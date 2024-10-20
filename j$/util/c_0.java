/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/*
 * Renamed from j$.util.c
 */
public final class c_0
implements Comparator,
Serializable {
    public final int a;
    public final Comparator b;
    public final Object c;

    public /* synthetic */ c_0(Comparator comparator, Object object, int n2) {
        this.a = n2;
        this.b = comparator;
        this.c = object;
    }

    public final int compare(Object object, Object object2) {
        switch (this.a) {
            default: {
                Function function = (Function)this.c;
                object = function.apply(object);
                object2 = function.apply(object2);
                return this.b.compare(object, object2);
            }
            case 0: 
        }
        int n2 = this.b.compare(object, object2);
        if (n2 == 0) {
            n2 = ((Comparator)this.c).compare(object, object2);
        }
        return n2;
    }
}

