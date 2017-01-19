package com.jake.prac.di;

public class MessageRendererEnhanced {
	private MessageProvider messageProvider;

	public void setMessageProvider(MessageProvider messageProvider){
		this.messageProvider = messageProvider;
	}
	public void render(){
		System.out.println(messageProvider.getMessage());
	}

	public static void main(String[] args){
		MessageRendererEnhanced renderer = new MessageRendererEnhanced();
		renderer.setMessageProvider(new HelloWorldMessageProvider());
		renderer.render();

		renderer.setMessageProvider(new HiWorldMessageProvider());
		renderer.render();
	}
}
