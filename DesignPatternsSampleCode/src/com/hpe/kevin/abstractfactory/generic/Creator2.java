package com.hpe.kevin.abstractfactory.generic;

public class Creator2 extends AbstractCreator {

	@Override
	public AbstractProductA createProductA() {
		// 只生产产品等级为2的B产品
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		// 只生产产品等级为2的B产品
		return new ProductB2();
	}

}
