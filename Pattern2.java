public class Pattern2{
	public static void main(String args[]){
		System.out.println("Pattern Printing ..........");
		int n=5;
		pattern(n);
	}
	public static void pattern(int n){
		int i,j;
		if(n==1){
			System.out.println("1");
			return;
		}
		for(i=1;i<=n;i++)
			System.out.print(i);

		System.out.println("");
		
		pattern(n-1);
		for(j=1;j<=n;j++)
			System.out.print(j);
		System.out.println("");
	}
}