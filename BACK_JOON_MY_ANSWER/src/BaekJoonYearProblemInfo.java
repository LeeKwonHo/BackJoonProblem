
public class BaekJoonYearProblemInfo {
	//불기년도 계산문제 불기년도는 현재 년도에 544년 앞선다
	int nowYear;
	int year;
	
	public BaekJoonYearProblemInfo(int year) {
		nowYear = year;
		this.year = year + 544;
	}
}
