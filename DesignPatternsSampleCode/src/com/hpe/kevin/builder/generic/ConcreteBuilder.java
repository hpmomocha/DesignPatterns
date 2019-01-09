package com.hpe.kevin.builder.generic;

/**
 * 具体建造者类
 * 如果有多个产品类就有几个具体的建造者，而且这多个产品类具有相同接口或抽象类
 * 
 * @author junzhang
 *
 */
public class ConcreteBuilder extends Builder {
	private Product product = new Product();
	
	@Override
	public void setPart() {
		// 产品类内的逻辑处理

	}

	@Override
	public Product buildProduct() {
		return this.product;
	}

}
