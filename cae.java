/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class cae {
    protected final Context a;
    protected final String b;
    protected final gui c = new bpr(4);
    protected cat d = cat.a;
    public cam e;

    public cae(Context context, String string) {
        kl.at(context);
        this.a = context;
        kl.ar(string);
        this.b = string;
    }

    public final caj a() {
        gui gui2 = this.c;
        return new caj(this.a, this.b, this.d, null, null, gui2, this.e);
    }

    public final void b(cat cat2) {
        kl.at(cat2);
        this.d = cat2;
        caf.b(cat2);
    }
}

