/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dalvik.system.PathClassLoader
 */
import dalvik.system.PathClassLoader;

final class chd
extends PathClassLoader {
    public chd(String string, ClassLoader classLoader) {
        super(string, classLoader);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final Class loadClass(String string, boolean bl2) {
        if (string.startsWith("java.")) return super.loadClass(string, bl2);
        if (string.startsWith("android.")) return super.loadClass(string, bl2);
        try {
            return this.findClass(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return super.loadClass(string, bl2);
        }
    }
}

