/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.nio.file.attribute.a;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final class v
implements IntConsumer {
    public final Consumer a;

    public /* synthetic */ v(Consumer consumer) {
        this.a = consumer;
    }

    @Override
    public final void accept(int n2) {
        this.a.accept(n2);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }
}

