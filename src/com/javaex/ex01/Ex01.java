package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		
		//출장 가라 > 준비되는대로 시작하라(숫자찍어라)
		Thread thread = new DigitThread();
		thread.start();
		//thread.run(); < 코드를 run에다 짰다고해서 start가 아닌 run으로 시작하면 차례대로 실행됨
		//출장의 개념 X
		
		
		for (char ch = 'A'; ch <= 'Z'; ch++ ) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
