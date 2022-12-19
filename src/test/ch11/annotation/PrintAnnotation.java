package test.ch11.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 어노테이션의 용도
 * 컴파일 시 사용하는 정보전달
 * 실행 시 특정기능을 처리할 때 사용하는 정보 전달 
 * -> @PrintAnnotation(value="값", number=20)
 * 
 * 어노테이션 적용 대상
 * @Target({ElementType.열거상수, })
 * TYPE(클래스, 인터페이스, 열거타입), ANNOTATION_TYPE(어노테이션), 
 * FIELD(필드), CONSTRUCTOR(생성자), METHOD(메소드), 
 * LOCAL_VARIABLE(로컬변수), PAKAGE(패키지)
 * 
 * 어노테이션 유지 정책
 * @Retention(RetentionPolicy.열거상수)
 * 언제까지 유지할 것인지 지정해야 한다
 * SOURCE 컴파일할 때 적용 / 컴파일된 후 에 제거됨
 * CLASS 메모리로 로딩할 때 적용 / 메모리로 로딩된 후에 제거됨
 * RUNTIME 실행할 때 적용 / 계속 유지됨
 */

//@Target: 어노테이션을 사용할 수 있는 곳을 지정
//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR})
@Target({ElementType.METHOD})

//Retention : 유지정책 , 시작과 언제까지 유지 할지를 지정
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	//value: 속성
	String value() default "-";
	int number() default 15;
}
