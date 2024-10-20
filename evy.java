/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  hom
 */
import android.util.Log;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.gms.common.GooglePlayServicesManifestException;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class evy
extends jsf
implements jrk {
    final Object a;
    final Object b;
    final Object c;
    private final int d;

    public evy(ggh ggh2, String string, jrq jrq2, int n2) {
        this.d = n2;
        this.c = ggh2;
        this.a = string;
        this.b = jrq2;
        super(1);
    }

    public evy(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.b = object2;
        this.c = object3;
        super(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object2;
                hqp hqp2;
                block8: {
                    hqp2 = (hqp)object;
                    object = (hnx)((Map)((ggh)this.c).g.b()).get(this.a);
                    boolean bl2 = ((Map)((ggh)this.c).h.b()).containsKey(this.a);
                    boolean bl3 = ((Map)((ggh)this.c).i.b()).containsKey(this.a);
                    n2 = object == null && !bl2 && !bl3 ? 0 : 1;
                    if (hqp2 != null && n2 == 0) {
                        object2 = this.c;
                        try {
                            bl2 = ((duw)((ggh)object2).a).a().a.l(12200000);
                            if (!bl2) break block8;
                        }
                        catch (GooglePlayServicesManifestException googlePlayServicesManifestException) {
                            Log.e((String)"MendelPackageState", (String)"Failed to check if declarative registration is supported", (Throwable)googlePlayServicesManifestException);
                        }
                        object2 = hqp2.i;
                        jse.d(object2, "getLogSourceNameList(...)");
                        if (fvd.V((Collection)object2).containsAll(((ggh)this.c).e)) {
                            return hhk.K(null);
                        }
                    }
                }
                object2 = this.c;
                Object object3 = this.b;
                Object object4 = this.a;
                n2 = hqp2 != null ? (hqp2.c == 2 ? (Integer)hqp2.d : 0) : ((ggh)object2).d;
                if (object != null) {
                    object = fxf.ai((hnx)object, ((ggh)object2).b);
                } else {
                    object = hqp2 != null && (object = hqp2.j) != null ? (Object)((hvu)object).y() : null;
                    object = hhk.K(object);
                }
                String string = (String)object4;
                ggh ggh2 = (ggh)object2;
                object = fxf.ak((hpn)object, new frm(new ggf((jrq)object3, string, n2, ggh2, hqp2), 14), ggh2.b);
                return fxf.aE(new hpn[]{object, fxf.aC(new hpn[]{object}).C(new etu(object2, object4, 11, null), (Executor)hom.a)}).B(new fgm(object, 20), (Executor)hom.a);
            }
            AmbientMode$AmbientController ambientMode$AmbientController = (AmbientMode$AmbientController)object;
            Object object5 = this.a;
            Object object6 = this.b;
            object = (egz)this.c;
            ehb ehb2 = (ehb)((Object)object6);
            ambientMode$AmbientController.d((ehb)((Object)object5), ehb2, (egz)object);
            return jon.a;
        }
        object = (RandomAccessFile)object;
        jse.e(object, "$this$runOpsSafely");
        Object object7 = this.a;
        Objects.toString(object7);
        ((RandomAccessFile)object).writeBytes(object7.toString().concat(","));
        ((RandomAccessFile)object).writeBytes(String.valueOf(this.b).concat(","));
        object7 = this.c;
        Objects.toString(object7);
        ((RandomAccessFile)object).writeBytes(object7.toString().concat("\n"));
        return jon.a;
    }
}

