/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 */
import android.content.IntentFilter;

final class ec
extends eb {
    final eg a;
    public final bmu b;

    public ec(eg eg2, bmu bmu2) {
        this.a = eg2;
        super(eg2);
        this.b = bmu2;
    }

    @Override
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override
    public final void b() {
        this.a.M();
    }
}

