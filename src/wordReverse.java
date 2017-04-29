
import java.io.*;
import java.util.Scanner;

public class wordReverse {
    private static final String INPUT_FILE_NAME = "Prob11.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File("Prob11.in.txt");
            Scanner sc = new Scanner(inFile);
            String inLine = null;
            
            // get the number of test cases
            int T = sc.nextInt();
            
            // loop through test cases
            while (T-- > 0) {
            	int pos = 0;
            	String out = "";
            	String s = sc.nextLine();
            	int count = 0;
                for(int i = 0; i<s.length();i++){
                	char c= s.charAt(i);
                	if(c<'A'||(c>'Z'&&c<'a')||c>'z'){
                		if(count >0){
                			char f = s.charAt(count);
                			char d = s.charAt(pos);
                			if(d<='Z'){
                				s = s.substring(0,pos)+(char)((int)d+'a'-'A')+s.substring(pos+1,count)+(char)((int)f-'a'+'A')+s.substring(count+1);
                				System.out.println(s);
                			}
                			for(int ww=count;count>=pos;count--){
                				out+=s.charAt(count);
                			}
                		}
                		pos=i+1;
                	}
                	else{
                		count++;
                	}
                }
                System.out.println(out);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
