package com.mysite.ssb;

import lombok.Getter; 

@Getter 
public class HelloLombok {
	private final String hello; 
    private final int lombok; 
    
    public HelloLombok(String hello, int lombok) { 
        this.hello = hello; 
        this.lombok = lombok; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloLombok helloLombok = new HelloLombok("헬로", 5); 
        System.out.println(helloLombok.getHello()); 
        System.out.println(helloLombok.getLombok()); 

	}

}
