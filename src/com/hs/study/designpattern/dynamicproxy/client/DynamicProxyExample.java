package com.hs.study.designpattern.dynamicproxy.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.hs.study.designpattern.dynamicproxy.handlers.ProxyHandler;
import com.hs.study.designpattern.dynamicproxy.impl.ConcreteClass;
import com.hs.study.designpattern.dynamicproxy.impl.DoSomethingImpl;
import com.hs.study.designpattern.dynamicproxy.interfaces.DoSomethingInterface;
import com.hs.study.designpattern.dynamicproxy.interfaces.TargetInterface;

public class DynamicProxyExample {
	 public static void main(String[] args){  
//         ConcreteClass c=new ConcreteClass();//Ԫ����(���������)  
//         InvocationHandler ih=new ProxyHandler(c);//����ʵ���ĵ��ô������  
//         //����һ��ʵ��ҵ��ӿڵĴ�����,���ڷ���ҵ����(������ģʽ)��  
//         //����һ��ָ���ӿڵĴ�����ʵ�����ýӿڿ��Խ���������ָ�ɵ�ָ���ĵ��ô��������ProxyHandler��  
//         TargetInterface targetInterface=  
//             (TargetInterface)Proxy.newProxyInstance(c.getClass().getClassLoader(),c.getClass().getInterfaces(),ih);  
//         //���ô����෽��,Javaִ��InvocationHandler�ӿڵķ���.  
//         int i=targetInterface.targetMethodA(5);  
//         System.out.println(i);
//         System.out.println(); 
//         int j=targetInterface.targetMethodB(15);  
//         System.out.println(j);
         
         
		 DoSomethingImpl doSomething = new DoSomethingImpl();
         InvocationHandler dh = new ProxyHandler(doSomething);
         DoSomethingInterface ds = (DoSomethingInterface)Proxy.newProxyInstance(doSomething.getClass().getClassLoader(),doSomething.getClass().getInterfaces(),dh);
         String str = ds.doOne("heshi");
         System.out.println(str);
         boolean bl = ds.doTwo(str);
         System.out.println(bl);
    }  
}
