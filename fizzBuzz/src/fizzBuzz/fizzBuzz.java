package fizzBuzz;

public class fizzBuzz {
	public static int n = 20;
	public static void main(String[] args) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.printf(" Fizz ");
			}else {
				if(i%5==0) {
					System.out.printf(" Buzz ");
				}else {
					if(i%3==0 && i%5==0) {
						System.out.printf(" Fizz Buzz ");
					}else {
						System.out.printf(" %d ", i);
					}
				}
			}
		 
			 
//			System.out.printf(" %d ", i);
	}
  }
}
