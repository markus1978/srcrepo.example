package de.hub.example.java;

public class ReferencedRenamed {

	public void run() {		
		System.out.println("Hello world.");
		log("Hello world printed.");
	}
	
	public void log(String msg) {
		System.out.println("# " + msg);
	}
}
