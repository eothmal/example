package com.mycompany.custom.third;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.PARAMETER)
public @interface Required {
}

// NOTE: Required annotation will only apply on Type