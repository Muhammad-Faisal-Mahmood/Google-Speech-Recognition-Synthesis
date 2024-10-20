/*
 * Decompiled with CFR 0.152.
 */
public final class bdj
extends avp {
    public bdj() {
        super(20, 21);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}

