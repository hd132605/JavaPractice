package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int SalaryPerMonth = 1700000;
		int workerNum = 3;
		int marketNum = 1500;
		long payPerYear = (long)SalaryPerMonth * workerNum * marketNum * 12;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", SalaryPerMonth));
		System.out.println("점포 내 직원 수 : " + workerNum + "명");
		System.out.println("점포 수 : " + String.format("%,d", marketNum) + "개");
		System.out.println("");
		System.out.println("");
		System.out.println("연간 인건비 : " + String.format("%,d", payPerYear));

	}

}
