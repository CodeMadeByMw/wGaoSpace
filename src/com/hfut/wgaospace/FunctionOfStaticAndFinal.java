package com.hfut.wgaospace;

public class FunctionOfStaticAndFinal {
	private static int a;
	public static int b;
	private int c;
	public int d;

	public FunctionOfStaticAndFinal() {
		// TODO Auto-generated constructor stub
	}
	
	private static void printA() {
		System.out.println(a);
	}

	public static void printB() {
		System.out.println(b);
	}

	private void printC() {
		System.out.println(a);
	}

	public void printD() {
		System.out.println(b);
	}
	
	private void mai() {
		// TODO Auto-generated method stub
		FunctionOfStaticAndFinal staticAndFinalA=new FunctionOfStaticAndFinal();
		staticAndFinalA.printC();
	}
}
