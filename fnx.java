/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class fnx {
    private static final Bundle c = new Bundle();
    public final List a = new ArrayList();
    protected final List b = new ArrayList();
    private fnw d;
    private fnw e;
    private fnw f;
    private fnw g;
    private fnw h;

    public fnx() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String H(foo object) {
        object = object instanceof fol ? (object instanceof fop ? ((fop)object).a() : object.getClass().getName()) : null;
        return object;
    }

    public static final Bundle I(foo object, Bundle bundle) {
        object = bundle != null ? ((object = fnx.H((foo)object)) != null ? bundle.getBundle((String)object) : c) : null;
        return object;
    }

    public static final void J(foo foo2) {
        if (foo2 instanceof fnf) {
            ((fnf)((Object)foo2)).a();
        }
    }

    public final void A() {
        fnl fnl2 = new fnl(7);
        this.G(fnl2);
        this.f = fnl2;
    }

    public final void B(Bundle object) {
        object = new fnk((Bundle)object, 6);
        this.G((fnw)object);
        this.g = object;
    }

    public final void C() {
        fnl fnl2 = new fnl(6);
        this.G(fnl2);
        this.e = fnl2;
    }

    public final void D() {
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
            if (object instanceof fon) {
                ((fon)object).a();
            }
            ++n3;
        }
    }

    public final void E(boolean bl2) {
        int n2;
        if (bl2) {
            fnl fnl2 = new fnl(5);
            this.G(fnl2);
            this.h = fnl2;
            return;
        }
        fnw fnw2 = this.h;
        int n3 = n2 = 0;
        if (fnw2 != null) {
            this.F(fnw2);
            this.h = null;
            n3 = n2;
        }
        while (n3 < this.a.size()) {
            fnx.J((foo)this.a.get(n3));
            ++n3;
        }
    }

    public final void F(fnw fnw2) {
        this.b.remove(fnw2);
    }

    public final void G(fnw fnw2) {
        fpk.c();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            fnw2.a((foo)this.a.get(i2));
        }
        this.b.add(fnw2);
    }

    public final void K() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fny)) continue;
            ((fny)((Object)foo2)).a();
        }
    }

    public final void L() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fnz)) continue;
            ((fnz)((Object)foo2)).a();
        }
    }

    public final boolean M() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof foa) || !((foa)((Object)foo2)).a()) continue;
            return true;
        }
        return false;
    }

    public final void N() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof foc)) continue;
            ((foc)((Object)foo2)).a();
        }
    }

    public final boolean O() {
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            boolean bl3 = bl2;
            if (foo2 instanceof fod) {
                bl3 = bl2 | ((fod)((Object)foo2)).a();
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public final boolean P() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof fog) || !((fog)((Object)foo2)).a()) continue;
            return true;
        }
        return false;
    }

    public final boolean Q() {
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            boolean bl3 = bl2;
            if (foo2 instanceof foi) {
                bl3 = bl2 | ((foi)((Object)foo2)).a();
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public final void R() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            foo foo2 = (foo)this.a.get(i2);
            if (!(foo2 instanceof foj)) continue;
            ((foj)((Object)foo2)).a();
        }
    }

    public void d() {
        int n2;
        Object object = this.g;
        if (object != null) {
            this.F((fnw)object);
            this.g = null;
        }
        object = this.d;
        int n3 = n2 = 0;
        if (object != null) {
            this.F((fnw)object);
            this.d = null;
            n3 = n2;
        }
        while (n3 < this.a.size()) {
            object = (foo)this.a.get(n3);
            fph.a(object);
            if (object instanceof foe) {
                ((foe)object).a();
            }
            ++n3;
        }
    }

    public void f() {
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
            if (object instanceof foh) {
                ((foh)object).a();
            }
            ++n3;
        }
    }

    public final void y(Bundle object) {
        object = new fnk((Bundle)object, 5);
        this.G((fnw)object);
        this.d = object;
    }

    public final void z() {
        for (foo foo2 : this.a) {
            if (!(foo2 instanceof fof)) continue;
            ((fof)((Object)foo2)).a();
        }
    }
}

