package kr.co.sanghun.study;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface MyAnnotation {

    String value() default "value";

    String name() default "sanghun";

    int number() default 10;
}
