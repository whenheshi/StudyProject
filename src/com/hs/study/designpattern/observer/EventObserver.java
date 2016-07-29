package com.hs.study.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class EventObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		((EventObserveable) o).logicHandler(arg.toString());
	}

}
