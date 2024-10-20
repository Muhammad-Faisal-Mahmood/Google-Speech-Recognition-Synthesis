/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class kql
implements Runnable {
    final CronetBidirectionalStream a;
    private ByteBuffer b;
    private final boolean c;

    public kql(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean bl2) {
        this.a = cronetBidirectionalStream;
        this.b = byteBuffer;
        this.c = bl2;
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
            byteBuffer = this.b;
            this.b = null;
            object = this.a.s;
            synchronized (object) {
                cronetBidirectionalStream = this.a;
                if (!cronetBidirectionalStream.k()) break block10;
            }
        }
        catch (Exception exception) {
            this.a.h(exception);
            return;
        }
        {
            boolean bl3;
            block10: {
                return;
            }
            boolean bl4 = this.c;
            bl2 = bl3 = false;
            if (bl4) {
                cronetBidirectionalStream.C = 10;
                bl2 = bl3;
                if (cronetBidirectionalStream.B == 4) {
                    bl2 = true;
                }
            }
        }
        {
            object = this.a;
            ((CronetBidirectionalStream)object).b.h((knz)object, ((CronetBidirectionalStream)object).D, byteBuffer, this.c);
            if (bl2) {
                this.a.f();
            }
            return;
        }
    }
}

