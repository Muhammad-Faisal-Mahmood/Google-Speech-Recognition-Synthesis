/*
 * Decompiled with CFR 0.152.
 */
public final class bcj
extends avp {
    public static final bcj c = new bcj();

    private bcj() {
        super(4, 5);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        awl2.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}

