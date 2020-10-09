package com.edureka.java_jee.module_4.threads;


import java.util.Date;
import java.util.List;

class Producer implements Runnable {
	
	private final List<Integer> taskQueue;
	
	private final int MAX_CAPACITY;

	public Producer(List<Integer> taskQueue, int size) {
		this.taskQueue = taskQueue;
		this.MAX_CAPACITY = size;

	}
	
	@Override
	public void run() {
		int counter = 0;
		int  counterVal = 10;
		while (counterVal > 0) {
			try {
				counterVal --;
				produce(counter++);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		synchronized (taskQueue) {
			
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: "
						+ taskQueue.size()+"Time: "+new Date(System.currentTimeMillis()));
				taskQueue.wait();
			}

			Thread.sleep(2000);
			taskQueue.add(i);
			System.out.println("Produced: " + i);
			taskQueue.notifyAll();
		}
	}
}
