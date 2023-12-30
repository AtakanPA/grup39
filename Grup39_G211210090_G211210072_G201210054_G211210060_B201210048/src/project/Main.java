package project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int timer = 0;
      

        Algoritma fcfs = new Algoritma();
        PriorityList firstQueue = new PriorityList();
        PriorityList secQueue = new PriorityList();
        PriorityList rRobin = new PriorityList();
        
       
     
        String dosyaYolu = "giris.txt"; // Okunacak dosyanın yolu
        List<Process> priorityList = new ArrayList<>(); // Process nesnelerini tutacak liste
        int id = 1; // Başlangıç ID değeri

        try {
            BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));
            String satir;

            while ((satir = br.readLine()) != null) {
                String[] veriParcalari = satir.split(",\\s*"); // Virgülle ayrılmış verileri parçala
                int[] processVerisi = new int[veriParcalari.length + 1]; // ID dahil edildi

                // ID değerini ekleyerek verileri yeni diziye kopyala
                processVerisi[0] = id++;
                for (int i = 0; i < veriParcalari.length; i++) {
                    processVerisi[i + 1] = Integer.parseInt(veriParcalari[i]);
                }

                // Process nesnesi oluştur ve priorityList'e ekle
                priorityList.add(new Process(processVerisi));
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     

       while(true)
       {
    	   
            for (Process process : priorityList) {
            
                if (!(timer < process.arrivingTime)) {
                    if (process.priority == 0) {
                        fcfs.queue.PushQueue(process);
                    } else if (process.priority == 1) {
                        firstQueue.queue1.PushQueue(process);
                    } else if (process.priority == 2) {
                        secQueue.queue2.PushQueue(process);
                    } else if (process.priority == 3) {
                        rRobin.rr.queue.PushQueue(process);
                    }
                }
            }
         
            if (!(fcfs.queue.isQueueEmpty())) {
                timer += fcfs.FCFS(timer);
                System.out.println("fcfs"+timer);
            } else if (!(firstQueue.queue1.isQueueEmpty())) {
                timer += firstQueue.FirstPriList(timer);
                System.out.println("first"+timer);
            } else if (!(secQueue.queue2.isQueueEmpty())) {
                timer += secQueue.SecondPriList(timer);
                System.out.println("sec"+timer);
            } else if (!(rRobin.rr.queue.isQueueEmpty())) {
                timer += rRobin.rr.RoundRobin(timer);
                System.out.println("third"+timer);
            } else {
                timer++;
            }
          
           
            if (rRobin.rr.queue.isQueueEmpty()&&(firstQueue.queue1.isQueueEmpty())&&(secQueue.queue2.isQueueEmpty())&&(fcfs.queue.isQueueEmpty()))
            	break;
        }
    }
}
