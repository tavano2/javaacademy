package org.Chapter_02;

import java.util.Scanner;

public class Japangi {

	public static void main(String[] args) {
		// 돈 과 음료를 선택
		// {콜라 : 2000, 사이다 : 1000, 주스 : 1000, 생수: 500}
		System.out.println("음료를 선택 하세요");
		Scanner scan = new Scanner(System.in);
		String item = scan.nextLine();
		System.out.println("선택한 음료 : " + item);
		
		System.out.println("돈을 넣으세요");
		Scanner scan2 = new Scanner(System.in);
		int money = scan2.nextInt();
		System.out.println("가격 : " + money);
		
		if(item.equals("콜라") && money >= 2000) {
			System.out.println("콜라가 나왔습니다.");
		} else if (item.equals("사이다")&& money >= 1000) {
			System.out.println("사이다가 나왔습니다.");
		} else if(item.equals("주스")&& money >= 1000) {
			System.out.println("주스가 나왔습니다.");
		} else if(item.equals("생수")&& money >= 500) {
			System.out.println("생수가 나왔습니다.");
		} else {
			System.out.println("선택하신 음료는 없습니다.\n" + "돈을 반환합니다.");
		}
		
	}
	
}
