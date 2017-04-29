
import java.io.*;
import java.util.*;

public class Donor {
    private static final String INPUT_FILE_NAME = "Prob05.in.txt";
    
    private static ArrayList<String> last=new ArrayList<String>();
    private static ArrayList<String> both=new ArrayList<String>();
    private static ArrayList<String> is=new ArrayList<String>();
    
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
            	
                String s=in.nextLine();
                last.add(s.substring(0,s.indexOf(",")));
                s=s.substring(s.indexOf(","));
                while(s.contains(",")){
                	last.add(s.substring(s.indexOf(",")));
                	s=s.substring(s.indexOf(","));
                }
                
                String a=in.nextLine();
                is.add(a.substring(0,a.indexOf(",")));
                a=a.substring(a.indexOf(","));
                while(a.contains(",")){
                	last.add(a.substring(a.indexOf(",")));
                	a=a.substring(a.indexOf(","));
                }
                
                for(int i=0;i<last.size();i++){
                	for(int j=0;j<is.size();i++){
                		if(last.get(i).equals(is.get(j))){
                			both.add(last.remove(i));is.remove(j);
                		}
                	}
                }
                
                for(String temp1:last)
                	System.out.println(temp1+" ");
                for(String temp2:is)
                	System.out.println(temp2+" ");
                for(String temp3:both)
                	System.out.println(temp3+" ");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
