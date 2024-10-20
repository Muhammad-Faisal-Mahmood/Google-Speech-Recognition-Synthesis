/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketTimeoutException;

public final class kjr
extends kll {
    final kjs a;

    public kjr(kjs kjs2) {
        this.a = kjs2;
    }

    @Override
    protected final void a() {
        this.a.h(kiq.i);
        kjl kjl2 = this.a.b;
        synchronized (kjl2) {
            block4: {
                long l2 = kjl2.n;
                long l3 = kjl2.m;
                if (l2 < l3) break block4;
                kjl2.m = l3 + 1L;
                kjl2.p = System.nanoTime() + 1000000000L;
                // MONITOREXIT @DISABLED, blocks:[1, 2] lbl11 : MonitorExitStatement: MONITOREXIT : var5_1
                kjl2.i.f(new kji(String.valueOf(kjl2.d).concat(" ping"), kjl2));
                return;
            }
            return;
        }
    }

    public final void b() {
        if (!this.f()) {
            return;
        }
        throw new SocketTimeoutException("timeout");
    }
}

