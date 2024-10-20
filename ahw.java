/*
 * Decompiled with CFR 0.152.
 */
public final class ahw
extends IllegalStateException {
    public ahw(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder("Buffer too small (");
        stringBuilder.append(n2);
        stringBuilder.append(" < ");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        super(stringBuilder.toString());
    }
}

