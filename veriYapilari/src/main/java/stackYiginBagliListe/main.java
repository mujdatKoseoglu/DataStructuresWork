package stackYiginBagliListe;

public class main {
    public static void main(String[] args) {
        StackYiginYapisi stackYiginYapisi=new StackYiginYapisi(5);
        stackYiginYapisi.push(10);
        stackYiginYapisi.push(20);
        stackYiginYapisi.push(30);
        stackYiginYapisi.remainArea();
        stackYiginYapisi.push(40);
        stackYiginYapisi.push(50);

        stackYiginYapisi.topGoster();
        stackYiginYapisi.print();

        stackYiginYapisi.push(60);

        stackYiginYapisi.pop();
        stackYiginYapisi.pop();
        stackYiginYapisi.pop();
        stackYiginYapisi.pop();
        stackYiginYapisi.pop();

        stackYiginYapisi.topGoster();
        stackYiginYapisi.print();

        stackYiginYapisi.pop();
    }

}
