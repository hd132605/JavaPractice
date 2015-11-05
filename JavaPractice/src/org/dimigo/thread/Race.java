package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		Runner r1 = new Runner("정성민");
		Runner r2 = new Runner("정성운");
		
		r1.start();
		r2.start();
		
	}

}
