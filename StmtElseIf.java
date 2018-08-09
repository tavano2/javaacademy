package org.Chapter_02;

import java.util.Scanner;

public class StmtElseIf {

	public static void main(String[] args) {
		
		
			
			System.out.println("음료를 선택하세요 : ");
			Scanner scan = new Scanner(System.in);
			String item = scan.nextLine();
			System.out.println(item + "을(를) 선택 하셨네요.");
			if(item.equals("콜라"))	{	
				System.out.println("콜라가 나왔습니다");		
			}	
			else if(item.equals("생수")) {
				System.out.println("생수가 나왔습니다");
			}	
			else if(item.equals("주스")) {
				System.out.println("주스가 나왔습니다");
			}
			else if (item.equals("사이다")) {
				System.out.println("사이다가 나왔습니다");
			} else {
				System.out.println("선택하신 음료가 없습니다.");
			}

		 

	}

}
