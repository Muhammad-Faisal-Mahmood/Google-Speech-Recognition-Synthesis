/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.util.Log
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult
extends ccx {
    public static final ThreadLocal b = new cdp();
    private final Object a = new Object();
    public cda c;
    public boolean d = false;
    private final CountDownLatch e = new CountDownLatch(1);
    private final ArrayList f = new ArrayList();
    private final AtomicReference g = new AtomicReference();
    private Status h;
    private volatile boolean i;
    private boolean j;
    private volatile ki k;

    @Deprecated
    BasePendingResult() {
        new cdq(Looper.getMainLooper());
        new WeakReference<Object>(null);
    }

    protected BasePendingResult(ccv ccv2) {
        new cdq(((cdu)ccv2).a.f);
        new WeakReference<ccv>(ccv2);
    }

    public static void i(cda cda2) {
        if (cda2 instanceof ccy) {
            try {
                ((ccy)((Object)cda2)).a();
                return;
            }
            catch (RuntimeException runtimeException) {
                Log.w((String)"BasePendingResult", (String)"Unable to release ".concat(String.valueOf(String.valueOf(cda2))), (Throwable)runtimeException);
            }
        }
    }

    protected abstract cda a(Status var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(ccw ccw2) {
        kl.ao(true, "Callback cannot be null.");
        Object object = this.a;
        synchronized (object) {
            if (this.k()) {
                ccw2.a(this.h);
            } else {
                this.f.add(ccw2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(TimeUnit object) {
        kl.aq(this.i ^ true, "Result has already been consumed.");
        kl.aq(true, "Cannot await if then() has been called.");
        try {
            if (!this.e.await(0L, (TimeUnit)((Object)object))) {
                this.h(Status.d);
            }
        }
        catch (InterruptedException interruptedException) {
            this.h(Status.b);
        }
        kl.aq(this.k(), "Result is not ready.");
        Object object2 = this.a;
        synchronized (object2) {
            kl.aq(this.i ^ true, "Result has already been consumed.");
            kl.aq(this.k(), "Result is not ready.");
            object = this.c;
            this.c = null;
            this.i = true;
        }
        object2 = this.g.getAndSet(null);
        if (object2 != null) {
            object2.a();
        }
        kl.at(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public final void h(Status status) {
        Object object = this.a;
        synchronized (object) {
            if (!this.k()) {
                this.j(this.a(status));
                this.j = true;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(cda object) {
        Object object2 = this.a;
        synchronized (object2) {
            if (this.j) {
                BasePendingResult.i((cda)object);
                return;
            }
            this.k();
            kl.aq(this.k() ^ true, "Results have already been set");
            kl.aq(this.i ^ true, "Result has already been consumed");
            this.c = object;
            this.h = (Status)object;
            this.e.countDown();
            object = this.f;
            int n2 = object.size();
            int n3 = 0;
            while (true) {
                if (n3 >= n2) {
                    this.f.clear();
                    return;
                }
                ((ccw)object.get(n3)).a(this.h);
                ++n3;
            }
        }
    }

    public final boolean k() {
        return this.e.getCount() == 0L;
    }
}

