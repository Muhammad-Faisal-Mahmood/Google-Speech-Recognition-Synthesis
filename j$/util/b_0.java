/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/*
 * Renamed from j$.util.b
 */
public final class b_0
implements Comparator,
Serializable {
    public final int a;
    public final Object b;

    public /* synthetic */ b_0(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public final int compare(Object object, Object object2) {
        switch (this.a) {
            default: {
                ToLongFunction toLongFunction = (ToLongFunction)this.b;
                return Long.compare(toLongFunction.applyAsLong(object), toLongFunction.applyAsLong(object2));
            }
            case 2: {
                Function function = (Function)this.b;
                return ((Comparable)function.apply(object)).compareTo(function.apply(object2));
            }
            case 1: {
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction)this.b;
                return Double.compare(toDoubleFunction.applyAsDouble(object), toDoubleFunction.applyAsDouble(object2));
            }
            case 0: 
        }
        ToIntFunction toIntFunction = (ToIntFunction)this.b;
        return Integer.compare(toIntFunction.applyAsInt(object), toIntFunction.applyAsInt(object2));
    }
}

