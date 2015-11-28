package com.imoc.sanf;

public class One {
	public static void main2(String[] args) {
		// 创建一个空的StringBuilder对象
		StringBuffer str = new StringBuffer();
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
		// 从后往前每隔三位插入逗号
		for (int i = str.length() - 3; i >= 0; i = i - 3) {
			str.insert(i, ",");
		}
		// 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
	}

	public static void main(String[] args) {
		// 定义一个整型数组，长度为10
		int[] nums = new int[10];
		// 通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
			// 产生10以内的随机数
			int x = (int) (Math.random() * 10);
			nums[i] = x;// 为元素赋值
		}
		// 使用foreach循环输出数组中的元素
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
