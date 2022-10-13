package stackYiginDizi;

public class main {
    public static void main(String[] args) {
        StackYigin stack=new StackYigin(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.yazdir();
        stack.yazdir2();
        stack.findFirstNumber();
        stack.sumOfAllNumber();
        stack.avarageOfAllNumber();
        stack.push(30);



        System.out.println("cikan sayi : "+stack.pop());
        System.out.println("cikan sayi : "+stack.pop());
        System.out.println("cikan sayi : "+stack.pop());

        System.out.println("cikan sayi : "+stack.pop());
    }

}
