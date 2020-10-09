package com.edureka.java_jee.module_4.threads;

import java.util.ArrayList;
import java.util.List;

public class TestProducerConsumer {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
		Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
		tProducer.start();
		tConsumer.start();

		tProducer.join();
		tConsumer.join();
		System.out.println("Completed the execution.");
	}
}
