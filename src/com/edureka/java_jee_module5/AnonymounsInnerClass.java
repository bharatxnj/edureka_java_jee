package com.edureka.java_jee_module5;

public class AnonymounsInnerClass {

	public static void main(String[] args) {
		myInterface t = new myInterface(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		

	}

}

interface myInterface {
	public void run();
}


