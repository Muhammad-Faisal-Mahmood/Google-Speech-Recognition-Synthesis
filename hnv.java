/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

final class hnv
extends hnt {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int a(hnw hnw2) {
        synchronized (hnw2) {
            int n2;
            hnw2.remaining = n2 = hnw2.remaining - 1;
            return n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(hnw hnw2, Set set) {
        synchronized (hnw2) {
            if (hnw2.seenExceptions == null) {
                hnw2.seenExceptions = set;
            }
            return;
        }
    }
}

