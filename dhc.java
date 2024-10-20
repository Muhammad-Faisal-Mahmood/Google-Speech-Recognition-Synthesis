/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class dhc {
    public Context a;
    public Executor b;
    public djj c;
    public boolean d = true;
    private final String e;

    public dhc() {
        this.e = "superpacks";
    }

    public final dwm a() {
        dyr dyr2 = new dyr(null);
        dyr2.a = 3;
        dyr2.b = this.e;
        if (this.c == null) {
            Object object = new kgo();
            ((kgo)object).w = new AmbientMode$AmbientController(dhf.a, null);
            ((kgo)object).a(dhg.a, TimeUnit.MILLISECONDS);
            ((kgo)object).b(dhg.b, TimeUnit.MILLISECONDS);
            long l2 = dhg.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jse.e((Object)timeUnit, "unit");
            ((kgo)object).v = khb.A(l2, timeUnit);
            ((kgo)object).d = true;
            djl djl2 = new djl(new kgp((kgo)object));
            timeUnit = this.a;
            fxf.K((Object)timeUnit);
            object = this.b;
            fxf.K(object);
            this.c = new djj(djl2, (Context)timeUnit, (Executor)object, dyr2);
        }
        return new dwm(this);
    }
}

