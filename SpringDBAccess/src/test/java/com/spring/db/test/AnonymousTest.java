package com.spring.db.test;

public class AnonymousTest {

	public static void main(String[] args) {
		
		Car s = new Sonata();
		s.run();
		
		
		Car ferrari = new Car() {
			@Override
			public void run() {
				System.out.println("페라리는 쌩쌩 달립니다.");
			}
		};
		ferrari.run();
		
		
		new Car() {
			@Override
			public void run() {
				System.out.println("포르쉐는 팍팍 달립니다.");
			}
		}.run();
		
		
		//lambda식 적용: 인터페이스 안에 추상메서드가 단 하나일 경우에만 가능!
		Car morning = () -> {System.out.println("모닝이 뽈뽈 달립니다.");};
		morning.run();
		
		//////////////////////////////////////////////////////////////////
		
		//계산기 인터페이스 (익명 클래스)
		Calculator sharp = new Calculator() {
			@Override
			public int add(int n1, int n2) {
				System.out.println("샤프 계산기의 덧셈!");
				return n1 + n2;
			}
		};
		System.out.println("-----------------------------------------------");
		System.out.println(sharp.add(10, 15));
		
		
		//계산기 람다식
		Calculator casio = (n1, n2) -> {
			System.out.println("카시오 계산기의 덧셈!");
			return n1 + n2;
		};
		System.out.println(casio.add(10, 15));
		
		
		//딱 return만 할거면 더 생략해서 아래와 같이 작성 가능!
		Calculator xiaomi = (x, y) -> x + y;
		System.out.println("샤오미 결과: " + xiaomi.add(10, 15));
		
		
		
		
		

	}

}
