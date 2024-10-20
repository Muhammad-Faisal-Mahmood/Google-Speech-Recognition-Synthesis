/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class cfb
extends ceu {
    final cfc g;

    public cfb(cfc cfc2, int n2, Bundle bundle) {
        this.g = cfc2;
        super(cfc2, n2, bundle);
    }

    @Override
    protected final void a(cbk cbk2) {
        this.g.f.a(cbk2);
        System.currentTimeMillis();
    }

    @Override
    protected final boolean c() {
        this.g.f.a(cbk.a);
        return true;
    }
}

