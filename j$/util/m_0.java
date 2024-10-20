/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.function.Consumer$_CC;
import j$.util.n;
import java.util.Map;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.m
 */
public final class m_0
implements Consumer {
    public final Consumer a;

    public /* synthetic */ m_0(Consumer consumer) {
        this.a = consumer;
    }

    public final void accept(Object object) {
        object = new n((Map.Entry)object);
        this.a.accept(object);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

