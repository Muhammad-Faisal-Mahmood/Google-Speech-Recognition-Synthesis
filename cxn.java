/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class cxn
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;

    public cxn(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
    }

    public final cxm a() {
        Context context = ((ilt)this.a).a();
        cqq cqq2 = (cqq)this.b.b();
        return new cxm(context, (cuv)this.c.b(), (gto)this.d.b(), (Executor)this.e.b());
    }
}

