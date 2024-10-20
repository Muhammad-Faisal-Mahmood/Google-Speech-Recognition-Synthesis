/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ewi
implements dzj {
    final Executor a;
    final jyh b;

    public ewi(jyh jyh2, Executor executor) {
        this.b = jyh2;
        this.a = executor;
    }

    @Override
    public final Executor a() {
        return this.a;
    }

    @Override
    public final void b(dzn dzn2) {
        jse.e(dzn2, "audioData");
        this.b.g(dzn2);
        if (dzn2.c == 2) {
            jns.al(this.b);
        }
    }
}

