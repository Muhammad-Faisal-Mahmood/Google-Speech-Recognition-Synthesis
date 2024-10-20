/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$-CC
 *  hom
 */
import android.util.Pair;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.File;
import java.util.concurrent.Executor;

public final class cvd
implements pq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;

    public /* synthetic */ cvd(czh czh2, cva cva2, File file, String string, djm djm2, int n2) {
        this.f = n2;
        this.a = czh2;
        this.b = cva2;
        this.c = file;
        this.d = string;
        this.e = djm2;
    }

    public /* synthetic */ cvd(Executor executor, AmbientLifecycleObserver$AmbientLifecycleCallback.-CC -CC2, String string, jqz jqz2, abo abo2, int n2) {
        this.f = n2;
        this.c = executor;
        this.a = -CC2;
        this.e = string;
        this.d = jqz2;
        this.b = abo2;
    }

    @Override
    public final Object a(po po2) {
        if (this.f != 0) {
            Object object = this.c;
            jse.e(object, "$executor");
            Object object2 = this.e;
            Object object3 = this.d;
            abo abo2 = (abo)this.b;
            object.execute(new ww((String)object2, (jqz)object3, abo2, po2, 5));
            return jon.a;
        }
        Object object = new cvc(po2);
        Object object4 = this.c;
        Object object5 = this.d;
        Object object6 = this.e;
        Object object7 = this.a;
        Object object8 = (czh)object7;
        Object object9 = ((czh)object8).c;
        cva cva2 = (cva)this.b;
        String string = cva2.b;
        djj djj2 = (djj)object9;
        object9 = (String)object5;
        object = new djc(djj2, string, (File)object4, (String)object9, (dja)object, (djm)object6);
        ((djc)object).l = (AmbientModeSupport$AmbientController)((czh)object8).a;
        object8 = cva2.c;
        if (cuz.c == object8) {
            ((djc)object).h(djb.b);
        } else {
            ((djc)object).h(djb.a);
        }
        int n2 = cva2.d;
        if (n2 > 0) {
            ((djc)object).i = n2;
        }
        object8 = cva2.e;
        for (n2 = 0; n2 < ((hct)object8).c; ++n2) {
            string = (Pair)object8.get(n2);
            object6 = (String)((Pair)string).first;
            string = (String)((Pair)string).second;
            ((gxw)((djc)object).k).m(object6, string);
        }
        po2.a(new ai(object7, object4, object5, 14, null), (Executor)hom.a);
        boolean bl2 = ((djc)object).e();
        cyr.e("%s: Data download scheduled for file: %s enqueued: %s", "OffroadFileDownloader", cva2.b, bl2);
        if (!bl2) {
            object5 = css.a();
            ((kqr)object5).b = csr.u;
            ((kqr)object5).c = "Duplicate request for: ".concat(String.valueOf(cva2.b));
            po2.d(((kqr)object5).a());
        }
        return "Data download scheduled for file ".concat(String.valueOf(cva2.b));
    }
}

