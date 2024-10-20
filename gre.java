/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class gre {
    private final hog a;

    public gre(hog hog2) {
        this.a = hog2;
    }

    public final gre a(hoe hoe2, Executor executor) {
        return new gre(this.a.a(gqk.f(hoe2), executor));
    }

    public final grf b() {
        return grf.g(this.a.i());
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("PropagatedClosingFuture[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

