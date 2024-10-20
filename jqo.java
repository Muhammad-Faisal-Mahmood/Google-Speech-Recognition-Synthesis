/*
 * Decompiled with CFR 0.152.
 */
public abstract class jqo
extends jqm {
    private final jqf a;
    public transient jqb l;

    public jqo(jqb jqb2) {
        jqf jqf2 = jqb2 != null ? jqb2.d() : null;
        this(jqb2, jqf2);
    }

    public jqo(jqb jqb2, jqf jqf2) {
        super(jqb2);
        this.a = jqf2;
    }

    @Override
    public jqf d() {
        jqf jqf2 = this.a;
        jse.b(jqf2);
        return jqf2;
    }

    @Override
    protected void g() {
        jqb jqb2 = this.l;
        if (jqb2 != null && jqb2 != this) {
            jqd jqd2 = this.d().get(jqc.b);
            jse.b(jqd2);
            ((jqc)jqd2).d(jqb2);
        }
        this.l = jqn.a;
    }
}

