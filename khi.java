/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class khi
implements kgn {
    public static final khi a = new khi();

    private khi() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final kgv a(kid object) {
        khp khp2 = ((kid)object).a;
        // MONITORENTER : khp2
        if (!khp2.k) {
            object = new IllegalStateException("released");
            throw object;
        }
        if (khp2.j) {
            object = new IllegalStateException("Check failed.");
            throw object;
        }
        boolean bl2 = khp2.i;
        if (!bl2) {
            // MONITOREXIT : khp2
            khl khl2 = khp2.g;
            jse.b(khl2);
            Object object2 = khl2.a(khp2.a, (kid)object);
            khp2.n = object2 = new kmb(khp2, khp2.d, khl2, (kib)object2);
            khp2.o = object2;
            // MONITORENTER : khp2
            khp2.i = true;
            khp2.j = true;
            // MONITOREXIT : khp2
            if (khp2.l) throw new IOException("Canceled");
            return kid.c((kid)object, 0, (kmb)object2, null, 61).a(((kid)object).b);
        }
        object = new IllegalStateException("Check failed.");
        throw object;
    }
}

