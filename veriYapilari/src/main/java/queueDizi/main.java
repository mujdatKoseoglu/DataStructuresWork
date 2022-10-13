package queueDizi;

public class main {
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.deQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.elemanSayisi();
        queue.enQueue(40);
        queue.print();
        queue.enQueue(50);
        queue.print();
        //queue.enQueue(60);
        //queue.deQueue();
        //queue.deQueue();
        //queue.deQueue();

        //queue.elemanSayisi();
        //queue.print();
        System.out.println("dizinin ilk elemani: "+queue.dizi[queue.front]);
        System.out.println("dizinin son elemani: "+queue.dizi[queue.rear]);
    }
}
