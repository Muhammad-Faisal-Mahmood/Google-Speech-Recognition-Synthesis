/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class cxp
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;

    public cxp(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
    }

    public final cxo a() {
        Context context = ((ilt)this.a).a();
        cuv cuv2 = (cuv)this.b.b();
        gto gto2 = (gto)this.c.b();
        cqq cqq2 = (cqq)this.d.b();
        return new cxo(context, cuv2, gto2);
    }
}

