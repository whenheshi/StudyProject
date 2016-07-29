package com.hs.study.designpattern.staticproxy.factories;

import com.hs.study.designpattern.staticproxy.impl.SubjectReal;
import com.hs.study.designpattern.staticproxy.interfaces.Subject;
import com.hs.study.designpattern.staticproxy.proxy.SubjectProxy;

public class SubjectStaticFactory {
	public static Subject getInstance() {
		return new SubjectProxy(new SubjectReal());
	}
}
