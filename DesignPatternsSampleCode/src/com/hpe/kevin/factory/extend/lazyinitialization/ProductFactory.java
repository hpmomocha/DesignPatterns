package com.hpe.kevin.factory.extend.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

import com.hpe.kevin.factory.generic.ConcreteProduct1;
import com.hpe.kevin.factory.generic.ConcreteProduct2;
import com.hpe.kevin.factory.generic.Product;

public class ProductFactory {
	private static final Map<String, Product> prMap = new HashMap();
	public static synchronized Product createProduct(String type) throws Exception {
		Product product = null;
		// 
		if(prMap.containsKey(type)) {
			product = prMap.get(type);
		} else {
			if (type.equals("Product1")) {
				product = new ConcreteProduct1();
			} else if (type.equals("Product2")) {
				product = new ConcreteProduct2();
			}
			// 同时把对象放到缓存容器中
			prMap.put(type, product);
		}
		return product;
	}
}