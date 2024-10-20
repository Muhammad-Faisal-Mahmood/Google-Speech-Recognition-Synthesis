/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.TelephonyDisplayInfo
 */
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback$DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;

final class afy
extends TelephonyCallback
implements TelephonyCallback$DisplayInfoListener {
    private final jle a;

    public afy(jle jle2) {
        this.a = jle2;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo object) {
        int n2 = sk$$ExternalSyntheticApiModelOutline1.m((TelephonyDisplayInfo)object);
        int n3 = 5;
        n2 = n2 != 3 && n2 != 4 && n2 != 5 ? 0 : 1;
        object = this.a;
        n2 = 1 != n2 ? n3 : 10;
        ((jle)object).f(n2);
    }
}

