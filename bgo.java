/*
 * Decompiled with CFR 0.152.
 */
final class bgo
extends atw {
    public bgo(aum aum2) {
        super(aum2);
    }

    @Override
    protected final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}

