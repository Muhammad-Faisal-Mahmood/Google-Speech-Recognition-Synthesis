/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteCursor
 *  android.database.sqlite.SQLiteCursorDriver
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteQuery
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

final class fsp
implements SQLiteDatabase.CursorFactory {
    private final Object[] a;

    public fsp(Object[] objectArray) {
        this.a = objectArray;
    }

    public final Cursor newCursor(SQLiteDatabase object, SQLiteCursorDriver sQLiteCursorDriver, String string, SQLiteQuery sQLiteQuery) {
        block3: {
            if (this.a == null) break block3;
            int n2 = 0;
            while (n2 < ((Object[])(object = this.a)).length) {
                block9: {
                    int n3;
                    block5: {
                        block8: {
                            block7: {
                                block6: {
                                    block4: {
                                        n3 = n2 + 1;
                                        if ((object = object[n2]) != null) break block4;
                                        sQLiteQuery.bindNull(n3);
                                        break block5;
                                    }
                                    if (!(object instanceof String)) break block6;
                                    sQLiteQuery.bindString(n3, (String)object);
                                    break block5;
                                }
                                if (!(object instanceof byte[])) break block7;
                                sQLiteQuery.bindBlob(n3, (byte[])object);
                                break block5;
                            }
                            if (!(object instanceof Long)) break block8;
                            sQLiteQuery.bindLong(n3, ((Long)object).longValue());
                            break block5;
                        }
                        if (!(object instanceof Double)) break block9;
                        sQLiteQuery.bindDouble(n3, ((Double)object).doubleValue());
                    }
                    n2 = n3;
                    continue;
                }
                throw new AssertionError((Object)"Attempted to bind an unsupported type");
            }
        }
        return new SQLiteCursor(sQLiteCursorDriver, string, sQLiteQuery);
    }
}

