/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.Locale;

public final class tt {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            sk$$ExternalSyntheticApiModelOutline1.m(30);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            sk$$ExternalSyntheticApiModelOutline1.m(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            sk$$ExternalSyntheticApiModelOutline1.m(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            sk$$ExternalSyntheticApiModelOutline1.m(1000000);
        }
    }

    public static final boolean a(String string, String string2) {
        jse.e(string2, "buildCodename");
        if (jse.i("REL", string2)) {
            return false;
        }
        string2 = string2.toUpperCase(Locale.ROOT);
        jse.d(string2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        string = string.toUpperCase(Locale.ROOT);
        jse.d(string, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return string2.compareTo(string) >= 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b() {
        boolean bl2;
        int n2 = Build.VERSION.SDK_INT;
        boolean bl3 = bl2 = true;
        if (n2 >= 31) return bl3;
        if (Build.VERSION.SDK_INT < 30) return false;
        String string = Build.VERSION.CODENAME;
        jse.d(string, "CODENAME");
        if (!tt.a("S", string)) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean c() {
        boolean bl2;
        int n2 = Build.VERSION.SDK_INT;
        boolean bl3 = bl2 = true;
        if (n2 >= 33) return bl3;
        if (Build.VERSION.SDK_INT < 32) return false;
        String string = Build.VERSION.CODENAME;
        jse.d(string, "CODENAME");
        if (!tt.a("Tiramisu", string)) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean d() {
        boolean bl2;
        int n2 = Build.VERSION.SDK_INT;
        boolean bl3 = bl2 = true;
        if (n2 >= 34) return bl3;
        if (Build.VERSION.SDK_INT < 33) return false;
        String string = Build.VERSION.CODENAME;
        jse.d(string, "CODENAME");
        if (!tt.a("UpsideDownCake", string)) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean e() {
        boolean bl2;
        int n2 = Build.VERSION.SDK_INT;
        boolean bl3 = bl2 = true;
        if (n2 >= 35) return bl3;
        if (Build.VERSION.SDK_INT < 34) return false;
        String string = Build.VERSION.CODENAME;
        jse.d(string, "CODENAME");
        if (!tt.a("VanillaIceCream", string)) return false;
        return bl2;
    }
}

