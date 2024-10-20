/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.os.CancellationSignal
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;

final class fry
extends fsb {
    final Object[] a;
    final String b;
    final fsc c;

    public fry(fsc fsc2, Object[] objectArray, String string) {
        this.a = objectArray;
        this.b = string;
        this.c = fsc2;
        super(fsc2);
    }

    @Override
    public final Cursor a(CancellationSignal cancellationSignal) {
        this.c.e.d();
        try {
            SQLiteDatabase sQLiteDatabase = this.c.a;
            fsp fsp2 = new fsp(this.a);
            cancellationSignal = sQLiteDatabase.rawQueryWithFactory((SQLiteDatabase.CursorFactory)fsp2, this.b, null, null, cancellationSignal);
            return cancellationSignal;
        }
        finally {
            this.c.e.c();
        }
    }
}

