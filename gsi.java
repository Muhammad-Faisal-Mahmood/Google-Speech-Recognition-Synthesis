/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.Log
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.Serializable;
import java.util.Set;

public final class gsi
extends ach {
    private static volatile Handler k;
    public final pb a = new pb();
    public final Set b = new ov();
    public by c = null;
    public gse d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean i = false;
    public final String j;
    private final abw l;

    public gsi(abw abw2) {
        this.l = abw2;
        Serializable serializable = this.getClass();
        Parcelable[] parcelableArray = gte.class.getName();
        String string = be.class.getName();
        String string2 = ((Class)serializable).getName();
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append((String)parcelableArray);
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(string2);
        this.j = ((StringBuilder)serializable).toString();
        if (abw2.c()) {
            parcelableArray = (Bundle)abw2.a("FutureListenerState");
            this.g = true;
            this.i((Bundle)parcelableArray);
            parcelableArray = parcelableArray.getParcelableArray("futures");
            if (parcelableArray != null) {
                for (int i2 = 0; i2 < parcelableArray.length; ++i2) {
                    this.b.add((gsj)parcelableArray[i2]);
                }
            }
        }
        abw2.b("FutureListenerState", new bo(this, 8));
    }

    public static final void f() {
        boolean bl2 = Looper.myLooper() == Looper.getMainLooper();
        fxf.B(bl2, "Must be called from the main thread.");
    }

    private final void i(Bundle object) {
        if ((object = object.getString("appVersion")) != null) {
            if (this.j.equals(object)) {
                return;
            }
            String string = this.j;
            StringBuilder stringBuilder = new StringBuilder("Got data from old app version: expected=");
            stringBuilder.append(string);
            stringBuilder.append(" got=");
            stringBuilder.append((String)object);
            throw new gsh(stringBuilder.toString());
        }
        throw new gsh("Got key but not value from saved state.");
    }

    public final void a(Runnable runnable) {
        this.i = true;
        try {
            runnable.run();
            return;
        }
        finally {
            this.i = false;
        }
    }

    public final void b(gsj gsj2, Throwable throwable) {
        this.c(gsj2, new fbx(this, gsj2, throwable, 17, null));
    }

    public final void c(gsj gsj2, Runnable runnable) {
        if (this.c != null) {
            if (k == null) {
                k = new Handler(Looper.getMainLooper());
            }
            k.post((Runnable)new fbx(this, gsj2, runnable, 16, null));
        }
    }

    @Override
    public final void d() {
        int n2 = ((ov)this.b).c;
        Object object = new StringBuilder("Dropped results for ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" pending futures.");
        Log.i((String)"FutureListener", (String)((StringBuilder)object).toString());
        ou ou2 = new ou((ov)this.b);
        while (ou2.hasNext()) {
            object = (gsj)ou2.next();
            if ((AmbientModeSupport$AmbientController)pc.a(this.a, ((gsj)object).a) == null) continue;
            this.a(new gjf(object, 11));
        }
        this.b.clear();
    }

    final void e(by object) {
        int n2;
        int n3 = 1;
        fxf.q(true);
        Object object2 = this.c;
        boolean bl2 = object2 == null || object == object2;
        fxf.A(bl2);
        if (!this.f) {
            if (this.l.c()) {
                object2 = (Bundle)this.l.a("FutureListenerState");
                this.i((Bundle)object2);
                object2 = object2.getIntArray("callback_ids");
                int n4 = ((Object)object2).length;
                for (n2 = 0; n2 < n4; ++n2) {
                    bl2 = pc.a(this.a, (int)object2[n2]) != null;
                    fxf.B(bl2, "Didn't re-register callback.");
                }
            }
            this.f = true;
        }
        n2 = n3;
        if (!this.e) {
            n2 = this.c == null ? n3 : 0;
        }
        if (this.c == null) {
            this.c = object;
        }
        if (n2 != 0) {
            this.e = false;
            object2 = new ou((ov)this.b);
            while (object2.hasNext()) {
                object = (gsj)object2.next();
                if (!((gsj)object).b()) {
                    AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = (AmbientModeSupport$AmbientController)pc.a(this.a, ((gsj)object).a);
                    this.h((gsj)object);
                }
                ((gsj)object).c(this);
            }
        }
    }

    public final void h(gsj gsj2) {
        this.a(new gjf(gsj2, 12));
    }
}

