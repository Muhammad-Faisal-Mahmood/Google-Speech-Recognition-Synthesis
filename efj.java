/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class efj {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionImpl");
    public final efn b;
    public final adf c;
    public final eip d;
    public final efl e;
    public final Executor f;
    public po g;
    private final hpn h;
    private final hpn i;

    public efj(efn efn2, adf adf2, eip eip2, hpn hpn2, efl efl2, Executor executor) {
        this.b = efn2;
        this.c = adf2;
        this.d = eip2;
        this.h = hpn2;
        this.e = efl2;
        this.f = executor;
        this.i = kl.o(new bwo(this, 2));
    }

    public final hpn a() {
        return hhk.L(this.h);
    }

    public final hpn b() {
        return hhk.L(this.i);
    }
}

