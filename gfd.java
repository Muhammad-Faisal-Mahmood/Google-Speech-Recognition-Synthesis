/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.util.concurrent.Executor;

public final class gfd
implements gui {
    public final Context a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final int g;

    public /* synthetic */ gfd(Context context, String string, cqm cqm2, bmu bmu2, jrk jrk2, String string2, int n2) {
        this.g = n2;
        this.a = context;
        this.b = string;
        this.c = cqm2;
        this.d = bmu2;
        this.e = jrk2;
        this.f = string2;
    }

    public /* synthetic */ gfd(Executor executor, iku iku2, Context context, gto gto2, bmu bmu2, gto gto3, int n2) {
        this.g = n2;
        this.e = executor;
        this.f = iku2;
        this.a = context;
        this.d = gto2;
        this.c = bmu2;
        this.b = gto3;
    }

    @Override
    public final Object a() {
        if (this.g != 0) {
            int n2 = (int)ins.a.b().f();
            Object object = new cvf((Executor)this.e, n2);
            koc koc2 = (koc)this.f.b();
            Objects.requireNonNull(koc2);
            Object var3_6 = null;
            Object object2 = new div(new AmbientMode$AmbientController(koc2, null));
            Object object3 = new dyr(null);
            koc2 = this.a;
            object2 = new djj((djk)object2, (Context)koc2, (Executor)object, (dyr)object3);
            ((djj)object2).h((djg)((gtt)this.d).a);
            object3 = this.b;
            gto gto2 = (gto)object3;
            object = var3_6;
            if (gto2.g()) {
                object = var3_6;
                if (((iku)gto2.c()).b() != null) {
                    object = new AmbientModeSupport$AmbientController(object3, null);
                }
            }
            return new czh((Context)koc2, (djj)object2, (bmu)this.c, (AmbientModeSupport$AmbientController)object);
        }
        Object object = this.b;
        jse.e(object, "$packageName");
        Object object4 = this.d;
        jse.e(object4, "$fileApi");
        Object object5 = this.c;
        Object object6 = this.e;
        Object object7 = this.f;
        gff gff2 = gff.a;
        object7 = (String)object7;
        object5 = (cqm)object5;
        object4 = (bmu)object4;
        return gpm.B((String)object, (cqm)object5, (bmu)object4, (jrk)object6, (String)object7, gff2);
    }
}

