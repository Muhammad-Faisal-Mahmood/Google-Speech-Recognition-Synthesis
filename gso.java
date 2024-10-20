/*
 * Decompiled with CFR 0.152.
 */
public final class gso
extends gst {
    public static final gsy a = new gso();

    public gso() {
        super("CharMatcher.ascii()");
    }

    @Override
    public final boolean b(char c2) {
        return c2 <= '\u007f';
    }
}

