/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 */
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class cbn
extends gbs {
    final cbo a;
    private final Context b;

    public cbn(cbo cbo2, Context context) {
        this.a = cbo2;
        cbo2 = Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper();
        super((Looper)cbo2, (byte[])null);
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(Message object) {
        if (((Message)object).what != 1) {
            int n2 = ((Message)object).what;
            object = new StringBuilder("Don't know how to handle this message: ");
            ((StringBuilder)object).append(n2);
            Log.w((String)"GoogleApiAvailability", (String)((StringBuilder)object).toString());
            return;
        }
        int n3 = this.a.e(this.b);
        object = ccg.c;
        if (n3 != 1 && n3 != 2 && n3 != 3 && n3 != 9) {
            return;
        }
        this.a.b(this.b, n3);
    }
}

