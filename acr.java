/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class acr {
    public final Map b = new LinkedHashMap();

    public abstract Object a(acq var1);

    public final boolean equals(Object object) {
        return object instanceof acr && jse.i(this.b, ((acr)object).b);
    }

    public final int hashCode() {
        return ((Object)this.b).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CreationExtras(extras=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

