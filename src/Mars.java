
import java.io.*;
import java.util.*;

public class Mars {
    private static final String INPUT_FILE_NAME = "Prob08.in.txt";
    
    private static int days, hours, minutes, seconds;
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            Scanner in = new Scanner(inFile);
            
            // get the number of test cases
            int T = in.nextInt();
            in.nextLine();
            // loop through test cases
            while (T-- > 0) {
            	double distance=in.nextDouble()*1000000;
            	double time=distance/in.nextDouble();
            	time*=3600;//seconds
            	days=(int)(time*1/60.0*1/60.0*1/24.0);
            	time-=days*60*60*24;
            	hours=(int)(time*1/60.0*1/60.0);
            	time-=hours*3600;
            	minutes=(int)(time/60.0);
            	time-=minutes*60;
            	seconds=(int)Math.round(time);
            	System.out.println("Time to Mars: "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
