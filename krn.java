/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class krn
implements krt {
    public final krs a;
    public final ByteBuffer b;

    public /* synthetic */ krn(krs krs2, ByteBuffer byteBuffer) {
        this.a = krs2;
        this.b = byteBuffer;
    }

    @Override
    public final void a() {
        int n2;
        Object object = this.a;
        Object object2 = ((krs)object).n;
        Object object3 = this.b;
        if (object2 != null) {
            ++((krs)object).u;
            n2 = object2.read((ByteBuffer)object3);
        } else {
            n2 = -1;
        }
        if (n2 != -1) {
            object2 = ((krs)object).b;
            ((krq)object2).a(new krp((krq)object2, ((krs)object).x, object3, 1));
            return;
        }
        object3 = ((krs)object).n;
        if (object3 != null) {
            object3.close();
        }
        if (((krs)object).g.compareAndSet(5, 7)) {
            ((krs)object).j();
            object3 = ((krs)object).b;
            object = new kot(object3, ((krs)object).x, 15);
            ((krq)object3).b.execute((Runnable)object);
        }
    }
}

