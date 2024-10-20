/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 */
import android.app.Service;
import com.google.android.libraries.mdi.download.foreground.sting.ForegroundDownloadService;

public abstract class cvh
extends Service
implements ilw {
    private volatile ilq a;
    private final Object b = new Object();
    private boolean c = false;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object bn() {
        if (this.a != null) return this.a.bn();
        Object object = this.b;
        synchronized (object) {
            ilq ilq2;
            if (this.a != null) return this.a.bn();
            this.a = ilq2 = new ilq(this);
            return this.a.bn();
        }
    }

    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            Object object = this.bn();
            ((ForegroundDownloadService)this).a = (cty)((bre)object).b.k.b();
        }
        super.onCreate();
    }
}

