/*
 * Decompiled with CFR 0.152.
 */
final class jil
extends jij {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a(jim jim2) {
        synchronized (jim2) {
            if (jim2.a == 0) {
                jim2.a = -1;
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(jim jim2) {
        synchronized (jim2) {
            jim2.a = 0;
            return;
        }
    }
}

