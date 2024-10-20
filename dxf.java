/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class dxf
implements dxa {
    public final Map a;
    public final Map b;
    public final dtu c;

    public /* synthetic */ dxf(dtu dtu2, Map map, Map map2) {
        this.c = dtu2;
        this.a = map;
        this.b = map2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void a() {
        var5_1 = this.c;
        var4_3 = fxf.aq("Startup Listeners");
        var3_5 = var5_1.b();
        var5_1 = this.a;
        if (!var3_5) ** GOTO lbl20
        var1_6 = Math.random();
        var6_7 = this.b;
        if (!(var1_6 < 0.5)) ** GOTO lbl17
        try {
            block7: {
                dww.d((Map)var5_1);
                dww.d(var6_7);
                break block7;
lbl17:
                // 1 sources

                dww.d(var6_7);
                dww.d((Map)var5_1);
                break block7;
lbl20:
                // 1 sources

                dww.d((Map)var5_1);
            }
            return;
        }
        finally {
            var4_3.close();
        }
    }
}

