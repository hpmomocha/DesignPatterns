package com.hpe.kevin.abstractfactory.generic;

public abstract class AbstractProductA {
	// 每个产品共有的方法
	public void sharedMethod(){
	}
	
	// 每个产品相同方法，不同实现
	public abstract void doSomething();
}
