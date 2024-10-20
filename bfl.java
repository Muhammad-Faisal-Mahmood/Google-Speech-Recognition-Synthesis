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

public final class bfl
extends bfq {
    public bfl(Context context, czh czh2) {
        jse.e(context, "context");
        super(context, czh2);
    }

    @Override
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override
    public final void c(Intent object) {
        jse.e(object, "intent");
        object = object.getAction();
        if (object != null) {
            bbi.a();
            String string = bfm.a;
            switch (((String)object).hashCode()) {
                default: {
                    break;
                }
                case 1019184907: {
                    if (!((String)object).equals("android.intent.action.ACTION_POWER_CONNECTED")) break;
                    this.f(true);
                    return;
                }
                case 948344062: {
                    if (!((String)object).equals("android.os.action.CHARGING")) break;
                    this.f(true);
                    return;
                }
                case -54942926: {
                    if (!((String)object).equals("android.os.action.DISCHARGING")) break;
                    this.f(false);
                    return;
                }
                case -1886648615: {
                    if (!((String)object).equals("android.intent.action.ACTION_POWER_DISCONNECTED")) break;
                    this.f(false);
                }
            }
        }
    }
}

