/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.Collections;
import java.util.function.Consumer;

public final class fnm
extends fnx {
    private fnw c;
    private fnw d;
    private fnw e;
    private fnw f;

    public final void a() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmn)) continue;
            ((fmn)((Object)foo2)).a();
        }
    }

    public final void b() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmo)) continue;
            ((fmo)((Object)foo2)).a();
        }
    }

    public final void c() {
        fnl fnl2 = new fnl(0);
        this.G(fnl2);
        this.f = fnl2;
    }

    @Override
    public final void d() {
        fnw fnw2 = this.d;
        if (fnw2 != null) {
            this.F(fnw2);
            this.d = null;
        }
        if ((fnw2 = this.c) != null) {
            this.F(fnw2);
            this.c = null;
        }
        super.d();
    }

    public final void e() {
        int n2;
        Object object = this.f;
        int n3 = n2 = 0;
        if (object != null) {
            this.F((fnw)object);
            this.f = null;
            n3 = n2;
        }
        while (n3 < this.a.size()) {
            object = (foo)this.a.get(n3);
            fph.a(object);
            if (object instanceof fmu) {
                ((fmu)object).a();
            }
            ++n3;
        }
    }

    @Override
    public final void f() {
        fnw fnw2 = this.e;
        if (fnw2 != null) {
            this.F(fnw2);
            this.e = null;
        }
        super.f();
    }

    public final void g(Bundle object) {
        object = new fnk((Bundle)object, 1);
        this.G((fnw)object);
        this.c = object;
    }

    public final void h() {
        fnl fnl2 = new fnl(1);
        this.G(fnl2);
        this.e = fnl2;
    }

    public final void i(Bundle object) {
        object = new fnk((Bundle)object, 0);
        this.G((fnw)object);
        this.d = object;
    }

    public final void j() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fng)) continue;
            ((fng)((Object)foo2)).a();
        }
    }

    public final void k() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fnh)) continue;
            ((fnh)((Object)foo2)).a();
        }
    }

    public final boolean l() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmt) || !((fmt)((Object)foo2)).a()) continue;
            return true;
        }
        return false;
    }

    public final boolean m() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmm) || !((fmm)((Object)foo2)).a()) continue;
            return true;
        }
        return false;
    }

    public final void n() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmr)) continue;
            ((fmr)((Object)foo2)).a();
        }
    }

    public final void o() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fov)) continue;
            ((fov)((Object)foo2)).a();
        }
    }

    public final void p(Consumer consumer) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmv)) continue;
            ((fmv)((Object)foo2)).a();
            return;
        }
        ag$$ExternalSyntheticApiModelOutline1.m(consumer, Collections.emptyList());
    }

    public final boolean q() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmw) || !((fmw)((Object)foo2)).a()) continue;
            return true;
        }
        return false;
    }

    public final boolean r() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmx) || !((fmx)((Object)foo2)).a()) continue;
            return true;
        }
        return false;
    }

    public final void s() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmy)) continue;
            ((fmy)((Object)foo2)).a();
        }
    }

    public final void t() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fmz)) continue;
            ((fmz)((Object)foo2)).a();
            return;
        }
    }

    public final void u() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fnc)) continue;
            ((fnc)((Object)foo2)).a();
        }
    }

    public final void v() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fnd)) continue;
            ((fnd)((Object)foo2)).a();
        }
    }

    public final void w() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fni)) continue;
            ((fni)((Object)foo2)).a();
        }
    }

    public final void x() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fnj)) continue;
            ((fnj)((Object)foo2)).a();
        }
    }
}

