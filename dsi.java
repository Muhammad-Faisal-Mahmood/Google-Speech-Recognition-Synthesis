/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class dsi
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public dsi(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final dsh a() {
        Context context = ((ilt)this.a).a();
        cgw cgw2 = (cgw)this.b.b();
        return new dsh(context, this.c);
    }
}

