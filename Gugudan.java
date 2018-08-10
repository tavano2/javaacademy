package com.test.sample;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		
		System.out.println("단수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		for(int a = 1; a < 10; a++) {
			System.out.println(val + "*" + a  +"=" + val*a );
		}				
	}
}
