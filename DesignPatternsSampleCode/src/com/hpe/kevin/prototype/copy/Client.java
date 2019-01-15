package com.hpe.kevin.prototype.copy;

public class Client {
	// 浅拷贝测试
	public static void main(String[] args) {
		//产生一个对象
		Thing thing = new Thing();
		//设置一个值
		thing.setValue("张三");
		//拷贝一个对象
		Thing cloneThing = thing.clone();
		cloneThing.setValue("李四");
		System.out.println(thing.getValue()); // 结果为[张三, 李四]
	}
}
