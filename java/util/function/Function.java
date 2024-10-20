/*
 * Decompiled with CFR 0.152.
 */
package java.util.function;

public interface Function<T, R> {
    public <V> Function<T, V> andThen(Function<? super R, ? extends V> var1);

    public R apply(T var1);
}

