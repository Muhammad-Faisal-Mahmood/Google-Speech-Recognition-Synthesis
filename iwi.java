/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public abstract class iwi
extends ivx {
    public ixd b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object object) {
        return this == object;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("policy", this.c());
        gtn2.e("priority", 5);
        gtn2.g("available", true);
        return gtn2.toString();
    }
}

