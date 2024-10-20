/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;

public class abo
extends abn {
    public abo() {
    }

    public abo(Object object) {
        super(object);
    }

    @Override
    public void g(Object object) {
        abn.a("setValue");
        ++this.h;
        this.f = object;
        this.b(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h(Object object) {
        Object object2 = this.b;
        // MONITORENTER : object2
        Object object3 = this.g;
        Object object4 = abn.a;
        this.g = object;
        // MONITOREXIT : object2
        if (object3 != object4) {
            return;
        }
        object3 = this.i;
        object4 = nz.v().b;
        object2 = (oa)object4;
        if (((oa)object2).c == null) {
            object = ((oa)object2).a;
            // MONITORENTER : object
            if (((oa)object4).c == null) {
                Handler handler;
                ((oa)object4).c = handler = oa.v(Looper.getMainLooper());
            }
            // MONITOREXIT : object
        }
        ((oa)object2).c.post((Runnable)object3);
    }
}

