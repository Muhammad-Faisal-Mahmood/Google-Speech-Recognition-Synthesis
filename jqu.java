/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jqu
implements Serializable {
    private static final long serialVersionUID = 0L;
    private final Class a;

    public jqu(Enum[] object) {
        jse.e(object, "entries");
        object = object.getClass().getComponentType();
        jse.b(object);
        this.a = object;
    }

    private final Object readResolve() {
        T[] TArray = this.a.getEnumConstants();
        jse.d(TArray, "getEnumConstants(...)");
        return jsd.h((Enum[])TArray);
    }
}

