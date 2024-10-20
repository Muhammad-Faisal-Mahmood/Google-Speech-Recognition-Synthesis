/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DatabaseErrorHandler
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.util.Log
 *  android.util.Pair
 */
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;

public final class awv
implements DatabaseErrorHandler {
    public final ilo a;

    public /* synthetic */ awv(ilo ilo2) {
        this.a = ilo2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCorruption(SQLiteDatabase object) {
        Object object2;
        awu awu2;
        block12: {
            jse.d(object, "dbObj");
            awu2 = yj.r(this.a, (SQLiteDatabase)object);
            Log.e((String)"SupportSQLite", (String)a.ak(awu2, "Corruption reported by sqlite on database: ", ".path"));
            if (!awu2.j()) {
                object = awu2.c();
                if (object == null) return;
                awm.a((String)object);
                return;
            }
            object = null;
            object2 = null;
            try {
                try {
                    List list = awu2.d.getAttachedDbs();
                    object = list;
                }
                catch (SQLiteException sQLiteException) {}
                break block12;
            }
            catch (Throwable throwable) {}
            if (object2 != null) {
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    Object object3 = ((Pair)object2.next()).second;
                    jse.d(object3, "p.second");
                    awm.a((String)object3);
                }
                throw throwable;
            }
            object2 = awu2.c();
            if (object2 == null) {
                throw throwable;
            }
            awm.a((String)object2);
            throw throwable;
        }
        object2 = object;
        try {
            awu2.close();
        }
        catch (IOException iOException) {}
        if (object == null) {
            object = awu2.c();
            if (object == null) return;
            awm.a((String)object);
            return;
        }
        object2 = object.iterator();
        while (object2.hasNext()) {
            object = ((Pair)object2.next()).second;
            jse.d(object, "p.second");
            awm.a((String)object);
        }
    }
}

