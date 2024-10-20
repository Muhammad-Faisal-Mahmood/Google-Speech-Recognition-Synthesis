/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

public final class hhg
extends hhk {
    public static final hhg a = new hhg(hhm.a);
    public final AtomicReference b;

    public hhg(hhk hhk2) {
        this.b = new AtomicReference<hhk>(hhk2);
    }

    @Override
    public final hfz a() {
        return ((hhk)this.b.get()).a();
    }

    @Override
    public final hhr b() {
        return ((hhk)this.b.get()).b();
    }

    @Override
    public final void c(String string, Level level, boolean bl2) {
        ((hhk)this.b.get()).c(string, level, bl2);
    }
}

