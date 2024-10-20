/*
 * Decompiled with CFR 0.152.
 */
final class gqz
implements gqw {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final gqx a(gra gra2) {
        synchronized (gra2) {
            return gra2.currentMetadata;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean b(gra gra2, gqx gqx2, gqx gqx3) {
        synchronized (gra2) {
            if (gra2.currentMetadata == gqx2) {
                gra2.currentMetadata = gqx3;
                return true;
            }
            return false;
        }
    }
}

