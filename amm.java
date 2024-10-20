/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class amm
implements ane {
    public final HashSet a;
    public final dvy b;
    public final dvy c;
    private final ArrayList d = new ArrayList(1);
    private Looper e;
    private aew f;
    private akr g;

    public amm() {
        this.a = new HashSet(1);
        this.b = new dvy(new CopyOnWriteArrayList(), null);
        this.c = new dvy(new CopyOnWriteArrayList(), null);
    }

    protected final akr a() {
        akr akr2 = this.g;
        abr.j(akr2);
        return akr2;
    }

    @Override
    public final void b(Handler object, ani ani2) {
        object = new awg(object, ani2);
        ((CopyOnWriteArrayList)this.b.b).add(object);
    }

    @Override
    public final void c(and and2) {
        boolean bl2 = this.a.isEmpty();
        this.a.remove(and2);
        if (!bl2 && this.a.isEmpty()) {
            this.d();
        }
    }

    protected void d() {
    }

    @Override
    public final void e(and and2) {
        abr.i(this.e);
        HashSet hashSet = this.a;
        boolean bl2 = hashSet.isEmpty();
        hashSet.add(and2);
        if (bl2) {
            this.f();
        }
    }

    protected void f() {
    }

    @Override
    public final void g(and and2, ahl ahl2, akr object) {
        boolean bl2;
        Looper looper = Looper.myLooper();
        Looper looper2 = this.e;
        boolean bl3 = bl2 = true;
        if (looper2 != null) {
            bl3 = looper2 == looper ? bl2 : false;
        }
        abr.d(bl3);
        this.g = object;
        object = this.f;
        this.d.add(and2);
        if (this.e == null) {
            this.e = looper;
            this.a.add(and2);
            this.h(ahl2);
            return;
        }
        if (object != null) {
            this.e(and2);
            and2.a((aew)object);
        }
    }

    protected abstract void h(ahl var1);

    protected final void i(aew aew2) {
        this.f = aew2;
        ArrayList arrayList = this.d;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((and)arrayList.get(i2)).a(aew2);
        }
    }

    @Override
    public final void j(and and2) {
        this.d.remove(and2);
        if (this.d.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.a.clear();
            this.k();
            return;
        }
        this.c(and2);
    }

    protected abstract void k();

    @Override
    public final void l(alc alc2) {
        dvy dvy2 = this.c;
        for (bzb bzb2 : (CopyOnWriteArrayList)dvy2.b) {
            if (bzb2.a != alc2) continue;
            ((CopyOnWriteArrayList)dvy2.b).remove(bzb2);
        }
    }

    @Override
    public final void m(ani ani2) {
        dvy dvy2 = this.b;
        for (awg awg2 : (CopyOnWriteArrayList)dvy2.b) {
            if (awg2.a != ani2) continue;
            ((CopyOnWriteArrayList)dvy2.b).remove(awg2);
        }
    }

    @Override
    public /* synthetic */ void n(aef aef2) {
        throw null;
    }

    @Override
    public /* synthetic */ void o() {
    }

    @Override
    public /* synthetic */ void p() {
    }

    @Override
    public final void q(alc object) {
        object = new bzb(object);
        ((CopyOnWriteArrayList)this.c.b).add(object);
    }

    protected final dvy r(anc anc2) {
        return this.b.c(anc2);
    }

    protected final dvy s(anc anc2) {
        return this.c.e(anc2);
    }
}

