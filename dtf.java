/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class dtf {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    private final dsv e;
    private final dsx f;
    private final dtb g;

    public dtf(Context object, gto object2, gto object3, gto serializable, gto gto2, gto gto3) {
        object = object.getPackageName();
        object2 = (dsv)((gto)object2).e(dsv.a);
        object3 = (dsx)((gto)object3).e(dsx.a);
        dtb dtb2 = (dtb)serializable.e(dtb.a);
        serializable = Boolean.valueOf(false);
        boolean bl2 = (Boolean)gto2.e(serializable);
        boolean bl3 = (Boolean)gto3.e(serializable);
        this.b = "GOOGLETTS_ANDROID_PRIMES";
        this.e = object2;
        this.f = object3;
        this.g = dtb2;
        this.c = bl2;
        this.d = bl3;
        this.a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(object));
    }

    public final hpn a() {
        hpn hpn2 = this.e.a();
        hpn hpn3 = this.f.a();
        hpn hpn4 = this.g.a();
        return hhk.Z(hpn2, hpn3, hpn4).a(new ddy(this, hpn2, hpn3, hpn4, 2), (Executor)hom.a);
    }
}

