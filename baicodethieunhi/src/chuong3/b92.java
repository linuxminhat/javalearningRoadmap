package chuong3;

public class b92 {
	public static int numb1,numb2;
	public static int findingMaxDivisors(int numb1,int numb2) {
		int temp_maxDivisors=1;
		for(int i=1;i<=numb1 && i<=numb2;i++) {
			if(numb1%i==0 && numb2%i==0) {
				if(i>temp_maxDivisors) {
					temp_maxDivisors=i;
				}
			}
		}
		return temp_maxDivisors;
	}
	public static void main(String[] args) {
		System.out.println(findingMaxDivisors(6,12));
	}

}
