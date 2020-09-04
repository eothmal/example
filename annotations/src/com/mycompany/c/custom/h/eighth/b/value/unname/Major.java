package com.mycompany.c.custom.h.eighth.b.value.unname;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Major {
    String value();
}

// NOTE : value is keyword a special meaning for attribute