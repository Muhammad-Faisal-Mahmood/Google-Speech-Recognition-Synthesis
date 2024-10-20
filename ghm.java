/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class ghm
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;

    public ghm(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
    }

    public final ghl a() {
        Object object = ((imc)this.c).a;
        Context context = ((ilt)this.a).a();
        dtu dtu2 = ((dwy)this.b).a();
        gto gto2 = (gto)object;
        object = (ExecutorService)this.d.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)this.e.b();
        int n2 = ((gdg)this.f).a();
        Object object2 = this.h;
        iku iku2 = ima.c(this.i);
        object2 = ((ily)object2).a;
        return new ghl(context, dtu2, gto2, (ExecutorService)object, scheduledExecutorService, n2, ((ily)this.g).a, (Map)object2, iku2);
    }
}

