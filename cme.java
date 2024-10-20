/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.ContentObserver
 */
import android.database.ContentObserver;

final class cme
extends ContentObserver {
    final cmg a;

    public cme(cmg cmg2) {
        this.a = cmg2;
        super(null);
    }

    public final void onChange(boolean bl2) {
        this.a.a.set(true);
    }
}

