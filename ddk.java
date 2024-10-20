/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class ddk
implements Iterable {
    private final ArrayList a;

    public ddk() {
        this.a = new ArrayList();
    }

    public ddk(ddk ddk2) {
        this.a = new ArrayList(ddk2.a);
    }

    public final void a(Object object, int n2) {
        int n3;
        int n4;
        int n5;
        block4: {
            n5 = 0;
            for (n4 = 0; n4 < this.a.size(); ++n4) {
                if (!((gtp)this.a.get((int)n4)).a.equals(object)) continue;
                n3 = n4;
                break block4;
            }
            n3 = -1;
        }
        n4 = n5;
        if (n3 != -1) {
            if ((Integer)((gtp)this.a.get((int)n3)).b == n2) {
                return;
            }
            this.a.remove(n3);
            n4 = n5;
        }
        while (n4 < this.a.size() && (Integer)((gtp)this.a.get((int)n4)).b <= n2) {
            ++n4;
        }
        this.a.add(n4, new gtp(object, n2));
    }

    public final Iterator iterator() {
        return fvd.H(this.a.iterator(), new cxc(12));
    }
}

