/*
 * Decompiled with CFR 0.152.
 */
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class kgm {
    public static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String b;
    public final String c;
    public final int d;
    public final List e;
    public final boolean f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public kgm(String string, String string2, String string3, String string4, int n2, List list, String string5, String string6) {
        jse.e(string2, "username");
        jse.e(string3, "password");
        this.b = string;
        this.g = string2;
        this.h = string3;
        this.c = string4;
        this.d = n2;
        this.e = list;
        this.i = string5;
        this.j = string6;
        this.f = jse.i(string, "https");
    }

    public final String a() {
        if (this.h.length() == 0) {
            return "";
        }
        int n2 = jse.L(this.j, ':', this.b.length() + 3, 4);
        String string = this.j;
        string = string.substring(n2 + 1, jse.L(string, '@', 0, 6));
        jse.d(string, "substring(...)");
        return string;
    }

    public final String b() {
        int n2 = this.b.length();
        String string = this.j;
        n2 = jse.L(string, '/', n2 + 3, 4);
        int n3 = khb.b(string, "?#", n2, string.length());
        string = this.j.substring(n2, n3);
        jse.d(string, "substring(...)");
        return string;
    }

    public final String c() {
        if (this.e == null) {
            return null;
        }
        int n2 = jse.L(this.j, '?', 0, 6) + 1;
        String string = this.j;
        string = string.substring(n2, khb.a(string, '#', n2, string.length()));
        jse.d(string, "substring(...)");
        return string;
    }

    public final String d() {
        if (this.g.length() == 0) {
            return "";
        }
        String string = this.b;
        String string2 = this.j;
        int n2 = string.length() + 3;
        string2 = string2.substring(n2, khb.b(string2, ":@", n2, string2.length()));
        jse.d(string2, "substring(...)");
        return string2;
    }

    public final String e() {
        kgl kgl2 = this.i("/...");
        jse.b(kgl2);
        kgl2.b = jvf.w("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        kgl2.c = jvf.w("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return kgl2.a().j;
    }

    public final boolean equals(Object object) {
        return object instanceof kgm && jse.i(((kgm)object).j, this.j);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final URI f() {
        int n2;
        Object object = new kgl();
        ((kgl)object).a = this.b;
        Object object2 = this.d();
        jse.e(object2, "<set-?>");
        ((kgl)object).b = object2;
        object2 = this.a();
        jse.e(object2, "<set-?>");
        ((kgl)object).c = object2;
        ((kgl)object).d = this.c;
        int n3 = n2 = this.d;
        if (n2 == jvf.t(this.b)) {
            n3 = -1;
        }
        ((kgl)object).e = n3;
        ((kgl)object).f.clear();
        ((kgl)object).f.addAll(this.h());
        ((kgl)object).b(this.c());
        object2 = this.i;
        n2 = 0;
        Object var5_6 = null;
        if (object2 == null) {
            object2 = null;
        } else {
            n3 = jse.L(this.j, '#', 0, 6);
            object2 = this.j.substring(n3 + 1);
            jse.d(object2, "substring(...)");
        }
        ((kgl)object).h = object2;
        object2 = ((kgl)object).d;
        object2 = object2 != null ? new jtv("[\"<>^`{|}]").a((CharSequence)object2, "") : null;
        ((kgl)object).d = object2;
        int n4 = ((kgl)object).f.size();
        for (n3 = 0; n3 < n4; ++n3) {
            object2 = ((kgl)object).f;
            object2.set(n3, jvf.w((String)object2.get(n3), 0, 0, "[]", true, true, false, false, 227));
        }
        Object object3 = ((kgl)object).g;
        if (object3 != null) {
            n4 = object3.size();
            for (n3 = n2; n3 < n4; ++n3) {
                object2 = (String)object3.get(n3);
                object2 = object2 != null ? jvf.w((String)object2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null;
                object3.set(n3, object2);
            }
        }
        object3 = ((kgl)object).h;
        object2 = var5_6;
        if (object3 != null) {
            object2 = jvf.w((String)object3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        ((kgl)object).h = object2;
        object = ((kgl)object).toString();
        try {
            return new URI((String)object);
        }
        catch (URISyntaxException uRISyntaxException) {
            try {
                object2 = new jtv("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                return URI.create(((jtv)object2).a((CharSequence)object, ""));
            }
            catch (Exception exception) {
                throw new RuntimeException(uRISyntaxException);
            }
        }
    }

    public final URL g() {
        try {
            URL uRL = new URL(this.j);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            throw new RuntimeException(malformedURLException);
        }
    }

    public final List h() {
        int n2 = this.b.length();
        String string = this.j;
        n2 = jse.L(string, '/', n2 + 3, 4);
        int n3 = khb.b(string, "?#", n2, string.length());
        ArrayList<String> arrayList = new ArrayList<String>();
        while (n2 < n3) {
            int n4 = n2 + 1;
            n2 = khb.a(this.j, '/', n4, n3);
            string = this.j.substring(n4, n2);
            jse.d(string, "substring(...)");
            arrayList.add(string);
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final kgl i(String object) {
        try {
            kgl kgl2 = new kgl();
            kgl2.c(this, (String)object);
            object = kgl2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            object = null;
        }
        return object;
    }

    public final String toString() {
        return this.j;
    }
}

