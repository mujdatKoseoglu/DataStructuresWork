package tekYonluDaireselBagliListe;

public class TekYonluDaireselListeYapisi {
    Node head=null;
    Node tail=null;

    void basaEkle(int data){
        Node eleman= new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
            System.out.println("ilk eleman eklendi");
        }
        else{
            eleman.next=head;
            head=eleman;
            tail.next=head;
        }
    }

    void sonaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
            System.out.println("ilk eleman eklendi");
        }

        else{
            tail.next=eleman;
            tail=eleman;
            tail.next=head;
        }
    }

    void arayaEkle(int indis, int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;
            tail.next=head;
            System.out.println("ilk eleman eklendi");
        }

        else if(indis==0) {
            eleman.next=head;
            head=eleman;
            tail.next=head;
        }

        else{
            Node temp=head;
            Node temp2=head;
            int i=0;
            while (temp!=tail){
                i++;
                temp=temp.next;
            }

            if(indis==i){
                tail.next=eleman;
                tail=eleman;
                tail.next=head;
            }

            else{
                temp=head;
                temp2=temp;
                int j=0;
                while(j<indis){
                    temp2=temp;
                    temp=temp.next;
                    j++;
                }

                temp2.next=eleman;
                eleman.next=temp;

            }
        }

    }

    void bastanSil(){
        if(head==null){
            System.out.println("silinecek eleman bulunamadı");
        }

        else if(head==tail){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silindi");
        }
        else{
            head=head.next;
            tail.next=head;
            System.out.println("listedeki ilk eleman silindi");
        }
    }

    void sondanSil(){
        if(head==null){
            System.out.println("silinecek eleman bulunamadı");
        }

        else if(head==tail){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silindi");
        }
        else{
            Node temp=head;
            Node temp2=temp;
            int i=0;
            while(temp!=tail){
                i++;
                temp2=temp;
                temp=temp.next;
            }
                temp2.next=head;
                tail=temp2;
                tail.next=head;
        }
    }

    void aradanSil(int indis){
        if(head==null){
            System.out.println("silinecek eleman bulunamadı");
        }

        else if(head==tail && indis==0){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silindi");
        }
        else{
            Node temp=head;
            Node temp2=temp;
            int i=0;
            while(temp!=tail){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if(i==indis) {
                temp2.next = head;
                tail = temp2;
                tail.next = head;
            }
            else{
                temp=head;
                temp2=temp;
                int j=0;
                while (j!=indis){
                    temp2=temp;
                    temp=temp.next;
                    j++;
                }
                temp2.next=temp.next;
            }
        }
    }

    void yazdir(){
        Node temp=head;
        while(temp!=tail){
            System.out.print(temp.data+"--");
            temp=temp.next;
        }
        try {
            System.out.print(temp.data);
        }
        catch (Exception e){
            System.out.println("listede eleman yoktur");
        }
    }

}
