/*
 * Decompiled with CFR 0.152.
 */
final class eoz
extends jqo {
    Object a;
    final epa b;
    int c;
    epa d;
    jur e;

    public eoz(epa epa2, jqb jqb2) {
        this.b = epa2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}

