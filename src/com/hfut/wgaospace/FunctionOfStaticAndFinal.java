package com.hfut.wgaospace;

public class FunctionOfStaticAndFinal {
	private static int a;
	public static int b;
	private int c;
	public int d;
	/*
	 * final����������г�ʼ���Ҳ��ɱ�
	 * final�������η�������
	 * ����ǰ�����final�ؼ��֣�����������������Ա�����ķ�����д��
	 * ʹ��final�����ε������final�ࡣfinal��ͨ�������������ģ����ǲ��ܱ��̳С�
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
		//����ʹ��this��super
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
		//ʹ��static���εķ������߱�������ֱ��ʹ������.�ķ�ʽ������
		FunctionOfStaticAndFinal.a=1;
		FunctionOfStaticAndFinal.printA();
		//����ֱ�ӷ��ʾ�̬�����ͱ���
		a=2;
		printA();
		FunctionOfStaticAndFinal classA =new FunctionOfStaticAndFinal();
		classA.printC();
		FunctionOfStaticAndFinal classB =new FunctionOfStaticAndFinal();
		//static���εķ������߱�������JVM��ֻ��һ������������ͬһ���������߷�
		classB.printA();
		classA.printB();
		classA.a=5;
		classA.printA();
		//���������ڱ���ʼ��
//		f=1;
		System.err.println(f);
		
	}
}
