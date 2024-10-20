/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cba
extends ccs
implements cak {
    public final gui a;

    static {
        new AtomicBoolean(false);
    }

    public cba(Context context, gui gui2) {
        bxt bxt2 = caj.k;
        ccn ccn2 = cco.a;
        ddl ddl2 = new ddl();
        ddl2.a = new ki(null);
        super(context, bxt2, ccn2, ddl2.f());
        this.a = gui2;
    }

    public final void a(cav cav2) {
        if (cav2.a.isEmpty()) {
            cgw.r(Status.a);
            return;
        }
        cer cer2 = new cer();
        cer2.a = new cgn(cav2, 1);
        cer2.b = new cbm[]{caq.a};
        cer2.b();
        this.g(cer2.a());
    }
}

