/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class aby
implements Closeable,
abc {
    public final abw a;
    public boolean b;
    private final String c;

    public aby(String string, abw abw2) {
        this.c = string;
        this.a = abw2;
    }

    @Override
    public final void a(abe abe2, aaz aaz2) {
        if (aaz2 == aaz.ON_DESTROY) {
            this.b = false;
            abe2.getLifecycle().c(this);
        }
    }

    public final void b(awf awf2, abb abb2) {
        jse.e(awf2, "registry");
        jse.e(abb2, "lifecycle");
        if (!this.b) {
            this.b = true;
            abb2.b(this);
            awf2.b(this.c, this.a.f);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override
    public final void close() {
    }
}

