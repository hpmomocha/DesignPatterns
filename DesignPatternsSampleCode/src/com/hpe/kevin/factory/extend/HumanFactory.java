package com.hpe.kevin.factory.extend;

import com.hpe.kevin.factory.Human;

/**
 * 简单工厂模式
 * @author junzhang
 *
 */
public class HumanFactory {
	
	public static <T extends Human> T createHuman(Class<T> c) {
		// 定义一个生产出的人种
		Human human = null;
		
		try {
			// 产生一个人种
			human = (T) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			System.out.println("人种生成错误！");
		}
		return (T) human;
	}
}