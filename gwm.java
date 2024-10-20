/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.ReferenceQueue;

final class gwm
extends gwi {
    final int b;

    public gwm(ReferenceQueue referenceQueue, Object object, gws gws2, int n2) {
        super(referenceQueue, object, gws2);
        this.b = n2;
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final gwd b(ReferenceQueue referenceQueue, Object object, gws gws2) {
        return new gwm(referenceQueue, object, gws2, this.b);
    }
}

