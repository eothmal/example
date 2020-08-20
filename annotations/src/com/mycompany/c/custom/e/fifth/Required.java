package com.mycompany.c.custom.e.fifth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// NOTE: Reflection only work with Runtime RetentionPolicy
//@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface Required {
}
