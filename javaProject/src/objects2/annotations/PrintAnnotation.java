package objects2.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD}) //적용대상
@Retention(RetentionPolicy.RUNTIME) //적용시점
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
