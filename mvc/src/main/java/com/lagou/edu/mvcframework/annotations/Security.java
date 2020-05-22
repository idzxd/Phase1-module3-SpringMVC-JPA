package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Security {
    String[] value();//可能存在多个用户名
}
