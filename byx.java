/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public final class byx {
    public static final hfn a = hfn.o("LPSettingsButtonAction");
    private final gbu b;
    private final byp c;

    public byx(gbu gbu2, byp byp2) {
        this.b = gbu2;
        this.c = byp2;
    }

    public final void a(byv byv2, Locale object, int n2) {
        object = new bzb(this.c.a((Locale)object, n2));
        this.b.c((bzb)object, byv2);
    }

    public final void b(byw byw2, Locale object) {
        object = new bzb(this.c.c((Locale)object));
        this.b.c((bzb)object, byw2);
    }
}

