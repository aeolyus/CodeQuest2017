
import java.io.*;
import java.util.Scanner;

public class compound{
	private static final String INPUT_FILE_NAME="Prob12.in.txt";

	public static void main(String[] args){
		try{
			// prepare to read the file
			File inFile=new File(INPUT_FILE_NAME);
			Scanner sc=new Scanner(inFile);
			String inLine=null;

			// get the number of test cases
			int F=sc.nextInt();
			while (F-->0){
				int T=sc.nextInt();
				sc.nextLine();
				double I=0.18;
				double P=12;
				double D=T;
				double balance=0;
				double totalB=0;
				// loop through test cases
				while (T-->0){

					String s=sc.nextLine();
					s=s.substring(s.indexOf(",")+1);
					double p=0;
	
					if (s.length()>1&&s.charAt(0)!=','){
				
						p=Double.parseDouble(s.substring(0,s.indexOf(",")));
					}
					s=s.substring(s.indexOf(",")+1);
					double c=0;
					if (s.length()>0){
						c=Double.parseDouble(s);
					}
					
					balance=balance+p-c;
					totalB+=balance;
				}
				double out=totalB/D;
				out*=I;
				out/=P;
				System.out.printf("$%.2f\n",out);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
