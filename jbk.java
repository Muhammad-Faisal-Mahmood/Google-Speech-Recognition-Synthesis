/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class jbk
extends iwe {
    final ivw a;
    final ivn b;
    final jbz c;
    final jca d;
    List e;
    jeu f;
    boolean g;
    boolean h;
    final jfs i;
    ksb j;

    public jbk() {
        throw null;
    }

    public jbk(jfs jfs2, ivw object) {
        ivn ivn2;
        this.i = jfs2;
        this.e = ((ivw)object).a;
        this.a = object;
        this.b = ivn2 = ivn.b("Subchannel", jfs2.b());
        this.d = object = new jca(ivn2, jfs2.l.a(), "Subchannel for ".concat(((ivw)object).a.toString()));
        this.c = new jbz((jca)object, jfs2.l);
    }

    @Override
    public final void a() {
        this.i.m.c();
        fxf.B(this.g, "not started");
        this.f.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void b() {
        Object object;
        this.i.m.c();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (this.h) {
            if (!this.i.B || (object = this.j) == null) return;
            ((ksb)object).j();
            this.j = null;
        } else {
            this.h = true;
        }
        object = this.i;
        if (!((jfs)object).B) {
            iym iym2 = ((jfs)object).m;
            object = new jey(new jel(this, 14));
            jfs jfs2 = this.i;
            this.j = iym2.d((Runnable)object, 5L, TimeUnit.SECONDS, jfs2.i.c());
            return;
        }
        this.f.h(jfs.b);
    }

    @Override
    public final void c(iwg object) {
        this.i.m.c();
        fxf.B(this.g ^ true, "already started");
        fxf.B(this.h ^ true, "already shutdown");
        fxf.B(this.i.B ^ true, "Channel is being terminated");
        this.g = true;
        jfs jfs2 = this.i;
        Object object2 = jfs2.b();
        jco jco2 = jfs2.i;
        ScheduledExecutorService scheduledExecutorService = jco2.c();
        jeq jeq2 = new jeq(this, (iwg)object);
        jfs jfs3 = this.i;
        object = jfs3.H;
        jby jby2 = jfs3.D.a();
        ivn ivn2 = this.b;
        jbz jbz2 = this.c;
        object = new jeu(this.a.a, (String)object2, jfs2.q, jco2, scheduledExecutorService, jfs3.m, jeq2, (ivk)object, jby2, ivn2, jbz2, jfs3.p);
        object2 = new ivg();
        ((ivg)object2).a = "Child Subchannel started";
        ((ivg)object2).b = ivh.b;
        ((ivg)object2).b(this.i.l.a());
        ((ivg)object2).d = object;
        object2 = ((ivg)object2).a();
        this.i.F.b((ivi)object2);
        this.f = object;
        ivk.b(this.i.H.e, (ivm)object);
        this.i.v.add(object);
    }

    @Override
    public final void d(List list) {
        this.i.m.c();
        this.e = list;
        jeu jeu2 = this.f;
        a.s(list, "newAddressGroups");
        jeu.b(list, "newAddressGroups contains null entry");
        fxf.r(list.isEmpty() ^ true, "newAddressGroups is empty");
        list = DesugarCollections.unmodifiableList(new ArrayList(list));
        jeu2.f.execute(new jdg(jeu2, list, 8, null));
    }

    public final String toString() {
        return this.b.toString();
    }
}

