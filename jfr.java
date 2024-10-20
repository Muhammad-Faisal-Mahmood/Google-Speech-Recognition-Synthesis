/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;

final class jfr {
    final Object a;
    Collection b;
    iyh c;
    final jfs d;

    public jfr(jfs jfs2) {
        this.d = jfs2;
        this.a = new Object();
        this.b = new HashSet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void a(iyh iyh2) {
        Object object = this.a;
        // MONITORENTER : object
        if (this.c != null) {
            // MONITOREXIT : object
            return;
        }
        this.c = iyh2;
        boolean bl2 = this.b.isEmpty();
        // MONITOREXIT : object
        if (!bl2) return;
        this.d.y.o(iyh2);
    }
}

