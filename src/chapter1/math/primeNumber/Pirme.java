package math.primeNumber;

/*
소수 구하기
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	256 MB	41842	11811	8256	28.386%
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력 1 
3 16
예제 출력 1 
3
5
7
11
13
 */

import java.util.Scanner;

public class Pirme {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] check = new boolean[m+1];
        check[0] = true;
        check[1] = true;
        // 2보다 작은 경우에는 무조건 소수가 아니기 떄문에 제거
        
        for(int i = 2; i<=m; i++){
    		if(check[i] ==false){
    			for(int j = i*2; j<=m; j+=i) {
    				check[j] = true;
    			}
    		}
    	}
        
        for(int i = n; i <= m; i++) {
        	if (check[i] == false) {
                System.out.println(i);
            }
        }
        
        
	}
}


/*
	N이 소수가 되려면 2<= N < N-1
	으로 나누어 떨어지면 안된다.
  
  bool prime(int n){
  	if(n<2){
  		return false;
	}
	
	for (int =2; i*i <=n; i++){
		if(n%i == 0){
			return false;
		}
	}
  	return true;
  }
   시간복잡도 O(루트N)
  
  
  
  
  
  1~N 까지 범위안에 들어가는 모든 소수를 구하는 방법 : 에라토스테네스의 체
   
  에라토스테네스의 체: 1. 2부터 N까지 모든 수를 써 놓는다.
                2. 아직 지워지지 않은 수 중에서 가장 작은 수를 찾는다.
                3. 그 수는 소수이다.
                4. 이제 그수의 배수를 모두 지운다.
                
	int prime[100] //소수 저장
	int pn = 0; 소수의 개수
	bool check[101]; //지워졌으면 true;
	int n = 100; //100까지의 소수를 구하자
	
	for(int=2; i<=n; i++){
		if(check[i] ==false){
			prime[pn++] == i;
			for(int j = i*2; j<=n j+=i) {
				check[j] = true;
			}
		}
	
	}
 */
