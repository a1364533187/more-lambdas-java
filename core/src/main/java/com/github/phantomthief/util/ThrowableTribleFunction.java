package com.github.phantomthief.util;

/**
 * @author suzhiwu
 */
@FunctionalInterface
public interface ThrowableTribleFunction<T, U, V, R, X extends Throwable> {

    R apply(T t, U u, V v) throws X;
}
