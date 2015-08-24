package org.projectodd.jrapidoc.annotation.soap.wsprovider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DocParam {

    boolean isHeader() default false;

    boolean isRrequired() default false;

    Class<?> type();

    String description() default "";
}