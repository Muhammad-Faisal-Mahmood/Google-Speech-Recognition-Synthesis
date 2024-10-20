/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.Context;
import android.net.Uri;
import android.util.Log;

public final class duj {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public duj(Context context, String string, awm awm2, boolean bl2, boolean bl3) {
        jse.e(context, "context");
        this.d = context;
        this.a = string;
        this.e = awm2;
        this.b = bl2;
        this.c = bl3;
    }

    public duj(Uri uri) {
        this(uri, "", "", false, false);
    }

    public duj(Uri uri, String string, String string2, boolean bl2, boolean bl3) {
        this.d = uri;
        this.e = string;
        this.a = string2;
        this.b = bl2;
        this.c = bl3;
    }

    public final duj a() {
        if (this.d == null) {
            Log.w((String)"PhenotypeFlag", (String)"Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        Object object = this.d;
        Object object2 = this.e;
        String string = this.a;
        boolean bl2 = this.b;
        object2 = (String)object2;
        return new duj((Uri)object, (String)object2, string, bl2, true);
    }

    public final duj b() {
        if (((String)this.e).isEmpty()) {
            Object object = this.d;
            Object object2 = this.e;
            String string = this.a;
            boolean bl2 = this.c;
            object2 = (String)object2;
            return new duj((Uri)object, (String)object2, string, true, bl2);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final dul c(String string, long l2) {
        return new dud(this, string, l2);
    }

    public final dul d(String string, boolean bl2) {
        return new due(this, string, bl2);
    }
}

