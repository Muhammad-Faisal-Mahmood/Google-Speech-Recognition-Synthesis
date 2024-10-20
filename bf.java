/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.res.Configuration
 */
import android.content.Intent;
import android.content.res.Configuration;

public final class bf
implements um {
    public final Object a;
    private final int b;

    public /* synthetic */ bf(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            gfb gfb2 = (gfb)object;
                            object = (by)this.a;
                            if (((by)object).T()) {
                                ((by)object).x(gfb2.a, false);
                            }
                            return;
                        }
                        object = (gfb)object;
                        by by2 = (by)this.a;
                        if (by2.T()) {
                            by2.s(((gfb)object).a, false);
                        }
                        return;
                    }
                    object = (Integer)object;
                    by by3 = (by)this.a;
                    if (by3.T() && (Integer)object == 80) {
                        by3.r(false);
                    }
                    return;
                }
                Configuration configuration = (Configuration)object;
                object = (by)this.a;
                if (((by)object).T()) {
                    ((by)object).o(configuration, false);
                }
                return;
            }
            object = (Configuration)object;
            ((bh)this.a).e.ai();
            return;
        }
        object = (Intent)object;
        ((bh)this.a).e.ai();
    }
}

