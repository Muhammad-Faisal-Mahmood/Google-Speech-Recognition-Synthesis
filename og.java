/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

public abstract class og
extends oh
implements Iterator {
    oe a;
    oe b;

    public og(oe oe2, oe oe3) {
        this.a = oe3;
        this.b = oe2;
    }

    private final oe d() {
        oe oe2 = this.b;
        oe oe3 = this.a;
        if (oe2 != oe3 && oe3 != null) {
            return this.b(oe2);
        }
        return null;
    }

    public abstract oe a(oe var1);

    @Override
    public final void aR(oe oe2) {
        oe oe3;
        if (this.a == oe2 && oe2 == this.b) {
            this.b = null;
            this.a = null;
        }
        if ((oe3 = this.a) == oe2) {
            this.a = this.a(oe3);
        }
        if (this.b == oe2) {
            this.b = this.d();
        }
    }

    public abstract oe b(oe var1);

    public final Map.Entry c() {
        oe oe2 = this.b;
        this.b = this.d();
        return oe2;
    }

    @Override
    public final boolean hasNext() {
        return this.b != null;
    }
}

