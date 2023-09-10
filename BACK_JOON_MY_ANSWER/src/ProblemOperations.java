import java.util.*;
public class ProblemOperations {

	public static void main(String[] args) {
		// 사칙연산
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("첫번째 수를 입력하세요:");
		a = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요:");
		b = sc.nextInt();
		
		int result1 = a+b;
		int result2 = a-b;
		int result3 = a*b;
		int result4 = a/b;
		int result5 = a%b;
		
		System.out.println("더하기:" + result1);
		System.out.println("빼기:" + result2);
		System.out.println("곱하기:" + result3);
		System.out.println("나누기:" + result4 +  ", 나머지:" + result5);
		
		sc.close();
	}

}
