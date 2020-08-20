package com.mycompany.custom.d.fourth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.LOCAL_VARIABLE,ElementType.FIELD})
public @interface Required {
}

// NOTE: Required annotation will only apply on Type