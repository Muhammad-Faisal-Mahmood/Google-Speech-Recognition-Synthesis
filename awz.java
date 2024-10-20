/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class awz
implements awp {
    public final Context a;
    public final String b;
    public final awm c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final jny g;

    public awz(Context context, String string, awm awm2, boolean bl2, boolean bl3) {
        jse.e(context, "context");
        this.a = context;
        this.b = string;
        this.c = awm2;
        this.d = bl2;
        this.e = bl3;
        this.g = new jog(new mq(this, 11));
    }

    private final awy a() {
        return (awy)((Object)this.g.a());
    }

    @Override
    public final awl b() {
        return this.a().b();
    }

    @Override
    public final void c(boolean bl2) {
        if (this.g.b()) {
            this.a().setWriteAheadLoggingEnabled(bl2);
        }
        this.f = bl2;
    }

    @Override
    public final void close() {
        if (this.g.b()) {
            this.a().close();
        }
    }
}

