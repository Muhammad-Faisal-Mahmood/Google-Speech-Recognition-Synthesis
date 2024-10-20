/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.Context;
import android.net.Uri;

public final class dtx {
    public static final int a = 0;
    private static final ot b = new ot();

    private dtx() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(String string) {
        synchronized (dtx.class) {
            ot ot2 = b;
            Uri uri = (Uri)ot2.get(string);
            if (uri == null) {
                uri = Uri.parse((String)"content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode((String)string))));
                ot2.put(string, uri);
                return uri;
            }
            return uri;
        }
    }

    public static String b(String string) {
        int n2 = string.indexOf("#");
        if (n2 < 0) {
            if (!string.contains("@")) {
                return string;
            }
            throw new IllegalArgumentException("Invalid package name: ".concat(String.valueOf(string)));
        }
        return string.substring(0, n2);
    }

    public static String c(Context object, String string) {
        if (!string.contains("#")) {
            String string2 = object.getPackageName();
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("#");
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(string)));
    }
}

