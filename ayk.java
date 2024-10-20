/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class ayk
extends ayc {
    ArrayList u = new ArrayList();
    int v;
    boolean w = false;
    private boolean x = true;
    private int y = 0;

    public ayk() {
    }

    public ayk(byte[] byArray) {
        this();
        this.O();
        this.N(new axr(2));
        this.N(new axp());
        this.N(new axr(1));
    }

    private final void P(ayc ayc2) {
        this.u.add(ayc2);
        ayc2.g = this;
    }

    @Override
    public final boolean A() {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            if (!((ayc)this.u.get(i2)).A()) continue;
            return true;
        }
        return false;
    }

    @Override
    public final void I() {
        this.y |= 2;
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ayc)this.u.get(i2)).I();
        }
    }

    @Override
    public final /* synthetic */ void J(long l2) {
        this.a = l2;
    }

    @Override
    public final void L(yj yj2) {
        super.L(yj2);
        this.y |= 4;
        if (this.u != null) {
            for (int i2 = 0; i2 < this.u.size(); ++i2) {
                ((ayc)this.u.get(i2)).L(yj2);
            }
        }
    }

    @Override
    public final void M(aay aay2) {
        this.t = aay2;
        this.y |= 8;
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ayc)this.u.get(i2)).M(aay2);
        }
    }

    public final void N(ayc ayc2) {
        this.P(ayc2);
        if (this.b >= 0L) {
            ayc2.K();
        }
        if ((this.y & 1) != 0) {
            ayc2.H();
        }
        if ((this.y & 2) != 0) {
            ayc2.I();
        }
        if ((this.y & 4) != 0) {
            ayc2.L(this.s);
        }
        if ((this.y & 8) != 0) {
            ayc2.M(this.t);
        }
    }

    public final void O() {
        this.x = false;
    }

    @Override
    public final void b(aym aym2) {
        if (this.C(aym2.b)) {
            ArrayList arrayList = this.u;
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ayc ayc2 = (ayc)arrayList.get(i2);
                if (!ayc2.C(aym2.b)) continue;
                ayc2.b(aym2);
                aym2.c.add(ayc2);
            }
        }
    }

    @Override
    public final void c(aym aym2) {
        if (this.C(aym2.b)) {
            ArrayList arrayList = this.u;
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ayc ayc2 = (ayc)arrayList.get(i2);
                if (!ayc2.C(aym2.b)) continue;
                ayc2.c(aym2);
                aym2.c.add(ayc2);
            }
        }
    }

    @Override
    public final boolean d() {
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((ayc)this.u.get(i2)).d()) continue;
            return false;
        }
        return true;
    }

    public final int f() {
        return this.u.size();
    }

    public final ayc g(int n2) {
        if (n2 >= 0 && n2 < this.u.size()) {
            return (ayc)this.u.get(n2);
        }
        return null;
    }

    @Override
    public final ayc i() {
        ayk ayk2 = (ayk)super.i();
        ayk2.u = new ArrayList();
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ayk2.P(((ayc)this.u.get(i2)).i());
        }
        return ayk2;
    }

    @Override
    public final String m(String string) {
        String string2 = super.m(string);
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("\n");
            stringBuilder.append(((ayc)this.u.get(i2)).m(string.concat("  ")));
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    @Override
    public final void n() {
        super.n();
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ayc)this.u.get(i2)).n();
        }
    }

    @Override
    public final void o(aym aym2) {
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ayc)this.u.get(i2)).o(aym2);
        }
    }

    @Override
    public final void r(ViewGroup viewGroup, ayn ayn2, ayn ayn3, ArrayList arrayList, ArrayList arrayList2) {
        long l2 = this.a;
        int n2 = this.u.size();
        int n3 = 0;
        while (n3 < n2) {
            int n4;
            ayc ayc2;
            block6: {
                long l3;
                block7: {
                    ayc2 = (ayc)this.u.get(n3);
                    n4 = n3;
                    if (l2 <= 0L) break block6;
                    n4 = n3;
                    if (this.x) break block7;
                    n4 = n3;
                    if (n3 != 0) break block6;
                    n4 = 0;
                }
                if ((l3 = ayc2.a) > 0L) {
                    ayc2.J(l3 + l2);
                } else {
                    ayc2.J(l2);
                }
            }
            ayc2.r(viewGroup, ayn2, ayn3, arrayList, arrayList2);
            n3 = n4 + 1;
        }
    }

    @Override
    public final void u(View view) {
        super.u(view);
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ayc)this.u.get(i2)).u(view);
        }
    }

    @Override
    public final void v() {
        this.p = 0L;
        ayi ayi2 = new ayi(this);
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            long l2;
            ayc ayc2 = (ayc)this.u.get(i2);
            ayc2.D(ayi2);
            ayc2.v();
            long l3 = ayc2.p;
            if (this.x) {
                this.p = Math.max(this.p, l3);
                continue;
            }
            ayc2.r = l2 = this.p;
            this.p = l2 + l3;
        }
    }

    @Override
    public final void w(View view) {
        super.w(view);
        int n2 = this.u.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ayc)this.u.get(i2)).w(view);
        }
    }

    @Override
    protected final void x() {
        if (!this.u.isEmpty()) {
            int n2;
            ayj ayj2 = new ayj(this);
            Cloneable cloneable = this.u;
            int n3 = cloneable.size();
            int n4 = 0;
            for (n2 = 0; n2 < n3; ++n2) {
                ((ayc)cloneable.get(n2)).D(ayj2);
            }
            this.v = this.u.size();
            if (!this.x) {
                for (n2 = 1; n2 < this.u.size(); ++n2) {
                    ((ayc)this.u.get(n2 - 1)).D(new ayh((ayc)this.u.get(n2)));
                }
                cloneable = (ayc)this.u.get(0);
                if (cloneable != null) {
                    ((ayc)cloneable).x();
                    return;
                }
            } else {
                cloneable = this.u;
                n3 = cloneable.size();
                for (n2 = n4; n2 < n3; ++n2) {
                    ((ayc)cloneable.get(n2)).x();
                }
            }
            return;
        }
        this.z();
        this.s();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void y(long var1_1, long var3_2) {
        var10_3 = this.p;
        if (this.g == null || (var1_1 >= 0L || var3_2 >= 0L) && (var1_1 <= var10_3 || var3_2 <= var10_3)) {
            block14: {
                block15: {
                    var7_4 = var1_1 == var3_2 ? 0 : (var1_1 < var3_2 ? -1 : 1);
                    var5_5 = 0;
                    var8_6 = var7_4 < 0;
                    cfr_temp_0 = var1_1 - 0L;
                    var6_7 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var6_7 >= 0 && var3_2 < 0L || var1_1 <= var10_3 && var3_2 > var10_3) {
                        this.m = false;
                        super.t(this, ayb.a, var8_6);
                    }
                    if (this.x) {
                        while (true) {
                            var9_8 = var8_6;
                            if (var5_5 >= this.u.size()) break;
                            ((ayc)this.u.get(var5_5)).y(var1_1, var3_2);
                            ++var5_5;
                        }
                        while (true) {
                            var8_6 = var9_8;
                            break block14;
                            break;
                        }
                    }
                    for (var5_5 = 1; var5_5 < this.u.size(); ++var5_5) {
                        if (((ayc)this.u.get((int)var5_5)).r <= var3_2) {
                            continue;
                        }
                        break block15;
                    }
                    var5_5 = this.u.size();
                }
                --var5_5;
                if (var7_4 >= 0) {
                    while (true) {
                        var9_8 = var8_6;
                        if (var5_5 >= this.u.size()) ** continue;
                        var16_10 = (ayc)this.u.get(var5_5);
                        var14_14 = var16_10.r;
                        var9_8 = var8_6;
                        var12_12 = var1_1 - var14_14;
                        var8_6 = var9_8;
                        if (var12_12 >= 0L) {
                            var16_10.y(var12_12, var3_2 - var14_14);
                            ++var5_5;
                            var8_6 = var9_8;
                            continue;
                        }
                        break;
                    }
                } else {
                    var9_9 = var8_6;
                    while (true) {
                        var8_6 = var9_9;
                        if (var5_5 < 0) break;
                        var16_11 = (ayc)this.u.get(var5_5);
                        var14_15 = var16_11.r;
                        var12_13 = var1_1 - var14_15;
                        var16_11.y(var12_13, var3_2 - var14_15);
                        var8_6 = var9_9;
                        if (var12_13 >= 0L) break;
                        --var5_5;
                    }
                }
            }
            if (this.g != null && ((var5_5 = (int)(var1_1 == var10_3 ? 0 : (var1_1 < var10_3 ? -1 : 1))) > 0 && var3_2 <= var10_3 || var6_7 < 0 && var3_2 >= 0L)) {
                if (var5_5 > 0) {
                    this.m = true;
                }
                super.t(this, ayb.b, var8_6);
            }
        }
    }
}

