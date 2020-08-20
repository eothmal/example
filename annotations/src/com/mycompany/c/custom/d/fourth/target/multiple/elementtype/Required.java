package com.mycompany.c.custom.d.fourth.target.multiple.elementtype;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.LOCAL_VARIABLE,ElementType.FIELD})
public @interface Required {
}

// NOTE: Required annotation will apply, Method, local variable, field