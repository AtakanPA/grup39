package project;
import java.util.Random;
public class PriorityList {

    Algoritma rr = new Algoritma();
    Queue queue1 = new Queue();
    Queue queue2 = new Queue();

    int FirstPriList(int time) {
        //timer that will go to main (will be adding)

       

        String text = "";
        int timer = 0;

        Process process = queue1.RemoveQueue();
        if(process.cpuUsage>960)
        {
        	 text =  "   Process cok gazla kaynak kullaniyor"+process.ID;
             System.out.println(text);

        	return 0;
        }
        text = "Process"+process.ID+"Başlatildi";
        //print text in color
        System.out.println(text);

        timer++;
        process.overTime--;

        process.delay = time + timer;

        if (process.overTime > 0) {
           
            process.priority++;

            text = "Process"+process.ID+"Bekliyor";
            System.out.println(text);
             queue2.PushQueue(process);

        } else {
            text = "Process" +process.ID+"Bitti";
            System.out.println(text);
        }

        return timer;
    }

    int SecondPriList(int time) {


        


        String text = "";
        int timer = 0;

        Process process = queue2.RemoveQueue();
        if(process.cpuUsage>960)
        {
        	 text =   "   Process cok gazla kaynak kullaniyor"+process.ID;
             System.out.println(text);

        	return 0;
        }
        text = "Process"+process.ID+"Başlatildi";
        System.out.println(text);

        timer++;
        process.overTime--;

        process.delay = time + timer;

        if (process.overTime > 0) {

            process.priority++;

            rr.queue.PushQueue(process);

            text = "Process"+process.ID+"Bekliyor";
            System.out.println(text);

        } else {
        	 text = "Process" +process.ID+"Bitti";
            System.out.println(text);
        }

        //dl.TimeOut_Scanner((time + timer));

        return timer;
    }
}