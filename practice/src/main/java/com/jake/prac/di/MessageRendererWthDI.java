package com.jake.prac.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRendererWthDI {
	private MessageProvider messageProvider;

	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	public void render() {
		System.out.println(messageProvider.getMessage());
	}

	public static void main(String[] args) {
/*		MessageRendererWthDI renderer = new MessageRendererWthDI();
		renderer.setMessageProvider(new HelloWorldMessageProvider());
		renderer.render();

		renderer.setMessageProvider(new HiWorldMessageProvider());
		renderer.render();*/

		ApplicationContext ac = new ClassPathXmlApplicationContext("di.xml");
		MessageRendererWthDI renderer = (MessageRendererWthDI)ac.getBean("messageRenderer");
		renderer.render();
	}
}
