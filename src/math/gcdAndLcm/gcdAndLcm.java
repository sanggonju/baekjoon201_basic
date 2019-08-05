package math.gcdAndLcm;

import java.util.Scanner;

/*
문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

예제 입력 1 
24 18
예제 출력 1 
6
 */
public class gcdAndLcm{
	public static void main(String[] args) {
		gcdAndLcm gal = new gcdAndLcm();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = gal.findGcd(a, b);
		
		int lcm = (a*b) /gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
	}
		
	
	private int findGcd(int a, int b) {
			while( b!= 0) {
				int r = a%b;
				a=b;
				b=r;
			}
			return a;
	}
	
}


/*
	[최대공약수GCD]
	두수 a와 b의 공통된 약수 중 가장 큰 정수
	
	*최대공약수를 구하는 방법
	= 2부터 min(a,b)까지 모든 수를 나누어 보는 방법.
	##min(a,b)란 둘중 작은수
	
	[[[방법1]]]
	int gcd = 1;
	
	for(int i=2; i<=min(a,b); i++){
		if(a % i == 0 && b % i == 0){
			g = i;
		}
	}
	
	
	[[[방법2]]] 위에것 보다 빠른 방법 _ 유클리드 호제법
	a를 b로 나눈 나머지를 r 이라고 할때,
	GCD(a,b) = GCD(b,r)과 같다.
	
	r=0일떄 b 가 최대공약수이다.
	
	ex) gcd(24,16) = gcd(16,8) = gcd(8,0) == 8(gcd)
	
	--유클리드 호제법(재귀)
	int gcd(int a,int b) {
		if(b==0){
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	----> 시간복잡도 0(logN)
	
	--유클리드 호제법(반복)
	int gcd(int a,int b) {
		while( b!= 0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
	----> 시간복잡도 0(logN)
	
	
	
	세수의 최대공약수
	
	gcd(a,b,c) = gcd(gcd(a,b),c) 와 같은방식으로 해서 구할 수 있다.
	

----------------------------------------------------------------
	[[최소공배수Least Common Multiple]]
	
	최소공배수는 두 수의 공통된 배수 중 가장 작은 정수
	
	최소 공배수는 GCD를 응용하여 구할 수 있다.
	
----두수 a,b의 최대공약수가 g 일떄,
    최소 공배수 lcm = g*(a/g)*(b/g) == (a*b)/gcd이다.
	



*/
