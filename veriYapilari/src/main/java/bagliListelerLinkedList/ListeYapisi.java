package bagliListelerLinkedList;

public class ListeYapisi {

    Node head=null;
    Node tail=null;

    void ekle(int x){
        Node eleman=new Node();
        eleman.data=x;
        eleman.next=null;

        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("liste olusturuldu ve ilk dugum eklendi");
        }

        else {
            tail.next=eleman;
            tail=eleman;
            System.out.println("listenin sonuna yeni bir dugum eklendi");
        }
    }

    void yazdir(){
        if(head==null){
            System.out.println("liste yapısı boştur");
        }
        else {
            Node temp=head;
            System.out.print("listenin basi");
            while (temp!=null){
                System.out.print("->"+temp.data);
                temp=temp.next;
            }
            System.out.print("  listenin sonu");
        }
    }

}
