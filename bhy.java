/*
 * Decompiled with CFR 0.152.
 */
final class bhy
extends atw {
    public bhy(aum aum2) {
        super(aum2);
    }

    @Override
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}

