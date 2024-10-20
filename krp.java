/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class krp
implements krt {
    public final krq a;
    public final kpv b;
    public final Object c;
    private final int d;

    public /* synthetic */ krp(krq krq2, kpv kpv2, Object object, int n2) {
        this.d = n2;
        this.a = krq2;
        this.b = kpv2;
        this.c = object;
    }

    @Override
    public final void a() {
        if (this.d != 0) {
            krq krq2 = this.a;
            if (krq2.d.g.compareAndSet(5, 4)) {
                Object object = this.c;
                kpv kpv2 = this.b;
                krq2.a.b(krq2.d, kpv2, (ByteBuffer)object);
            }
            return;
        }
        krq krq3 = this.a;
        Object object = this.c;
        krs krs2 = krq3.d;
        kpv kpv3 = this.b;
        object = (String)object;
        krq3.a.c(krs2, kpv3, (String)object);
    }
}

