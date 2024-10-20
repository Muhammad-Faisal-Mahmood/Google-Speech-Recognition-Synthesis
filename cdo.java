/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

public abstract class cdo
extends cec
implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final AtomicReference b = new AtomicReference<Object>(null);
    public final Handler c = new gbs(Looper.getMainLooper(), null);
    protected final cbo d;

    public cdo(ced ced2, cbo cbo2) {
        super(ced2);
        this.d = cbo2;
    }

    private static final int k(hti hti2) {
        if (hti2 == null) {
            return -1;
        }
        return hti2.a;
    }

    public final void a(cbk cbk2, int n2) {
        this.b.set(null);
        this.e(cbk2, n2);
    }

    public final void b() {
        this.b.set(null);
        this.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void c(int n2, int n3, Intent object) {
        hti hti2 = (hti)this.b.get();
        if (n2 != 1) {
            if (n2 == 2) {
                n2 = this.d.e((Context)this.l());
                if (n2 == 0) {
                    this.b();
                    return;
                }
                if (hti2 == null || ((cbk)hti2.b).c == 18 && n2 == 18) {
                    return;
                }
            }
        } else {
            if (n3 == -1) {
                this.b();
                return;
            }
            if (n3 == 0) {
                if (hti2 == null) return;
                n2 = 13;
                if (object != null) {
                    n2 = object.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                this.a(new cbk(n2, null, ((cbk)hti2.b).toString()), cdo.k(hti2));
                return;
            }
        }
        if (hti2 == null) return;
        Object object2 = hti2.b;
        n2 = hti2.a;
        this.a((cbk)object2, n2);
    }

    @Override
    public final void d(Bundle object) {
        if (object != null) {
            AtomicReference atomicReference = this.b;
            object = object.getBoolean("resolving_error", false) ? new hti(new cbk(object.getInt("failed_status"), (PendingIntent)object.getParcelable("failed_resolution")), object.getInt("failed_client_id", -1)) : null;
            atomicReference.set(object);
        }
    }

    protected abstract void e(cbk var1, int var2);

    protected abstract void f();

    @Override
    public final void g(Bundle bundle) {
        hti hti2 = (hti)this.b.get();
        if (hti2 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", hti2.a);
        bundle.putInt("failed_status", ((cbk)hti2.b).c);
        bundle.putParcelable("failed_resolution", (Parcelable)((cbk)hti2.b).d);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a(new cbk(13, null), cdo.k((hti)this.b.get()));
    }
}

