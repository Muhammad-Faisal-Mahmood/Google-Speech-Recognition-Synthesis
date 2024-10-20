/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.Executor;

final class hsv
extends itx {
    private final gbq a;
    private final String b;
    private final Executor c;

    public hsv(AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, hrk hrk2, Executor executor) {
        this.b = hrk2.c.getAuthority();
        this.c = hrk2.e;
        this.a = new gbq(new hss(ambientModeSupport$AmbientController, hrk2), executor);
    }

    @Override
    public final itz a(ixb object, itw itw2) {
        cry.a();
        hpn hpn2 = this.a.c();
        ffp ffp2 = new ffp(object, itw2, 6, null);
        object = itw2.c;
        if (object == null) {
            object = this.c;
        }
        return new hsu(fxf.aj(hpn2, ffp2, (Executor)object));
    }

    @Override
    public final String b() {
        return this.b;
    }
}

