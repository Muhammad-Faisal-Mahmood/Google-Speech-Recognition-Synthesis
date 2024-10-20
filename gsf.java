/*
 * Decompiled with CFR 0.152.
 */
public final class gsf
implements aas {
    final bmu a;
    private boolean b;

    public gsf(bmu bmu2) {
        this.a = bmu2;
        this.b = false;
    }

    @Override
    public final /* synthetic */ void onCreate(abe abe2) {
        wc.d(abe2);
    }

    @Override
    public final void onDestroy(abe object) {
        gsi gsi2 = (gsi)this.a.a.a();
        boolean bl2 = gsi2.c == null;
        fxf.A(bl2);
        int n2 = gsi2.a.b();
        while (--n2 >= 0) {
            object = gsi2.a;
            if (((pb)object).a) {
                pc.b((pb)object);
            }
            ((pb)object).c[n2] = null;
        }
        gsi2.f = false;
    }

    @Override
    public final /* synthetic */ void onPause(abe abe2) {
        wc.f(abe2);
    }

    @Override
    public final void onResume(abe abe2) {
        ((gsi)this.a.a.a()).e((by)this.a.b.a());
        if (!this.b) {
            abe2.getLifecycle().b(new gsg(this.a));
            this.b = true;
        }
    }

    @Override
    public final void onStart(abe abe2) {
        ((gsi)this.a.a.a()).e((by)this.a.b.a());
    }

    @Override
    public final void onStop(abe object) {
        gsi gsi2 = (gsi)this.a.a.a();
        object = this.a.b.a();
        boolean bl2 = true;
        fxf.q(true);
        by by2 = gsi2.c;
        if (by2 != null) {
            if (object != by2) {
                bl2 = false;
            }
            fxf.A(bl2);
            gsi2.c = null;
            object = new ou((ov)gsi2.b);
            while (object.hasNext()) {
                ((gsj)object.next()).c(null);
            }
        }
    }
}

