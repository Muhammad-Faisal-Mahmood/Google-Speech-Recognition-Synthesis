/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Collector<T, A, R> {
    public Set a();

    public BiConsumer b();

    public BinaryOperator c();

    public Supplier d();

    public Function e();

    public static final class Characteristics
    extends Enum<Characteristics> {
        public static final /* enum */ Characteristics CONCURRENT;
        public static final /* enum */ Characteristics IDENTITY_FINISH;
        public static final /* enum */ Characteristics UNORDERED;
        private static final Characteristics[] a;

        static {
            Enum enum_ = new Enum("CONCURRENT", 0);
            CONCURRENT = enum_;
            Enum enum_2 = new Enum("UNORDERED", 1);
            UNORDERED = enum_2;
            Enum enum_3 = new Enum("IDENTITY_FINISH", 2);
            IDENTITY_FINISH = enum_3;
            a = new Characteristics[]{enum_, enum_2, enum_3};
        }

        public static Characteristics valueOf(String string) {
            return Enum.valueOf(Characteristics.class, string);
        }

        public static Characteristics[] values() {
            return (Characteristics[])a.clone();
        }
    }
}

