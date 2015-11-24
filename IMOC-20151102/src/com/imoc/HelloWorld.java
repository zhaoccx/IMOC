package com.imoc;

public class HelloWorld {
	// 内部类Inner，类Inner在类HelloWorld的内部
	public class Inner {
		// 内部类的方法
		public void show() {
			System.out.println("welcome to imooc!");
		}

		public String Mani() {
			return "ss";
		}
	}

	public static void main(String[] args) {
		// 创建外部类对象
		// HelloWorld hello = new HelloWorld();
		// 创建内部类对象
		// HelloWorld.Inner.show();
		// 调用内部类对象的方法
		// i.show();
		HelloWorld helloWorld = new HelloWorld();
		Inner inner = helloWorld.new Inner();
		// Inner inner = new Inner();
		String mani = inner.Mani();
		inner.show();
		System.out.println(mani);
	}
}
