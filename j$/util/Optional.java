/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Objects;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    private Optional(Object object) {
        this.a = Objects.requireNonNull(object);
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t2) {
        return new Optional<T>(t2);
    }

    public static <T> Optional<T> ofNullable(T object) {
        object = object == null ? Optional.empty() : Optional.of(object);
        return object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Optional)) {
            return false;
        }
        object = (Optional)object;
        return Objects.equals(this.a, ((Optional)object).a);
    }

    public T get() {
        Object object = this.a;
        if (object != null) {
            return (T)object;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        Object object = this.a;
        if (object != null) {
            consumer.accept(object);
        }
    }

    public void ifPresentOrElse(Consumer<? super T> consumer, Runnable runnable) {
        Object object = this.a;
        if (object != null) {
            consumer.accept(object);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        boolean bl2 = this.a == null;
        return bl2;
    }

    public boolean isPresent() {
        boolean bl2 = this.a != null;
        return bl2;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!this.isPresent()) {
            return Optional.empty();
        }
        return Optional.ofNullable(function.apply(this.a));
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        Objects.requireNonNull(supplier);
        if (this.isPresent()) {
            return this;
        }
        return Objects.requireNonNull(supplier.get());
    }

    public T orElse(T object) {
        Object object2 = this.a;
        if (object2 != null) {
            object = object2;
        }
        return object;
    }

    public T orElseGet(Supplier<? extends T> object) {
        Object object2 = this.a;
        object = object2 != null ? object2 : object.get();
        return (T)object;
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) {
        Object object = this.a;
        if (object != null) {
            return (T)object;
        }
        throw (Throwable)supplier.get();
    }

    public final String toString() {
        Object object = this.a;
        object = object != null ? String.format("Optional[%s]", object) : "Optional.empty";
        return object;
    }
}

