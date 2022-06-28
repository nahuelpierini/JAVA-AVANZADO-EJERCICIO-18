package ejercicios;
public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        try {
           int a[] = new int[3];
           a[0]=1;
           a[1]=1;
           a[2]=1;
           a[3]=1;


        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound");
        }

    }
}
