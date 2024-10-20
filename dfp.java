/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 *  hom
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public final class dfp
extends SQLiteOpenHelper
implements dew {
    public static final int b = 0;
    private static final String[] c = new String[]{"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), requires_idle INT DEFAULT(0), requires_battery_not_low INT DEFAULT(0), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, sync_metadata BLOB, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] d = new String[]{"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, sync_metadata BLOB, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] e = new String[]{"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] f = new String[]{dfg.e, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
    private static final String[] g;
    private static final String[] h;
    private static final String[] i;
    private static final String[] j;
    private static volatile dfp k;
    private static final Object l;
    public final cxv a = new cxv((Executor)hom.a);
    private final int m;

    static {
        String string = dfg.d;
        g = new String[]{string, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0), validation_count INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        h = new String[]{string, "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        i = new String[]{"CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), connection_attempts INT DEFAULT(3), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), UNIQUE (download_id) ON CONFLICT FAIL)", "CREATE TABLE file_metadata (_id INTEGER PRIMARY KEY AUTOINCREMENT, namespace TEXT, name TEXT, gc_priority INT DEFAULT(0), reservation_state INT DEFAULT(0), last_access_millis INT DEFAULT(0), reserved_size INT DEFAULT(0), source TEXT,superpack_name TEXT, superpack_version INT DEFAULT(0),  UNIQUE (namespace, name) ON CONFLICT FAIL)", "CREATE TABLE selected_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, superpack_name TEXT NOT NULL, superpack_version INT DEFAULT(0), pack_list TEXT, UNIQUE (superpack_name) ON CONFLICT FAIL)", "CREATE TABLE pending_packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, parent_id TEXT NOT NULL, pack_name TEXT NOT NULL, packing_scheme TEXT, UNIQUE (parent_id, pack_name) ON CONFLICT FAIL)", "CREATE TABLE manifest_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, version INT DEFAULT(0), UNIQUE (name) ON CONFLICT FAIL)"};
        j = new String[]{"DROP TABLE IF EXISTS pending_downloads", "DROP TABLE IF EXISTS file_metadata", "DROP TABLE IF EXISTS selected_packs", "DROP TABLE IF EXISTS pending_packs", "DROP TABLE IF EXISTS manifest_table"};
        l = new Object();
    }

    private dfp(Context context) {
        super(context, "superpacks.db", null, 17);
        this.m = 17;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static dfp b(Context context) {
        if (k != null) return k;
        Object object = l;
        synchronized (object) {
            dfp dfp2;
            if (k != null) return k;
            k = dfp2 = new dfp(context);
            return k;
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase, int n2) {
        String[] stringArray;
        switch (n2) {
            default: {
                throw new IllegalArgumentException(a.af(n2, "Invalid database version: "));
            }
            case 17: {
                stringArray = c;
                break;
            }
            case 16: {
                stringArray = d;
                break;
            }
            case 15: {
                stringArray = e;
                break;
            }
            case 14: {
                stringArray = f;
                break;
            }
            case 13: {
                stringArray = g;
                break;
            }
            case 12: {
                stringArray = h;
                break;
            }
            case 11: {
                stringArray = i;
            }
        }
        n2 = stringArray.length;
        for (n2 = 0; n2 < 5; ++n2) {
            sQLiteDatabase.execSQL(stringArray[n2]);
        }
    }

    @Override
    public final void a(IOException object) {
        object = new dbc(object, 6);
        this.a.a((dau)object);
    }

    public final void c(SQLiteDatabase sQLiteDatabase) {
        String[] stringArray = j;
        int n2 = stringArray.length;
        for (n2 = 0; n2 < 5; ++n2) {
            sQLiteDatabase.execSQL(stringArray[n2]);
        }
        dfp.d(sQLiteDatabase, this.m);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ((hfk)ddd.a.f()).A("Creating database %s, version %d", "superpacks.db", this.m);
        dfp.d(sQLiteDatabase, this.m);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        ((hfk)ddd.a.f()).G("Downgrading database %s, old version: %d, new version: %d", "superpacks.db", n2, n3);
        this.c(sQLiteDatabase);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onUpgrade(SQLiteDatabase var1_1, int var2_3, int var3_4) {
        ((hfk)ddd.a.f()).G("Upgrading database %s, old version: %d, new version: %d", "superpacks.db", var2_3, var3_4);
        switch (var2_3) {
            default: {
                this.c(var1_1);
                return;
            }
            case 11: {
                if (var3_4 >= 12) {
                    var4_5 = dfg.a;
                    var6_6 = new StringBuilder("ALTER TABLE pending_downloads ADD COLUMN http_conn_timeout_millis INT DEFAULT(");
                    var6_6.append(var4_5);
                    var6_6.append(")");
                    var1_1.execSQL(var6_6.toString());
                    var4_5 = dfg.b;
                    var6_6 = new StringBuilder("ALTER TABLE pending_downloads ADD COLUMN http_read_timeout_millis INT DEFAULT(");
                    var6_6.append(var4_5);
                    var6_6.append(")");
                    var1_1.execSQL(var6_6.toString());
                    var4_5 = dfg.c;
                    var6_6 = new StringBuilder("ALTER TABLE pending_downloads ADD COLUMN http_write_timeout_millis INT DEFAULT(");
                    var6_6.append(var4_5);
                    var6_6.append(")");
                    var1_1.execSQL(var6_6.toString());
                    var1_1.execSQL("ALTER TABLE pending_downloads ADD COLUMN http_retry_on_conn_failure INT DEFAULT(1)");
                }
            }
            case 12: {
                if (var3_4 >= 13) {
                    var1_1.execSQL("ALTER TABLE file_metadata ADD COLUMN validation_count INT DEFAULT(0)");
                }
            }
            case 13: {
                if (var3_4 >= 14) {
                    var2_3 = dfg.f;
                    var1_1.execSQL("ALTER TABLE pending_downloads ADD COLUMN scheduling_flags INT DEFAULT(2)");
                }
            }
            case 14: {
                if (var3_4 >= 15) {
                    var2_3 = dfg.f;
                    var8_8 = new ArrayList<String>();
                    var6_6 = null;
                    var7_9 /* !! */  = var1_1.rawQuery("pragma table_info(pending_downloads);", null);
                    while (true) {
                        var6_6 = var7_9 /* !! */ ;
                        if (!var7_9 /* !! */ .moveToNext()) break;
                        var6_6 = var7_9 /* !! */ ;
                        var8_8.add(var7_9 /* !! */ .getString(var7_9 /* !! */ .getColumnIndex("name")));
                        continue;
                        break;
                    }
                    if (var7_9 /* !! */  != null) {
                        var7_9 /* !! */ .close();
                    }
                    var8_8.removeAll(Arrays.asList(new String[]{"connection_attempts", "http_conn_timeout_millis", "http_read_timeout_millis", "http_write_timeout_millis", "http_retry_on_conn_failure"}));
                    var7_9 /* !! */  = var8_8.toArray(new String[var8_8.size()]);
                    var1_1.beginTransaction();
                    try {
                        var6_6 = new StringBuilder();
                        var6_6.append("ALTER TABLE ");
                        var6_6.append("pending_downloads");
                        var6_6.append(" RENAME TO ");
                        var6_6.append("pending_downloads");
                        var6_6.append("_old;");
                        var1_1.execSQL(var6_6.toString());
                        var1_1.execSQL("CREATE TABLE pending_downloads (_id INTEGER PRIMARY KEY AUTOINCREMENT, download_id TEXT, priority INT DEFAULT(0), urls TEXT, start_timestamp_millis INT DEFAULT(0), requires_unmetered_network INT DEFAULT(1), requires_charging INT DEFAULT(0), file_path TEXT, completed INT DEFAULT(0), failure TEXT, next_retry_time_millis INT DEFAULT(0), retry_count INT DEFAULT(0), superpack_name TEXT, superpack_version INT DEFAULT(0), ttl_millis INT DEFAULT(0), scheduling_flags INT DEFAULT(2), UNIQUE (download_id) ON CONFLICT FAIL)");
                        var8_8 = new StringBuilder();
                        var6_6 = new ArrayList();
                        var8_8.append("INSERT INTO ");
                        var8_8.append("pending_downloads");
                        var8_8.append("(");
                        doc.b(var7_9 /* !! */ , (StringBuilder)var8_8);
                        var8_8.append(") SELECT ");
                        doc.b(var7_9 /* !! */ , (StringBuilder)var8_8);
                        var8_8.append(" FROM ");
                        var8_8.append("pending_downloads");
                        var8_8.append("_old;");
                        var8_8 = var8_8.toString();
                        var7_9 /* !! */  = new dxg((String)var8_8, (List)var6_6);
                        var1_1.execSQL(var7_9 /* !! */ .a, (Object[])var7_9 /* !! */ .b.toArray(new String[0]));
                        var6_6 = new StringBuilder();
                        var6_6.append("DROP TABLE ");
                        var6_6.append("pending_downloads");
                        var6_6.append("_old;");
                        var1_1.execSQL(var6_6.toString());
                        var1_1.setTransactionSuccessful();
                        ** GOTO lbl111
                    }
                    finally {
                        var1_1.endTransaction();
                    }
                    catch (Throwable var1_2) {
                        if (var6_6 != null) {
                            var6_6.close();
                        }
                        throw var1_2;
                    }
                }
            }
lbl111:
            // 4 sources

            case 15: {
                if (var3_4 < 16) break;
                var1_1.execSQL("ALTER TABLE selected_packs ADD COLUMN sync_metadata BLOB ");
            }
            case 16: 
        }
        if (var3_4 >= 17) {
            var2_3 = dfg.f;
            var1_1.execSQL("ALTER TABLE pending_downloads ADD COLUMN requires_idle INT DEFAULT(0)");
            var1_1.execSQL("ALTER TABLE pending_downloads ADD COLUMN requires_battery_not_low INT DEFAULT(0)");
        }
    }
}

