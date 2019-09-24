import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Graph implements dbStrategy {
    public void store(){
        try {
            File srcfile = new File("input.txt");
            File tfile = new File("output.txt");
            FileInputStream FI = new FileInputStream("input.txt");
            FileOutputStream FO = new FileOutputStream("output.txt");

            int len;

            while((len = FI.read()) != -1) {
                FO.write(len);
            }
            FI.close();

        }
        catch(IOException e) {
            System.out.println(e);
        }
        System.out.println("Stored using node store.");
    }
}
