/*
 * Decompiled with CFR 0.152.
 */
final class bhr
extends aup {
    public bhr(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}

