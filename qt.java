/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class qt
extends qs {
    public int m;

    public qt(ra ra2) {
        super(ra2);
        int n2 = true != ra2 instanceof qx ? 3 : 2;
        this.l = n2;
    }

    @Override
    public final void c(int n2) {
        if (!this.i) {
            this.i = true;
            this.f = n2;
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                ((qq)iterator.next()).f();
            }
        }
    }
}

