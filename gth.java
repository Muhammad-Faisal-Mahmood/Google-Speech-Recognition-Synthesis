/*
 * Decompiled with CFR 0.152.
 */
public final class gth
extends gtk {
    final String a;
    final gtk b;

    public gth(gtk gtk2, gtk gtk3) {
        this.a = "";
        this.b = gtk2;
        super(gtk3);
    }

    @Override
    public final CharSequence a(Object object) {
        object = object == null ? this.a : this.b.a(object);
        return object;
    }
}

