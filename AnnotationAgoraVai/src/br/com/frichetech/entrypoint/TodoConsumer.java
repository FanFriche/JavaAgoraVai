package br.com.frichetech.entrypoint;

import java.lang.reflect.Method;

import br.com.frichetech.cross.Todo;
import br.com.frichetech.usecase.Implementacao;

public class TodoConsumer {
	
	public static void main(String[] args) {
		consumir();
	}
	
	public static void consumir() {
		Class<Implementacao> businessLogicClass = Implementacao.class;
		
		for(Method method : businessLogicClass.getMethods()) {
			Todo todoAnnotation = (Todo)method.getAnnotation(Todo.class);
			if(todoAnnotation != null) {
				System.out.println(" Method Name : " + method.getName());
				System.out.println(" Author : " + todoAnnotation.autor());
				System.out.println(" Priority : " + todoAnnotation.prioridade());
				System.out.println(" Status : " + todoAnnotation.status());
			}
		}
	}
}
