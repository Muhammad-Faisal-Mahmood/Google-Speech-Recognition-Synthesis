/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class fnv
extends fnx {
    private fnw c;
    private fnw d;
    private fnw e;
    private fnw f;
    private fnw g;
    private fnw h;

    public static final void i(foo foo2) {
        if (foo2 instanceof fnt) {
            ((fnt)((Object)foo2)).a();
        }
    }

    public final void a(Bundle object) {
        object = new fnk((Bundle)object, 2);
        this.G((fnw)object);
        this.d = object;
    }

    public final void b() {
        int n2;
        Object object = this.e;
        int n3 = n2 = 0;
        if (object != null) {
            this.F((fnw)object);
            this.e = null;
            n3 = n2;
        }
        while (n3 < this.a.size()) {
            object = (foo)this.a.get(n3);
            fph.a(object);
            if (object instanceof fnp) {
                ((fnp)object).a();
            }
            ++n3;
        }
    }

    public final void c() {
        int n2;
        Object object = this.c;
        int n3 = n2 = 0;
        if (object != null) {
            this.F((fnw)object);
            this.c = null;
            n3 = n2;
        }
        while (n3 < this.a.size()) {
            object = (foo)this.a.get(n3);
            fph.a(object);
            if (object instanceof fnq) {
                ((fnq)object).a();
            }
            ++n3;
        }
    }

    @Override
    public final void d() {
        super.d();
        fnw fnw2 = this.d;
        if (fnw2 != null) {
            this.F(fnw2);
            this.d = null;
        }
        if ((fnw2 = this.f) != null) {
            this.F(fnw2);
            this.f = null;
        }
        if ((fnw2 = this.h) != null) {
            this.F(fnw2);
            this.h = null;
        }
    }

    public final void e() {
        if (this.h != null) {
            return;
        }
        fnl fnl2 = new fnl(4);
        this.G(fnl2);
        this.h = fnl2;
    }

    public final void g(Bundle object) {
        object = new fnk((Bundle)object, 3);
        this.G((fnw)object);
        this.f = object;
    }

    public final void h(boolean bl2) {
        fnw fnw2 = this.g;
        if (fnw2 != null) {
            this.F(fnw2);
            this.g = null;
        }
        if (bl2) {
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                fnv.i((foo)this.a.get(i2));
            }
            return;
        }
        fnw2 = new fnl(3);
        this.G(fnw2);
        this.g = fnw2;
    }

    public final void j() {
        fnl fnl2 = new fnl(2);
        this.G(fnl2);
        this.c = fnl2;
    }

    public final void k(Bundle object) {
        object = new fnk((Bundle)object, 4);
        this.G((fnw)object);
        this.e = object;
    }
}

