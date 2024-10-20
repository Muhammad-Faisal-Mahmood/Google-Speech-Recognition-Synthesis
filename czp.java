/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public final class czp {
    public final boolean a;
    private final Object b;
    private final Object c;

    public czp(boolean bl2, Object object, Object object2) {
        this.a = bl2;
        this.b = object;
        this.c = object2;
    }

    public static boolean d(czp object, czp object2, Comparator comparator) {
        Object object3;
        if (object != null && ((czp)object).a && (object3 = ((czp)object).b) != null && object2 != null && ((czp)object2).a && ((czp)object2).b != null) {
            object = new ArrayList((Collection)object3);
            object2 = new ArrayList((Collection)((czp)object2).b);
            Collections.sort(object, comparator);
            Collections.sort(object2, comparator);
            return object.equals(object2);
        }
        return a.k(object, object2);
    }

    public final Object a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object b() {
        if (this.c()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean c() {
        return !this.a;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof czp)) {
            return false;
        }
        object = (czp)object;
        if (this.a) {
            return ((czp)object).a && a.k(this.a(), ((czp)object).a());
        }
        return ((czp)object).c() && a.k(this.b(), ((czp)object).b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }
}

