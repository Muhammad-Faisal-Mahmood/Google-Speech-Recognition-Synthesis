/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gqv
 */
import java.util.Iterator;
import java.util.Set;

public class gop {
    public static final fxf e = new fxf();
    private final gop a;
    public final pa c;
    public boolean d = false;

    public gop(gop gop2, pa pa2) {
        if (gop2 != null) {
            fxf.q(gop2.d);
        }
        this.a = gop2;
        this.c = pa2;
    }

    public static gon b() {
        return goo.a.c();
    }

    public static gop d(Set object) {
        Object object2;
        Object object3;
        if (object.isEmpty()) {
            return goo.a;
        }
        if (object.size() == 1) {
            return (gop)object.iterator().next();
        }
        Iterator iterator = object.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            object3 = (gop)iterator.next();
            int n3 = n2;
            do {
                n2 = n3 + ((gop)object3).c.f;
                object2 = ((gop)object3).a;
                n3 = n2;
                object3 = object2;
            } while (object2 != null);
        }
        if (n2 == 0) {
            return goo.a;
        }
        object2 = new pa(n2);
        iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (gop)iterator.next();
            do {
                n2 = 0;
                while (true) {
                    object3 = ((gop)object).c;
                    if (n2 >= ((pa)object3).f) break;
                    boolean bl2 = ((pa)object2).put((fxf)((pa)object3).d(n2), ((gop)object).c.g(n2)) == null;
                    fxf.v(bl2, "Duplicate bindings: %s", ((gop)object).c.d(n2));
                    ++n2;
                }
                object = object3 = ((gop)object).a;
            } while (object3 != null);
        }
        return new goo(null, (pa)object2).f();
    }

    public static gop e(gop gop2, gop gop3) {
        if (gop2.g()) {
            return gop3;
        }
        if (gop3.g()) {
            return gop2;
        }
        return gop.d(hav.p(gop2, gop3));
    }

    public static gom h(fxf object, gop gop2, gqv gqv2) {
        fxf.K(gqv2);
        object = gop2.i((fxf)object);
        if (object == null) {
            int n2 = true != gop2.c.containsKey(e) ? 3 : 2;
            return gom.d(n2);
        }
        return new gom(1, object, false);
    }

    public final gon c() {
        return new goo(this, new pa());
    }

    public final gop f() {
        if (!this.d) {
            this.d = true;
            gop gop2 = this.a;
            if (gop2 != null && this.c.isEmpty()) {
                return gop2;
            }
            return this;
        }
        throw new IllegalStateException("Already frozen");
    }

    public final boolean g() {
        return this == goo.a;
    }

    public final Object i(fxf fxf2) {
        gop gop2;
        fxf.A(this.d);
        Object object = this.c.get(fxf2);
        if (object == null && (gop2 = this.a) != null) {
            return gop2.i(fxf2);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean j(fxf fxf2) {
        boolean bl2;
        boolean bl3 = this.c.containsKey(fxf2);
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        gop gop2 = this.a;
        if (gop2 == null) return false;
        if (!gop2.j(fxf2)) return false;
        return bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SpanExtras<");
        gop gop2 = this;
        while (gop2 != null) {
            for (int i2 = 0; i2 < gop2.c.f; ++i2) {
                stringBuilder.append(this.c.g(i2));
                stringBuilder.append("], ");
            }
            gop2 = gop2.a;
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

