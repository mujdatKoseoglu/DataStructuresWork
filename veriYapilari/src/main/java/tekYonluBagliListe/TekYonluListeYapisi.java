package tekYonluBagliListe;

public class TekYonluListeYapisi {

    Node head=null;
    Node tail=null;

    void basaEkle(int x){
        Node eleman =new Node();
        eleman.data=x;

        if(head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapisi olusturuldu ilk eleman eklendi");
        }
        else {
            eleman.next=head;
            head=eleman;
            System.out.println("basa eleman eklendi");
        }

    }

    void sonaEkle(int x){
        Node eleman =new Node();
        eleman.data=x;

        if(head==null){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapisi olusturuldu ilk eleman eklendi");
        }
        else {
            tail.next=eleman;
            tail=eleman;
            eleman.next=null;
            System.out.println("sona eleman eklendi");
        }

    }

    void arayaEkle(int indis,int x){
        Node eleman = new Node();
        eleman.data=x;

        if(head==null && indis==0){
            eleman.next=null;
            head=eleman;
            tail=eleman;
            System.out.println("liste yapisi olusturuldu ilk eleman eklendi");
        }

        else if(head!=null && indis==0){
            eleman.next=head;
            head=eleman;
            System.out.println("basa eleman eklendi");
        }

        else {
            int toplamElemanSayisi=0;
            Node temp=head;
            Node temp2=head;
            while(temp.next!=null){
                toplamElemanSayisi++;
                temp2=temp;
                temp=temp.next;
            }


            if(indis==toplamElemanSayisi){
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println("eleman eklendi");
            }
            else {
                temp=head;
                temp2=head;
                int i=0;
                while (i<indis){
                    temp2=temp;
                    temp=temp.next;
                    i++;
                }
                temp2.next=eleman;
                eleman.next=temp;
                System.out.println(indis+" . siraya yeni eleman eklendi");
            }
        }

    }

    void bastanSil(){
        if(head==null){
            System.out.println("listede eleman yoktur");
        }
        else if(head.next==null){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silinmiştir");
        }
        else{
            head=head.next;
            System.out.println("ilk eleman silinmistir");
        }
    }

    void sondanSil(){
        if(head==null){
            System.out.println("listede eleman yoktur");
        }
        else if(head.next==null){
            head=null;
            tail=null;
            System.out.println("listedeki son eleman silinmistir");
        }
        else {
            int i=0;
            Node temp=head;
            Node temp2=head;
            while(temp.next!=null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
            System.out.println("sondan eleman silindi");
        }
    }

    void aradanSil(int indis){
        if(head==null){
            System.out.println("liste boştur");
        }

        else if (head.next==null){
            head=null;
            tail=null;
            System.out.println("listedeki tek eleman silindi");
        }

        else{
            if(head.next!=null && indis==0){
                head=head.next;
                System.out.println(indis+" . indis silindi");
            }

            else{
                Node temp=head;
                Node temp2=head;
                int i=0;
                while(temp.next!=null){
                    i++;
                    temp2=temp;
                    temp=temp.next;
                }
                if (indis==i){
                    temp2.next=null;
                    tail=temp2;
                    System.out.println("sonuncu eleman silindi");
                }
                else {
                    temp=head;
                    temp2=head;
                    int j=0;
                    while(j<indis){
                        temp2=temp;
                        temp=temp.next;
                        j++;
                    }
                    temp2.next=temp.next;
                    System.out.println("aradaki eleman silindi");
                }
            }
        }
    }
    void yazdir(){
        if(head==null){
            System.out.println("liste yapısı bostur");
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
