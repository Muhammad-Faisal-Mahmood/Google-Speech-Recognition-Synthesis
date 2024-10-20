/*
 * Decompiled with CFR 0.152.
 */
public final class dhk
extends Exception {
    public dhk(den object, String string) {
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("No validator available for ");
        stringBuilder.append((String)object);
        stringBuilder.append(", scheme: ");
        stringBuilder.append(string);
        super(stringBuilder.toString());
    }
}

