/*
 * Decompiled with CFR 0.152.
 */
public final class hry
implements hsy {
    static final iws a = new iwo(idi.A(hqs.c.i()), iwx.f);
    static final iws b = new iwo(idi.A(hqt.d.i()), iwx.f);
    private final hrw c;
    private final hrx d;
    private gzx e;
    private int f;

    public hry(hrw hrw2) {
        this.c = hrw2;
        this.d = hrw2.b();
    }

    @Override
    public final /* synthetic */ htl a() {
        return htl.a;
    }

    @Override
    public final /* synthetic */ htl b(gpm gpm2) {
        return htl.a;
    }

    @Override
    public final htl c(gpm object) {
        this.e = this.d.a();
        this.f = 2;
        if (((Boolean)this.c.a().a()).booleanValue() && !this.e.isEmpty() && this.f == 2) {
            Object object2 = ((gpm)object).c;
            object = a;
            Object object3 = this.e;
            hwp hwp2 = hqs.a.l();
            int n2 = object3.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object4 = (String)object3.get(i2);
                object4 = hvu.q(hjd.e.h((CharSequence)object4));
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hqs hqs2 = (hqs)hwp2.b;
                hxk hxk2 = hqs2.b;
                if (!hxk2.c()) {
                    hqs2.b = hwv.s(hxk2);
                }
                hqs2.b.add(object4);
            }
            object3 = ((hqs)hwp2.o()).g();
            ((iwx)object2).g((iws)object, object3);
            return htl.a;
        }
        return htl.a;
    }

    @Override
    public final /* synthetic */ htl d(bzq bzq2) {
        return htl.a;
    }

    @Override
    public final /* synthetic */ void e(bzq bzq2) {
    }

    @Override
    public final /* synthetic */ void f(dlm dlm2) {
    }

    @Override
    public final void g(dlm object) {
        if (((Boolean)this.c.a().a()).booleanValue() && this.f == 2) {
            object = ((dlm)object).a;
            Object object2 = b;
            if ((object = (Object)((byte[])((iwx)object).b((iws)object2))) != null) {
                try {
                    object2 = (hqt)((hwp)hqt.a.l().c((byte[])object, hwj.a())).o();
                    if ((((hqt)object2).b & 1) != 0) {
                        object = this.d;
                        object2 = ((hqt)object2).c;
                        object.b();
                        return;
                    }
                }
                catch (hxn hxn2) {
                    throw new RuntimeException(hxn2);
                }
            }
        }
    }
}

