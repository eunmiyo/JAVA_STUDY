package test.ch11.reflection;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;

//클래스안에 있는 import 
import java.lang.reflect.*;

public class ReflectionEx {

	public static void main(String[] args) {
		//클래스로부터 정보 얻기
		Class clazz = Car2.class; 		
		
		System.out.println("[필드 정보]");
		//클래스에 선언된 필드 정보들을 가져온다.
		Field[] fields = clazz.getDeclaredFields();
		
		//for(타입 변수명: 반복대상) : 배열 값을 루프로 가져온다
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " + field.getName());
		}
		

		System.out.println("[생성자 정보]");
		//클래스에 선언된 생성자 정보들을 가져온다.
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			//파라메터의 타입을 불러온다.
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println();
		System.out.println("[메소드 정보]");
		//클래스에 선언된 메소드 정보들을 가져온다.
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(" );
			//파라메터의 타입을 불러온다.
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	//Class[] parameters: parameters변수에는 Class[]객체 배열이 있다.
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			//메소드에 파라메타 타입이 여러개 일 때 ,로 구분
			// -1 해준이유는? 마지막에 ,를 찍지 않기 위해
			if(i < parameters.length -1) {
				System.out.print(",");
			}
		}
	}

}
