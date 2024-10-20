/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class dga
implements dfa {
    public static final dez a;
    public final Map b = new HashMap();

    static {
        dey dey2 = dez.i();
        dey2.d(new dco("default", "default"));
        a = dey2.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final dez a(ddn object) {
        Map map = this.b;
        synchronized (map) {
            Object object2 = (dgb)this.b.get(object);
            if (object2 == null) {
                object2 = dez.i();
                ((dey)object2).d((ddn)object);
                return ((dey)object2).a();
            }
            if (((dgb)object2).i != null) return ((dgb)object2).i;
            object = dez.i();
            ((dey)object).c(((dgb)object2).e);
            ((dey)object).e(((dgb)object2).d);
            ((dey)object).d(((dgb)object2).a);
            ((dey)object).b(((dgb)object2).c);
            ((dey)object).f(((dgb)object2).b);
            ((dey)object).b = ((dgb)object2).f;
            ((dey)object).g(((dgb)object2).h);
            ((dey)object).a = ((dgb)object2).g;
            ((dgb)object2).i = ((dey)object).a();
            return ((dgb)object2).i;
        }
    }

    @Override
    public final void b(ddn ddn2) {
        throw null;
    }

    @Override
    public final void c(ddn ddn2, int n2) {
        throw null;
    }
}

