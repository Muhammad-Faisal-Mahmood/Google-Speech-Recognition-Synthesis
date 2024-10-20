/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.ProxyInfo
 *  android.net.Uri
 */
import android.net.ProxyInfo;
import android.net.Uri;
import java.util.Locale;

public final class kpg {
    public static final kpg a = new kpg("", 0, "", new String[0]);
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;

    public kpg(String string, int n2, String string2, String[] stringArray) {
        this.b = string;
        this.c = n2;
        this.d = string2;
        this.e = stringArray;
    }

    public static kpg a(ProxyInfo proxyInfo) {
        String string;
        String string2 = null;
        if (proxyInfo == null) {
            return null;
        }
        String string3 = string = proxyInfo.getHost();
        if (string == null) {
            string3 = "";
        }
        string = proxyInfo.getPacFileUrl();
        int n2 = proxyInfo.getPort();
        if (!Uri.EMPTY.equals((Object)string)) {
            string2 = string.toString();
        }
        return new kpg(string3, n2, string2, proxyInfo.getExclusionList());
    }

    public final String toString() {
        String string = !this.b.equals("localhost") && !this.b.isEmpty() ? "<redacted>" : this.b;
        Locale locale = Locale.US;
        int n2 = this.c;
        String string2 = this.d == null ? "null" : "\"<redacted>\"";
        return String.format(locale, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", string, n2, string2);
    }
}

