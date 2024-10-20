/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public final class gzy {
    public int a;
    public Object b;
    public Object c;

    public gzy() {
        this(4);
    }

    public gzy(int n2) {
        this.b = new Object[n2 + n2];
        this.a = 0;
    }

    public gzy(Context context, aiv aiv2) {
        fvd.ap(new aim(context, 1));
        this.b = aiv2;
        int n2 = aic.a;
    }

    private final hac h(boolean bl2) {
        Object object;
        Object object2;
        if (bl2 && (object2 = this.c) != null) {
            throw ((bmu)object2).N();
        }
        object2 = hcy.n(this.a, (Object[])this.b, this);
        if (bl2 && (object = this.c) != null) {
            throw ((bmu)object).N();
        }
        return object2;
    }

    public final hac a() {
        return this.h(false);
    }

    public final hac b() {
        return this.h(true);
    }

    public final void c(int n2) {
        Object[] objectArray = (Object[])this.b;
        int n3 = objectArray.length;
        if ((n2 += n2) > n3) {
            this.b = Arrays.copyOf(objectArray, gzl.f(n3, n2));
        }
    }

    public final void d(Object object, Object object2) {
        this.c(this.a + 1);
        fvd.aj(object, object2);
        Object[] objectArray = this.b;
        int n2 = this.a;
        int n3 = n2 + n2;
        objectArray = objectArray;
        objectArray[n3] = object;
        objectArray[n3 + 1] = object2;
        this.a = n2 + 1;
    }

    public final void e(Map.Entry entry) {
        this.d(entry.getKey(), entry.getValue());
    }

    public final void f(Iterable object) {
        if (object instanceof Collection) {
            this.c(this.a + object.size());
        }
        object = object.iterator();
        while (object.hasNext()) {
            this.e((Map.Entry)object.next());
        }
    }

    public final void g(Map map) {
        this.f(map.entrySet());
    }
}

