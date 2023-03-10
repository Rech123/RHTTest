package com.example.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Makes the Call retry on failure
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface NoInternetConnection {
}
