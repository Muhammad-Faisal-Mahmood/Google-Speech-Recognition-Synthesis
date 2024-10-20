/*
 * Decompiled with CFR 0.152.
 */
final class bhi
extends aup {
    public bhi(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}

