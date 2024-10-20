/*
 * Decompiled with CFR 0.152.
 */
final class bhs
extends aup {
    public bhs(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}

