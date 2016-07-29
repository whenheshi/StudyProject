package com.hs.study.designpattern.observer;

import java.util.Observer;

public class EventSource {
	private EventObserveable ob = new EventObserveable();  
    
    public void addEventListener(Observer listener) {  
        ob.addObserver(listener);  
    }  
  
    public void removeEventListener(Observer listener) {  
        ob.deleteObserver(listener);  
    }  
      
    public void notifyEvent(Object arg) {  
        ob.dosomething(arg);
    }  
}
