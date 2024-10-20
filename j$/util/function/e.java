/*
 * Decompiled with CFR 0.152.
 */
package j$.util.function;

import j$.nio.file.attribute.a;
import java.util.function.IntConsumer;

public final class e
implements IntConsumer {
    public final IntConsumer a;
    public final IntConsumer b;

    public /* synthetic */ e(IntConsumer intConsumer, IntConsumer intConsumer2) {
        this.a = intConsumer;
        this.b = intConsumer2;
    }

    @Override
    public final void accept(int n2) {
        this.a.accept(n2);
        this.b.accept(n2);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }
}

