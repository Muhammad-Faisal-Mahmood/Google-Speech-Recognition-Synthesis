/*
 * Decompiled with CFR 0.152.
 */
import j$.util.stream.Collector;
import j$.util.stream.Collector$_CC;
import j$.util.stream.Collectors;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class gye {
    public static final Collector a = Collector$_CC.of(new fes(4), new gyc(1), new faf(4), new fcx(15), new Collector.Characteristics[0]);
    public static final Collector b = Collector$_CC.of(new fes(5), new gyc(0), new faf(5), new fcx(16), new Collector.Characteristics[0]);

    static {
        Collector$_CC.of(new fes(6), new gyc(2), new faf(3), new fcx(14), new Collector.Characteristics[0]);
    }

    public static Collector a(Function function, Function function2) {
        return Collector$_CC.of(new fes(7), new gyd(function, function2), new faf(6), new fcx(17), new Collector.Characteristics[0]);
    }

    public static Collector b(Function function, Function function2, BinaryOperator binaryOperator) {
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new fes(8)), new fcx(18));
    }
}

