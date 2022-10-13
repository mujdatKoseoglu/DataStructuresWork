package ciftYonluDaireselBagliListe;

public class CiftYonluDaireselListeYapisi {
    Node head=null;
    Node tail=null;

    void basaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;

            head.prev=tail;
            tail.next=head;

        }
        else {
            eleman.next=head;
            head.prev=eleman;

            head=eleman;

            tail.next=head;
            head.prev=tail;

        }

    }

    void sonaEkle(int data){
        Node eleman=new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;

            head.prev=tail;
            tail.next=head;

        }

        else{
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
            tail.next=head;
            head.prev=tail;
        }
    }

    void arayaEkle(int indis, int data){
        Node eleman =new Node(data);
        if(head==null){
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;

            head.prev=tail;
            tail.next=head;

        }

        else if(indis==0){
            eleman.next=head;
            head.prev=eleman;

            head=eleman;

            tail.next=head;
            head.prev=tail;
        }

        else{
            Node temp=head;
            Node temp2=temp;
            int n=0;
            while (temp!=tail){
                n++;
                temp=temp.next;
            }
            temp=head;
            int j=0;
            while (j<indis){
                temp2=temp;
                temp=temp.next;
                j++;
            }

            if(n<indis){
                tail.next=eleman;
                eleman.prev=tail;
                tail=eleman;
                tail.next=head;
                head.prev=tail;
            }

            else{
                temp2.next=eleman;
                eleman.prev=temp2;
                eleman.next=temp;
                temp.prev=eleman;
            }
        }

    }

    void bastanSil(){
        if(head==null){
            System.out.println("listede silinecek eleman yoktur");
        }

        else if(head==tail){
            head=null;
            tail=null;
        }

        else{
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
    }

    void sondanSil(){
        if(head==null){
            System.out.println("silinecek eleman bulunamadı");
        }
        else if(head==tail){
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
        else {
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
        }
    }

    void aradanSil(int indis) {
        if (head == null) {
            System.out.println("listede silinecek eleman bulunamadı");
        } else {

            if (head == tail && indis == 0) {
                head = null;
                tail = null;
            } else if (head != tail && indis == 0) {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            } else {
                Node temp = head;
                Node temp2 = temp;
                int n = 0;
                while (temp != tail) {
                    n++;
                    temp2 = temp;
                    temp = temp.next;
                }

                if (n <= indis) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                } else {
                    temp = head;
                    int j = 0;
                    while (j < indis) {
                        temp2 = temp;
                        temp = temp.next;
                        j++;
                    }
                    temp2.prev.next = temp.prev;
                    temp2.next = temp.next;
                    temp.next.prev = temp2;

                }
            }
        }
    }
    void yazdir(){
        Node temp=head;
        while (temp!=tail){
            System.out.print(temp.data+"--");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    void sondanYazdir(){
        Node temp=tail;
        System.out.println("\n");
        while (temp!=head){
            System.out.print(temp.data+"--");
            temp=temp.prev;
        }
        System.out.print(temp.data);
    }
    }

