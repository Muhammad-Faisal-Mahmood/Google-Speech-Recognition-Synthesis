/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;

public final class fri {
    public final Context a;
    public final Executor b;
    public String c;
    public gui d = new guk(1);
    public AmbientModeSupport$AmbientController e;
    private boolean f = false;

    public fri(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final frk a() {
        fxf.r(this.f, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new frk(this);
    }

    public final void b() {
        this.f = true;
    }

    public final void c(frj frj2) {
        this.e = new AmbientModeSupport$AmbientController(frj2, null);
    }
}

