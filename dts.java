/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 */
import android.content.ContentResolver;
import android.content.Context;

public final class dts
implements dtr {
    public final dtu a;
    public final String b;

    public /* synthetic */ dts(dtu dtu2, String string) {
        this.a = dtu2;
        this.b = string;
    }

    @Override
    public final Object a() {
        ContentResolver contentResolver = ((Context)this.a.c).getContentResolver();
        String string = this.b;
        return cmb.a.d(contentResolver, string);
    }
}

