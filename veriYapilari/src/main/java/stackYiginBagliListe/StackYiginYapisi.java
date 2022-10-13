package stackYiginBagliListe;

public class StackYiginYapisi {
    int size;
    int counter;
    Node top;

    public StackYiginYapisi(int size) {
        this.size = size;
        counter=0;
        top=null;
    }

    void push(int data){
        Node eleman=new Node(data);
        if(isFull()){
            System.out.println("stack de bos yer yok");
        }
        else{
            if(isEmpty()){
                top=eleman;
                System.out.println(top.data+" stack icin ilk eleman eklendi");
            }
            else{
                eleman.next=top;
                top=eleman;
                System.out.println(top.data+" stack'e eklendi");
            }
            counter++;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("stack bostur");
        }
        else{
            System.out.println(top.data+" stack'ten silindi");
            top=top.next;
            counter--;
        }
    }

    void remainArea(){
        System.out.println("stack'te kalan yer sayisi : "+(size-counter));
    }
    void topGoster(){
        if(isEmpty()){
            System.out.println("stack bostur");
        }
        else{
            System.out.println("en ustteski eleman"+top.data);
        }
    }
    void print(){
        if(isEmpty()){
            System.out.println("stack bos oldugu icin yazdirilacak eleman bulunamadi");
        }

        else{
            Node temp=top;
            while (temp!=null){
                System.out.println(temp.data+"--");
                temp=temp.next;
            }
        }
    }
    boolean isEmpty(){
        return  (counter==0);
    }

    boolean isFull(){
        return (counter==size);
    }
}


