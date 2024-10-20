/*
 * Decompiled with CFR 0.152.
 */
final class bgx
extends atw {
    public bgx(aum aum2) {
        super(aum2);
    }

    @Override
    protected final String a() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}

