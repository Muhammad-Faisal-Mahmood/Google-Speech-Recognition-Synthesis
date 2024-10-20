/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 *  android.net.Uri
 */
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import j$.util.Collection$_EL;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class cmq
implements Callable {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ cmq(dhn dhn2, dfi dfi2, Map map, int n2) {
        this.d = n2;
        this.c = dhn2;
        this.a = dfi2;
        this.b = map;
    }

    public /* synthetic */ cmq(efi efi2, adf adf2, dzw dzw2, int n2) {
        this.d = n2;
        this.b = efi2;
        this.a = adf2;
        this.c = dzw2;
    }

    public /* synthetic */ cmq(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
    }

    public /* synthetic */ cmq(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.c = object;
        this.b = object2;
        this.a = object3;
    }

    public /* synthetic */ cmq(Object object, Object object2, Object object3, int n2, char[] cArray) {
        this.d = n2;
        this.a = object;
        this.c = object2;
        this.b = object3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        var2_1 = this.d;
        var4_2 = null;
        var1_3 = 0;
        switch (var2_1) {
            default: {
                var4_2 = this.a;
                jse.b(var4_2);
                return (Uri)this.c.a(this.b.a(var4_2));
            }
            case 11: {
                var5_4 = this.b;
                var4_2 = this.c;
                ((fsc)this.a).a.execSQL((String)var4_2, (Object[])var5_4);
                return null;
            }
            case 10: {
                var6_15 = (fjj)this.a;
                if (var6_15.h != false) return (Void)this.b.call();
                var5_5 = this.c;
                ((heg)((heg)fjj.a.h()).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionSession", "processEventIfRecognitionStarted", 548, "RecognitionSession.java")).C("[%s] Recognition not started, drop %s", var6_15.g, var5_5);
                return var4_2;
            }
            case 9: {
                var5_6 = (hav)hhk.S((Future)this.a);
                var6_16 = (hav)hhk.S((Future)this.c);
                var4_2 = var6_16.isEmpty() != false ? var5_6 : (hav)Collection$_EL.stream(var6_16).filter(new fai(var5_6, 9)).collect(gye.b);
                var7_27 = (hav)hhk.S((Future)this.b);
                ((heg)((heg)fcf.a.b().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getRecognitionSupport", 105, "ModelManagerImpl.java")).u("ModelManager has raw support for: [%s]", fcf.c(var6_16));
                ((heg)((heg)fcf.a.f().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getRecognitionSupport", 107, "ModelManagerImpl.java")).u("ModelManager has support for: [%s]", fcf.c((Collection)var4_2));
                ((heg)((heg)fcf.a.f().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getRecognitionSupport", 109, "ModelManagerImpl.java")).u("ModelManager pending download for: [%s]", fcf.c(var7_27));
                ((heg)((heg)fcf.a.f().h(hfo.a, "ModelManagerImpl")).j("com/google/android/libraries/speech/modelmanager/languagepack/ModelManagerImpl", "getRecognitionSupport", 111, "ModelManagerImpl.java")).u("ModelManager has installed: [%s]", fcf.c(var5_6));
                return new bmu((hav)var4_2, var7_27, var5_6);
            }
            case 8: {
                var6_17 = this.b;
                var5_7 = this.c;
                var4_2 = (gzx)hhk.S((Future)this.a);
                var5_7 = (gzx)hhk.S((Future)var5_7);
                var7_28 = (gzx)hhk.S((Future)var6_17);
                var6_17 = new gzs();
                var6_17.j((Iterable)var4_2);
                var6_17.j((Iterable)var5_7);
                var6_17.j(var7_28);
                return var6_17.g();
            }
            case 7: {
                var5_8 = this.b;
                var4_2 = this.c;
                var7_29 = this.a;
                var6_18 = new hat();
                var6_18.i((Iterable)hhk.S((Future)var7_29));
                var6_18.i((Iterable)hhk.S((Future)var4_2));
                var6_18.i((Iterable)hhk.S((Future)var5_8));
                return var6_18.g().f();
            }
            case 6: {
                var4_2 = this.b;
                var5_9 = this.c;
                return new ezo((gzx)hhk.S((Future)this.a), (gzx)hhk.S((Future)var5_9), (gzx)hhk.S((Future)var4_2));
            }
            case 5: {
                var4_2 = ((adf)this.a).a;
                var1_3 = ag$$ExternalSyntheticApiModelOutline0.m(((efi)this.b).c, ag$$ExternalSyntheticApiModelOutline0.m(var4_2));
                var4_2 = this.c;
                if (var1_3 != 1) return elb.n(3, (dzw)var4_2);
                return elb.n(2, (dzw)var4_2);
            }
            case 4: {
                var5_10 = this.a;
                var4_2 = (dhn)this.c;
                var5_10 = var5_10.a(var4_2.a);
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/PacksRequest", "releaseAllPacks", 304, "PacksRequest.java")).C("Releasing all pending packs for %s: %s", var4_2.a, var5_10);
                var6_19 = var5_10.iterator();
                while (true) {
                    if (!var6_19.hasNext()) {
                        var6_19 = this.b;
                        var4_2 = var4_2.a;
                        var5_10 = var6_19.values();
                        var1_3 = var6_19.size();
                        var6_19 = new StringBuilder("Request of ");
                        var6_19.append(var1_3);
                        var6_19.append(" packs for ");
                        var6_19.append((String)var4_2);
                        var6_19.append(" failed");
                        dcu.a(var5_10, var6_19.toString(), new Object[0]);
                        return null;
                    }
                    var8_34 = (dfh)var6_19.next();
                    var5_10 = var4_2.f;
                    var7_30 = var4_2.a;
                    var1_3 = true != var4_2.c.contains(var8_34.a) ? 2 : 3;
                    var5_10.f(var7_30, var8_34, var1_3);
                }
            }
            case 3: {
                var5_11 = this.a;
                var6_20 = this.b;
                var4_2 = this.c;
                try {
                    dcu.a((Collection)var6_20, "Cancellation request for pack '%s' failed", new Object[]{var4_2});
                    var6_20 = var6_20.iterator();
                    var1_3 = 0;
                    while (var6_20.hasNext()) {
                        var1_3 |= ((Boolean)hhk.S((hpn)var6_20.next())).booleanValue();
                    }
                    if (var1_3 != 0) {
                        var6_20 = ((egg)var5_11).e;
                        var7_31 = new dbc(var4_2, 3);
                        ((cxv)var6_20).a((dau)var7_31);
                    }
                    if ((var6_20 = ((egg)var5_11).b.a((String)var4_2, false)) == null) ** GOTO lbl138
                    var6_20 = var6_20.a;
                    if (!var6_20.isEmpty()) {
                        var7_31 = ((egg)var5_11).c;
                        var8_35 = ddo.c(var6_20);
                        ((dcj)((egg)var5_11).d).f((String)var4_2);
                        var6_20 = ((dfu)var7_31).b;
                        synchronized (var6_20) {
                            var9_37 = var8_35.iterator();
                        }
                    }
                    ** GOTO lbl128
                }
                catch (Throwable var6_23) {
                    var5_11 = (egg)var5_11;
                    var7_32 = var5_11.e;
                    var8_36 = new dba(var4_2, var6_23, 3);
                    ((cxv)var7_32).a(var8_36);
                    var5_11 = var5_11.e;
                    var4_2 = new dba(var4_2, var6_23, 4);
                    ((cxv)var5_11).a((dau)var4_2);
                    throw var6_23;
                }
                {
                    while (var9_37.hasNext()) {
                        var8_35 = (ddn)var9_37.next();
                        ((dfu)var7_31).p((ddn)var8_35);
                    }
                }
lbl128:
                // 2 sources

                var7_31 = ((egg)var5_11).b;
                try {
                    ((dfo)var7_31).a.getWritableDatabase().delete("selected_packs", "superpack_name=?", new String[]{(String)var4_2});
                }
                catch (SQLiteException var6_22) {
                    var7_31 = ((dfo)var7_31).a;
                    var8_35 = new IOException("SqliteSelectedPacks#remove, SQL delete failed, superpackName: ".concat(String.valueOf(var4_2)), var6_22);
                    var7_31.a((IOException)var8_35);
                    throw var8_35;
                }
lbl138:
                // 2 sources

                var7_31 = ((egg)var5_11).h;
                var6_20 = Collections.emptySet();
                ((czh)var7_31).e((String)var4_2, (Set)var6_20, 0);
                ((egg)var5_11).j.b((String)var4_2);
                ((bmu)((czh)((egg)var5_11).h).a).r((String)var4_2);
                var7_31 = ((egg)var5_11).c;
                var6_20 = dhu.e;
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/gc/FileManager", "deleteNamespaceFiles", 582, "FileManager.java")).u("Deleting all files in namespace %s", var4_2);
                var8_35 = ((dfu)var7_31).g((String)var4_2);
                if (!var8_35.exists()) ** GOTO lbl165
                var9_37 = dda.d((File)var8_35).iterator();
                while (var9_37.hasNext()) {
                    var11_39 = ((File)var9_37.next()).getName();
                    var10_38 = new dco((String)var4_2, var11_39);
                    ((dfu)var7_31).o(var10_38, (dhu)var6_20, true);
                }
                var9_37 = ((dfu)var7_31).d;
                try {
                    ((dfl)var9_37).b.getWritableDatabase().delete("file_metadata", "namespace=?", new String[]{(String)var4_2});
                    ((dfu)var7_31).e.b((String)var4_2, (File)var8_35, (dhu)var6_20);
                }
                catch (SQLiteException var6_21) {
                    var8_35 = ((dfl)var9_37).b;
                    var7_31 = new IOException("SqliteFileMetadataTable#removeNamespace, SQL delete failed, namespace: ".concat(String.valueOf(var4_2)), var6_21);
                    var8_35.a((IOException)var7_31);
                    throw var7_31;
                }
            }
lbl165:
            // 2 sources

            var7_31 = ((egg)var5_11).e;
            var6_20 = new dbc(var4_2, 4);
            ((cxv)var7_31).a((dau)var6_20);
            return null;
            case 2: {
                var5_12 = ((ctv)hhk.S((Future)this.c)).c;
                var4_2 = (cti)hhk.S((Future)this.b);
                if (var4_2 != null) {
                    return crh.k(var5_12, var4_2.e);
                }
                var6_24 = (ctf)this.a;
                var4_2 = var5_12;
                if ((var6_24.b & 32) == 0) return var4_2;
                return crh.k(var5_12, var6_24.i);
            }
            case 1: {
                var4_2 = (bcn)this.a;
                var5_13 = var4_2.d;
                var6_25 = this.c;
                var5_13 = var5_13.A();
                var6_25 = (String)var6_25;
                var5_13 = var5_13.a((String)var6_25);
                ((ArrayList)this.b).addAll(var5_13);
                return var4_2.d.z().b((String)var6_25);
            }
            case 0: 
        }
        var5_14 = (cms)this.a;
        var3_40 = var5_14.d;
        var7_33 = var5_14.f;
        if (var3_40 != 0 && (var2_1 = var5_14.e) >= 8000 && var2_1 <= 384000) {
            var1_3 = (var3_40 + var3_40) * (var2_1 / 1000) * 10;
        } else {
            ((heg)((heg)cms.a.g()).j("com/google/android/libraries/assistant/soda/SodaAudioPusher", "getAudioReadSize", 69, "SodaAudioPusher.java")).r("Incorrect Format set");
        }
        var4_2 = this.c;
        var6_26 = this.b;
        cms.b(var5_14.c, (InputStream)var6_26, (gto)var4_2, var7_33, var1_3);
        return null;
    }
}

