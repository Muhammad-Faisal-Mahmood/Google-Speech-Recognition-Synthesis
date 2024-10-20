/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Handler
 */
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

public final class dlq {
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    public Handler e = null;
    public final Runnable f;
    public final Set g = new HashSet();
    public djt h;

    public dlq(Context context) {
        this.e = new Handler(context.getMainLooper());
        this.f = new cmw(this, 11);
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new dlo(this));
    }

    public final void a() {
        if (this.a == 0 && this.c) {
            for (dld dld2 : this.g) {
            }
            this.d = true;
        }
    }
}

