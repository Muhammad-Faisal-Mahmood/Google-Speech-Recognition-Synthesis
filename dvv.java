/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  frc
 */
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

public final class dvv {
    public static final ConcurrentMap a = new ConcurrentHashMap();
    private static final frt b = new frt(dvn.a);
    private static final Object c = new Object();
    private static volatile gcv d = null;

    public static boolean a(File file) {
        block6: {
            block5: {
                File[] fileArray;
                if (!file.isDirectory() || (fileArray = file.listFiles()) == null) break block5;
                boolean bl2 = true;
                for (int i2 = 0; i2 < fileArray.length; ++i2) {
                    File file2 = fileArray[i2];
                    bl2 = bl2 && dvv.a(file2);
                }
                if (!bl2) break block6;
            }
            if (file.delete()) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static frr b(dua object) {
        Object object2;
        Object object3;
        Object object4 = new frg(null);
        ((frg)object4).g = frl.a;
        ((frg)object4).a();
        ((frg)object4).e = true;
        ((frg)object4).f = (byte)(((frg)object4).f | 1);
        Object object5 = new fps(((dua)object).c);
        ((fps)object5).d("phenotype");
        ((fps)object5).e("all_accounts.pb");
        object5 = ((fps)object5).a();
        if (object5 == null) {
            throw new NullPointerException("Null uri");
        }
        ((frg)object4).a = object5;
        object5 = dvn.a;
        if (object5 == null) {
            throw new NullPointerException("Null schema");
        }
        ((frg)object4).b = object5;
        ((frg)object4).c = gto.i(b);
        ((frg)object4).a();
        if (((frg)object4).d == null) {
            int n2 = gzx.d;
            ((frg)object4).d = hct.a;
        }
        if (((frg)object4).f == 3 && (object3 = ((frg)object4).a) != null && (object2 = ((frg)object4).b) != null && (object5 = ((frg)object4).g) != null) {
            object2 = new frh((Uri)object3, (hyf)object2, ((frg)object4).c, ((frg)object4).d, (fvc)object5, ((frg)object4).e);
            object4 = object5 = d;
            if (object5 == null) {
                object3 = c;
                synchronized (object3) {
                    object4 = object5 = d;
                    if (object5 == null) {
                        fru fru2 = fru.a;
                        HashMap<String, Object> hashMap = new HashMap<String, Object>();
                        object5 = ((dua)object).d();
                        object = ((dua)object).g();
                        object4 = fro.a;
                        String string = ((frs)object4).a(frc.a);
                        fxf.v(true ^ hashMap.containsKey(string), "There is already a factory registered for the ID %s", string);
                        hashMap.put(string, object4);
                        d = object4 = new gcv((Executor)object5, (bmu)object, fru2, hashMap);
                    }
                }
            }
            return ((gcv)object4).d((frh)object2);
        }
        object = new StringBuilder();
        if (((frg)object4).a == null) {
            ((StringBuilder)object).append(" uri");
        }
        if (((frg)object4).b == null) {
            ((StringBuilder)object).append(" schema");
        }
        if (((frg)object4).g == null) {
            ((StringBuilder)object).append(" variantConfig");
        }
        if ((1 & ((frg)object4).f) == 0) {
            ((StringBuilder)object).append(" useGeneratedExtensionRegistry");
        }
        if ((((frg)object4).f & 2) == 0) {
            ((StringBuilder)object).append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }
}

