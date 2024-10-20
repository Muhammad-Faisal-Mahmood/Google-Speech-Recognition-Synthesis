/*
 * Decompiled with CFR 0.152.
 */
final class bhv
extends aup {
    public bhv(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}

