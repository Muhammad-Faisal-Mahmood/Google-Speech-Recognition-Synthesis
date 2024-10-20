/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;

public final class jav
extends iuy {
    public ScheduledExecutorService a;
    public final koc b;
    public final jfy c;
    public int d = 0x400000;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public final dml i = jjv.i;

    public jav(String string, int n2, koc koc2) {
        this.c = new jfy(InetSocketAddress.createUnresolved(string, n2), jeb.d(string, n2), new jki(this, 1));
        a.s(koc2, "cronetEngine");
        this.b = koc2;
    }

    @Override
    public final kmp j() {
        return this.c;
    }
}

