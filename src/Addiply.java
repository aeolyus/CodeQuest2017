
import java.io.*;
import java.util.Scanner;

public class Addiply {
    private static final String INPUT_FILE_NAME = "Prob03.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            Scanner sc = new Scanner(inFile);
            String inLine = null;
            
            // get the number of test cases
            int T = sc.nextInt();
            
            // loop through test cases
            while (T-- > 0) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b+" "+a*b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
