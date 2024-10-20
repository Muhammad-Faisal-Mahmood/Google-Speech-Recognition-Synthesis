/*
 * Decompiled with CFR 0.152.
 */
public final class dhj
extends Exception {
    public dhj(den object, String string) {
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("No unpacker available for ");
        stringBuilder.append((String)object);
        stringBuilder.append(" scheme: ");
        stringBuilder.append(string);
        super(stringBuilder.toString());
    }
}

