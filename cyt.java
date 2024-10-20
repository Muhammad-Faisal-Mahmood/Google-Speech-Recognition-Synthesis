/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class cyt
implements hny {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ cyt(cwj cwj2, cth cth2, int n2, int n3, int n4) {
        this.e = n4;
        this.d = cwj2;
        this.c = cth2;
        this.b = n2;
        this.a = n3;
    }

    public /* synthetic */ cyt(cyu cyu2, hnx hnx2, int n2, int n3, int n4) {
        this.e = n4;
        this.c = cyu2;
        this.d = hnx2;
        this.b = n2;
        this.a = n3;
    }

    @Override
    public final hpn a(Object object) {
        if (this.e != 0) {
            boolean bl2 = (Boolean)object;
            object = this.c;
            if (!bl2) {
                cyr.h("%s: Subscribing to file failed for group: %s", "FileGroupManager", ((cth)object).d);
                object = hhk.K(false);
            } else {
                int n2 = this.a;
                int n3 = this.b;
                object = ((cwj)this.d).o((cth)object, n3 + 1, n2);
            }
            return object;
        }
        gto gto2 = (gto)object;
        if (!gto2.g()) {
            object = hpj.a;
        } else {
            int n4 = this.a;
            int n5 = this.b;
            Object object2 = this.d;
            object = this.c;
            object = dah.e(object2.a()).f(new ffq((cyu)object, n5, n4, gto2, 1), (Executor)hom.a);
        }
        return object;
    }
}

