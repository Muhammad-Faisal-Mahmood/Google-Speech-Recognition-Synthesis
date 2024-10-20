/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dalvik.system.PathClassLoader
 */
import com.android.car.ui.pluginsupport.OemApiUtil;
import dalvik.system.PathClassLoader;
import java.util.regex.Pattern;

final class bjz
extends PathClassLoader {
    private static final Pattern a;
    private static final Pattern b;
    private final ClassLoader c;

    static {
        String string = Pattern.quote(OemApiUtil.class.getName());
        String string2 = Pattern.quote(bka.class.getName());
        StringBuilder stringBuilder = new StringBuilder("^com\\.android\\.car\\.ui\\..*AdapterV[0-9]+(\\$.*)?$|Lambda|^");
        stringBuilder.append(string);
        stringBuilder.append("|^");
        stringBuilder.append(string2);
        stringBuilder.append("$");
        a = Pattern.compile(stringBuilder.toString());
        b = Pattern.compile("^com\\.android\\.car\\.ui\\.plugin\\.(oemapis\\..*|PluginVersionProviderImpl)$");
    }

    public bjz(String string, String string2, ClassLoader classLoader, ClassLoader classLoader2) {
        super(string, string2, classLoader);
        this.c = classLoader2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final Class loadClass(String clazz, boolean bl2) {
        Class<?> clazz2 = this.findLoadedClass((String)((Object)clazz));
        if (clazz2 != null) {
            return clazz2;
        }
        try {
            return Object.class.getClassLoader().loadClass((String)((Object)clazz));
        }
        catch (ClassNotFoundException classNotFoundException) {
            Class<?> clazz3;
            Class<?> clazz4 = clazz3 = null;
            if (clazz != null) {
                clazz4 = clazz3;
                if (a.matcher((CharSequence)((Object)clazz)).find()) {
                    try {
                        return this.findClass((String)((Object)clazz));
                    }
                    catch (ClassNotFoundException classNotFoundException2) {
                        // empty catch block
                    }
                }
            }
            if (this.c != null && b.matcher((CharSequence)((Object)clazz)).matches()) {
                try {
                    return this.c.loadClass((String)((Object)clazz));
                }
                catch (ClassNotFoundException classNotFoundException3) {}
            }
            try {
                return this.getParent().loadClass((String)((Object)clazz));
            }
            catch (ClassNotFoundException classNotFoundException4) {
                if (clazz4 != null) throw clazz4;
                throw classNotFoundException4;
            }
        }
    }
}

