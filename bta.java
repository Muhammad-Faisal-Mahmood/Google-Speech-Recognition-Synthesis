/*
 * Decompiled with CFR 0.152.
 */
public final class bta
extends Exception {
    public final int a;

    public bta() {
        this.a = 2;
    }

    public bta(Throwable throwable) {
        super("Failed to sync packs", throwable);
        this.a = 2;
    }

    @Override
    public final String getMessage() {
        int n2 = this.a;
        String string = super.getMessage();
        String string2 = n2 != 1 ? (n2 != 2 ? "null" : "SYNC_PACK_FAILED") : "PACK_NOT_FOUND";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (Reason=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

