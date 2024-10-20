/*
 * Decompiled with CFR 0.152.
 */
final class bhf
extends aup {
    public bhf(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}

