package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		Runner r1 = new Runner("정성민");
		r1.setPriority(Thread.MAX_PRIORITY);
		Runner r2 = new Runner("정성운");
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
	}

}
