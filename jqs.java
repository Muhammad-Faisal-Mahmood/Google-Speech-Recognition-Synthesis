/*
 * Decompiled with CFR 0.152.
 */
public abstract class jqs
extends jqo
implements jsb {
    private final int a;

    public jqs(int n2, jqb jqb2) {
        super(jqb2);
        this.a = n2;
    }

    @Override
    public final int i() {
        return this.a;
    }

    @Override
    public final String toString() {
        String string;
        if (this.k == null) {
            string = jsd.a(this);
            jse.d(string, "renderLambdaToString(...)");
        } else {
            string = super.toString();
        }
        return string;
    }
}

