/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

public final class hpf {
    public boolean a = false;
    public boolean b = true;
    public final AtomicInteger c;
    public final hpn[] d;
    public volatile int e = 0;

    public hpf(hpn[] hpnArray) {
        this.d = hpnArray;
        this.c = new AtomicInteger(hpnArray.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (hpn hpn2 : this.d) {
                if (hpn2 == null) continue;
                hpn2.cancel(this.b);
            }
        }
    }
}

