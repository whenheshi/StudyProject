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
		  //将请求分派给委托类处理  
		  delegate.dealTaskOne(taskname);
		  long ftime = System.currentTimeMillis();   
		  System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");  
	}

}
