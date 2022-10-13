package queueBagliListe;

public class QueueYapisi {
    Node front;
    Node rear;
    int size;
    int counter;

    public QueueYapisi(int size) {
        this.size = size;
        counter=0;
        front=null;
        rear=null;
    }

    void enQueue(int data){
        if(isFull()){
            System.out.println("kuyruk doludur, ekleme yapilamaz");
        }
        else{
            Node eleman=new Node(data);
            if(isEmpty()){
                front=eleman;
                rear=eleman;
                System.out.println("ilk eleman eklendi");
            }
            else{
                rear.next=eleman;
                rear=eleman;
                System.out.println("kuyruga eklendi");
            }
            counter++;
        }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("silinecek eleman bulunamadi");
        }
        else{
            System.out.println(front.data+" silindi");
            front=front.next;
            counter--;
        }
    }

    boolean isEmpty() {
        return (counter==0);
    }

    boolean isFull() {
        return counter==size;
    }

    void yazdir(){
        if(isEmpty()){
            System.out.println("yazdirilacak eleman bulunamadi");
        }
        else{
            Node temp=front;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }

    }
}
