/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import j$.util.Objects;

public final class dse
implements imb {
    private final jnu a;
    private final int b;

    public dse(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    public final gto a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return gto.h((Activity)((imc)this.a).a);
            }
            gto gto2 = (gto)((imc)this.a).a;
            gto2 = gto2.g() ? gto.h((dmo)((jnu)gto2.c()).b()) : gsl.a;
            return gto2;
        }
        gto gto3 = (gto)((imc)this.a).a;
        if (gto3.g()) {
            Objects.requireNonNull(gto3);
            gto3 = gto.i(new aim(gto3, 18));
        } else {
            gto3 = gsl.a;
        }
        return gto3;
    }

    @Override
    public final /* synthetic */ Object b() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return this.a();
            }
            return this.a();
        }
        return this.a();
    }
}

