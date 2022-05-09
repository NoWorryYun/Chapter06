package com.javaex.ex02;

/*
Thread(클래스의 예상도)

필드

생성자 출장기능...
	 해야할 일...
	 run();
메소드GS

메소드 일반

*/
public class UpperThread extends Thread {

	// 필드

	// 생성자

	// GS

	// 일반
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
