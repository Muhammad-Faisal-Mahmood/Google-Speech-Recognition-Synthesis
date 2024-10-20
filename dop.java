/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

public final class dop
extends doo
implements dmw {
    private final dmt a;

    static {
        new LinkedHashSet();
    }

    public dop(dmu dmu2, iku iku2, Executor executor) {
        this.a = dmu2.a(executor, iku2, null);
    }

    @Override
    public final /* synthetic */ void L() {
    }

    @Override
    public final void a(gqm hyg2) {
        long l2;
        Object object;
        Object object2 = ((gqm)hyg2).e.iterator();
        long l3 = Long.MIN_VALUE;
        long l4 = Long.MAX_VALUE;
        while (object2.hasNext()) {
            object = (gok)object2.next();
            l2 = ((gok)object).f * 1000000L + (long)((gok)object).g;
            l4 = Math.min(l4, l2);
            l3 = Math.max(l3, l2 + (((gok)object).h * 1000000L + (long)((gok)object).i));
        }
        boolean bl2 = l4 >= 0L;
        fvd.am(bl2);
        bl2 = l4 < l3;
        fvd.am(bl2);
        object = kdn.a.l();
        l2 = fxf.ad((gqm)hyg2);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object2 = ((hwp)object).b;
        hyg2 = (kdn)object2;
        ((kdn)hyg2).b |= 4;
        ((kdn)hyg2).e = l2;
        if (!((hwv)object2).B()) {
            ((hwp)object).u();
        }
        hyg2 = (kdn)((hwp)object).b;
        ((kdn)hyg2).b |= 1;
        ((kdn)hyg2).c = 0;
        hwv hwv2 = hzu.b(l3 - l4);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hyg2 = ((hwp)object).b;
        object2 = (kdn)hyg2;
        hwv2.getClass();
        ((kdn)object2).d = hwv2;
        ((kdn)object2).b |= 2;
        if (!((hwv)hyg2).B()) {
            ((hwp)object).u();
        }
        hyg2 = (kdn)((hwp)object).b;
        ((kdn)hyg2).f = 6;
        ((kdn)hyg2).b |= 8;
        object2 = (kdn)((hwp)object).o();
        dmt dmt2 = this.a;
        object = dmq.a();
        ((fhc)object).h(true);
        hyg2 = kfl.a.l();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        hwv2 = (kfl)((hwp)hyg2).b;
        object2.getClass();
        ((kfl)hwv2).p = object2;
        ((kfl)hwv2).b |= 0x80000;
        ((fhc)object).i((kfl)((hwp)hyg2).o());
        ((fhc)object).d = null;
        dmt2.b(((fhc)object).e());
    }
}

