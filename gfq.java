/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class gfq {
    public final String a;
    public final dup b;
    public final hqa c;
    public final gbq d;
    final cya e;

    public gfq(cya cya2, String string, dup dup2) {
        jse.e(string, "mendelPackage");
        jse.e(dup2, "commitProperties");
        this.e = cya2;
        this.a = string;
        this.b = dup2;
        this.c = new hqa();
        this.d = new gbq(new etu(cya2, this, 9), (Executor)cya2.e);
    }
}

