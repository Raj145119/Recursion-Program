public class Pattern3{
	public static void main(String args[]){
		System.out.println("Pattern Printing ..........");
		int n=5;
		pattern(n);
	}
	public static void pattern(int n){
		int i;
		if(n==0)
			return;
		
		for(i=1;i<=n;i++)
			System.out.print(i);
			
		System.out.println("");
		
		pattern(n-1);
	}
}