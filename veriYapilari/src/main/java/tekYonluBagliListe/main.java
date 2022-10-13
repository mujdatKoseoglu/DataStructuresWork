package tekYonluBagliListe;

public class main {
    public static void main(String[] args) {
        TekYonluListeYapisi tekYonluListeYapisi=new TekYonluListeYapisi();
        tekYonluListeYapisi.basaEkle(10);
        tekYonluListeYapisi.basaEkle(20);
        tekYonluListeYapisi.basaEkle(300);
        tekYonluListeYapisi.sonaEkle(800);
        tekYonluListeYapisi.sonaEkle(75000);
        tekYonluListeYapisi.arayaEkle(4,1785);
        tekYonluListeYapisi.arayaEkle(1,12792);
        tekYonluListeYapisi.arayaEkle(1,2);
        tekYonluListeYapisi.bastanSil();
        tekYonluListeYapisi.sondanSil();
        tekYonluListeYapisi.sondanSil();
        //tekYonluListeYapisi.aradanSil(0);
        //tekYonluListeYapisi.aradanSil(3);
        //tekYonluListeYapisi.aradanSil(1);
        tekYonluListeYapisi.aradanSil(4);
        //tekYonluListeYapisi.aradanSil(4);
        //tekYonluListeYapisi.aradanSil(4);
        tekYonluListeYapisi.yazdir();

        System.out.println("\nbastaki eleman "+tekYonluListeYapisi.head.data);
        System.out.println(tekYonluListeYapisi.tail.data+"  sondaki eleman");
    }
}
