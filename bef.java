/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

public class bef
extends BroadcastReceiver {
    public static final int a = 0;

    static {
        bbi.b("ConstraintProxy");
    }

    public final void onReceive(Context context, Intent intent) {
        bbi.a();
        Objects.toString(intent);
        context.startService(bee.b(context));
    }
}

