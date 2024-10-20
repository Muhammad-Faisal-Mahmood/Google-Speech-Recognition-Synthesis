/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class bfx
extends bfq {
    public bfx(Context context, czh czh2) {
        jse.e(context, "context");
        super(context, czh2);
    }

    @Override
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override
    public final void c(Intent object) {
        jse.e(object, "intent");
        if (object.getAction() != null) {
            bbi.a();
            int n2 = bfy.a;
            object.getAction();
            object = object.getAction();
            if (object != null) {
                n2 = ((String)object).hashCode();
                if (n2 != -1181163412) {
                    if (n2 == -730838620 && ((String)object).equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        this.f(true);
                        return;
                    }
                } else if (((String)object).equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    this.f(false);
                }
            }
        }
    }
}

