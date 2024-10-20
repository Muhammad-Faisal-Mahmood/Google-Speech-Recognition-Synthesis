/*
 * Decompiled with CFR 0.152.
 */
final class bhg
extends aup {
    public bhg(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}

