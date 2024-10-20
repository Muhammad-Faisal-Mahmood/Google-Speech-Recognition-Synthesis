/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
import android.database.DataSetObserver;

final class ju
extends DataSetObserver {
    final jw a;

    public ju(jw jw2) {
        this.a = jw2;
    }

    public final void onChanged() {
        if (this.a.u()) {
            this.a.s();
        }
    }

    public final void onInvalidated() {
        this.a.k();
    }
}

