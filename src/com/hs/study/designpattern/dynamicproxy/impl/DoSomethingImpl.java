package com.hs.study.designpattern.dynamicproxy.impl;

import com.hs.study.designpattern.dynamicproxy.interfaces.DoSomethingInterface;

public class DoSomethingImpl implements DoSomethingInterface {

	@Override
	public String doOne(String str) {
		System.out.println("do No1.");
		return str.concat(" is a pig");
	}

	@Override
	public boolean doTwo(String str) {
		System.out.println("do No2.");
		return str.startsWith("a");
	}

}
