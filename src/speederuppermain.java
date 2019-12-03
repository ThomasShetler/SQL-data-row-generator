import java.lang.Math; 
import java.util.Scanner;
public class speederuppermain {
	
	public static String phoneNumber() {
	//Random Phone Number generator 
		int p1 = (int) (Math.random()*9); 
		int p2 = (int) (Math.random()*9);
		int p3 = (int) (Math.random()*9);
		int p4 = (int) (Math.random()*9);
		int p5 = (int) (Math.random()*9);
		int p6 = (int) (Math.random()*9);
		int p7 = (int) (Math.random()*9);
		int p8 = (int) (Math.random()*9);
		int p9 = (int) (Math.random()*9);
		int p10 = (int) (Math.random()*9);
		
		String phoneNum = ("'"+p1+p2+p3+"-"+p4+p5+p6+"-"+p7+p8+p9+p10+"'");
		
		return phoneNum;
		
	}
	public static String dateGen (int yearRangeStart, int yearRangeEnd) {
		int m = (int) (Math.random()*11 )+ 1;
		int d = (int) (Math.random()*28)+ 1;
		int y = (int) (Math.random()*(yearRangeEnd - yearRangeStart))+ yearRangeStart;
		
		String dateOutput = (m+"/"+d+"/"+y);
		
		
		return dateOutput;
		
	}
	
	public static void main(String[] args) {
		
		
		
		for(int i = 0; i <= 100 ; i++) {
			int cardNo = (int) (Math.random()*8);
			int bookID = (int) (Math.random()*23 - 3)+ 4;
			int branchid =(int) (Math.random()*4 )+ 1;;
			
			int m = (int) (Math.random()*11 )+ 1;
			int d = (int) (Math.random()*28)+ 1;
			int y = 19;
			int m2 = m;
			int d2 = d + 14;
			if (d2 > 28) {
				d2 = d2 - 28;
				m2 = m + 1;
			}
			System.out.println("("+bookID+","+branchid+",10"+cardNo+","+"'"+dateGen(2002,2007)+"','"+m2+"/"+d2+"/"+y+"'),");
			
				
			
		}
		

	}


}


