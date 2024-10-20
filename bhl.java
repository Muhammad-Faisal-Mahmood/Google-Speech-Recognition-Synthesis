/*
 * Decompiled with CFR 0.152.
 */
final class bhl
extends aup {
    public bhl(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}

