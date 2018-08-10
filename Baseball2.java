package com.test.sample;

import java.util.Scanner;

public class Baseball2 {

	public static void main(String[] args) {
		System.out.println("경기 시작");
		Scanner scan = new Scanner(System.in);
		int item = scan.nextInt();
		System.out.println("ball : " + item);
		
		String ball_game = item <= 4 ? "Ball" : "";
	}

}
