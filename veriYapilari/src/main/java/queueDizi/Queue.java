package queueDizi;

public class Queue {
    int[] dizi; //dizimiz
    int size; //dizinin boyutu
    int front; //dizinin ilk elemanı
    int rear; //dizinin son elemanı

    public Queue(int size) {
        this.size = size;
        dizi=new int[size];
        front=0;
        rear=-1;
    }

    void enQueue(int data){
       if(isFull()){
           System.out.println("dizide eklenecek yer kalmadi");
       }
       else {
           rear++;
           dizi[rear]=data;
           System.out.println(dizi[rear]+" degeri kuyruga eklendi");
       }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("diziden cikarilacak eleman kalmadi");
        }
        else{
            int sayi=dizi[front];
            for (int i = 1; i <=rear ; i++) {
                dizi[i-1]=dizi[i];
            }
            rear--;
            System.out.println(sayi+" degeri kuyruktan cikarildi");
        }
    }

    boolean isEmpty(){
        return rear==-1;
    }

    boolean isFull(){
        return (rear==size-1);
    }

    void print(){
        int i=rear;
      while (i>=0){
          System.out.println(dizi[i]);
          i--;
      }
    }

    void elemanSayisi(){
        System.out.println("eleman sayisi :"+(rear+1));
    }
}
