public class Fibonacci{
	public static void main(String args[]){
		System.out.println("Pattern Printing ..........");
		int n=6;
		int fab=fibonacci(n);
		System.out.println("fibonacci of "+n+" term is "+fab);
		
		for(int i=1;i<=n;i++){
			System.out.print(fibonacci(i));
		}
	}
	public static int fibonacci(int n){
		if(n<2)
				return n;
		int fab=fibonacci(n-2)+fibonacci(n-1);
		return fab;
			
		
	}
}