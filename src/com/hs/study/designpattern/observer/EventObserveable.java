package com.hs.study.designpattern.observer;

import java.util.Observable;

public class EventObserveable extends Observable{
	public void dosomething(Object o){
		super.setChanged();
		super.notifyObservers(o);
	}
	
	public void logicHandler(String name) {  
        // ... logic handle here , like :  
        System.out.println("Object arg is :" + name);  
    }  
}
