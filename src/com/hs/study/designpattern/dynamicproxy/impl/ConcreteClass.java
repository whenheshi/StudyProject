package com.hs.study.designpattern.dynamicproxy.impl;

import com.hs.study.designpattern.dynamicproxy.interfaces.TargetInterface;

public class ConcreteClass implements TargetInterface {
	@Override
	public int targetMethodA(int number) {
		System.out.println("��ʼ����Ŀ����ķ���targetMethodA...");
		System.out.println("����-��ӡ����:" + number);
		System.out.println("��������Ŀ����ķ���targetMethodA...");
		return number;
	}

	@Override
	public int targetMethodB(int number) {
		System.out.println("��ʼ����Ŀ����ķ���targetMethodB...");
		System.out.println("����-��ӡ����:" + number);
		System.out.println("��������Ŀ����ķ���targetMethodB...");
		return number;
	}

}
