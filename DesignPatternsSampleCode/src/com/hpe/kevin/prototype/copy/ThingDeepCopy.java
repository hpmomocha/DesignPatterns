package com.hpe.kevin.prototype.copy;

import java.util.ArrayList;

public class ThingDeepCopy implements Cloneable {
	// 定义一个私有变量
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	//设置arrayList的值
	public ArrayList<String> getValue() {
		return arrayList;
	}
	//取得arrayList的值
	public void setValue(String value) {
		this.arrayList.add(value);
	}

	@Override
	public ThingDeepCopy clone() {
		ThingDeepCopy thingDeepCopy = null;
		try {
			thingDeepCopy = (ThingDeepCopy) super.clone();
			thingDeepCopy.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thingDeepCopy;
	}
}
