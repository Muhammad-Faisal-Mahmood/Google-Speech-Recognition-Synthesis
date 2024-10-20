/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;

public final class bbm
extends AmbientLifecycleObserverKt {
    private final Throwable a;

    public bbm(Throwable throwable) {
        this.a = throwable;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FAILURE (");
        stringBuilder.append(this.a.getMessage());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

