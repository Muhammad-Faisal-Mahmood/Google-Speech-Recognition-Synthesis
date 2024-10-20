/*
 * Decompiled with CFR 0.152.
 */
public final class cdb
extends UnsupportedOperationException {
    private final cbm a;

    public cdb(cbm cbm2) {
        this.a = cbm2;
    }

    @Override
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.a)));
    }
}

