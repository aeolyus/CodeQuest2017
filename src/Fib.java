
import java.io.*;
import java.util.Scanner;

public class Fib {
    private static final String INPUT_FILE_NAME = "Prob04.in.txt";
    

    
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
            	int c = 1;
            	int d = sc.nextInt();
            	int prev = 0;
            	int current = 1;
            	int i = 2;
            	while(i<d){
            		if(d==1){
            			prev = 0;
            			i =d;
            		}
            		else if(d==2){
            			c= current;
            			i = d;
            		}
            		else{
            			int temp = c;
            			c += prev;
            			prev = temp;
            			i++;
            		}
            	}
                System.out.println(d + " = "+c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
