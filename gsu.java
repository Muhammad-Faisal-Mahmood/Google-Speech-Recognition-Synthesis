/*
 * Decompiled with CFR 0.152.
 */
public final class gsu
extends gsy {
    final gsy a;

    public gsu(gsy gsy2) {
        this.a = gsy2;
    }

    @Override
    public final boolean b(char c2) {
        return !this.a.b(c2);
    }

    public final String toString() {
        return ((gst)this.a).b.concat(".negate()");
    }
}

