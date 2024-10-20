/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Map;

public final class amu
implements agr {
    private final agr a;
    private final int b;
    private final byte[] c;
    private int d;
    private final ank e;

    public amu(agr agr2, int n2, ank ank2) {
        boolean bl2 = n2 > 0;
        abr.d(bl2);
        this.a = agr2;
        this.b = n2;
        this.e = ank2;
        this.c = new byte[1];
        this.d = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        int n5 = n4 = this.d;
        if (n4 == 0) {
            Object object = this.a;
            byte[] byArray2 = this.c;
            int n6 = 0;
            if (object.a(byArray2, 0, 1) == -1) return -1;
            n5 = (this.c[0] & 0xFF) << 4;
            if (n5 != 0) {
                int n7;
                object = new byte[n5];
                n4 = n5;
                while (true) {
                    n7 = n5;
                    if (n4 <= 0) break;
                    n7 = this.a.a((byte[])object, n6, n4);
                    if (n7 == -1) return -1;
                    n6 += n7;
                    n4 -= n7;
                }
                while (n7 > 0 && object[n5 = n7 - 1] == false) {
                    n7 = n5;
                }
                if (n7 > 0) {
                    ank ank2 = this.e;
                    object = new aga((byte[])object, n7);
                    long l2 = !ank2.l ? ank2.i : Math.max(ank2.m.c(true), ank2.i);
                    n5 = ((aga)object).a();
                    aqe aqe2 = ank2.k;
                    abr.i(aqe2);
                    aqe2.l((aga)object, n5);
                    aqe2.m(l2, 1, n5, 0, null);
                    ank2.l = true;
                }
            }
            this.d = n5 = this.b;
        }
        if ((n2 = this.a.a(byArray, n2, Math.min(n5, n3))) == -1) return n2;
        this.d -= n2;
        return n2;
    }

    @Override
    public final long b(agt agt2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Uri c() {
        return this.a.c();
    }

    @Override
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map e() {
        return this.a.e();
    }

    @Override
    public final void f(ahl ahl2) {
        abr.i(ahl2);
        this.a.f(ahl2);
    }
}

