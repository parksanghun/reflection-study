package kr.co.sanghun.study;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited
public @interface AnotherAnnotation {

    String value() default "";

    String name() default "sanghun";

    int number() default 10;
}
