/*
 * Decompiled with CFR 0.152.
 */
final class hfb
extends hfe {
    final hfe a;
    final hfe b;

    public hfb(hfe hfe2, hfe hfe3) {
        this.a = hfe2;
        this.b = hfe3;
    }

    @Override
    public final void a() {
        try {
            this.a.a();
            return;
        }
        finally {
            this.b.a();
        }
    }
}

