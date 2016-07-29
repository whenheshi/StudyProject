package com.hs.study.designpattern.staticproxy.impl;

import com.hs.study.designpattern.staticproxy.interfaces.Subject;

public class SubjectReal implements Subject {

	@Override
	public void dealTaskOne(String taskname) {
		System.out.println("I am doing "+taskname);
	}

}
