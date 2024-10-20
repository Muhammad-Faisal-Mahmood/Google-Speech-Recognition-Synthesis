/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Instant;

public final class gdq
implements gen {
    @Override
    public final int a(Instant instant, gdo gdo2, boolean bl2) {
        int n2;
        if (gdo2.b()) {
            boolean bl3 = gdo2.c();
            n2 = 2;
            if (!bl3 && bl2) {
                return 3;
            }
        } else {
            n2 = 1;
        }
        return n2;
    }
}

