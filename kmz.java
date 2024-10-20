/*
 * Decompiled with CFR 0.152.
 */
public final class kmz
extends RuntimeException {
    public kmz(String string, Throwable throwable) {
        String string2 = System.lineSeparator();
        StringBuilder stringBuilder = new StringBuilder("Native stack trace:");
        stringBuilder.append(string2);
        stringBuilder.append(string);
        super(stringBuilder.toString(), throwable);
    }
}

