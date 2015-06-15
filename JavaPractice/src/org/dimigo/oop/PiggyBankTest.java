package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember daddy = new FamilyMember("아빠");
		FamilyMember mommy = new FamilyMember("엄마");
		FamilyMember me = new FamilyMember("나");
		FamilyMember youngbro = new FamilyMember("남동생");
		PiggyBank piggy = new PiggyBank();
		FamilyMember.printMemberCnt();
		piggy.putMoney(daddy, 10000);
		piggy.putMoney(mommy, 5000);
		piggy.putMoney(me, 2000);
		piggy.putMoney(youngbro, 1000);
		piggy.printBalance();
		piggy.putMoney(me, 1000);
		piggy.printBalance();
	}

}
