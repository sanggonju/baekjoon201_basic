package chapter1.math.mod_01;

import java.util.Scanner;

/*
문제
(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

출력
첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

예제 입력 1 
5 8 4
예제 출력 1 
1
1
0
0
 */

public class mod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String insVal = "";
		int a, b, c ;
		insVal= sc.nextLine();
		
		String[] s = insVal.split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);
		
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
		
		
		
		


	}

}




/*
 * [[[나머지 연산]]]
**나머지 연산의 법칙
* 1) (A+B) mod M = ( (A mod M) + (B mod M) ) mod M 
* 2) (AXB) mod M = ( (A mod M) X (B mod M) ) mod M
* 뺄샘의 경우는 음수가 나올 수 있음으로 아래와 같이 
* 3) (A-B) mod M = ( (A mod M) - (B mod M) + M ) mod M   // M을 한번 더해준다
* 4) 나누기의 경우 성립 하지 않음. Modular Inverse를 구해야함.
 	____나누기의 경우에는 (axb^c-2)%c = (a/b)%c [[페르마의 소정리]] 
 		단, a와 b가 서로소이고 c는 소수 일 경우에만 적용됨.
 */





