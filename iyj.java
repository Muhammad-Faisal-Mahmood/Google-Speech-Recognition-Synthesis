/*
 * Decompiled with CFR 0.152.
 */
public final class iyj
extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final iyh a;
    public final iwx b;

    public iyj(iyh iyh2) {
        this(iyh2, null);
    }

    public iyj(iyh iyh2, iwx iwx2) {
        this(iyh2, iwx2, true);
    }

    public iyj(iyh iyh2, iwx iwx2, boolean bl2) {
        super(iyh.f(iyh2), iyh2.p, true, bl2);
        this.a = iyh2;
        this.b = iwx2;
    }
}

