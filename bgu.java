/*
 * Decompiled with CFR 0.152.
 */
final class bgu
extends atw {
    public bgu(aum aum2) {
        super(aum2);
    }

    @Override
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}

