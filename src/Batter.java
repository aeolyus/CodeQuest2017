
import java.io.*;
import java.util.Scanner;

public class Batter {
    private static final String INPUT_FILE_NAME = "Prob07.in.txt";
    private static String f;
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            Scanner sc = new Scanner(inFile);
            
            // get the number of test cases
            int T = sc.nextInt();
            sc.nextLine();
            // loop through test cases
            while (T-- > 0) {
            	
                String s=sc.nextLine();
                String name=s.substring(0,s.indexOf(":"));
                int total=0,singles=0,doubles=0,triples=0,hr=0;
                s=s.substring(s.indexOf(":")+1);
                while(s.indexOf(",")>-1){
                	if(s.substring(0,s.indexOf(",")).equals("K"))
                		total++;
                	else if(s.substring(0,s.indexOf(",")).equals("1B")){
                		singles++;total++;
                	}else if(s.substring(0,s.indexOf(",")).equals("2B")){
                		doubles++;total++;
                	}else if(s.substring(0,s.indexOf(",")).equals("3B")){
                		triples++;total++;
                	}else if(s.substring(0,s.indexOf(",")).equals("HR")){
                		hr++;total++;
                	}
                	s=s.substring(s.indexOf(",")+1);
                }
                if(s.equals("K"))
            		total++;
            	else if(s.equals("1B")){
            		singles++;total++;
            	}else if(s.equals("2B")){
            		doubles++;total++;
            	}else if(s.equals("3B")){
            		triples++;total++;
            	}else if(s.equals("HR")){
            		hr++;total++;
            	}
                
                double thing=(double)(singles+2*doubles+3*triples+4*hr)/(double)(total);
                f+=String.format(name+"=%.3f",thing);
            }
            System.out.print(f.substring(5,f.length()-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
