/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Comparator;
import j$.util.Comparator$_CC;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public final class jpv
implements java.util.Comparator,
Comparator {
    public static final jpv a;
    public static final jpv b;
    private final int c;

    static {
        b = new jpv(1);
        a = new jpv(0);
    }

    private jpv(int n2) {
        this.c = n2;
    }

    public final /* synthetic */ int compare(Object object, Object object2) {
        if (this.c != 0) {
            object = (Comparable)object;
            object2 = (Comparable)object2;
            jse.e(object, "a");
            jse.e(object2, "b");
            return object.compareTo(object2);
        }
        object = (Comparable)object;
        object2 = (Comparable)object2;
        jse.e(object, "a");
        jse.e(object2, "b");
        return object2.compareTo(object);
    }

    public final java.util.Comparator reversed() {
        if (this.c != 0) {
            return a;
        }
        return b;
    }

    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        if (this.c != 0) {
            return Comparator$_CC.$default$thenComparing((java.util.Comparator)this, comparator);
        }
        return Comparator$_CC.$default$thenComparing((java.util.Comparator)this, comparator);
    }

    public final /* synthetic */ java.util.Comparator thenComparing(Function function) {
        if (this.c != 0) {
            return Comparator$_CC.$default$thenComparing((java.util.Comparator)this, function);
        }
        return Comparator$_CC.$default$thenComparing((java.util.Comparator)this, function);
    }

    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        if (this.c != 0) {
            return Comparator$_CC.$default$thenComparing(this, function, comparator);
        }
        return Comparator$_CC.$default$thenComparing(this, function, comparator);
    }

    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        if (this.c != 0) {
            return Comparator$_CC.$default$thenComparingDouble(this, toDoubleFunction);
        }
        return Comparator$_CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        if (this.c != 0) {
            return Comparator$_CC.$default$thenComparingInt(this, toIntFunction);
        }
        return Comparator$_CC.$default$thenComparingInt(this, toIntFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        if (this.c != 0) {
            return Comparator$_CC.$default$thenComparingLong(this, toLongFunction);
        }
        return Comparator$_CC.$default$thenComparingLong(this, toLongFunction);
    }
}

