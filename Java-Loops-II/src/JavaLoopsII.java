import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int t=in.nextInt();
		      
		        if(t>=0 && t<=500) {
		        	for(int i=0;i<t;i++){
		        		int a = in.nextInt();
		        		int b = in.nextInt();
		        		int n = in.nextInt();
		        		
		        		if((a >= 0 && a <= 50) && (b >= 0 && b <= 50)) {
		        			if(n >=1 && n<=15) {
		        				int result = 0;
		        				for(int j=0;j<n;j++) {
		        					result = a;
		        					for(int k=0;k<=j;k++) {
		        						result += (int) (Math.pow(2, k) * b );	
		        					}
		        					System.out.print(result + " ");
		        				}
		        				System.out.println("");
		        			}else {
		        				System.out.println("n should not be < 1 and > 15");
		        			}
		        		}else {
		        			System.out.println("a*b should not be > 50 and < 0");
		        		}
		        		
		        	}
		        	in.close();
		        }else {
		        	System.out.println("Please enter number between 0 to 500");
		        }
	}
	
}
