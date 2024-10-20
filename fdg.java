/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.libraries.speech.modelmanager.languagepack.ui.grpc.DownloadActivityStarterService;

public class fdg
extends abi
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

    @Override
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            Object object = this.bn();
            ((DownloadActivityStarterService)this).a = new fdf((Context)((bre)object).b.P.a);
        }
        super.onCreate();
    }
}

