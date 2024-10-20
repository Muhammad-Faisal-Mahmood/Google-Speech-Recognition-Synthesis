/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

abstract class ceu
extends cew {
    public final int a;
    public final Bundle b;
    final cfc c;

    protected ceu(cfc cfc2, int n2, Bundle bundle) {
        this.c = cfc2;
        super(cfc2, true);
        this.a = n2;
        this.b = bundle;
    }

    protected abstract void a(cbk var1);

    @Override
    protected final void b() {
    }

    protected abstract boolean c();
}

