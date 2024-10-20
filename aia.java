/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;

public final class aia
extends aew {
    public final int b;
    public final aew[] c;
    public final Object[] d;
    private final int e;
    private final int f;
    private final int[] g;
    private final int[] h;
    private final HashMap i;
    private final bmu j;

    public aia(Collection object, bmu bmu2) {
        aew[] aewArray = new aew[object.size()];
        Object[] objectArray = object.iterator();
        int n2 = 0;
        int n3 = 0;
        while (objectArray.hasNext()) {
            aewArray[n3] = ((ajm)objectArray.next()).a();
            ++n3;
        }
        objectArray = new Object[object.size()];
        object = object.iterator();
        n3 = n2;
        while (object.hasNext()) {
            objectArray[n3] = ((ajm)object.next()).b();
            ++n3;
        }
        this(aewArray, objectArray, bmu2);
    }

    public aia(aew[] aewArray, Object[] objectArray, bmu object) {
        int n2;
        this.j = object;
        this.e = ((bmu)object).b();
        this.c = aewArray;
        int n3 = aewArray.length;
        this.g = new int[n3];
        this.h = new int[n3];
        this.d = objectArray;
        this.i = new HashMap();
        n3 = 0;
        int n4 = 0;
        int n5 = n2 = 0;
        while (n3 < aewArray.length) {
            this.c[n5] = object = aewArray[n3];
            this.h[n5] = n4;
            this.g[n5] = n2;
            n4 += ((aew)object).c();
            n2 += this.c[n5].b();
            this.i.put(objectArray[n5], n5);
            ++n3;
            ++n5;
        }
        this.b = n4;
        this.f = n2;
    }

    private final int A(int object, boolean bl2) {
        block7: {
            block6: {
                int n2;
                block5: {
                    n2 = -1;
                    if (!bl2) break block5;
                    Object object2 = this.j;
                    int n3 = ((int[])((bmu)object2).c)[object] + 1;
                    object2 = (int[])((bmu)object2).a;
                    object = n2;
                    if (n3 < ((Object)object2).length) {
                        object = object2[n3];
                    }
                    break block6;
                }
                if (object < this.e - 1) break block7;
                object = n2;
            }
            return object;
        }
        return object + 1;
    }

    private final int B(int n2, boolean bl2) {
        block7: {
            block6: {
                int n3;
                block5: {
                    n3 = -1;
                    if (!bl2) break block5;
                    bmu bmu2 = this.j;
                    int n4 = ((int[])bmu2.c)[n2] - 1;
                    n2 = n3;
                    if (n4 >= 0) {
                        n2 = ((int[])bmu2.a)[n4];
                    }
                    break block6;
                }
                if (n2 > 0) break block7;
                n2 = n3;
            }
            return n2;
        }
        return n2 - 1;
    }

    public static Object r(Object object) {
        return ((Pair)object).second;
    }

    public static Object s(Object object) {
        return ((Pair)object).first;
    }

    @Override
    public final int a(Object object) {
        if (object instanceof Pair) {
            int n2;
            Object object2 = aia.s(object);
            object = aia.r(object);
            int n3 = this.t(object2);
            if (n3 != -1 && (n2 = this.y(n3).a(object)) != -1) {
                return this.w(n3) + n2;
            }
        }
        return -1;
    }

    @Override
    public final int b() {
        return this.f;
    }

    @Override
    public final int c() {
        return this.b;
    }

    @Override
    public final aeu d(int n2, aeu aeu2, boolean bl2) {
        int n3 = this.u(n2);
        int n4 = this.x(n3);
        int n5 = this.w(n3);
        this.y(n3).d(n2 - n5, aeu2, bl2);
        aeu2.c += n4;
        if (bl2) {
            Object object = this.z(n3);
            Object object2 = aeu2.b;
            abr.i(object2);
            aeu2.b = Pair.create((Object)object, (Object)object2);
        }
        return aeu2;
    }

    @Override
    public final aev e(int n2, aev aev2, long l2) {
        Object object;
        int n3 = this.v(n2);
        int n4 = this.x(n3);
        int n5 = this.w(n3);
        this.y(n3).e(n2 - n4, aev2, l2);
        Object object2 = object = this.z(n3);
        if (!aev.a.equals(aev2.b)) {
            object2 = Pair.create((Object)object, (Object)aev2.b);
        }
        aev2.b = object2;
        aev2.n += n5;
        aev2.o += n5;
        return aev2;
    }

    @Override
    public final Object f(int n2) {
        int n3 = this.u(n2);
        int n4 = this.w(n3);
        Object object = this.y(n3).f(n2 - n4);
        return Pair.create((Object)this.z(n3), (Object)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int g(boolean bl2) {
        if (this.e == 0) return -1;
        int n2 = 0;
        if (bl2) {
            int[] nArray = (int[])this.j.a;
            n2 = nArray.length > 0 ? nArray[0] : -1;
        }
        while (this.y(n2).p()) {
            int n3;
            n2 = n3 = this.A(n2, bl2);
            if (n3 != -1) continue;
            return -1;
        }
        return this.x(n2) + this.y(n2).g(bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int h(boolean bl2) {
        int[] nArray;
        int n2 = this.e;
        if (n2 == 0) return -1;
        n2 = bl2 ? ((n2 = (nArray = (int[])this.j.a).length) > 0 ? nArray[n2 - 1] : -1) : --n2;
        while (this.y(n2).p()) {
            int n3;
            n2 = n3 = this.B(n2, bl2);
            if (n3 != -1) continue;
            return -1;
        }
        return this.x(n2) + this.y(n2).h(bl2);
    }

    @Override
    public final int j(int n2, int n3, boolean bl2) {
        int n4;
        int n5 = this.v(n2);
        int n6 = this.x(n5);
        aew aew2 = this.y(n5);
        n2 = aew2.j(n2 - n6, n4 = n3 == 2 ? 0 : n3, bl2);
        if (n2 != -1) {
            return n6 + n2;
        }
        n2 = this.A(n5, bl2);
        while (n2 != -1 && this.y(n2).p()) {
            n2 = this.A(n2, bl2);
        }
        if (n2 != -1) {
            return this.x(n2) + this.y(n2).g(bl2);
        }
        if (n3 == 2) {
            return ((aew)this).g(bl2);
        }
        return -1;
    }

    @Override
    public final aeu n(Object object, aeu aeu2) {
        Object object2 = aia.s(object);
        Object object3 = aia.r(object);
        int n2 = this.t(object2);
        int n3 = this.x(n2);
        this.y(n2).n(object3, aeu2);
        aeu2.c += n3;
        aeu2.b = object;
        return aeu2;
    }

    @Override
    public final int q(int n2) {
        int n3 = this.v(n2);
        int n4 = this.x(n3);
        n2 = this.y(n3).q(n2 - n4);
        if (n2 != -1) {
            return n4 + n2;
        }
        n2 = this.B(n3, false);
        while (n2 != -1 && this.y(n2).p()) {
            n2 = this.B(n2, false);
        }
        if (n2 != -1) {
            return this.x(n2) + this.y(n2).h(false);
        }
        return -1;
    }

    protected final int t(Object object) {
        if ((object = (Integer)this.i.get(object)) == null) {
            return -1;
        }
        return (Integer)object;
    }

    protected final int u(int n2) {
        return agf.a(this.g, n2 + 1, false, false);
    }

    protected final int v(int n2) {
        return agf.a(this.h, n2 + 1, false, false);
    }

    protected final int w(int n2) {
        return this.g[n2];
    }

    protected final int x(int n2) {
        return this.h[n2];
    }

    protected final aew y(int n2) {
        return this.c[n2];
    }

    protected final Object z(int n2) {
        return this.d[n2];
    }
}

