/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class bij
implements Runnable {
    private final bcn a;
    private final boolean b;
    private final int c;
    private final bzb d;

    public bij(bcn bcn2, bzb bzb2, boolean bl2, int n2) {
        jse.e(bcn2, "processor");
        jse.e(bzb2, "token");
        this.a = bcn2;
        this.d = bzb2;
        this.b = bl2;
        this.c = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        Object object;
        if (this.b) {
            Object object2 = this.a;
            object = this.d;
            int n2 = this.c;
            String string = ((bgs)((bzb)object).a).a;
            object = ((bcn)object2).j;
            // MONITORENTER : object
            object2 = ((bcn)object2).d(string);
            // MONITOREXIT : object
            bcn.f((dhl)object2, n2);
        } else {
            Object object3 = this.a;
            bzb bzb2 = this.d;
            int n3 = this.c;
            String string = ((bgs)bzb2.a).a;
            object = ((bcn)object3).j;
            // MONITORENTER : object
            if (((bcn)object3).e.get(string) != null) {
                bbi.a();
                // MONITOREXIT : object
            } else {
                Set set = (Set)((bcn)object3).g.get(string);
                if (set != null && set.contains(bzb2)) {
                    object3 = ((bcn)object3).d(string);
                    // MONITOREXIT : object
                    bcn.f((dhl)object3, n3);
                }
            }
        }
        bbi.a();
        bbi.b("StopWorkRunnable");
        object = ((bgs)this.d.a).a;
    }
}

