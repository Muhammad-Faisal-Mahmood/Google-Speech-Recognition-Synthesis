/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

final class afv
implements afw {
    @Override
    public final void a(String string, String string2, Throwable throwable) {
        Log.e((String)string, (String)afx.a(string2, throwable));
    }

    @Override
    public final void b(String string, String string2, Throwable throwable) {
        Log.w((String)string, (String)afx.a(string2, throwable));
    }
}

