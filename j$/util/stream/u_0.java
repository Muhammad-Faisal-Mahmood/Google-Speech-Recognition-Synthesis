/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.stream.B0;
import java.util.function.IntConsumer;

/*
 * Renamed from j$.util.stream.u
 */
public final class u_0
implements IntConsumer {
    public final B0 a;

    public /* synthetic */ u_0(B0 b0) {
        this.a = b0;
    }

    @Override
    public final void accept(int n2) {
        this.a.accept(n2);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }
}

