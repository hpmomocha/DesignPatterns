package com.hpe.kevin.composite;

public class Leaf extends Corp {

	// 在继承的情况下，如果new 一个子类的对象，那么就会先去调用父类的构造函数
	// 所以子类必须有和父类同样形式的构造方法
	// 构造函数是必需的
	public Leaf(String name, String position, int salary) {
		super(name, position, salary);
	}

}
