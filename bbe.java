/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;

public final class bbe
extends AmbientLifecycleObserverKt {
    public final bas a;

    public bbe() {
        bas bas2 = bas.a;
        this.a = bas2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (bbe)object;
            return this.a.equals(((bbe)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3016827 + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Failure {mOutputData=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

