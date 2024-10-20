/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class jsf
implements Serializable,
jsb {
    private final int a;

    public jsf(int n2) {
        this.a = n2;
    }

    @Override
    public final int i() {
        return this.a;
    }

    public final String toString() {
        int n2 = jsk.a;
        String string = jsd.a(this);
        jse.d(string, "renderLambdaToString(...)");
        return string;
    }
}

