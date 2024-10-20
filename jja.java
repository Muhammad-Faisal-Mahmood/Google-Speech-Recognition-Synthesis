/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class jja
extends ixw
implements ivm {
    public static final Logger b = Logger.getLogger(jja.class.getName());
    public static final jjf c = new jiv();
    public Executor d;
    public final ive e;
    public final ive f;
    public final List g;
    public final ixz[] h;
    public final long i;
    public iyh j;
    public boolean k;
    public final Object l = new Object();
    public boolean m;
    public final Set n = new HashSet();
    public final ius o;
    public final iuw p;
    public final ivk q;
    public final jby r;
    public final kmp s;
    private final ivn t;
    private final jgp u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final jej y;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public jja(jjc object, jej object2, ius ius2) {
        Object object3 = ((jjc)object).h;
        a.s(object3, "executorPool");
        this.u = object3;
        dml dml2 = ((jjc)object).r;
        object3 = new HashMap();
        Iterator iterator = ((HashMap)dml2.a).values().iterator();
        block3: while (true) {
            if (!iterator.hasNext()) {
                DesugarCollections.unmodifiableList(new ArrayList(((HashMap)dml2.a).values()));
                this.e = new jei(DesugarCollections.unmodifiableMap(object3));
                object3 = ((jjc)object).g;
                a.s(object3, "fallbackRegistry");
                this.f = object3;
                this.y = object2;
                object3 = this.l;
                synchronized (object3) {
                    object2 = DesugarCollections.unmodifiableList(gzx.q(((izf)object2).b));
                }
                this.t = ivn.b("Server", String.valueOf(object2));
                a.s(ius2, "rootContext");
                this.o = new ius(ius2.f, ius2.g + 1);
                this.p = ((jjc)object).i;
                this.g = DesugarCollections.unmodifiableList(new ArrayList(((jjc)object).d));
                object2 = ((jjc)object).e;
                this.h = object2.toArray(new ixz[object2.size()]);
                this.i = ((jjc)object).k;
                this.q = object2 = ((jjc)object).p;
                this.r = new jby(jjt.a);
                object = ((jjc)object).s;
                a.s(object, "ticker");
                this.s = object;
                object = ((ivk)object2).g.put(ivk.a(this), new ivj());
                ivk.b(((ivk)object2).c, this);
                return;
            }
            Iterator iterator2 = ((ksb)iterator.next()).m().iterator();
            while (true) {
                if (!iterator2.hasNext()) continue block3;
                ksb ksb2 = (ksb)iterator2.next();
                object3.put(((ixb)ksb2.b).b, ksb2);
            }
            break;
        }
    }

    @Override
    public final ivn c() {
        return this.t;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object = this.l;
        synchronized (object) {
            if (this.w && this.n.isEmpty() && this.m) {
                if (this.x) {
                    AssertionError assertionError = new AssertionError((Object)"Server already terminated");
                    throw assertionError;
                }
                this.x = true;
                Object object2 = this.q;
                ivk.c(((ivk)object2).c, this);
                object2 = (ivj)((ivk)object2).g.remove(ivk.a(this));
                object2 = this.d;
                if (object2 != null) {
                    this.u.b(object2);
                    this.d = null;
                }
                this.l.notifyAll();
            }
            return;
        }
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.f("logId", this.t.a);
        gtn2.b("transportServer", this.y);
        return gtn2.toString();
    }
}

