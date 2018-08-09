package org.Chapter_02;

public class ThredOperator {

	public static void main(String[] args) {
		// 값 = 조건 ? 맞으면 : 틀리면
		
		int bread = 100;
		String bead = bread <=100 && bread >=90? "S학점" :
								// 점수가 90점 이상일시 S학점
							 bread < 90 && bread >= 70 ? "A학점" :  
								 // 점수가 85~70점일시 A학점
							 bread < 70 && bread >= 60? "B학점" : "C학점";
							    // 점수가 70~60점일시 B학점, 60점 아래일시 C학점 
		System.out.println("임수철 학생의 학점은 " + bead + "입니다.");

	}

}
