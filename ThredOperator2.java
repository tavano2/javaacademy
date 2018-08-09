package org.Chapter_02;

import java.util.Scanner;

public class ThredOperator2 {

	public static void main(String[] args) {
		
		System.out.println("음료를 선택 하세요");
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		System.out.println("선택한 음료 : " + item);
		
		System.out.println("돈을 넣으세요");
		Scanner scan2 = new Scanner(System.in);
		int money = scan2.nextInt();
		System.out.println("가격 : " + money);
		
		
		String item_money = item.equals("콜라") && money >= 2000 ?  "콜라가 나왔습니다" :
										// 아이템 이름이 콜라이고 입력 가격이 2000원 보다 같거나 높을시
										item.equals("사이다") && money >= 1000 ? "사이다가 나왔습니다" :
										// 아이템 이름이 사이다이고 입력 가격이 1000원 보다 같거나 높을시
										item.equals("주스") && money >= 1000 ? "주스가 나왔습니다" :
										// 아이템 이름이 주스이고 입력 가격이 1000원 보다 같거나 높을시
										item.equals("생수") && money >= 500 ? "주스가 나왔습니다" :
										// 아이템 이름이 생수이고 입력 가격이 500원 보다 같거나 높을시
										"음료가 제대로 선택되지 않았거나\n돈이 부족합니다.";
										// 아이템 이름이 다르거나 입력 가격이 부족할시
										
		System.out.println(item_money);
		

	}

}

