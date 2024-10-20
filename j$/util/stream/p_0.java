/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.I;
import j$.util.stream.w0_0;
import java.util.function.Consumer;

/*
 * Renamed from j$.util.stream.p
 */
abstract class p_0
implements w0_0 {
    boolean a;
    Object b;

    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        if (!this.a) {
            this.a = true;
            this.b = object;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
    }

    @Override
    public final /* synthetic */ void e(long l2) {
    }

    @Override
    public final boolean j() {
        return this.a;
    }
}

