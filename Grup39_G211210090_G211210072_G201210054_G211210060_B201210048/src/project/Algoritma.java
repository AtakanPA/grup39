package project;


public class Algoritma {
	 Queue queue = new Queue();
	    int counter = 0;
	    Sistem sistem=new Sistem();
	    Process item = null;

	    
	    int RoundRobin(int time) {
	        //timer that will go to main (will be adding)

	    	   System.out.println("atiati");
	        String text = "";
	        int timer = 0;

	        Process process = queue.Get(counter);
	        if(process.cpuUsage>sistem.UserProcessCPU)
	        {
	        	 text =  "   Process cok gazla kaynak kullaniyor "+process.ID+" ";
	             System.out.println(text);

	        	return 0;
	        }
	        text = "Process "+process.ID+" Başlatildi ";
	        System.out.println(text);

	        timer++;
	        process.overTime--;

	        process.delay = time + timer;

	        if (process.overTime == 0) {
	        	 text = "Process "+process.ID+" Bekliyor";
	            System.out.println(text);

	            queue.RemoveByIdQueue(counter);

	            if (counter == queue.QueueSize())
	                counter = 0;
	        } else {
	        	 text = "Process" +process.ID+"Bitti";
	            System.out.println(text);

	            counter = (counter + 1) % queue.QueueSize();

	        }
	        return timer;
	    }

	    int FCFS(int time) {
	        //timer that will go to main (will be adding)

	   

	        int timer = 0;
	        String text = "";
	        Process process = queue.Get(counter);
	        if(process.cpuUsage>sistem.realTimeCpu)
	        {
	        	 text = 
	                     "   Process cok gazla kaynak kullaniyor     " ;

	        	return 0;
	        }
	        text = "Process"+process.ID+"Başlatildi";
	        System.out.println(text);
	        System.out.println("atiati");
	        while (process.overTime != 0) {
	            process.overTime--;
	            timer++;
	            
	            process.delay = time + timer;

	            if (process.overTime > 0) {
	                text = "Process yürütülüyor";
	                System.out.println(text);
	            } else {
	            	 
	         
	           
	            }
	        }
	        if(process.overTime==0)
	        {   
	        	text = "Process" +process.ID+"Bitti";
	        	   System.out.println(text);
	        	
	        	 queue.RemoveByIdQueue(counter);
	        	
	        	
	        }
	        return timer;
	    }
	   
}
