package queueBagliListe;

import queueDizi.Queue;

public class main {
    public static void main(String[] args) {
        QueueYapisi queueYapisi=new QueueYapisi(5);
        queueYapisi.enQueue(10);
        queueYapisi.enQueue(20);
        queueYapisi.enQueue(30);
        queueYapisi.enQueue(40);
        System.out.println("eleman sayisi : "+queueYapisi.counter);
        System.out.println("bastaki eleman : "+queueYapisi.front.data);
        System.out.println("sondaki eleman : "+queueYapisi.rear.data);
        queueYapisi.enQueue(50);
        //queueYapisi.enQueue(60);
        queueYapisi.deQueue();
        queueYapisi.deQueue();
        queueYapisi.deQueue();
        queueYapisi.deQueue();
        queueYapisi.deQueue();
        queueYapisi.deQueue();

        queueYapisi.yazdir();


    }
}
