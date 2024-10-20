/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 */
import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dnc
implements dmw {
    public final hpr a;
    public final iku b;

    public dnc(dmu dmu2, Context context, hpr hpr2, iku iku2, jnu jnu2, jnu jnu3) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        dmu2.a(hpr2, iku2, jnu2);
        this.a = hpr2;
        this.b = iku2;
        fvd.ap(new drq(this, context, 1));
        fvd.ap(new aim(jnu3, 14));
    }

    @Override
    public final void L() {
        hhk.N(new cmw(this, 12), this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            dnb dnb2 = (dnb)this.b.b();
            return;
        }
    }
}

