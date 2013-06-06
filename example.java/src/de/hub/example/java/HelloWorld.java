package de.hub.example.java;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This is a java doc comment for a top-level class.
 */
public class HelloWorld {
	
	/**
	 * This is a innter class doc.
	 */
	private abstract class InnerClass<E> extends ArrayList<E> implements Serializable {
		
	}
	
	/*
	 * This is a comment just somewhere.
	 */
	
	/**
	 * This is a java doc comment just somewhere.
	 */

	/**
	 * This is a java doc commit at a method.
	 */
	public static void main(String args) {
		// a Comment
		new Referenced().run();
	}

}
