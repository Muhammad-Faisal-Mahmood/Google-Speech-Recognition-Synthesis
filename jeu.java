/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class jeu
implements ivm {
    public final jeq a;
    public final ScheduledExecutorService b;
    public final ivk c;
    public final ity d;
    public final List e;
    public final iym f;
    public final jer g;
    public volatile List h;
    public final guh i;
    public jgf j;
    public final Collection k = new ArrayList();
    public final jeg l = new jek(this);
    public jcu m;
    public volatile jgf n;
    public volatile iuj o = iuj.a(iui.d);
    public iyh p;
    public volatile its q;
    public jdp r;
    public ksb s;
    public ksb t;
    private final ivn u;
    private final String v;
    private final String w;
    private final jco x;
    private final jby y;

    public jeu(List list, String string, String string2, jco jco2, ScheduledExecutorService scheduledExecutorService, iym iym2, jeq jeq2, ivk ivk2, jby jby2, ivn ivn2, ity ity2, List list2) {
        fxf.r(list.isEmpty() ^ true, "addressGroups is empty");
        jeu.b(list, "addressGroups contains null entry");
        this.h = list = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.g = new jer(list);
        this.v = string;
        this.w = string2;
        this.x = jco2;
        this.b = scheduledExecutorService;
        this.i = new guh();
        this.f = iym2;
        this.a = jeq2;
        this.c = ivk2;
        this.y = jby2;
        this.u = ivn2;
        this.d = ity2;
        this.e = list2;
    }

    public static void b(List object, String string) {
        object = object.iterator();
        while (object.hasNext()) {
            a.s(object.next(), string);
        }
    }

    static /* bridge */ /* synthetic */ void j(jeu jeu2) {
        jeu2.m = null;
    }

    public static final String k(iyh iyh2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)iyh2.n);
        if (iyh2.o != null) {
            stringBuilder.append("(");
            stringBuilder.append(iyh2.o);
            stringBuilder.append(")");
        }
        if (iyh2.p != null) {
            stringBuilder.append("[");
            stringBuilder.append(iyh2.p);
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    public final jcm a() {
        jgf jgf2 = this.n;
        if (jgf2 != null) {
            return jgf2;
        }
        this.f.execute(new jel(this, 1));
        return null;
    }

    @Override
    public final ivn c() {
        return this.u;
    }

    public final void d(iui iui2) {
        this.f.c();
        this.e(iuj.a(iui2));
    }

    public final void e(iuj iuj2) {
        this.f.c();
        if (this.o.a != iuj2.a) {
            boolean bl2 = this.o.a != iui.e;
            fxf.B(bl2, "Cannot transition out of SHUTDOWN to ".concat(((Object)iuj2).toString()));
            this.o = iuj2;
            jeq jeq2 = this.a;
            fxf.B(true, "listener is null");
            jeq2.a.a(iuj2);
        }
    }

    public final void f() {
        jel jel2 = new jel(this, 2);
        this.f.execute(jel2);
    }

    public final void g(jcu object, boolean bl2) {
        object = new jem(this, (jcu)object, bl2);
        this.f.execute((Runnable)object);
    }

    public final void h(iyh object) {
        object = new jdg(this, object, 9);
        this.f.execute((Runnable)object);
    }

    public final void i() {
        Object object;
        this.f.c();
        boolean bl2 = this.s == null;
        fxf.B(bl2, "Should have no reconnectTask scheduled");
        Object object2 = this.g;
        if (((jer)object2).b == 0 && ((jer)object2).c == 0) {
            object2 = this.i;
            ((guh)object2).c();
            ((guh)object2).d();
        }
        if ((object2 = this.g.b()) instanceof ivf) {
            object = (ivf)object2;
            object2 = ((ivf)object).b;
        } else {
            object = null;
        }
        its its2 = this.g.a();
        String string = (String)its2.a(iux.a);
        jcn jcn2 = new jcn();
        String string2 = string;
        if (string == null) {
            string2 = this.v;
        }
        a.s(string2, "authority");
        jcn2.a = string2;
        jcn2.b = its2;
        jcn2.c = this.w;
        jcn2.d = object;
        object = new jet();
        ((jet)object).a = this.u;
        object2 = new jep(this.x.a((SocketAddress)object2, jcn2, (ity)object), this.y);
        ((jet)object).a = object2.c();
        ivk.b(this.c.f, (ivm)object2);
        this.m = object2;
        this.k.add(object2);
        object2 = object2.d(new jes(this, (jcu)object2));
        if (object2 != null) {
            this.f.b((Runnable)object2);
        }
        this.d.b(2, "Started transport {0}", ((jet)object).a);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.f("logId", this.u.a);
        gtn2.b("addressGroups", this.h);
        return gtn2.toString();
    }
}

