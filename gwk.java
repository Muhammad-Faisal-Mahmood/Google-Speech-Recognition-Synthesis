/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.ReferenceQueue;

final class gwk
extends gvv {
    final int b;

    public gwk(ReferenceQueue referenceQueue, Object object, gws gws2, int n2) {
        super(referenceQueue, object, gws2);
        this.b = n2;
    }

    @Override
    public final int a() {
        return this.b;
    }

    @Override
    public final gwd b(ReferenceQueue referenceQueue, Object object, gws gws2) {
        return new gwk(referenceQueue, object, gws2, this.b);
    }
}

