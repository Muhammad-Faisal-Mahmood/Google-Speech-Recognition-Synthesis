/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 */
import android.content.pm.PackageInfo;

public final class gdg
implements imb {
    private final jnu a;
    private final int b;

    public gdg(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    public final Integer a() {
        if (this.b != 0) {
            Integer n2 = (Integer)((gto)((imc)this.a).a).e(4);
            n2.intValue();
            return n2;
        }
        return ((PackageInfo)this.a.b()).versionCode;
    }

    @Override
    public final /* synthetic */ Object b() {
        if (this.b != 0) {
            return this.a();
        }
        return this.a();
    }
}

