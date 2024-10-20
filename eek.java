/*
 * Decompiled with CFR 0.152.
 */
public final class eek {
    public final eae a;
    public final byte[] b;
    public long c;
    public int d;
    public int e;
    public int f;
    private final gto g;

    public eek(eae eae2, int n2, gto gto2) {
        this.a = eae2;
        this.g = gto2;
        this.b = new byte[n2];
        this.c = Long.MIN_VALUE;
    }

    public final dzn a(dzn object, long l2, long l3) {
        Object object2 = this.g;
        Object object3 = object;
        if (((gto)object2).g()) {
            Object object4;
            object3 = ((gto)object2).c();
            if (l3 < l2) {
                ((heg)els.a.h().j("com/google/android/libraries/search/audio/core/timestamp/TimestampProvider", "getTimestampForByteRange", 48, "TimestampProvider.kt")).y("#audio# getTimestampForByteRange called with invalid range [%d, %d]", l2, l3);
                object3 = doc.l(dzs.a.l());
                ((bzb)object3).l(doc.k(dzo.a.l()).j());
                object3 = ((bzb)object3).k();
            } else {
                object4 = (els)object3;
                object3 = (dzs)((els)object4).d.get();
                if (((dzs)object3).b == 1) {
                    long l4 = ((els)object4).b;
                    l2 /= l4;
                    l3 /= l4;
                    object2 = (dzq)((dzs)object3).c;
                    l4 = ((dzq)object2).d;
                    if (l2 <= l4 && l4 <= l3) {
                        jse.b(object3);
                    } else {
                        jse.d(object2, "getTimestamp(...)");
                        l3 = ((dzq)object2).d;
                        int n2 = ((els)object4).c;
                        l4 = ((dzq)object2).c;
                        long l5 = n2;
                        object2 = doc.l(dzs.a.l());
                        object3 = doc.h(dzq.a.l());
                        ((bzb)object3).g(l2);
                        ((bzb)object3).h(l4 + (l2 - l3) * l5);
                        ((bzb)object3).i(dzr.c);
                        ((bzb)object2).m(((bzb)object3).f());
                        object3 = ((bzb)object2).k();
                    }
                } else {
                    jse.b(object3);
                }
            }
            object2 = (hwp)((hwv)object).C(5);
            ((hwp)object2).x((hwv)object);
            object = dox.g((hwp)object2);
            jse.e(object3, "value");
            object2 = (hwp)((cxt)object).a;
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object4 = (dzn)((hwp)object2).b;
            object2 = dzn.a;
            object3.getClass();
            ((dzn)object4).e = object3;
            ((dzn)object4).b |= 1;
            object3 = ((cxt)object).e();
        }
        object = object3;
        if (this.c != Long.MIN_VALUE) {
            object = (hwp)((hwv)object3).C(5);
            ((hwp)object).x((hwv)object3);
            object = dox.g((hwp)object);
            ((cxt)object).h(this.c);
            object = ((cxt)object).e();
        }
        object3 = (hwp)((hwv)object).C(5);
        ((hwp)object3).x((hwv)object);
        object = dox.g((hwp)object3);
        ((cxt)object).i(this.f);
        return ((cxt)object).e();
    }

    public final dzn b() {
        if (this.d == 0) {
            return null;
        }
        Object object = dox.g(dzn.a.l());
        cxt cxt2 = dox.f(dzm.a.l());
        cxt2.d(hvu.s(this.b, 0, this.d));
        ((cxt)object).f(cxt2.c());
        object = ((cxt)object).e();
        int n2 = this.e;
        int n3 = this.d;
        long l2 = n2;
        return this.a((dzn)object, n2 - n3, -1L + l2);
    }
}

