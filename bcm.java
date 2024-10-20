/*
 * Decompiled with CFR 0.152.
 */
public final class bcm
extends avp {
    public static final bcm c = new bcm();

    private bcm() {
        super(8, 9);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}

