/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;

public final class of
extends oh
implements Iterator {
    final oi a;
    private oe b;
    private boolean c;

    public of(oi oi2) {
        this.a = oi2;
        this.c = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Map.Entry a() {
        oe oe2;
        if (this.c) {
            this.c = false;
            oe2 = this.a.b;
        } else {
            oe2 = this.b;
            oe2 = oe2 != null ? oe2.c : null;
        }
        this.b = oe2;
        return this.b;
    }

    @Override
    public final void aR(oe oe2) {
        oe oe3 = this.b;
        if (oe2 == oe3) {
            this.b = oe2 = oe3.d;
            boolean bl2 = oe2 == null;
            this.c = bl2;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        oe oe2 = this.b;
        return oe2 != null && oe2.c != null;
    }
}

