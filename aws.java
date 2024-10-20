/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteCursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteProgram
 *  android.database.sqlite.SQLiteQuery
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;

public final class aws
implements SQLiteDatabase.CursorFactory {
    public final jrq a;

    public /* synthetic */ aws(jrq jrq2) {
        this.a = jrq2;
    }

    public final Cursor newCursor(SQLiteDatabase object, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        object = awu.a;
        jse.b(sQLiteQuery);
        object = new axb((SQLiteProgram)sQLiteQuery);
        ((awt)this.a).a.h((awq)object);
        return new SQLiteCursor(sQLiteCursorDriver, string, sQLiteQuery);
    }
}

