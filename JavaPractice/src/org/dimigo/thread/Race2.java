package org.dimigo.thread;

public class Race2 {

	public static void main(String[] args) {
		Thread r1 = new Thread(new Runner2("정성민"));
		r1.setPriority(Thread.MAX_PRIORITY);
		Thread r2 = new Thread(new Runner2("정성운"));
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
	}

}
