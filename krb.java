/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

public final class krb
implements Runnable {
    public Object a;
    final Object b;
    private final int c;

    public krb(kbg kbg2, Runnable runnable, int n2) {
        this.c = n2;
        this.b = kbg2;
        this.a = runnable;
    }

    public krb(CronetUrlRequest cronetUrlRequest, int n2) {
        this.c = n2;
        this.b = cronetUrlRequest;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        Object object2;
        if (this.c != 0) {
            Object object3;
            int n2;
            int n3 = 0;
            do {
                try {
                    this.a.run();
                }
                catch (Throwable throwable) {
                    jvf.i(jqg.a, throwable);
                }
                object3 = ((kbg)this.b).e();
                if (object3 == null) {
                    return;
                }
                this.a = object3;
                n3 = n2 = n3 + 1;
            } while (n2 < 16);
            object3 = this.b;
            ((kbg)object3).a.a((jqf)object3, this);
            return;
        }
        ((CronetUrlRequest)this.b).f();
        Object object4 = this.a;
        this.a = null;
        try {
            object2 = ((CronetUrlRequest)this.b).c;
            synchronized (object2) {
                object = this.b;
                if (!((CronetUrlRequest)object).m()) break block12;
            }
        }
        catch (Exception exception) {
            ((CronetUrlRequest)this.b).j(exception);
            return;
        }
        {
            block12: {
                return;
            }
            CronetUrlRequest.n((CronetUrlRequest)object);
        }
        {
            Object object5 = this.b;
            object2 = ((CronetUrlRequest)object5).e;
            object = ((CronetUrlRequest)object5).h;
            ((ksj)object2).b((kpt)object5, (kpv)object, (ByteBuffer)object4);
            return;
        }
    }
}

