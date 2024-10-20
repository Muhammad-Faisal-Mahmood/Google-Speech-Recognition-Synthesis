/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.ToIntFunction;

public final class cmm
implements ToIntFunction {
    public final int applyAsInt(Object object) {
        return ((Map)object).size();
    }
}

