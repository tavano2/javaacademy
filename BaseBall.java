package com.test.sample;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		System.out.println("야구 게임 시작");
		Scanner scan = new Scanner(System.in);
		String game = "";
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		while(out <3) {
			System.out.println("S : " + strike + "B :" + ball + "O :" + out);
			System.out.println("값을 입력하시오");
			game = scan.nextLine();
			switch(game) {			
			case "strike" : 
			case "Strike" : 
					strike ++;
				if(strike >= 3) {
					out ++;
					strike = 0;
					ball = 0;
				}
				break;			
			case "ball" : 
			case "Ball" : 
				ball ++;
				if(ball >= 4) {
					strike = 0;
					ball = 0;
				}
				break;			
			default :
				System.out.println("strikie 나 ball을 입력하시오.");
			}
		}
		System.out.println("Game over");				
	}						
}

