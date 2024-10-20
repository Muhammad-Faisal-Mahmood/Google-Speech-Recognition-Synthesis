/*
 * Decompiled with CFR 0.152.
 */
final class bgd
extends atw {
    public bgd(aum aum2) {
        super(aum2);
    }

    @Override
    protected final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}

