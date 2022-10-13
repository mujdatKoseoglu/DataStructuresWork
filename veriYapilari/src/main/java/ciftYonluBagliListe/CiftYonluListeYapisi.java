package ciftYonluBagliListe;

public class CiftYonluListeYapisi {

    Node head=null;
    Node tail=null;

    void basaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("listeye ilk eleman eklendi");
        }

        else {
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
            System.out.println("basa eleman eklendi");
        }
    }

    void sonaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("listeye ilk eleman eklendi");
        }

        else {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
        }

    }

    void arayaEkle(int indis, int x){
        Node eleman=new Node(x);
        if (head==null){
            head=eleman;
            tail=eleman;
            System.out.println("ilk eleman eklendi");
        }
        else if(head!=null && indis==0){
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
            System.out.println("listeye ikinci eleman eklendi");
        }
        else{
            Node temp=head;
            int i=0;
            while(temp.next==null){
                i++;
                temp=temp.next;

            }

            temp=head;
            if(indis>i){
                tail.next=eleman;
                eleman.prev=tail;
                tail=eleman;
            }
            else{
                temp=head;
                int j=0;
                while (j!=indis){
                    temp=temp.next;
                    j++;
                }

                eleman.prev=temp.prev;
                temp.prev.next=eleman;

                eleman.next=temp;
                temp.prev=eleman;
            }

        }

    }

    void bastanSil(){

        if(head==null){
            System.out.println("silinecek eleman bulunamadı");
        }
        else if(head.next==null){
            head=null;
            tail=null;
        }

        else{
            head=head.next;
            head.prev=null;
            System.out.println("ilk eleman silinmistir");
        }
    }

    void sondanSil(){
        if(head==null){
            System.out.println("listede silinecek eleman yoktur");
        }

        else if(head.next==null){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silinmistir");
        }

        else{
            tail=tail.prev;
            tail.next=null;
            /*Node temp=head;
            int i=0;
            while(temp.next!=null){
                i++;
                temp=temp.next;
            }
            tail=temp.prev;
            tail.next=null;
            System.out.println("listeden son eleman silinmistir.");*/
        }
    }

    void aradanSil(int indis){
        if(head==null){
            System.out.println("silinecek eleman yoktur");
        }
        else if(head.next==null){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silinmiştir");
        }
        else if(head.next!=null && indis==0){
            head=head.next;
            head.prev=null;
        }
        else{
            Node temp=head;
            int i=0;
            while (temp.next!=null){
                i++;
                temp=temp.next;
            }

            if(indis>=i){
                tail=tail.prev;
                tail.next=null;
            }
            else{
                temp=head;
                int j=0;
                while (j<indis){
                    temp=temp.next;
                    j++;
                }
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;

            }
        }
    }

    void yazdir(){
        Node temp=head;
        System.out.print("bastan sona--");
        while (temp!=null){
            System.out.print(temp.data+"--");
            temp=temp.next;
        }
        System.out.println("\n*****");
    }

    void sondanYazdir(){
        Node temp=tail;

        while (temp!=null){
            System.out.print(temp.data+"--");
            temp=temp.prev;
        }
        System.out.print("sondan basa");
    }
}
