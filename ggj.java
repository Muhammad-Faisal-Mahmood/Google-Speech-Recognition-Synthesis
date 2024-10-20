/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.util.Log
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.Collection;
import java.util.concurrent.Callable;

public final class ggj
implements Callable {
    public final String a;
    public final knl b;

    public /* synthetic */ ggj(knl knl2, String string) {
        this.b = knl2;
        this.a = string;
    }

    public final Object call() {
        Object object;
        Object object2 = this.b;
        Object object3 = new htf((PackageManager)((knl)object2).a);
        Object object4 = ((htf)object3).c;
        Object object5 = ((Context)((knl)object2).b).getPackageName();
        object4 = object2 = (dwv)object4.get(object5);
        if (object2 == null) {
            object4 = new dwv((htf)object3, (String)object5, new dws(new drq(object3, object5, 6, null)));
            ((htf)object3).c.put(object5, object4);
        }
        object3 = new gzs();
        object2 = new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService");
        object5 = ((dwv)object4).a;
        object2 = object2.setPackage((String)object5);
        Object object62 = ((PackageManager)((dwv)object4).e.a).queryIntentServices((Intent)object2, 787072).iterator();
        block0: while (true) {
            object2 = null;
            while (object62.hasNext()) {
                object = (ResolveInfo)object62.next();
                if (object2 != null) continue;
                if (((ResolveInfo)object).serviceInfo == null || ((ResolveInfo)object).serviceInfo.metaData == null || !"com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(((ResolveInfo)object).serviceInfo.name)) continue block0;
                object2 = ((ResolveInfo)object).serviceInfo;
            }
            break;
        }
        if (object2 == null) {
            Log.i((String)"PhenotypeResourceReader", (String)"unable to find any Phenotype resource metadata for ".concat(String.valueOf(object5)));
            object4 = hcy.a;
        } else {
            object62 = new ot();
            object5 = new ot();
            object2 = ((ServiceInfo)object2).metaData;
            for (Object object7 : object2.keySet()) {
                int n2;
                boolean bl2 = ((String)object7).startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                boolean bl3 = ((String)object7).startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                if (!bl2 && !bl3 || (n2 = object2.getInt((String)object7, 0)) == 0) continue;
                object7 = (String)fvd.N(guf.b(':').e((CharSequence)object7), 1);
                if (bl2) {
                    ((pa)object62).put(object7, n2);
                    continue;
                }
                ((pa)object5).put(object7, n2);
            }
            object2 = hac.h(((pa)object62).f);
            for (Object object62 : ((ot)object62).entrySet()) {
                object = (String)object62.getKey();
                ((gzy)object2).d(object, new flh((dwv)object4, (String)object, (Integer)object62.getValue(), (Integer)((pa)object5).getOrDefault(object, 0)));
            }
            object4 = ((gzy)object2).a();
        }
        object2 = ((hac)object4).g().k();
        while (object2.hasNext()) {
            object4 = (hqp)((flh)object2.next()).a.a();
            if (object4 == null) continue;
            ((gzs)object3).h(object4);
        }
        object4 = ((gzs)object3).g();
        object2 = new ggk(ero.m, 0);
        object4 = object4 instanceof Collection ? fvd.p(((gzx)object4).v(), (gte)object2, hac.h(((hct)object4).c)) : fvd.p(((gzx)object4).v(), (gte)object2, new gzy());
        return (hqp)((hac)object4).get(this.a);
    }
}

