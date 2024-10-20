/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteException
 */
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class dfn
implements dfi {
    private static final String[] b = new String[]{"parent_id", "pack_name", "packing_scheme"};
    public final dew a;

    public dfn(dew dew2) {
        this.a = dew2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List a(String string) {
        Throwable throwable2;
        Cursor cursor;
        block9: {
            SQLiteException sQLiteException2;
            Cursor cursor2;
            Object object;
            block10: {
                Cursor cursor3;
                object = new ArrayList();
                cursor2 = null;
                cursor = null;
                try {
                    cursor3 = this.a.getReadableDatabase().query("pending_packs", b, "parent_id=?", new String[]{string}, null, null, null, null);
                    while (cursor3 != null) {
                        cursor = cursor3;
                        cursor2 = cursor3;
                        if (cursor3.moveToNext()) {
                            cursor = cursor3;
                            cursor2 = cursor3;
                            Object object2 = cursor3.getString(1);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            String string2 = cursor3.getString(2);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            ddn ddn2 = ddn.d((String)object2);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            cursor = cursor3;
                            cursor2 = cursor3;
                            object2 = new dfh(ddn2, string2);
                            cursor = cursor3;
                            cursor2 = cursor3;
                            object.add(object2);
                            continue;
                        }
                        break;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                catch (SQLiteException sQLiteException2) {
                    break block10;
                }
                if (cursor3 != null) {
                    cursor3.close();
                }
                return object;
            }
            cursor = cursor2;
            {
                object = this.a;
                cursor = cursor2;
                cursor = cursor2;
                IOException iOException = new IOException(a.ai(string, "SqlitePendingPacks#get, SQL query failed, parentId: "), sQLiteException2);
                cursor = cursor2;
                object.a(iOException);
                cursor = cursor2;
                throw iOException;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }
}

