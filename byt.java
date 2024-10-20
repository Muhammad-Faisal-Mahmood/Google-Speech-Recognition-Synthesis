/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Instant;

public final class byt
implements hob {
    public final Object a;
    public final Object b;
    private final int c;

    public /* synthetic */ byt(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public final hog a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object = (hth)((flr)this.a).d.get(this.b);
                object = object == null ? fhd.a().a() : ((hth)object).b;
                return new hog(hhk.K(object));
            }
            String string = Long.toString(Instant.now().toEpochMilli());
            Object object = dxv.aw.b("timestamp", string);
            Object object2 = this.a;
            byu byu2 = (byu)object2;
            byu2.f.a((dyk)object);
            object = this.b;
            return new hog(grf.g((hpn)object).i(new bps(object2, 6), byu2.b).h(new cvp(byu2, (hpn)object, string, 1), byu2.b));
        }
        String string = Long.toString(Instant.now().toEpochMilli());
        Object object = dxv.au.b("timestamp", string);
        Object object3 = this.a;
        byu byu3 = (byu)object3;
        byu3.f.a((dyk)object);
        object = this.b;
        return new hog(grf.g((hpn)object).i(new bps(object3, 7), byu3.b).i(new bpu(object3, object, 4), byu3.b).h(new bte(object3, string, 2), byu3.b));
    }
}

