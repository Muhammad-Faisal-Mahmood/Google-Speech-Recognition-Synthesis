/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ggi
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;
    private final jnu j;
    private final jnu k;
    private final jnu l;
    private final jnu m;

    public ggi(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11, jnu jnu12, jnu jnu13, jnu jnu14) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
        this.j = jnu11;
        this.k = jnu12;
        this.l = jnu13;
        this.m = jnu14;
    }

    public final ggh a() {
        knl knl2 = ((ggl)this.b).a();
        Executor executor = (Executor)this.c.b();
        AmbientModeSupport$AmbientController ambientModeSupport$AmbientController = (AmbientModeSupport$AmbientController)this.d.b();
        iku iku2 = ima.c(this.e);
        int n2 = ((gdg)this.f).a();
        Set set = (Set)((imc)this.g).a;
        Map map = (Map)this.h.b();
        iku iku3 = ima.c(this.i);
        iku iku4 = ima.c(this.j);
        iku iku5 = ima.c(this.k);
        cya cya2 = ((ggb)this.l).a();
        cya cya3 = (cya)this.m.b();
        return new ggh(this.a, knl2, executor, ambientModeSupport$AmbientController, iku2, n2, set, map, iku3, iku4, iku5, cya2, cya3);
    }
}

