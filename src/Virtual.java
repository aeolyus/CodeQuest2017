
import java.io.*;
import java.util.Scanner;

public class Virtual {
    private static final String INPUT_FILE_NAME = "Prob13.in.txt";
    final static double TF=((double)1000)/90.0;
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            Scanner sc = new Scanner(inFile);
            String inLine = null;
            double frame0 = 0.0, frame1 =0, frame2=0;
            int qual = 0;
            // get the number of test cases
            int T = sc.nextInt();
            // loop through test cases
            while (T-- > 0) {
            	frame0= sc.nextDouble();
            	frame1= sc.nextDouble();
            	frame2 = sc.nextDouble();
            	qual=sc.nextInt();
            	if(frame2>(.9*TF)){
            		qual-=2;
            	}
            	else if(frame2>(.85*TF)){
            		double exp1=frame0+((2)*(frame2-frame1));
            		double exp2 = frame1+(2*(frame2-frame1));
            		if(exp1>(.9*TF)||exp2>(.9*TF)){
            			qual-=2;
            		}
            	}
            	else if(frame0<(.7*TF)&&frame1<(.7*TF)&&frame2<(.7*TF)){
            		++qual;
            	}
            	else{
            		
            	}
            	 System.out.println(qual);
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
