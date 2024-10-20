/*
 * Decompiled with CFR 0.152.
 */
import org.chromium.net.impl.CronetBidirectionalStream;

public final class jdj
implements Runnable {
    final boolean a;
    final Object b;
    private final int c;

    public /* synthetic */ jdj(fff fff2, boolean bl2, int n2) {
        this.c = n2;
        this.b = fff2;
        this.a = bl2;
    }

    public jdj(jdk jdk2, boolean bl2, int n2) {
        this.c = n2;
        this.a = bl2;
        this.b = jdk2;
    }

    public jdj(CronetBidirectionalStream cronetBidirectionalStream, boolean bl2, int n2) {
        this.c = n2;
        this.b = cronetBidirectionalStream;
        this.a = bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block11: {
            var1_1 = this.c;
            if (var1_1 == 0) break block11;
            if (var1_1 == 1) {
                ((fff)this.b).a.c.a(this.a);
                return;
            }
            var3_2 = ((CronetBidirectionalStream)this.b).s;
            synchronized (var3_2) {
                var4_5 = this.b;
                if (((CronetBidirectionalStream)var4_5).k()) {
                    return;
                }
                ((CronetBidirectionalStream)var4_5).w = var2_6 = this.a;
                ((CronetBidirectionalStream)var4_5).B = 2;
                if (CronetBidirectionalStream.j(((CronetBidirectionalStream)var4_5).e)) ** GOTO lbl-1000
                var4_5 = this.b;
                if (((CronetBidirectionalStream)var4_5).w) {
                    ((CronetBidirectionalStream)var4_5).C = 10;
                } else lbl-1000:
                // 2 sources

                {
                    ((CronetBidirectionalStream)this.b).C = 8;
                }
            }
            try {
                var3_2 = this.b;
                ((CronetBidirectionalStream)var3_2).b.f((knz)var3_2);
                return;
            }
            catch (Exception var3_3) {
                ((CronetBidirectionalStream)this.b).h(var3_3);
                return;
            }
        }
        if (this.a) {
            var3_4 = ((jdk)this.b).b;
            var3_4.o = true;
            if (var3_4.l > 0L) {
                var3_4 = var3_4.n;
                var3_4.c();
                var3_4.d();
            }
        }
        ((jdk)this.b).b.q = false;
    }
}

