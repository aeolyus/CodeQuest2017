
import java.io.*;
import java.util.Scanner;

public class Missing {
    private static final String INPUT_FILE_NAME = "Prob02.in.txt";
    
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
                String s=sc.next();
                int c=sc.nextInt();
                System.out.println(s.substring(0,c)+s.substring(c+1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
