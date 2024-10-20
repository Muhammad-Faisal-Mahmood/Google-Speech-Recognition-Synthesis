/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.sqlite.SQLiteException
 *  android.os.SystemClock
 */
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class dcc
implements hny {
    public final long a;
    public final String b;
    public final dbx c;
    public final egg d;

    public /* synthetic */ dcc(egg egg2, long l2, String string, dbx dbx2) {
        this.d = egg2;
        this.a = l2;
        this.b = string;
        this.c = dbx2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        Object object2;
        block15: {
            Object object3;
            object2 = (dcm)object;
            long l2 = SystemClock.elapsedRealtime();
            long l3 = this.a;
            Object object4 = (hfk)((hfk)ddd.a.f()).j("com/google/android/libraries/micore/superpacks/Superpacks", "sync", 793, "Superpacks.java");
            fxf.K(object2);
            object = ((dcm)object2).a();
            Object object5 = ((dcm)object2).d();
            boolean bl2 = ((dcm)object2).f();
            if (object.isEmpty() && object5.isEmpty() && bl2) {
                object = "no changes";
            } else {
                object = !object.isEmpty() ? "{added: ".concat(dcm.i((List)object)) : "{";
                object3 = object;
                if (!object5.isEmpty()) {
                    object3 = object;
                    if (((String)object).length() > 1) {
                        object3 = ((String)object).concat(", ");
                    }
                    object = dcm.i((List)object5);
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append((String)object3);
                    ((StringBuilder)object5).append("removed: ");
                    ((StringBuilder)object5).append((String)object);
                    object3 = ((StringBuilder)object5).toString();
                }
                boolean bl3 = ((dcm)object2).g() != null;
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(", metadata: ");
                ((StringBuilder)object).append(bl3);
                object = object3 = ((StringBuilder)object).toString();
                if (!bl2) {
                    object = ((String)object3).concat(", not last batch");
                }
            }
            object3 = this.c;
            object4.G("Sync for %s succeeded in %d ms: %s", this.b, l2 - l3, object);
            fxf.K(object3);
            object = ((dbx)object3).e();
            fxf.K(object2);
            if (((dcm)object2).e()) {
                Object object6;
                block14: {
                    Object object7;
                    Object object8;
                    Object object9;
                    int n2;
                    object4 = ((dcm)object2).c();
                    object3 = (hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "updateReservations", 1810, "Superpacks.java");
                    object5 = (hct)object4;
                    object3.x("Releasing previous selection of %d packs for manifest %s", ((hct)object5).c, object);
                    int n3 = ((hct)object5).c;
                    int n4 = 0;
                    while (true) {
                        object3 = this.d;
                        if (n4 >= n3) break;
                        object6 = (den)object4.get(n4);
                        object5 = ((egg)object3).c;
                        object6 = ((den)object6).o();
                        n2 = dde.a;
                        object9 = ((egg)object3).d;
                        object3 = ((dct)object).a;
                        ((dcj)object9).f((String)object3);
                        ((dfu)object5).p((ddn)object6);
                        ++n4;
                    }
                    gzx gzx2 = ((dcm)object2).b();
                    object4 = new HashSet();
                    object6 = (hct)gzx2;
                    n3 = ((hct)object6).c;
                    for (n4 = 0; n4 < n3; ++n4) {
                        object9 = (den)gzx2.get(n4);
                        object5 = dfy.g();
                        ((dfx)object5).b(((den)object9).b());
                        object8 = ((egg)object3).c;
                        object7 = ((dco)((den)object9).o()).a;
                        ((dfx)object5).a = ((dfu)object8).b((String)object7);
                        object7 = ((den)object9).o();
                        n2 = dde.a;
                        ((dfx)object5).c((ddn)object7);
                        ((dfx)object5).e(((den)object9).d());
                        ((dfx)object5).d(1);
                        object4.add(((dfx)object5).a());
                    }
                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/Superpacks", "updateReservations", 1835, "Superpacks.java")).x("Making reservation for new selection of %d packs for %s", ((hct)object6).c, object);
                    object5 = ((egg)object3).c;
                    object4 = new ArrayList(object4);
                    ((dfu)object5).k((List)object4);
                    object4 = ((dcm)object2).b();
                    object7 = new ArrayList<dcp>();
                    n3 = ((hct)object4).c;
                    for (n4 = 0; n4 < n3; object6 = ((den)object6).e(), ++n4) {
                        object6 = (den)object4.get(n4);
                        object5 = ((den)object6).o();
                        fxf.K(object6);
                        object7.add(new dcp((ddn)object5, ((ded)object6).a()));
                    }
                    object4 = ((egg)object3).b;
                    object9 = ((dcm)object2).g();
                    try {
                        object6 = ((dfo)object4).a.getWritableDatabase();
                        gzx2 = new ContentValues(3);
                        gzx2.put("superpack_name", ((dct)object).a);
                        gzx2.put("superpack_version", ((dct)object).b);
                        object5 = new StringBuilder();
                        ((StringBuilder)object5).append("1#");
                        object7 = object7.iterator();
                        n4 = 1;
                        while (object7.hasNext()) {
                            Object object10 = (ddo)object7.next();
                            if (n4 == 0) {
                                ((StringBuilder)object5).append(',');
                            }
                            object8 = ddo.a;
                            object8 = ((ddo)object10).b().toString();
                            n4 = ((ddo)object10).a();
                            object10 = new StringBuilder();
                            ((StringBuilder)object10).append((String)object8);
                            ((StringBuilder)object10).append(";");
                            ((StringBuilder)object10).append(n4);
                            ((StringBuilder)object5).append(((StringBuilder)object10).toString());
                            n4 = 0;
                        }
                        gzx2.put("pack_list", ((StringBuilder)object5).toString());
                        gzx2.put("sync_metadata", (byte[])object9);
                        l3 = object6.replaceOrThrow("selected_packs", null, (ContentValues)gzx2);
                        if (l3 < 0L) break block14;
                    }
                    catch (SQLiteException sQLiteException) {
                        object3 = ((dfo)object4).a;
                        object = new IOException("SqliteSelectedPacks#write, SQL replace failed, superpackName: ".concat(String.valueOf(String.valueOf(object))), sQLiteException);
                        object3.a((IOException)object);
                        throw object;
                    }
                    dec.l(((dcm)object2).c(), ((dcm)object2).b(), new dby((egg)object3), new aog(20));
                    break block15;
                }
                object5 = ((dfo)object4).a;
                object2 = String.valueOf(object);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("SqliteSelectedPacks#write, SQL replace returned < 0, superpackName: ");
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append("rowId: ");
                ((StringBuilder)object3).append(l3);
                object6 = new IOException(((StringBuilder)object3).toString());
                object5.a((IOException)object6);
                throw object6;
            }
        }
        ddb.a();
        ((dcm)object2).e();
        ((dcm)object2).b();
        return hhk.K(object2);
    }
}

