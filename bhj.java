/*
 * Decompiled with CFR 0.152.
 */
final class bhj
extends aup {
    public bhj(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}

