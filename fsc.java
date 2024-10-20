/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
import android.database.sqlite.SQLiteDatabase;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;

public final class fsc {
    public final SQLiteDatabase a;
    public final Executor b;
    public final Executor c;
    public volatile boolean d = false;
    public final AmbientModeSupport$AmbientController e;

    public fsc(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.c = executor2;
        this.e = ambientModeSupport$AmbientController;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        throw new IllegalStateException("Already closed");
    }
}

