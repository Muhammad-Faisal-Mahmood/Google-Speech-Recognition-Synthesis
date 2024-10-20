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

public final class dfl
implements dfa {
    public static final String[] a = new String[]{"namespace", "name", "reserved_size", "reservation_state", "gc_priority", "last_access_millis", "source", "superpack_name", "superpack_version", "validation_count"};
    private static final dez c;
    public final dew b;

    static {
        dey dey2 = dez.i();
        dey2.d(new dco("default", "default"));
        c = dey2.a();
    }

    public dfl(dew dew2) {
        this.b = dew2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final dez a(ddn object) {
        void var1_4;
        Cursor cursor;
        block11: {
            block10: {
                block9: {
                    cursor = this.b.getReadableDatabase().query("file_metadata", a, "namespace=? AND name=?", new String[]{((ddn)object).b(), ((ddn)object).a()}, null, null, null, null);
                    if (cursor == null) break block9;
                    try {
                        if (!cursor.moveToNext()) break block9;
                        object = dez.i();
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        dco dco2 = new dco(string, string2);
                        ((dey)object).d(dco2);
                        ((dey)object).f(cursor.getLong(2));
                        ((dey)object).c(cursor.getLong(5));
                        int n2 = cursor.getInt(4);
                        dcv.d(n2);
                        ((dey)object).b(n2);
                        n2 = cursor.getInt(3);
                        dec.q(n2);
                        ((dey)object).e(n2);
                        ((dey)object).b = cursor.getString(6);
                        ((dey)object).g(cursor.getInt(9));
                        string = cursor.getString(7);
                        if (string != null) {
                            ((dey)object).a = ded.c(string, cursor.getInt(8));
                        }
                        object = ((dey)object).a();
                    }
                    catch (Throwable throwable) {}
                    cursor.close();
                    return object;
                }
                dey dey2 = dez.i();
                dey2.d((ddn)object);
                object = dey2.a();
                if (cursor == null) break block10;
                cursor.close();
            }
            return object;
            {
                break block11;
                catch (Throwable throwable) {
                }
                catch (SQLiteException sQLiteException) {}
                {
                    dew dew2 = this.b;
                    IOException iOException = new IOException("SqliteFileMetadataTable#get, SQL query failed, name: ".concat(String.valueOf(String.valueOf(object))), sQLiteException);
                    dew2.a(iOException);
                    throw iOException;
                }
            }
            cursor = null;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var1_4;
    }

    @Override
    public final void b(ddn object) {
        try {
            this.b.getWritableDatabase().delete("file_metadata", "namespace=? AND name=?", new String[]{((ddn)object).b(), ((ddn)object).a()});
            return;
        }
        catch (SQLiteException sQLiteException) {
            dew dew2 = this.b;
            object = new IOException("SqliteFileMetadataTable#remove, SQL delete failed, name: ".concat(String.valueOf(String.valueOf(object))), sQLiteException);
            dew2.a((IOException)object);
            throw object;
        }
    }

    @Override
    public final void c(ddn ddn2, int n2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("reservation_state", Integer.valueOf(n2));
        this.d(ddn2, contentValues);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(ddn object, ContentValues object2) {
        int n2;
        int n3;
        if (this.b.getWritableDatabase().update("file_metadata", (ContentValues)object2, "namespace=? AND name=?", new String[]{((ddn)object).b(), ((ddn)object).a()}) > 0) {
            return;
        }
        boolean bl2 = object2.containsKey("superpack_name");
        Object object3 = bl2 && object2.containsKey("superpack_version") ? ded.c(object2.getAsString("superpack_name"), object2.getAsInteger("superpack_version")) : null;
        if (object2.containsKey("gc_priority")) {
            n3 = object2.getAsInteger("gc_priority");
            dcv.d(n3);
        } else {
            n3 = ((det)dfl.c).c;
        }
        if (object2.containsKey("reservation_state")) {
            n2 = object2.getAsInteger("reservation_state");
            dec.q(n2);
        } else {
            n2 = ((det)dfl.c).d;
        }
        long l2 = object2.containsKey("last_access_millis") ? object2.getAsLong("last_access_millis") : ((det)dfl.c).e;
        long l3 = object2.containsKey("reserved_size") ? object2.getAsLong("reserved_size") : ((det)dfl.c).b;
        Object object4 = object2.containsKey("source") ? object2.getAsString("source") : ((det)dfl.c).f;
        int n4 = object2.containsKey("validation_count") ? object2.getAsInteger("validation_count") : ((det)dfl.c).g;
        {
            catch (SQLiteException sQLiteException) {
                object2 = this.b;
                object = new IOException("SqliteFileMetadataTable#updateColumns, SQL update failed, name: ".concat(String.valueOf(String.valueOf(object))), sQLiteException);
                object2.a((IOException)object);
                throw object;
            }
            try {
                object2 = this.b.getWritableDatabase();
                ContentValues contentValues = new ContentValues(8);
                contentValues.put("namespace", ((ddn)object).b());
                contentValues.put("name", ((ddn)object).a());
                contentValues.put("gc_priority", Integer.valueOf(n3));
                contentValues.put("last_access_millis", Long.valueOf(l2));
                contentValues.put("reservation_state", Integer.valueOf(n2));
                contentValues.put("reserved_size", Long.valueOf(l3));
                contentValues.put("source", (String)object4);
                if (object3 != null) {
                    contentValues.put("superpack_name", ((dct)object3).a);
                    contentValues.put("superpack_version", Integer.valueOf(((dct)object3).b));
                } else {
                    contentValues.putNull("superpack_name");
                    contentValues.put("superpack_version", Integer.valueOf(0));
                }
                contentValues.put("validation_count", Integer.valueOf(n4));
                l2 = object2.replace("file_metadata", null, contentValues);
                if (l2 >= 0L) {
                    return;
                }
                object2 = String.valueOf(object);
                object4 = new StringBuilder("Update failed for ");
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(", rowId: ");
                ((StringBuilder)object4).append(l2);
                object3 = new IOException(((StringBuilder)object4).toString());
                throw object3;
            }
            catch (SQLiteException sQLiteException) {}
            {
                object4 = this.b;
                object3 = new IOException("SqliteFileMetadataTable#insertOrUpdate, SQL replace failed, name: ".concat(String.valueOf(String.valueOf(object))), sQLiteException);
                object4.a((IOException)object3);
                throw object3;
            }
        }
    }
}

