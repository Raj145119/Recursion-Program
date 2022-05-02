public class Pattern1{
	public static void main(String args[]){
		System.out.println("Pattern Printing ..........");
		int n=5;
		pattern(n+1,n);
	}
	public static void pattern(int m,int n){
		int i,j;
		if(n==0)
			return;
		
		for(i=2;i<=n;i++)
			System.out.print("*");
		
		for(j=1;j<=m-n;j++)
			System.out.print(j);
			
		System.out.println("");
		
		pattern(m,n-1);
	}
}