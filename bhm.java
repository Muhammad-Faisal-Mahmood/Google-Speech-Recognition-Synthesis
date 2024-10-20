/*
 * Decompiled with CFR 0.152.
 */
final class bhm
extends aup {
    public bhm(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
}

