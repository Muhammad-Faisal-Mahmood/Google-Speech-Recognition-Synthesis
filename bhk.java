/*
 * Decompiled with CFR 0.152.
 */
final class bhk
extends aup {
    public bhk(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}

