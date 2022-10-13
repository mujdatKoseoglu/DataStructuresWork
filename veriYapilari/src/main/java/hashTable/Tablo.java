package hashTable;

public class Tablo {
    Node dizi[];
    int size;

    public Tablo(int size) {
        this.size = size;
        dizi=new Node[size];
        for (int i = 0; i <size; i++) {
              dizi[i]=new Node();
        }
    }

    int modAl(int key){
        return key%size;
    }

    void ekle(int key, String isim){
        int index=modAl(key);
        Node eleman=new Node(key,isim);
        Node temp=dizi[index];
        while (temp.next!=null){ //liste sonuna ekleme yapıldı
            temp=temp.next;
        }
        temp.next=eleman;
        System.out.println(eleman.isim+" eklendi");
    }

    void sil(int key){
        boolean sonuc=false;
        int index=modAl(key);
        Node temp=dizi[index];
        Node temp2=dizi[index];
        if(temp.next==null){
            System.out.println(key+" numaralı kayıt yoktur");
            sonuc=true;
        }
        else if (temp.next.next==null && temp.next.key==key) {
            sonuc=true;
            System.out.println(temp.next.isim+" numarali son kisi silindi");
            temp.next=null;

        }
        else{
            while(temp.next!=null){
                temp2=temp;
                temp=temp.next;
                if(temp.key==key){
                    sonuc=true;
                    System.out.println(temp.isim+" key silindi");
                    temp2.next=temp.next;
                }
            }
        }

        if(sonuc==false){
            System.out.println(key+" numarali kayit yoktur");
        }
    }

    void yazdir(){
        for (int i = 0; i <size ; i++) {
            Node temp=dizi[i];
            System.out.print("dizi["+i+"] -> ");
            if(temp.next!=null){
                while(temp.next!=null){
                    System.out.print(temp.next.key+" - "+temp.next.isim+" -> ");
                    temp=temp.next;
                }
                System.out.println();
            }
        }
    }
}
