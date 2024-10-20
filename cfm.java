/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.os.Looper
 */
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class cfm
extends cfc
implements ccp {
    private static volatile Executor t;
    public final Set s;
    private final Account u;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected cfm(Context object, Looper object2, int n2, cfe cfe2, cdr cdr2, cel cel2) {
        Object object3 = cfo.a;
        synchronized (object3) {
            if (cfo.h == null) {
                cfo cfo2;
                cfo.h = cfo2 = new cfo(object.getApplicationContext(), object.getMainLooper());
            }
        }
        super((Context)object, (Looper)object2, cfo.h, cbo.a, n2, new AmbientMode$AmbientController(cdr2), new AmbientModeSupport$AmbientController(cel2), cfe2.e);
        this.u = cfe2.a;
        object2 = cfe2.c;
        object = object2.iterator();
        do {
            if (object.hasNext()) continue;
            this.s = object2;
            return;
        } while (object2.contains((Scope)object.next()));
        throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
    }

    @Override
    public final cbm[] B() {
        return new cbm[0];
    }

    @Override
    protected final void D() {
    }

    @Override
    public int a() {
        throw null;
    }

    @Override
    public final Set g() {
        Set set = this.l() ? this.s : Collections.emptySet();
        return set;
    }

    @Override
    public final Account r() {
        return this.u;
    }
}

