/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class gyn
extends gxu {
    final gyp a;
    private final Object b;
    private int c;

    public gyn(gyp gyp2, int n2) {
        this.a = gyp2;
        this.b = gyp2.e(n2);
        this.c = n2;
    }

    private final void a() {
        int n2 = this.c;
        if (n2 != -1 && n2 < this.a.size() && a.k(this.b, this.a.e(this.c))) {
            return;
        }
        this.c = this.a.d(this.b);
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        Map map = this.a.j();
        if (map != null) {
            return map.get(this.b);
        }
        this.a();
        int n2 = this.c;
        if (n2 == -1) {
            return null;
        }
        return this.a.h(n2);
    }

    @Override
    public final Object setValue(Object object) {
        Map map = this.a.j();
        if (map != null) {
            return map.put(this.b, object);
        }
        this.a();
        int n2 = this.c;
        if (n2 == -1) {
            this.a.put(this.b, object);
            return null;
        }
        map = this.a;
        Object object2 = ((gyp)map).h(n2);
        ((gyp)map).n(this.c, object);
        return object2;
    }
}

