/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class cku
implements cla {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final int d;

    public cku(Executor executor, ckq ckq2, cld cld2, int n2) {
        this.d = n2;
        this.c = executor;
        this.b = ckq2;
        this.a = cld2;
    }

    public cku(Executor executor, Object object, int n2) {
        this.d = n2;
        this.a = new Object();
        this.c = executor;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void b(ckz object) {
        int n2 = this.d;
        if (n2 == 0) {
            if (!((cld)object).c) return;
            Object object2 = this.a;
            // MONITORENTER : object2
            // MONITOREXIT : object2
            this.c.execute(new cmw(this, 1));
            return;
        }
        if (n2 == 1) {
            object = new ckr(this, object, 0);
            this.c.execute((Runnable)object);
            return;
        }
        if (n2 == 2) {
            Object object3 = this.a;
            // MONITORENTER : object3
            // MONITOREXIT : object3
            this.c.execute(new ckr(this, object, 3));
            return;
        }
        if (n2 != 3) {
            if (!((ckz)object).e()) return;
            Object object4 = this.a;
            // MONITORENTER : object4
            // MONITOREXIT : object4
            this.c.execute(new ckr(this, object, 5));
            return;
        }
        if (((ckz)object).e()) return;
        if (((cld)object).c) return;
        Object object5 = this.a;
        // MONITORENTER : object5
        // MONITOREXIT : object5
        this.c.execute(new ckr(this, object, 4));
    }
}

