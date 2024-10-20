/*
 * Decompiled with CFR 0.152.
 */
public final class epo
extends jqo {
    public Object a;
    final epp b;
    public int c;

    public epo(epp epp2, jqb jqb2) {
        this.b = epp2;
        super(jqb2);
    }

    @Override
    public final Object a(Object object) {
        this.a = object;
        this.c |= Integer.MIN_VALUE;
        return cqq.ak(this.b, this);
    }
}

