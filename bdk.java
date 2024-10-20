/*
 * Decompiled with CFR 0.152.
 */
public final class bdk
extends avp {
    public bdk() {
        super(22, 23);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}

