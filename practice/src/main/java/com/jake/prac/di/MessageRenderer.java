package com.jake.prac.di;

public class MessageRenderer {
	public void renderHello(){
		MessageProvider mp = new HelloWorldMessageProvider();
		System.out.println(mp.getMessage());
	}

	public void renderHi(){
		MessageProvider mp = new HiWorldMessageProvider();
		System.out.println(mp.getMessage());
	}

	public void render(){
		MessageProvider mp = new HelloWorldMessageProvider();
		System.out.println(mp.getMessage());
	}

	public static void main(String[] args){
		MessageRenderer renderer = new MessageRenderer();
		renderer.renderHello();
		renderer.renderHi();
	}
}
