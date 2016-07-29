package com.hs.study.designpattern.staticproxy.proxy;

import com.hs.study.designpattern.staticproxy.interfaces.Subject;

public class SubjectProxy implements Subject {
	private Subject delegate;
	
	public SubjectProxy(Subject delegate){
		this.delegate = delegate;
	}

	@Override
	public void dealTaskOne(String taskname) {
		 long stime = System.currentTimeMillis();   
		  //��������ɸ�ί���ദ��  
		  delegate.dealTaskOne(taskname);
		  long ftime = System.currentTimeMillis();   
		  System.out.println("ִ�������ʱ"+(ftime - stime)+"����");  
	}

}
