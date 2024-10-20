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

public final class bfn
extends bfq {
    public bfn(Context context, czh czh2) {
        jse.e(context, "context");
        super(context, czh2);
    }

    @Override
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override
    public final void c(Intent object) {
        jse.e(object, "intent");
        if (object.getAction() != null) {
            bbi.a();
            String string = bfo.a;
            object.getAction();
            object = object.getAction();
            if (object != null) {
                int n2 = ((String)object).hashCode();
                if (n2 != -1980154005) {
                    if (n2 == 490310653 && ((String)object).equals("android.intent.action.BATTERY_LOW")) {
                        this.f(false);
                        return;
                    }
                } else if (((String)object).equals("android.intent.action.BATTERY_OKAY")) {
                    this.f(true);
                }
            }
        }
    }
}

