/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class jcp
implements jcr {
    private final int a;

    public jcp(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ int a(jhg jhg2, int n2, Object object, int n3) {
        int n4 = this.a;
        if (n4 != 0) {
            if (n4 != 1) {
                if (n4 != 2) {
                    object = (ByteBuffer)object;
                    n3 = ((Buffer)object).limit();
                    ((Buffer)object).limit(((Buffer)object).position() + n2);
                    jhg2.i((ByteBuffer)object);
                    ((Buffer)object).limit(n3);
                    return 0;
                }
                jhg2.k((byte[])object, n3, n2);
                return n3 + n2;
            }
            object = (Void)object;
            return jhg2.e();
        }
        object = (Void)object;
        jhg2.l(n2);
        return 0;
    }
}

