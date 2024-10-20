/*
 * Decompiled with CFR 0.152.
 */
public final class bcd
extends avp {
    public static final bcd c = new bcd();

    private bcd() {
        super(11, 12);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}

