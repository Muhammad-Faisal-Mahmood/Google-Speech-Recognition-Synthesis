/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

final class caa
extends bzr {
    @Override
    public final void a(bso object, hwp hyg2) {
        object = ((String)((bso)object).j().get(0)).toLowerCase(Locale.getDefault());
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        iik iik2 = (iik)hyg2.b;
        hyg2 = iik.a;
        object.getClass();
        iik2.b |= 1;
        iik2.c = object;
    }

    @Override
    public final void b(bso object, hwp hyg2) {
        object = ((bso)object).m();
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (iik)hyg2.b;
        iik iik2 = iik.a;
        ((iik)hyg2).b |= 8;
        ((iik)hyg2).d = object;
    }

    @Override
    public final void c(bso object, hwp hyg2) {
        int n2;
        object = ((bso)object).e();
        Object object2 = cab.a;
        object2 = bty.b;
        int n3 = n2 = 1;
        if (object != object2) {
            n3 = n2;
            if (object != bty.c) {
                if (object == bty.d) {
                    n3 = n2;
                } else {
                    object2 = bty.e;
                    n3 = n2 = 5;
                    if (object != object2) {
                        object = bty.f;
                        n3 = n2;
                    }
                }
            }
        }
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        object = (iik)hyg2.b;
        hyg2 = iik.a;
        ((iik)object).e = n3 - 1;
        ((iik)object).b |= 0x80;
    }

    @Override
    public final void d(bso object, hwp hyg2) {
        object = gta.a(((bso)object).g());
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hyg2 = (iik)hyg2.b;
        iik iik2 = iik.a;
        ((iik)hyg2).f = ((iay)object).u;
        ((iik)hyg2).b |= 0x200;
    }
}

