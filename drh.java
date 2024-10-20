/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class drh
extends doc
implements dle,
dmw {
    public static final long a = TimeUnit.HOURS.toMillis(12L);
    public final dmt b;
    public final Context c;
    public final iku d;
    public final dsh e;
    private final dli f;
    private final Executor g;

    public drh(dmu dmu2, Context context, dli dli2, Executor executor, iku iku2, dsh dsh2, jnu jnu2) {
        super((short[])null);
        this.b = dmu2.a(executor, iku2, jnu2);
        this.g = executor;
        this.c = context;
        this.d = iku2;
        this.e = dsh2;
        this.f = dli2;
    }

    @Override
    public final void L() {
        this.f.a(this);
    }

    @Override
    public final void i(djt djt2) {
        this.f.b(this);
        hhk.P(new drg(this), this.g);
    }

    @Override
    public final /* synthetic */ void j(djt djt2) {
    }
}

