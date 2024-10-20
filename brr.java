/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class brr
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;

    public brr(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public final brq a() {
        Context context = (Context)this.a.b();
        gbs gbs2 = (gbs)((Object)this.b.b());
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.c.b();
        buj.a().intValue();
        return new brq(context, gbs2, scheduledExecutorService, ima.c(this.d));
    }
}

