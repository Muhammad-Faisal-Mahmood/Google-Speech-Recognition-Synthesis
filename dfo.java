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
import java.util.List;

public final class dfo
implements dfk {
    private static final String[] b = new String[]{"superpack_name", "superpack_version", "pack_list", "sync_metadata"};
    private static final String[] c = new String[]{"superpack_name", "superpack_version", "pack_list"};
    public final dew a;

    public dfo(dew dew2) {
        this.a = dew2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final dfj a(String string, boolean bl2) {
        void var1_4;
        Object object;
        block23: {
            Cursor cursor;
            Object object2;
            Object object3;
            block24: {
                block22: {
                    Object object4;
                    object3 = null;
                    object2 = null;
                    Object object5 = null;
                    object = object3;
                    try {
                        object4 = this.a.getReadableDatabase();
                        if (bl2) {
                            object = object3;
                            cursor = b;
                        } else {
                            object = object3;
                            cursor = c;
                        }
                        object = object3;
                        cursor = object4.query("selected_packs", (String[])cursor, "superpack_name=?", new String[]{string}, null, null, null, null);
                        if (cursor == null) break block22;
                    }
                    catch (Throwable throwable) {
                        break block23;
                    }
                    catch (SQLiteException sQLiteException) {
                        cursor = object2;
                        break block24;
                    }
                    try {
                        int n2;
                        int n3;
                        block27: {
                            block26: {
                                block25: {
                                    if (!cursor.moveToNext()) break block22;
                                    n3 = cursor.getInt(1);
                                    object = object5;
                                    if (bl2) {
                                        object = cursor.getBlob(3);
                                    }
                                    if ((n2 = (object2 = dfc.b.g((CharSequence)(object5 = cursor.getString(2)))).size()) == 1) break block26;
                                    if (n2 != 2) {
                                        object = new ddj("Invalid serialized pack list: ".concat(String.valueOf(object5)));
                                        throw object;
                                    }
                                    object5 = (String)object2.get(0);
                                    try {
                                        n2 = Integer.parseInt((String)object5);
                                        if (n2 != 1) break block25;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        object = new ddj("Failed to parse version number: ".concat(String.valueOf(object5)), numberFormatException);
                                        throw object;
                                    }
                                    object5 = (String)object2.get(1);
                                    break block27;
                                }
                                object5 = new StringBuilder("Unsupported serializer version found: ");
                                ((StringBuilder)object5).append(n2);
                                object = new ddj(((StringBuilder)object5).toString());
                                throw object;
                            }
                            n2 = 0;
                        }
                        object5 = dfc.a.g((CharSequence)object5);
                        object2 = new gzs();
                        object3 = object5.iterator();
                        while (object3.hasNext()) {
                            object5 = (String)object3.next();
                            if (n2 != 0) {
                                int n4;
                                if (n2 != 1) {
                                    object5 = new StringBuilder();
                                    ((StringBuilder)object5).append("Found invalid serializer version: ");
                                    ((StringBuilder)object5).append(n2);
                                    object = new IllegalStateException(((StringBuilder)object5).toString());
                                    throw object;
                                }
                                object4 = ddo.a.g((CharSequence)object5);
                                if (object4.size() != 2) {
                                    object = new ddj("Invalid input: ".concat(String.valueOf(object5)));
                                    throw object;
                                }
                                object5 = (String)object4.get(1);
                                try {
                                    n4 = Integer.parseInt((String)object5);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    object = new ddj("Failed to parse version number: ".concat(String.valueOf(object5)), numberFormatException);
                                    throw object;
                                }
                                object4 = ddn.d((String)object4.get(0));
                                object5 = new dcp((ddn)object4, n4);
                            } else {
                                object5 = new dcp(ddn.d((String)object5), n3);
                            }
                            ((gzs)object2).h(object5);
                        }
                        object = new dfj(string, ((gzs)object2).g(), (byte[])object);
                    }
                    catch (Throwable throwable) {
                        object = cursor;
                        break block23;
                    }
                    catch (SQLiteException sQLiteException) {
                        break block24;
                    }
                    cursor.close();
                    return object;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            object = cursor;
            {
                void var8_13;
                object3 = this.a;
                object = cursor;
                object = cursor;
                object2 = new IOException(a.ai(string, "SqliteSelectedPacks#get, SQL query failed, superpackName: "), (Throwable)var8_13);
                object = cursor;
                object3.a((IOException)object2);
                object = cursor;
                throw object2;
            }
        }
        if (object != null) {
            object.close();
        }
        throw var1_4;
    }

    @Override
    public final List b(String object) {
        if ((object = this.a((String)object, false)) == null) {
            int n2 = gzx.d;
            object = hct.a;
        } else {
            object = ((dfj)object).a;
        }
        return object;
    }
}

