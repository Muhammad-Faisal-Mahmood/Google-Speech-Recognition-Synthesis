/*
 * Decompiled with CFR 0.152.
 */
package j$.adapter;

public abstract class a {
    public static final boolean a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2;
        try {
            Class.forName("java.util.StringJoiner");
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            bl2 = false;
        }
        a = bl2;
        try {
            Class.forName("java.nio.file.FileSystems");
        }
        catch (ClassNotFoundException classNotFoundException) {}
        try {
            Class.forName("android.os.Build");
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return;
        }
    }
}

