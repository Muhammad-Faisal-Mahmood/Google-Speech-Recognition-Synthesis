/*
 * Decompiled with CFR 0.152.
 */
public final class bdg
extends avp {
    public bdg() {
        super(17, 18);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        awl2.g("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}

