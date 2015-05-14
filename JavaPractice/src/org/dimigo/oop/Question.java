package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String q1, q2, q3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("치킨이 맛있나요? 피자가 맛있나요?");
		q1 = scanner.nextLine();
		if("치킨".equals(q1)) {
			System.out.println("치킨보단 피자죳");
		} else if("피자".equals(q1)) {
			System.out.println("저랑 피자 하실래요?");
		} else {
			System.out.println("틀렸습니다!");
		}
		System.out.println("");

		System.out.println("가장 재미있는 게임은?");
		q2 = scanner.nextLine();
		if("스투".equals(q2) || "스타2".equals(q2) || "스타크래프트2".equals(q2)) {
			System.out.println("저랑 한 게임 하실래요?");
		} else {
			System.out.println("틀렸습니다!");
		}
		System.out.println("");
		
		System.out.println("김상욱: ( ) 에 상관없어. 괄호 안에 들어갈 말은?");
		q3 = scanner.nextLine();
		if("하등".equals(q3)) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("틀렸습니다!");
		}
		
		scanner.close();
	}
}
