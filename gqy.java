/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class gqy
implements gqw {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(gra.class, gqx.class, "currentMetadata");

    @Override
    public final gqx a(gra gra2) {
        return (gqx)this.a.get(gra2);
    }

    @Override
    public final boolean b(gra gra2, gqx gqx2, gqx gqx3) {
        return a.g(this.a, gra2, gqx2, gqx3);
    }
}

