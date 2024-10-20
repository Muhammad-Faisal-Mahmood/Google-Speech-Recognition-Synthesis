/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class glw
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;

    public glw(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
    }

    public final glv a() {
        Context context = ((ilt)this.a).a();
        gcv gcv2 = (gcv)this.b.b();
        bng bng2 = ((glm)this.c).a();
        cgw cgw2 = (cgw)this.d.b();
        return new glv(context, gcv2, bng2, (Executor)this.e.b(), (gto)((imc)this.f).a, (Boolean)this.g.b());
    }
}

