package stackYiginDizi;


import java.util.Arrays;

public class StackYigin {
    int array[];
    int size;
    int indis;

    public StackYigin(int size) {
        this.size = size;
        array=new int[size];
        indis=-1;
    }

    void push(int data){ //listemize eleman ekleme
        if(isFull()){
            System.out.println("stack doludur ekleme yapilamaz");
        }
        else{
            indis++;
            array[indis]=data;
            System.out.println("eklenen sayi : "+array[indis]);
        }

    }

    int pop(){ //listemizden eleman çıkarma
        if(isEmpty()){
            System.out.println("stack zaten bostur, cikarma islemi yapilamaz");
            return -1;
        }
        else{
            return array[indis--];
        }

    }

    boolean isEmpty(){ //listemiz boş mu?
       return (indis==-1);
    }

    boolean isFull(){ //listemiz dolu mu?
        return (indis==size-1);
    }

    void yazdir(){ //listemizi for ile yazdırdık
        for(int i=0; i< array.length; i++){
            System.out.print("-"+array[i]);
        }
    }

    void yazdir2(){ //listemizi foreach ile yazdırdık
        for (int i:array) {
            System.out.println(" : "+i);
        }
    }

    void findFirstNumber(){ //listemizib ilk elemanı
        System.out.println(Arrays.stream(array).findFirst().getAsInt());
    }

    void sumOfAllNumber(){ //listemizin toplamı
        System.out.println(Arrays.stream(array).sum());
    }

    void avarageOfAllNumber(){ //listemizin ortalaması
        System.out.println(Arrays.stream(array).average().getAsDouble());
    }
}
