/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

public final class jbc
implements jcu {
    public final String a;
    public jge b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final jjv g;
    public its h;
    public final jau i;
    public boolean j;
    public iyh k;
    public boolean l;
    private final ivn m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public jbc(jau object, InetSocketAddress inetSocketAddress, String string, String string2, its its2, Executor executor, int n2, jjv jjv2) {
        a.s(inetSocketAddress, "address");
        this.n = inetSocketAddress;
        this.m = ivn.a(this.getClass(), inetSocketAddress.toString());
        this.o = string;
        this.a = jeb.e("cronet", string2);
        this.f = n2;
        this.e = executor;
        this.i = object;
        this.g = jjv2;
        object = its.a;
        object = new kpy(its.a);
        ((kpy)object).b(jdx.a, (Object)ixv.c);
        ((kpy)object).b(jdx.b, its2);
        this.h = ((kpy)object).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(jba object, iyh iyh2) {
        Object object2 = this.c;
        synchronized (object2) {
            boolean bl2;
            if (!this.d.remove(object)) {
                return;
            }
            Object object3 = iyh2.n;
            iye iye2 = iye.b;
            boolean bl3 = bl2 = true;
            if (object3 != iye2) {
                bl3 = object3 == iye.e ? bl2 : false;
            }
            object = ((jba)object).o;
            object3 = new iwx();
            ((jbi)object).l(iyh2, bl3, (iwx)object3);
        }
        this.e();
    }

    @Override
    public final ivn c() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Runnable d(jge jge2) {
        this.b = jge2;
        Object object = this.c;
        synchronized (object) {
            this.l = true;
            return new iuk(this, 6);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void e() {
        Object object = this.c;
        synchronized (object) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                // MONITOREXIT @DISABLED, blocks:[2, 3] lbl5 : MonitorExitStatement: MONITOREXIT : var1_1
                this.b.d();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o(iyh iyh2) {
        Object object = this.c;
        synchronized (object) {
            if (this.j) {
                return;
            }
        }
        object = this.c;
        synchronized (object) {
            if (this.p) {
                return;
            }
            this.p = true;
        }
        this.b.c(iyh2);
        object = this.c;
        synchronized (object) {
            this.j = true;
            this.k = iyh2;
        }
        this.e();
    }

    @Override
    public final void p(iyh iyh2) {
        throw null;
    }

    public final String toString() {
        Object object = this.n;
        String string = super.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("(");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

