package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int ExpressbusDefaultfee = 850;
		int LightcarDefaultfee = 300;
		int ElseDefaultfee = 600;
		//10km 추가당 고속버스는 300원씩, 경차와 그 외는 200원씩 추가
		String Kind = "고속버스"; // 바뀔 수 있는 변수
		int distance = 10; // 바뀔 수 있는 변수
		int tmp = (distance-1) / 10;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + Kind);
		switch(Kind) {
		case "고속버스":
			System.out.println("통행료 : " + (ExpressbusDefaultfee + tmp * 300) + "원");
			break;
		case "경차":
			System.out.println("통행료 : " + (LightcarDefaultfee + tmp * 200) + "원");
			break;
		case "그 외":
			System.out.println("통행료 : " + (ElseDefaultfee + tmp * 200) + "원");
			break;
		default:
			System.out.println("넌 누구냐!!");
		}
	}
}
