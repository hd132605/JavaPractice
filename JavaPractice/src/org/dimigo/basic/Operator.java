package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		double trapezoidArea = (9 + 10) * 5.8 * 0.5;
		double parallelogramArea = 9 * 5.4;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + trapezoidArea);
		System.out.println("평행사변형 넓이 : " + parallelogramArea);
		System.out.println("");
		
		if(trapezoidArea > parallelogramArea) {
			System.out.println("사다리꼴이 평행사변형보다 " + (trapezoidArea - parallelogramArea) + " 더 큽니다.");
		}
		else if(trapezoidArea == parallelogramArea) {
			System.out.println("사다리꼴과 평행사변형의 넓이는 같습니다");
		}
		else {
			System.out.println("평행사변형이 사다리꼴보다 " + (parallelogramArea - trapezoidArea) + " 더 큽니다.");
		}
	}

}
