/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.system.Os
 *  gda
 *  hom
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.system.Os;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class gfs
implements ghb {
    public final Object a;
    private final int b;

    public /* synthetic */ gfs(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        int n2 = this.b;
        if (n2 == 0) {
            Object object = this.a;
            jse.e(object, "$updater");
            gax.c(((gpm)object).v(true), "Failed to obtain initial snapshot", new Object[0]);
            return hpj.a;
        }
        if (n2 == 1) {
            fxf.K(gda.a);
            Object object = this.a;
            Object object2 = (fzi)object;
            fzp fzp2 = ((fzi)object2).b;
            Object object3 = fzp2.g;
            object3 = gqk.c(new fzm(fzp2, cgw.p().toEpochMilli(), 0));
            object = hmv.g(((hou)fzp2.e).b((hnx)object3, (Executor)fzp2.f), Throwable.class, gqk.d(new frm(object, 7)), (Executor)hom.a);
            object2 = ((fzi)object2).b;
            hhk.T((hpn)object, gqk.g(new fgl(object2, 2)), (Executor)((fzp)object2).f);
            gax.c((hpn)object, "Failed account invalidation.", new Object[0]);
            return hpj.a;
        }
        Object object = this.a;
        object = ((Context)object).getPackageManager().getPackageInfo(((Context)object).getPackageName(), 0);
        if (((PackageInfo)object).applicationInfo.targetSdkVersion >= 24) return hpj.a;
        object = ((PackageInfo)object).applicationInfo.dataDir;
        try {
            Os.chmod((String)object, (int)448);
            return hpj.a;
        }
        catch (Exception exception) {
            try {
                object = new IOException(exception);
                throw object;
            }
            catch (PackageManager.NameNotFoundException | IOException throwable) {
                return hpj.a;
            }
        }
    }
}

