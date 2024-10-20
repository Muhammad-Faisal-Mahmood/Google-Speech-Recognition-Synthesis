/*
 * Decompiled with CFR 0.152.
 */
public final class bck
extends avp {
    public static final bck c = new bck();

    private bck() {
        super(6, 7);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}

