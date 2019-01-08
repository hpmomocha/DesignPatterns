package com.hpe.kevin.factory.extend.multifactory;

import com.hpe.kevin.factory.Human;
import com.hpe.kevin.factory.WhiteHuman;

/**
 * 多工厂模式
 * @author junzhang
 *
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}