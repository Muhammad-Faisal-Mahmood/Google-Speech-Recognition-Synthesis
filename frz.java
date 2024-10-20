/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteTransactionListener
 */
import android.database.sqlite.SQLiteTransactionListener;

final class frz
implements SQLiteTransactionListener {
    final fsa a;

    public frz(fsa fsa2) {
        this.a = fsa2;
    }

    public final void onBegin() {
    }

    public final void onCommit() {
    }

    public final void onRollback() {
        if (this.a.a) {
            return;
        }
        throw new fso();
    }
}

