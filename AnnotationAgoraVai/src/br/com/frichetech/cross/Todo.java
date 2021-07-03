package br.com.frichetech.cross;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
	
	String autor() default "Afrânio";
	
	Prioridade prioridade() default Prioridade.LOW;
	
	Status status() default Status.NOT_STARTED;
}
