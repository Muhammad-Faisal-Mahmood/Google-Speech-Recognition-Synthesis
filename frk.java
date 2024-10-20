/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
import android.content.Context;
import android.content.SharedPreferences;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;

public final class frk
implements frd {
    public final Context a;
    public final String b;
    public SharedPreferences c;
    private final Executor d;
    private final gui e;
    private final AmbientModeSupport$AmbientController f;

    public frk(fri fri2) {
        this.a = fri2.a;
        this.d = fri2.b;
        this.b = fri2.c;
        this.f = fri2.e;
        this.e = fri2.d;
    }

    public static fri d(Context context, Executor executor) {
        return new fri(context.getApplicationContext(), executor);
    }

    @Override
    public final hpn a() {
        if (((Boolean)this.e.a()).booleanValue()) {
            return hpj.a;
        }
        return hhk.O(new fgm(this, 13), this.d);
    }

    @Override
    public final hpn b(hyf hyf2) {
        cxt cxt2 = new cxt(this.c);
        return hhk.K(this.f.a.a(cxt2, hyf2));
    }

    @Override
    public final hpn c() {
        return hhk.O(new fgm(this, 14), this.d);
    }
}

