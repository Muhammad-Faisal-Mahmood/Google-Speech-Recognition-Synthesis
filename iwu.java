/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

public final class iwu {
    private final iwp a;
    private final Object b;
    private volatile byte[] c;

    public iwu(iwp iwp2, Object object) {
        this.a = iwp2;
        this.b = object;
    }

    public static iwp a(iws iws2) {
        iws2 = iwp.class.isInstance(iws2.c) ? iwp.class.cast(iws2.c) : null;
        return (iwp)((Object)iws2);
    }

    public final InputStream b() {
        return this.a.a(this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final byte[] c() {
        if (this.c != null) return this.c;
        synchronized (this) {
            if (this.c != null) return this.c;
            this.c = iwx.k(this.b());
            return this.c;
        }
    }
}

