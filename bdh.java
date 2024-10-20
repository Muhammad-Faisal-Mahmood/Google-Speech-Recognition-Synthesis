/*
 * Decompiled with CFR 0.152.
 */
public final class bdh
extends avp {
    public bdh() {
        super(18, 19);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}

