package com.mycompany.custom.c.third.target.parameter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.PARAMETER)
public @interface Required {
}

// NOTE: Required annotation will only apply on Type