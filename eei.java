/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class eei
implements eee {
    public final dzj a;
    private final Executor b;

    public eei(dzj dzj2) {
        this.a = dzj2;
        this.b = new hpz(dzj2.a());
    }

    @Override
    public final void b(dzn object) {
        jse.e(object, "audioData");
        object = gqk.i(new dpw(this, object, 10));
        this.b.execute((Runnable)object);
    }
}

