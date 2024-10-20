/*
 * Decompiled with CFR 0.152.
 */
public final class bcl
extends avp {
    public static final bcl c = new bcl();

    private bcl() {
        super(7, 8);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}

