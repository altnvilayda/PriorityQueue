
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        
       /*
        Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere gececek(PriorityQueue).
        
        Apandisit-----> En yüksek
        Yanık  -------> Orta
        BaşAğrısı-----> En düşük
        
       */ 
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer(new Hasta("Ali", "Yanık"));
        acilservis.offer(new Hasta("Veli", "Apandisit"));
        acilservis.offer(new Hasta("Ayşe", "Yanık"));
        acilservis.offer(new Hasta("Betül", "Baş Ağrısı"));
        acilservis.offer(new Hasta("Can", "Apandisit"));
        acilservis.offer(new Hasta("Hasan", "Yanık"));
        acilservis.offer(new Hasta("Merve", "Baş Ağrısı"));
        
        int i = 1;
        
        while(acilservis.isEmpty() != true){
            
            System.out.println("***********************");
            System.out.println(i + ".sırada");
            System.out.println(acilservis.poll());
            System.out.println("************************");
            
            i++;
        }
        
        
    }
}
