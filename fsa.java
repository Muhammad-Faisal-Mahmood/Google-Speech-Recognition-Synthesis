/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteTransactionListener
 */
import android.database.sqlite.SQLiteTransactionListener;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.ArrayList;
import java.util.concurrent.Callable;

final class fsa
implements Callable {
    volatile boolean a;
    final fsc b;
    final AmbientModeSupport$AmbientController c;
    final hth d;

    public fsa(fsc fsc2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, hth hth2) {
        this.c = ambientModeSupport$AmbientController;
        this.d = hth2;
        this.b = fsc2;
    }

    public final Object call() {
        fxf.B(this.b.a.inTransaction() ^ true, "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        Object object = new frz(this);
        this.b.a.beginTransactionWithListener((SQLiteTransactionListener)object);
        try {
            this.a = true;
            Object object2 = this.c;
            object = this.d;
            int n2 = ((ghh)((AmbientModeSupport$AmbientController)object2).a).a;
            object2 = ghl.j;
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<Object> arrayList = new ArrayList<Object>();
            stringBuilder.append("DELETE FROM ListenerSuccessfulRuns WHERE version_code != ?");
            object2 = (long)n2;
            arrayList.add(object2);
            ((hth)object).t(fvc.R(stringBuilder, arrayList));
            stringBuilder = new StringBuilder();
            arrayList = new ArrayList<Object>();
            stringBuilder.append("DELETE FROM AllListenersSucceededVersionTable WHERE version_code != ?");
            arrayList.add(object2);
            ((hth)object).t(fvc.R(stringBuilder, arrayList));
            hth.n();
            this.b.a.setTransactionSuccessful();
            this.a = false;
            return null;
        }
        finally {
            this.b.a.endTransaction();
        }
    }
}

