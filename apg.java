/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class apg
extends IOException {
    public apg(Throwable throwable) {
        String string = throwable.getClass().getSimpleName();
        String string2 = throwable.getMessage() != null ? ": ".concat(String.valueOf(throwable.getMessage())) : "";
        StringBuilder stringBuilder = new StringBuilder("Unexpected ");
        stringBuilder.append(string);
        stringBuilder.append(string2);
        super(stringBuilder.toString(), throwable);
    }
}

