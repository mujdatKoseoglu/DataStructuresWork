package hashTable;

public class main {
    public static void main(String[] args) {
        Tablo hashTable=new Tablo(5);
        hashTable.ekle(0,"mehmet");
        hashTable.ekle(10,"rustem");
        hashTable.ekle(3,"hasan");
        hashTable.ekle(4,"mert");
        hashTable.ekle(2,"tugce");
        hashTable.ekle(22,"beyza");
        hashTable.ekle(15,"cenk");
        hashTable.ekle(9,"serhat");

        System.out.println(hashTable.dizi[0].next.next.isim);

        hashTable.yazdir();

        hashTable.sil(0);
        hashTable.sil(9);
        hashTable.sil(15);
        hashTable.sil(22);
        hashTable.sil(2);
        hashTable.sil(4);
        hashTable.sil(3);
        hashTable.sil(10);
        hashTable.sil(3);
    }
}
