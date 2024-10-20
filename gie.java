/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class gie
implements ilw {
    private final Context a;
    private final gib b;
    private final ilw c;
    private volatile Object d;
    private final Object e = new Object();

    public gie(Context context, gib gib2) {
        this.a = context;
        this.b = gib2;
        this.c = new ilj(context, gib2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.d != null) return this.d;
        Object object = this.e;
        synchronized (object) {
            if (this.d != null) return this.d;
            Object object2 = this.a.getApplicationContext();
            fxf.E(object2 instanceof ilw, "TikTokFragmentHost must be created with a @Sting Application: Found: %s", object2);
            object2 = ((gid)idi.e(this.c, gid.class)).b();
            ((bqu)object2).b = this.b;
            this.d = ((bqu)object2).a();
            return this.d;
        }
    }
}

