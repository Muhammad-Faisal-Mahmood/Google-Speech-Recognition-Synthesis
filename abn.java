/*
 * Decompiled with CFR 0.152.
 */
public class abn {
    public static final Object a = new Object();
    public final Object b = new Object();
    public final oi c = new oi();
    public int d = 0;
    public boolean e;
    public volatile Object f;
    public volatile Object g;
    public int h;
    public final Runnable i;
    private boolean j;
    private boolean k;

    public abn() {
        Object object;
        this.g = object = a;
        this.i = new kd(this, 15);
        this.f = object;
        this.h = -1;
    }

    public abn(Object object) {
        this.g = a;
        this.i = new kd(this, 15);
        this.f = object;
        this.h = 0;
    }

    public static void a(String string) {
        if (nz.v().w()) {
            return;
        }
        throw new IllegalStateException(a.aj(string, "Cannot invoke ", " on a background thread"));
    }

    private final void h(abm abm2) {
        if (abm2.d) {
            if (!abm2.aS()) {
                abm2.d(false);
                return;
            }
            int n2 = abm2.e;
            int n3 = this.h;
            if (n2 < n3) {
                abm2.e = n3;
                abm2.c.a(this.f);
            }
        }
    }

    final void b(abm object) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        while (true) {
            this.k = false;
            if (object != null) {
                this.h((abm)object);
            } else {
                object = this.c.e();
                while (object.hasNext()) {
                    this.h((abm)((oe)((of)object).a()).b);
                    if (!this.k) continue;
                }
            }
            if (!this.k) break;
            object = null;
        }
        this.j = false;
    }

    public final void c(abe abe2, abp object) {
        abl abl2;
        block5: {
            block4: {
                abn.a("observe");
                if (abe2.getLifecycle().a() == aba.a) break block4;
                abl2 = new abl(this, abe2, (abp)object);
                if ((object = (abm)this.c.f(object, abl2)) != null && !((abm)object).c(abe2)) {
                    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
                }
                if (object == null) break block5;
            }
            return;
        }
        abe2.getLifecycle().b(abl2);
    }

    protected void d() {
    }

    protected void e() {
    }

    public void f(abp object) {
        abn.a("removeObserver");
        object = (abm)this.c.b(object);
        if (object == null) {
            return;
        }
        ((abm)object).b();
        ((abm)object).d(false);
    }

    public void g(Object object) {
        throw null;
    }
}

