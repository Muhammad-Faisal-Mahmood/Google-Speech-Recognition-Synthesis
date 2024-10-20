/*
 * Decompiled with CFR 0.152.
 */
final class bgp
extends aup {
    public bgp(aum aum2) {
        super(aum2);
    }

    @Override
    public final String a() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}

