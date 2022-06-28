package ejercicios;
public class ArithmeticException {
    public static void main(String[] args) {

        try{
            int numero1 = 5, numero2 = 0;
            System.out.println("Resutado: " + numero1/numero2);
        }catch (java.lang.ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
}
