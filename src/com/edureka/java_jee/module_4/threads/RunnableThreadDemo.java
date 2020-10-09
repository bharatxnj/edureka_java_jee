package com.edureka.java_jee.module_4.threads;

public class RunnableThreadDemo {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable(){
			@Override
			public void run() {
				for (int index = 0; index < 10; index++) {
					System.out
							.println("Thread name is " + Thread.currentThread().getName() + " printing the value of " + index);
				}
				System.out.println("Printed from the " + Thread.currentThread().getName());
			}
			
		});
		thread.setName("Child Thread");
		thread.start();

		for (int index = 0; index < 10; index++) {
			System.out.println(Thread.currentThread().getName() + " priting the index value as " + index);
		}
		System.out.println("Printed from the " + Thread.currentThread().getName());

	}

}
