/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
import android.os.Build;
import android.view.View;
import j$.util.Objects;

class xl {
    static final xn d;
    final xn e;

    static {
        xf xf2 = Build.VERSION.SDK_INT >= 30 ? new xe() : (Build.VERSION.SDK_INT >= 29 ? new xd() : new xc());
        d = ((xf)xf2).a().i().j().k();
    }

    public xl(xn xn2) {
        this.e = xn2;
    }

    public tg a(int n2) {
        return tg.a;
    }

    public tg c() {
        return tg.a;
    }

    public xn d(int n2, int n3, int n4, int n5) {
        return d;
    }

    public void e(View view) {
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof xl)) {
            return false;
        }
        object = (xl)object;
        return this.i() == ((xl)object).i() && this.n() == ((xl)object).n() && Objects.equals(this.c(), ((xl)object).c()) && Objects.equals(this.j(), ((xl)object).j()) && Objects.equals(this.o(), ((xl)object).o());
    }

    public void f(tg[] tgArray) {
    }

    public void h(xn xn2) {
    }

    public int hashCode() {
        return Objects.hash(this.i(), this.n(), this.c(), this.j(), this.o());
    }

    public boolean i() {
        return false;
    }

    public tg j() {
        return tg.a;
    }

    public xn k() {
        return this.e;
    }

    public xn l() {
        return this.e;
    }

    public void m(tg tg2) {
    }

    public boolean n() {
        return false;
    }

    public vc o() {
        return null;
    }

    public xn p() {
        return this.e;
    }

    public tg q() {
        return this.c();
    }

    public tg r() {
        return this.c();
    }

    public tg s() {
        return this.c();
    }
}

