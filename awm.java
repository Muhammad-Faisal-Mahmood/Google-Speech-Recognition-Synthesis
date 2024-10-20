/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.util.Log
 */
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class awm {
    public final int a;
    public att b;
    public final List c;
    public final aun d;
    public final String e;
    public final String f;

    public awm() {
        this.a = 23;
    }

    public awm(att att2, aun aun2) {
        jse.e(att2, "configuration");
        this();
        this.c = att2.d;
        this.b = att2;
        this.d = aun2;
        this.e = "86254750241babac4b8d52996a675549";
        this.f = "1cbd3130fa23b59692c061c594c16cc0";
    }

    public static final void a(String string) {
        if (!jse.H(string, ":memory:")) {
            int n2 = string.length() - 1;
            int n3 = 0;
            boolean bl2 = false;
            while (n3 <= n2) {
                int n4 = true != bl2 ? n3 : n2;
                n4 = jse.a(string.charAt(n4), 32);
                if (!bl2) {
                    if (n4 > 0) {
                        bl2 = true;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                if (n4 > 0) break;
                --n2;
            }
            if (((Object)string.subSequence(n3, n2 + 1)).toString().length() != 0) {
                Log.w((String)"SupportSQLite", (String)"deleting the database file: ".concat(String.valueOf(string)));
                try {
                    File file = new File(string);
                    SQLiteDatabase.deleteDatabase((File)file);
                    return;
                }
                catch (Exception exception) {
                    Log.w((String)"SupportSQLite", (String)"delete failed: ", (Throwable)exception);
                }
            }
        }
    }

    public static void c(awl awl2) {
        awl2.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        awl2.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    /*
     * Unable to fully structure code
     */
    public final void b(awl var1_1, int var2_3, int var3_4) {
        block18: {
            block17: {
                block19: {
                    var10_5 = this.b;
                    if (var10_5 == null) break block18;
                    if (var2_3 != var3_4) break block19;
                    var8_6 = jpa.a;
                    break block17;
                }
                var4_7 = var3_4 > var2_3;
                var9_8 = new ArrayList<E>();
                var5_9 = var2_3;
                block3: do {
                    block21: {
                        block20: {
                            if (!(var4_7 == false ? var5_9 > var3_4 : var5_9 < var3_4)) {
                                var8_6 = var9_8;
                                break block17;
                            }
                            var8_6 = var10_5.n;
                            if (!var4_7) break block20;
                            var8_6 = (TreeMap)var8_6.a.get(var5_9);
                            if (var8_6 == null) ** GOTO lbl-1000
                            var8_6 = new joc(var8_6, var8_6.descendingKeySet());
                            break block21;
                        }
                        var8_6 = (TreeMap)var8_6.a.get(var5_9);
                        if (var8_6 == null) lbl-1000:
                        // 2 sources

                        {
                            var8_6 = null;
                        } else {
                            var8_6 = new joc(var8_6, var8_6.keySet());
                        }
                    }
                    if (var8_6 == null) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var8_6 = null;
                            break block17;
                            break;
                        }
                    }
                    var11_12 = var8_6.a;
                    var12_13 = var8_6.b;
                    var8_6 = (Map)var11_12;
                    var11_12 = ((Iterable)var12_13).iterator();
                    while (var11_12.hasNext()) {
                        var7_11 = ((Number)var11_12.next()).intValue();
                        if (!(var4_7 != false ? var5_9 + 1 <= var7_11 && var7_11 <= var3_4 : var3_4 <= var7_11 && var7_11 < var5_9)) continue;
                        var8_6 = var8_6.get(var7_11);
                        jse.b(var8_6);
                        var9_8.add((Object)var8_6);
                        var6_10 = true;
                        var5_9 = var7_11;
                        continue block3;
                    }
                    var6_10 = false;
                } while (var6_10);
                ** while (true)
            }
            if (var8_6 != null) {
                var9_8 = new bzb(var1_1, null);
                var11_12 = new jpk(null);
                var10_5 = var9_8.L("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (var10_5.h()) {
                    var11_12.add(var10_5.d(0));
                }
                for (Object var10_5 : jns.c((List)var11_12)) {
                    if (!jse.X((String)var10_5, "room_fts_content_sync_")) continue;
                    yi.k(var9_8, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(var10_5)));
                }
                var8_6 = var8_6.iterator();
                while (var8_6.hasNext()) {
                    ((avp)var8_6.next()).a((awl)new bzb((Object)var1_1, null).a);
                }
                var8_6 = this.d.b((awl)var1_1);
                if (var8_6.a) {
                    awm.c((awl)var1_1);
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(var8_6.b)));
                finally {
                    var10_5.e();
                }
            }
        }
        if ((var8_6 = this.b) != null && (var2_3 > var3_4 && var8_6.j || !var8_6.i || var8_6.k.contains(var2_3))) {
            var1_1.g("DROP TABLE IF EXISTS `Dependency`");
            var1_1.g("DROP TABLE IF EXISTS `WorkSpec`");
            var1_1.g("DROP TABLE IF EXISTS `WorkTag`");
            var1_1.g("DROP TABLE IF EXISTS `SystemIdInfo`");
            var1_1.g("DROP TABLE IF EXISTS `WorkName`");
            var1_1.g("DROP TABLE IF EXISTS `WorkProgress`");
            var1_1.g("DROP TABLE IF EXISTS `Preference`");
            for (Object var8_6 : this.c) {
            }
            this.d.a((awl)var1_1);
            return;
        }
        var1_1 = new StringBuilder("A migration from ");
        var1_1.append(var2_3);
        var1_1.append(" to ");
        var1_1.append(var3_4);
        var1_1.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(var1_1.toString());
    }
}

