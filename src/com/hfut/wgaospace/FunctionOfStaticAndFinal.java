package com.hfut.wgaospace;

public class FunctionOfStaticAndFinal {
	private static int a;
	public static int b;
	private int c;
	public int d;
	/*
	 * final变量必须进行初始化且不可变
	 * final可以修饰方法和类
	 * 方法前面加上final关键字，代表这个方法不可以被子类的方法重写。
	 * 使用final来修饰的类叫作final类。final类通常功能是完整的，它们不能被继承。
	 */
	private static final int f=0;
	static{
		FunctionOfStaticAndFinal.b=2;
		System.out.println("b: "+b);
		FunctionOfStaticAndFinal t=new FunctionOfStaticAndFinal();
		t.b=3;
		t.printB();
	}
	public FunctionOfStaticAndFinal() {
		// TODO Auto-generated constructor stub
	}
	
	private static void printA() {
		//不能使用this与super
		System.out.println("a"+a);
	}

	public static void printB() {
		System.out.println("b"+b);
	}

	private void printC() {
		System.out.println("c"+c);
	}

	public void printD() {
		System.out.println("d"+d);
	}
	
	public static void main(String[] args) {
		//使用static修饰的方法或者变量可以直接使用类名.的方式来访问
		FunctionOfStaticAndFinal.a=1;
		FunctionOfStaticAndFinal.printA();
		//可以直接访问静态方法和变量
		a=2;
		printA();
		FunctionOfStaticAndFinal classA =new FunctionOfStaticAndFinal();
		classA.printC();
		FunctionOfStaticAndFinal classB =new FunctionOfStaticAndFinal();
		//static修饰的方法或者变量，在JVM中只有一个拷贝，访问同一个变量或者法
		classB.printA();
		classA.printB();
		classA.a=5;
		classA.printA();
		//常量不能在被初始化
//		f=1;
		System.err.println(f);
		
	}
}
