/*
 * Decompiled with CFR 0.152.
 */
final class jan
extends Enum {
    public static final /* enum */ jan a;
    public static final /* enum */ jan b;
    public static final /* enum */ jan c;
    private static final jan[] e;
    public final String d;

    static {
        jan jan2;
        jan jan3;
        jan jan4;
        a = jan4 = new jan("BIND_SERVICE", 0, "bindService");
        b = jan3 = new jan("BIND_SERVICE_AS_USER", 1, "bindServiceAsUser");
        c = jan2 = new jan("DEVICE_POLICY_BIND_SEVICE_ADMIN", 2, "DevicePolicyManager.bindDeviceAdminServiceAsUser");
        e = new jan[]{jan4, jan3, jan2};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jan() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.d = var3_2;
    }

    public static jan[] values() {
        return (jan[])e.clone();
    }
}

