package test.ch11.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declareMethods = Service.class.getDeclaredMethods();
		for(Method method : declareMethods) {
			//PrintAnnotation 얻어오기
			//getAnnotation(AnnotationName.class)
			PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class);
		
			printLine(printAnno);
			
			//invoke(객체) 메소드를 실행시킴
			//Service객체 안에 있는 method1, method2, method3를 실행시킴
			method.invoke(new Service());
		}

	}
	
	public static void printLine(PrintAnnotation printAnno) {
		if(printAnno != null) {
			//number, value속성 값 얻기
			int number = printAnno.number();
			String value = printAnno.value();
			
			System.out.println(number);
			System.out.println(value);
			
		}
	}

}
