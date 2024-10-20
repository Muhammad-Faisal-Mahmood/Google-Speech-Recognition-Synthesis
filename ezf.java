/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class ezf {
    public final Optional a;

    public ezf() {
        throw null;
    }

    public ezf(Optional optional) {
        if (optional != null) {
            this.a = optional;
            return;
        }
        throw new NullPointerException("Null downloadConditions");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ezf) {
            object = (ezf)object;
            return this.a.equals(((ezf)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("ForegroundDownloadParams{downloadConditions=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

