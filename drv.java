/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class drv {
    public final dru a;
    private long b;

    public drv(dru dru2) {
        this.a = dru2;
        this.b = 1L;
    }

    public final void a(dru object, long l2, ArrayList arrayList) {
        List list;
        if (((dru)object).f == null) {
            list = ((dru)object).f == null ? Collections.emptyList() : ((dru)object).f;
        } else {
            list = ((dru)object).f;
            ((dru)object).f = null;
        }
        if (!((dru)object).c() || !list.isEmpty()) {
            hwr hwr2 = (hwr)kec.a.l();
            int n2 = ((dru)object).g;
            String string = ((dru)object).b;
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            kec kec2 = (kec)hwr2.b;
            string.getClass();
            kec2.b |= 1;
            kec2.c = string;
            long l3 = ((dru)object).c;
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            kec2 = (kec)hwr2.b;
            kec2.b |= 0x200;
            kec2.h = l3;
            l3 = ((dru)object).a();
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            kec2 = (kec)hwr2.b;
            kec2.b |= 0x400;
            kec2.i = l3;
            l3 = ((dru)object).e;
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            kec2 = (kec)hwr2.b;
            kec2.b |= 0x1000;
            kec2.j = l3;
            l3 = this.b;
            this.b = 1L + l3;
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            kec2 = (kec)hwr2.b;
            kec2.b |= 8;
            kec2.f = l3;
            if (!hwr2.b.B()) {
                ((hwp)hwr2).u();
            }
            kec2 = (kec)hwr2.b;
            kec2.b |= 0x10;
            kec2.g = l2;
            n2 = ((dru)object).h - 1;
            if (n2 != 1) {
                if (n2 != 3) {
                    if (!hwr2.b.B()) {
                        ((hwp)hwr2).u();
                    }
                    kec2 = (kec)hwr2.b;
                    kec2.k = 0;
                    kec2.b |= 0x2000;
                } else {
                    if (!hwr2.b.B()) {
                        ((hwp)hwr2).u();
                    }
                    kec2 = (kec)hwr2.b;
                    kec2.k = 4;
                    kec2.b |= 0x2000;
                }
            } else {
                if (!hwr2.b.B()) {
                    ((hwp)hwr2).u();
                }
                kec2 = (kec)hwr2.b;
                kec2.k = 1;
                kec2.b |= 0x2000;
            }
            if (((dru)object).c()) {
                l2 = ((dru)list.get((int)(list.size() - 1))).d;
                l3 = ((dru)object).c;
                if (!hwr2.b.B()) {
                    ((hwp)hwr2).u();
                }
                object = (kec)hwr2.b;
                ((kec)object).b |= 0x400;
                ((kec)object).i = l2 - l3;
            }
            arrayList.add((kec)hwr2.o());
            object = list.iterator();
            while (object.hasNext()) {
                this.a((dru)object.next(), ((kec)hwr2.b).f, arrayList);
            }
        }
    }
}

