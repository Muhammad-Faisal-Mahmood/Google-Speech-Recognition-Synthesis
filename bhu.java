/*
 * Decompiled with CFR 0.152.
 */
final class bhu
extends aup {
    public bhu(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
    }
}

