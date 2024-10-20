/*
 * Decompiled with CFR 0.152.
 */
public final class bci
extends avp {
    public static final bci c = new bci();

    private bci() {
        super(3, 4);
    }

    @Override
    public final void a(awl awl2) {
        awl2.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}

