package com.hs.study.designpattern.observer;

public class ObserveClient {
	public static void main(String[] args) {
		EventSource ds = new EventSource();
		ds.addEventListener(new EventObserver());
		ds.notifyEvent("Hello Heshi ! ");
	}
}
