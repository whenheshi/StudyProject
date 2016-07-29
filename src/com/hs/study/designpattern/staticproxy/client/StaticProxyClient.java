package com.hs.study.designpattern.staticproxy.client;

import com.hs.study.designpattern.staticproxy.factories.SubjectStaticFactory;
import com.hs.study.designpattern.staticproxy.interfaces.Subject;

public class StaticProxyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject proxy = SubjectStaticFactory.getInstance();
		proxy.dealTaskOne("kissing");
	}

}
