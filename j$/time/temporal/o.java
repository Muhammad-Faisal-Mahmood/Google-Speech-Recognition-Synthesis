/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.a;
import j$.time.temporal.k;
import j$.time.temporal.n;

public final class o
implements n {
    public final int a;
    public final int b;

    public /* synthetic */ o(int n2, int n3) {
        this.a = n3;
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final k g(k k2) {
        switch (this.a) {
            default: {
                int n2 = k2.p(j$.time.temporal.a.DAY_OF_WEEK);
                int n3 = this.b;
                if (n2 == n3) {
                    return k2;
                }
                n2 = (n2 = n3 - n2) >= 0 ? 7 - n2 : -n2;
                long l2 = n2;
                return k2.m(l2, ChronoUnit.DAYS);
            }
            case 0: 
        }
        int n4 = k2.p(j$.time.temporal.a.DAY_OF_WEEK);
        int n5 = this.b;
        if (n4 == n5) {
            return k2;
        }
        n5 = (n5 = n4 - n5) >= 0 ? 7 - n5 : -n5;
        long l3 = n5;
        return k2.f(l3, ChronoUnit.DAYS);
    }
}

