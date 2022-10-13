package ciftYonluBagliListe;

public class main {
    public static void main(String[] args) {
        CiftYonluListeYapisi ciftYonluListeYapisi=new CiftYonluListeYapisi();
        ciftYonluListeYapisi.basaEkle(10);
        ciftYonluListeYapisi.basaEkle(20);
        ciftYonluListeYapisi.sonaEkle(30);
        ciftYonluListeYapisi.sonaEkle(40);
        ciftYonluListeYapisi.arayaEkle(1,85);
        ciftYonluListeYapisi.arayaEkle(2,70);
        ciftYonluListeYapisi.arayaEkle(0,1);
        ciftYonluListeYapisi.arayaEkle(6,60);
        ciftYonluListeYapisi.arayaEkle(7,77);
        ciftYonluListeYapisi.bastanSil();
        ciftYonluListeYapisi.sondanSil();
        ciftYonluListeYapisi.sondanSil();
        ciftYonluListeYapisi.sondanSil();
        ciftYonluListeYapisi.aradanSil(4);
        //ciftYonluListeYapisi.aradanSil(3);
        ciftYonluListeYapisi.aradanSil(1);
        //ciftYonluListeYapisi.aradanSil(1);
        //ciftYonluListeYapisi.aradanSil(0);
        ciftYonluListeYapisi.yazdir();
        ciftYonluListeYapisi.sondanYazdir();
    }
}
