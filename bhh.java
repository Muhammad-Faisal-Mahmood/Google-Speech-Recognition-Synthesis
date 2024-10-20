/*
 * Decompiled with CFR 0.152.
 */
final class bhh
extends aup {
    public bhh(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}

