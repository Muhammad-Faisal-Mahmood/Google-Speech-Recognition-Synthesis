/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteException
 */
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class dev
implements dfb {
    private final dfm a;
    private final Map b = new HashMap();

    public dev(dfm dfm2) {
        this.a = dfm2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final int a(String string) {
        synchronized (this) {
            Throwable throwable2;
            Object object;
            block14: {
                SQLiteException sQLiteException2;
                int n2;
                Object object2;
                Object object3;
                block15: {
                    Cursor cursor;
                    block13: {
                        int n3;
                        block12: {
                            object = (Integer)this.b.get(string);
                            if (object != null) {
                                return (Integer)object;
                            }
                            object3 = this.a;
                            object2 = null;
                            object = null;
                            try {
                                cursor = ((dfm)object3).b.getReadableDatabase().query("manifest_table", dfm.a, "name=?", new String[]{string}, null, null, null, null);
                                if (cursor == null) break block12;
                                object = cursor;
                                object2 = cursor;
                                if (!cursor.moveToNext()) break block12;
                                object = cursor;
                                object2 = cursor;
                                n2 = cursor.getInt(1);
                                break block13;
                            }
                            catch (Throwable throwable2) {
                                break block14;
                            }
                            catch (SQLiteException sQLiteException2) {}
                        }
                        n2 = n3 = -1;
                        if (cursor == null) break block15;
                        n2 = n3;
                    }
                    cursor.close();
                }
                object = this.b;
                object2 = n2;
                object.put(string, object2);
                object2.getClass();
                return n2;
                object = object2;
                {
                    dew dew2 = ((dfm)object3).b;
                    object = object2;
                    object = object2;
                    object3 = new IOException(a.ai(string, "SqliteManifestTable#getSyncVersion, SQL query failed, superpackName: "), sQLiteException2);
                    object = object2;
                    dew2.a((IOException)object3);
                    object = object2;
                    throw object3;
                }
            }
            if (object == null) throw throwable2;
            object.close();
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(String object) {
        synchronized (this) {
            Object object2 = this.a;
            try {
                ((dfm)object2).b.getWritableDatabase().delete("manifest_table", "name=?", new String[]{object});
                this.b.remove(object);
            }
            catch (SQLiteException sQLiteException) {
                object2 = ((dfm)object2).b;
                String string = String.valueOf(object);
                object = new IOException("SqliteManifestTable#remove, SQL delete failed, superpackName: ".concat(string), sQLiteException);
                object2.a((IOException)object);
                throw object;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(ded ded2) {
        synchronized (this) {
            long l2;
            Object object;
            Object object2;
            Object object3;
            block5: {
                object3 = this.a;
                try {
                    object2 = ((dfm)object3).b.getWritableDatabase();
                    object = new ContentValues(2);
                    object.put("name", ((dct)ded2).a);
                    object.put("version", Integer.valueOf(((dct)ded2).b));
                    l2 = object2.replaceOrThrow("manifest_table", null, object);
                    if (l2 < 0L) break block5;
                    this.b.put(((dct)ded2).a, ((dct)ded2).b);
                }
                catch (SQLiteException sQLiteException) {
                    object2 = ((dfm)object3).b;
                    object3 = new IOException("SqliteManifestTable#setSyncVersion, SQL replaceOrThrow failed, versionedName: ".concat(((Object)ded2).toString()), sQLiteException);
                    object2.a((IOException)object3);
                    throw object3;
                }
                return;
            }
            dew dew2 = ((dfm)object3).b;
            object = ((Object)ded2).toString();
            StringBuilder stringBuilder = new StringBuilder("SqliteManifestTable#setSyncVersion, SQL replaceOrThrow returned < 0, versionedName: ");
            stringBuilder.append((String)object);
            stringBuilder.append(", rowId: ");
            stringBuilder.append(l2);
            object2 = new IOException(stringBuilder.toString());
            dew2.a((IOException)object2);
            throw object2;
        }
    }
}

