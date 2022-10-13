package ciftYonluDaireselBagliListe;

public class main {
    public static void main(String[] args) {
        CiftYonluDaireselListeYapisi ciftYonluDaireselListeYapisi=new CiftYonluDaireselListeYapisi();
        ciftYonluDaireselListeYapisi.basaEkle(10);
        ciftYonluDaireselListeYapisi.basaEkle(5);
        ciftYonluDaireselListeYapisi.basaEkle(3);
        ciftYonluDaireselListeYapisi.basaEkle(1);
        ciftYonluDaireselListeYapisi.sonaEkle(20);
        ciftYonluDaireselListeYapisi.sonaEkle(30);
        ciftYonluDaireselListeYapisi.basaEkle(40);
        ciftYonluDaireselListeYapisi.arayaEkle(1,20);
        ciftYonluDaireselListeYapisi.arayaEkle(6,90);
        ciftYonluDaireselListeYapisi.bastanSil();
        ciftYonluDaireselListeYapisi.bastanSil();
        ciftYonluDaireselListeYapisi.sondanSil();
        ciftYonluDaireselListeYapisi.aradanSil(10);
        ciftYonluDaireselListeYapisi.aradanSil(7);
        ciftYonluDaireselListeYapisi.aradanSil(0);
        ciftYonluDaireselListeYapisi.yazdir();
        ciftYonluDaireselListeYapisi.sondanYazdir();
    }
}
