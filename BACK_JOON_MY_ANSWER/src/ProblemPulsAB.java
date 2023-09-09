
import java.util.*; // Scanner객체가 jva.utill에 포함되어있어 불어오는 과정

public class ProblemPulsAB {
	public static void main(String[] args) {
		//Scanner 객체 생성
		//클래스명은 주로 sc로,new는 새로운 객체를 heap 메모리에 할당하겠다는 의미
		//System.in은 화면에서 입력을 받겠다는 의미
		Scanner sc = new Scanner(System.in);
		
		int a, b; // 입력받은 메모리의 변수선언
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a + b);
		sc.close(); 
		// new Scanner 를 System.in을 해주었기 때문에 반드시 close 를 해주어야한다!!
	}
}
