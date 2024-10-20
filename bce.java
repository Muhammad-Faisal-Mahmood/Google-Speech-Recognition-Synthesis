/*
 * Decompiled with CFR 0.152.
 */
public final class bce
extends avp {
    public static final bce c = new bce();

    private bce() {
        super(12, 13);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        awl2.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}

