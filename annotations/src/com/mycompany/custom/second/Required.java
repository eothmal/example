package com.mycompany.custom.second;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
public @interface Required {
}

// NOTE: Required annotation will only apply on Type