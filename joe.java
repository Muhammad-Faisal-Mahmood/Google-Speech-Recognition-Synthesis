/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class joe
implements Serializable {
    public final Object a;

    public /* synthetic */ joe(Object object) {
        this.a = object;
    }

    public static final Throwable a(Object object) {
        if (object instanceof jod) {
            return ((jod)object).a;
        }
        return null;
    }

    public static final boolean b(Object object) {
        return !(object instanceof jod);
    }

    public final boolean equals(Object object) {
        return object instanceof joe && jse.i(this.a, ((joe)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object object = this.a;
        object = object instanceof jod ? object.toString() : a.ak(object, "Success(", ")");
        return object;
    }
}

