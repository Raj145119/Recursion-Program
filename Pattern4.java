public class Pattern4{
	public static void main(String args[]){
		System.out.println("Pattern Printing ..........");
		int n=5;
		pattern(n);
	}
	public static void pattern(int n){
		int i;
		if(n==0)
			return;
		
		pattern(n-1);
			for(i=1;i<=n;i++)
			System.out.print(i);
			
		System.out.println("");
	}
}