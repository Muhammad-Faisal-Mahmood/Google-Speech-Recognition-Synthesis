/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class rb
extends rd {
    public int a;
    public qd b;

    public rb(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(qg qg2, boolean bl2) {
        int n2;
        block6: {
            block5: {
                int n3;
                block8: {
                    block7: {
                        block4: {
                            n3 = this.a;
                            if (!bl2) break block4;
                            if (n3 == 5) break block5;
                            n2 = n3;
                            if (n3 != 6) break block6;
                            break block7;
                        }
                        if (n3 != 5) break block8;
                    }
                    n2 = 0;
                    break block6;
                }
                n2 = n3;
                if (n3 != 6) break block6;
            }
            n2 = 1;
        }
        if (qg2 instanceof qd) {
            ((qd)qg2).a = n2;
        }
    }

    public final void b(int n2) {
        this.b.c = n2;
    }

    @Override
    protected final void c() {
        qd qd2;
        this.b = qd2 = new qd();
        this.h = qd2;
        this.f();
    }
}

