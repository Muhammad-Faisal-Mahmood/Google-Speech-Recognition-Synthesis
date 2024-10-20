/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.SystemClock
 */
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;

public final class giv
implements dxa {
    public final Context a;
    public final long b;
    public final jnu c;

    public /* synthetic */ giv(Context context, long l2, jnu jnu2) {
        this.a = context;
        this.b = l2;
        this.c = jnu2;
    }

    @Override
    public final void a() {
        Object object;
        if (!dww.b()) {
            return;
        }
        long l2 = this.b;
        dqy dqy2 = dqy.a;
        if (l2 <= SystemClock.elapsedRealtime()) {
            object = this.a;
            dqy2.g = new dmz(l2, l2);
            dqy2.c((Application)object);
        }
        object = (djv)this.c.b();
        object.a.b();
        object.a.d();
    }
}

