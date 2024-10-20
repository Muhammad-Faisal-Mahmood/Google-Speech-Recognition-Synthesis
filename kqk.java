/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class kqk
implements Runnable {
    public ByteBuffer a;
    public boolean b;
    final CronetBidirectionalStream c;

    public kqk(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        boolean bl2;
        CronetBidirectionalStream cronetBidirectionalStream;
        Object object;
        ByteBuffer byteBuffer;
        try {
            byteBuffer = this.a;
            this.a = null;
            object = this.c.s;
            synchronized (object) {
                cronetBidirectionalStream = this.c;
                if (!cronetBidirectionalStream.k()) break block11;
            }
        }
        catch (Exception exception) {
            this.c.h(exception);
            return;
        }
        {
            block11: {
                return;
            }
            boolean bl3 = this.b;
            bl2 = false;
            if (bl3) {
                cronetBidirectionalStream.B = 4;
                if (cronetBidirectionalStream.C == 10) {
                    bl2 = true;
                }
            } else {
                cronetBidirectionalStream.B = 2;
            }
        }
        {
            object = this.c;
            ((CronetBidirectionalStream)object).b.c((knz)object, ((CronetBidirectionalStream)object).D, byteBuffer, this.b);
            if (bl2) {
                this.c.f();
            }
            return;
        }
    }
}

