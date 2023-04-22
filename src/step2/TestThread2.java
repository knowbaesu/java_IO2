package src.step2;

import step2.WorkerThread;

/*
 * step1 프로그램과 비교한다 
 * step1 은 main thread 1개가 실행. 즉 일꾼이 한명 
 * step2 는 main thread + WorkerThread : 일꾼이 두명이 동시에 실행
 * ==> 멀티 스레딩 
 * step1 과는 달리 main thread 는 WorkerThread 객체 생성 후
 * start() 실행해  스레드를 실행가능상태로 보내고 자신은 종료 
 */
public class TestThread2 {
	public static void main(String[] args) {
		//스레드를 생성해서 실행가능 상태로 보낸다
		WorkerThread wt=new WorkerThread();
		wt.start();//현 스레드를 Runnable 상태로 보냄 
		System.out.println("main thread 종료");
	}
}










