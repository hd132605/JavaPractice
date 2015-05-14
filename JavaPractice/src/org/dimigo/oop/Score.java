package org.dimigo.oop;

import java.util.Scanner;
public class Score {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		int total = kor + math + eng;
		double avg = total / 3.0;
		
		StringBuilder str = new StringBuilder()
		.append("<<점수 출력>>\n")
		.append("국어 점수 : ")
		.append(kor)
		.append("점\n수학 점수 : ")
		.append(math)
		.append("점\n영어 점수 : ")
		.append(eng)
		.append("점\n총점 : ")
		.append(total)
		.append("점\n평균 : ")
		.append(String.format("%.1f점", avg));
		System.out.println(str);

	}

}
