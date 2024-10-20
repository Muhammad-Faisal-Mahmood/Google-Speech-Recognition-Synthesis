/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
import android.content.Context;
import android.util.Log;
import java.security.Security;

public final class gkb
implements dxe {
    public final Object a;
    private final int b;

    public /* synthetic */ gkb(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        if (this.b != 0) {
            cpm cpm2 = (cpm)((Object)((gtt)this.a).a);
            return;
        }
        Object object = new foz(new fpb());
        Object object2 = new hti((Context)this.a);
        Object object3 = foz.b;
        synchronized (object3) {
            if (hti.c != null) {
                return;
            }
            hti.c = object2;
            if (foz.c == null) {
                foz.c = object2 = new fpd();
            }
            if (Security.insertProviderAt(foz.c, 1) != 1) {
                object = new RuntimeException("Failed to install SslGuard with top priority.");
                throw object;
            }
            object2 = ((foz)object).d;
            if (object2 == null) {
                object = new AssertionError((Object)"Cannot initialize SslGuardSocketFactory will null");
                throw object;
            }
            fpf.a = object2;
            object = ((foz)object).d;
            if (object != null) {
                fpe.a = object;
                foz.b();
                foz.a();
                Log.i((String)foz.a, (String)"SslGuard completed installation.");
                return;
            }
            object = new AssertionError((Object)"Cannot initialize SslGuardSocketFactory will null");
            throw object;
        }
    }
}

