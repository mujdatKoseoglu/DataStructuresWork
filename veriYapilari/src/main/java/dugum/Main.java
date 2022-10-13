package dugum;

public class Main {
    public static void main(String[] args){
        Node A=new Node();
        Node B=new Node();
        Node C=new Node();

        A.sayi=5; //değer atama
        B.sayi=6;
        C.sayi=7;

        A.next=B; //bağlama
        B.next=C;
        C.next=null;

        System.out.println(A.sayi);
        System.out.println(A.next);
        System.out.println(B.next);

        Node temp=A; //düğümün başlangıcı

        while (temp!=null){
            System.out.println(temp.next + "  " + temp.sayi);
            temp=temp.next;
        }

    }
}
