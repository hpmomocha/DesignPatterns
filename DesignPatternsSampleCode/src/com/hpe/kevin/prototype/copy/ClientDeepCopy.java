package com.hpe.kevin.prototype.copy;

public class ClientDeepCopy {
	// 浅拷贝测试
	public static void main(String[] args) {
		//产生一个对象
		ThingDeepCopy thingDeepCopy = new ThingDeepCopy();
		//设置一个值
		thingDeepCopy.setValue("张三");
		//拷贝一个对象
		ThingDeepCopy cloneThing = thingDeepCopy.clone();
		cloneThing.setValue("李四");
		System.out.println(thingDeepCopy.getValue()); // 结果为[张三]
		System.out.println(cloneThing.getValue());    // 结果为[张三, 李四]
	}
}
