/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class jjk {
    public final Object a;
    public int b;
    public Object c;

    public jjk(be be2) {
        this.b = 0;
        this.a = be2;
    }

    public jjk(Object object) {
        this.a = object;
    }

    public static /* synthetic */ gpf k(jjk object) {
        object = ((jjk)object).c;
        if (object != null) {
            return ((gqn)object).a();
        }
        return gno.h();
    }

    private final gpf l(String string) {
        if (gno.r()) {
            return fxf.aq(string);
        }
        bh bh2 = ((be)this.a).getActivity();
        a.s(bh2, "called before fragment was attached to an Activity");
        return fxf.i((Context)bh2).d(string);
    }

    private final gpf m(String object) {
        gno.o();
        object = gno.r() ? fxf.aq((String)object) : ((gng)fvd.l(((be)this.a).getContext(), gng.class)).c().d((String)object);
        return new gmp(gno.i(), object, 5, null);
    }

    private final void n(gqn gqn2, be object, boolean bl2) {
        if (((be)object).getContext() != null) {
            for (be be2 : ((be)object).getChildFragmentManager().h()) {
                if (be2 instanceof gpa) {
                    ((gpa)((Object)be2)).N(gqn2, bl2);
                    continue;
                }
                this.n(gqn2, be2, bl2);
            }
        }
    }

    public final gpf a() {
        try {
            Object object = this.c;
            object = object != null ? ((gqn)object).a() : gno.h();
            return object;
        }
        finally {
            this.c = null;
            this.b = 0;
        }
    }

    public final void b(boolean bl2) {
        gqn gqn2 = bl2 ? gqn.b() : null;
        this.c(gqn2, true);
    }

    public final void c(gqn gqn2, boolean bl2) {
        if (bl2) {
            if (gqn2 == null) {
                int n2;
                int n3 = n2 = this.b - 1;
                if (n2 < 0) {
                    n3 = 0;
                }
                this.b = n3;
                if (n3 == 0) {
                    this.c = null;
                }
                return;
            }
            ++this.b;
        }
        this.c = gqn2;
        this.n(gqn2, (be)this.a, bl2);
    }

    public final gpf d() {
        return this.l("Fragment:onActivityResult");
    }

    public final gpf e() {
        return this.m("DialogFragment:onCancel");
    }

    public final void f(int n2, int n3) {
        gno.h();
        if (n2 == 0 && n3 == 0) {
            return;
        }
        this.c(gqn.b(), true);
    }

    public final gpf g() {
        return this.m("DialogFragment:onDismiss");
    }

    public final gpf h() {
        return this.l("Fragment:onOptionsItemSelected");
    }

    public final void i() {
        gno.h();
        if (this.b > 0) {
            this.c(gqn.b(), false);
        }
    }

    public final void j() {
        gno.n(true);
        if (this.b > 0) {
            this.c(gqn.b(), false);
        }
    }
}

