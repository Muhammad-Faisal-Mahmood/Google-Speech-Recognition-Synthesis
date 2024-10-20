/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;

public final class bbg
extends AmbientLifecycleObserverKt {
    public final bas a;

    public bbg() {
        this(bas.a);
    }

    public bbg(bas bas2) {
        this.a = bas2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (bbg)object;
            return this.a.equals(((bbg)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3016889 + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Success {mOutputData=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

