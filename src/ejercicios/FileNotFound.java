package ejercicios;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileNotFound {
    public static void main(String[] args) {
        try {

            InputStream fichero = new FileInputStream("D:\\Holaa.txt");  // crear objeto fichero

                byte[] datos = fichero.readAllBytes();
                for (byte  dato : datos ){
                    System.out.print((char) dato);
                }
            } catch (IOException FileNotFoundException ) {
                System.out.println("FileNotFound");
            }



    }
}
