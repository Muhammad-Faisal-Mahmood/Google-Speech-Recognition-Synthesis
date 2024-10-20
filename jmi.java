/*
 * Decompiled with CFR 0.152.
 */
public final class jmi
implements iwz {
    private static final ThreadLocal b = new ThreadLocal();
    public final hyf a;
    private final hym c;

    public jmi(hyf hyf2) {
        a.s(hyf2, "defaultInstance cannot be null");
        this.a = hyf2;
        this.c = hyf2.u();
    }
}

