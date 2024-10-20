/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Pair
 */
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class cka
extends ccs {
    public static final int a = 0;

    static {
        Pair.create((Object)new cgw(), (Object)cgw.r(null));
    }

    public cka(Context context) {
        super(context, cju.a, cco.a, ccr.a);
    }

    public static ckz a() {
        ccq ccq2 = new ccq(new Status(16));
        cld cld2 = new cld();
        cld2.k(ccq2);
        return cld2;
    }

    public final ckz i(String string) {
        cer cer2 = new cer();
        cer2.a = new cgn(string, 4);
        return this.d(cer2.a());
    }

    public final ckz j(String string, int n2, String[] stringArray, byte[] byArray) {
        cer cer2 = new cer();
        cer2.a = new cjx(string, n2, stringArray, byArray);
        return this.d(cer2.a());
    }

    public final ckz k(String string, hqo hqo2) {
        cer cer2 = new cer();
        cer2.a = new cjv(string, hqo2, 4, null);
        cer2.b = new cbm[]{cjo.h};
        cer2.b();
        return this.d(cer2.a());
    }

    public final boolean l(int n2) {
        return cbp.d.f(this.b, n2) == 0;
    }

    public final ckz m(String string) {
        if (!this.l(12451000)) {
            return cka.a();
        }
        cer cer2 = new cer();
        cer2.a = new cjv(string, 3);
        return this.d(cer2.a());
    }
}

