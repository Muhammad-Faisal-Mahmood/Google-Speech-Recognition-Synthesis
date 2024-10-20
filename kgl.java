/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class kgl {
    public String a;
    public String b = "";
    public String c = "";
    public String d;
    public int e = -1;
    public final List f;
    public List g;
    public String h;

    public kgl() {
        ArrayList<String> arrayList;
        this.f = arrayList = new ArrayList<String>();
        arrayList.add("");
    }

    private final int d() {
        int n2 = this.e;
        if (n2 != -1) {
            return n2;
        }
        Object object = kgm.a;
        object = this.a;
        jse.b(object);
        return jvf.t((String)object);
    }

    public final kgm a() {
        String string = this.a;
        if (string != null) {
            Object object = kgm.a;
            String string2 = jvf.u(this.b, 0, 0, false, 7);
            String string3 = jvf.u(this.c, 0, 0, false, 7);
            String string4 = this.d;
            if (string4 != null) {
                Object object2;
                int n2 = this.d();
                Object object3 = this.f;
                object = new ArrayList(jns.B((Iterable)object3));
                object3 = object3.iterator();
                while (object3.hasNext()) {
                    object.add(jvf.u((String)object3.next(), 0, 0, false, 7));
                }
                object = this.g;
                object3 = null;
                if (object != null) {
                    object2 = new ArrayList(jns.B((Iterable)object));
                    Iterator iterator = object.iterator();
                    while (true) {
                        object = object2;
                        if (iterator.hasNext()) {
                            object = (String)iterator.next();
                            object = object != null ? jvf.u((String)object, 0, 0, true, 3) : null;
                            object2.add(object);
                            continue;
                        }
                        break;
                    }
                } else {
                    object = null;
                }
                if ((object2 = this.h) != null) {
                    object3 = jvf.u((String)object2, 0, 0, false, 7);
                }
                return new kgm(string, string2, string3, string4, n2, (List)object, (String)object3, this.toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void b(String string) {
        char[] cArray;
        Object object = cArray = null;
        if (string != null) {
            object = kgm.a;
            string = jvf.w(string, 0, 0, " \"'<>#", true, false, true, false, 211);
            object = cArray;
            if (string != null) {
                object = jvf.v(string);
            }
        }
        this.g = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(kgm var1_1, String var2_2) {
        block54: {
            block56: {
                block49: {
                    block48: {
                        block47: {
                            block55: {
                                block52: {
                                    block53: {
                                        block45: {
                                            block51: {
                                                jse.e(var2_2, "input");
                                                var10_3 = khb.a;
                                                var4_5 = khb.d((String)var2_2, 0, var2_2.length());
                                                var8_6 = khb.e((String)var2_2, var4_5, var2_2.length());
                                                if (var8_6 - var4_5 < 2 || (jse.a(var3_7 = (int)var2_2.charAt(var4_5), 97) < 0 || jse.a(var3_7, 122) > 0) && (jse.a(var3_7, 65) < 0 || jse.a(var3_7, 90) > 0)) ** GOTO lbl9
                                                var3_7 = var4_5 + 1;
                                                block2: while (true) {
                                                    block50: {
                                                        if (var3_7 < var8_6) break block50;
lbl9:
                                                        // 3 sources

                                                        while (true) {
                                                            var3_7 = -1;
                                                            break block2;
                                                            break;
                                                        }
                                                    }
                                                    var5_8 = var2_2.charAt(var3_7);
                                                    if (!(var5_8 >= 97 && var5_8 < 123 || var5_8 >= 65 && var5_8 < 91 || var5_8 >= 48 && var5_8 < 58 || var5_8 == 43 || var5_8 == 45 || var5_8 == 46)) {
                                                        if (var5_8 == 58) break;
                                                        ** continue;
                                                    }
                                                    ++var3_7;
                                                }
                                                var10_3 = "substring(...)";
                                                if (var3_7 == -1) break block51;
                                                if (jse.u((String)var2_2, "https:", var4_5, true)) {
                                                    this.a = "https";
                                                    var3_7 = var4_5 + 6;
                                                    break block45;
                                                } else {
                                                    if (!jse.u((String)var2_2, "http:", var4_5, true)) {
                                                        var1_1 = var2_2.substring(0, var3_7);
                                                        jse.d(var1_1, "substring(...)");
                                                        var2_2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                                                        var2_2.append((String)var1_1);
                                                        var2_2.append("'");
                                                        throw new IllegalArgumentException(var2_2.toString());
                                                    }
                                                    this.a = "http";
                                                    var3_7 = var4_5 + 5;
                                                }
                                                break block45;
                                            }
                                            if (var1_1 == null) break block52;
                                            this.a = var1_1.b;
                                            var3_7 = var4_5;
                                        }
                                        var4_5 = 0;
                                        for (var5_8 = var3_7; var5_8 < var8_6 && ((var6_9 = var2_2.charAt(var5_8)) == 92 || var6_9 == 47); ++var4_5, ++var5_8) {
                                        }
                                        if (var4_5 >= 2 || var1_1 == null || !jse.i(var1_1.b, var11_10 = this.a)) break block53;
                                        this.b = var1_1.d();
                                        this.c = var1_1.a();
                                        this.d = var1_1.c;
                                        this.e = var1_1.d;
                                        this.f.clear();
                                        this.f.addAll(var1_1.h());
                                        if (var3_7 == var8_6 || var2_2.charAt(var3_7) == '#') {
                                            this.b(var1_1.c());
                                        }
                                        break block54;
                                    }
                                    var4_5 = var3_7 + var4_5;
                                    var3_7 = 0;
                                    var6_9 = 0;
                                    var1_1 = var10_3;
                                    break block55;
                                }
                                if (var2_2.length() > 6) {
                                    var1_1 = String.valueOf(jse.D((String)var2_2, 6)).concat("...");
                                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(String.valueOf(var1_1)));
                                }
                                var1_1 = var2_2;
                                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(String.valueOf(var1_1)));
                            }
                            while ((var5_8 = khb.b((String)var2_2, "@/\\?#", var4_5, var8_6)) != var8_6 && (var7_11 = var2_2.charAt(var5_8)) != 35 && var7_11 != 47 && var7_11 != 92 && var7_11 != 63) {
                                if (var7_11 != 64) continue;
                                if (var3_7 == 0) {
                                    var7_11 = khb.a((String)var2_2, ':', var4_5, var5_8);
                                    var10_3 = kgm.a;
                                    var11_10 = jvf.w((String)var2_2, var4_5, var7_11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                    var10_3 = var11_10;
                                    if (var6_9 != 0) {
                                        var10_3 = this.b;
                                        var12_12 = new StringBuilder();
                                        var12_12.append((String)var10_3);
                                        var12_12.append("%40");
                                        var12_12.append((String)var11_10);
                                        var10_3 = var12_12.toString();
                                    }
                                    this.b = var10_3;
                                    if (var7_11 != var5_8) {
                                        this.c = jvf.w((String)var2_2, var7_11 + 1, var5_8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                        var3_7 = 1;
                                    }
                                    var6_9 = 1;
                                } else {
                                    var10_3 = this.c;
                                    var11_10 = kgm.a;
                                    var12_12 = jvf.w((String)var2_2, var4_5, var5_8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                    var11_10 = new StringBuilder();
                                    var11_10.append((String)var10_3);
                                    var11_10.append("%40");
                                    var11_10.append((String)var12_12);
                                    this.c = var11_10.toString();
                                }
                                var4_5 = var5_8 + 1;
                            }
                            var3_7 = var4_5;
                            while (var3_7 < var5_8) {
                                var7_11 = var2_2.charAt(var3_7);
                                if (var7_11 == 91) {
                                    while ((var6_9 = var3_7 + 1) < var5_8) {
                                        var3_7 = var6_9;
                                        if (var2_2.charAt(var6_9) != ']') continue;
                                        break;
                                    }
                                } else {
                                    var6_9 = var3_7;
                                    if (var7_11 == 58) break block47;
                                }
                                var3_7 = var6_9 + 1;
                            }
                            var3_7 = var5_8;
                        }
                        var9_13 = var3_7 + 1;
                        if (var9_13 < var5_8) {
                            var10_3 = kgm.a;
                            this.d = jvf.r(jvf.u((String)var2_2, var4_5, var3_7, false, 4));
                            var7_11 = Integer.parseInt(jvf.w((String)var2_2, var9_13, var5_8, "", false, false, false, false, 248));
                            if (var7_11 <= 0) break block48;
                            var6_9 = var7_11;
                            if (var7_11 < 65536) break block49;
                            break block48;
                        }
                        var10_3 = kgm.a;
                        this.d = jvf.r(jvf.u((String)var2_2, var4_5, var3_7, false, 4));
                        var10_3 = this.a;
                        jse.b(var10_3);
                        this.e = jvf.t((String)var10_3);
                        break block56;
                        catch (NumberFormatException var10_4) {}
                    }
                    var6_9 = -1;
                }
                this.e = var6_9;
                if (var6_9 == -1) {
                    var2_2 = var2_2.substring(var9_13, var5_8);
                    jse.d(var2_2, (String)var1_1);
                    var1_1 = new StringBuilder("Invalid URL port: \"");
                    var1_1.append((String)var2_2);
                    var1_1.append("\"");
                    throw new IllegalArgumentException(var1_1.toString());
                }
            }
            if (this.d == null) {
                var2_2 = var2_2.substring(var4_5, var3_7);
                jse.d(var2_2, (String)var1_1);
                var1_1 = new StringBuilder("Invalid URL host: \"");
                var1_1.append((String)var2_2);
                var1_1.append("\"");
                throw new IllegalArgumentException(var1_1.toString());
            }
            var3_7 = var5_8;
        }
        var4_5 = khb.b((String)var2_2, "?#", var3_7, var8_6);
        if (var3_7 != var4_5) {
            var5_8 = var2_2.charAt(var3_7);
            if (var5_8 != 47 && var5_8 != 92) {
                var1_1 = this.f;
                var1_1.set(var1_1.size() - 1, "");
            } else {
                this.f.clear();
                this.f.add("");
                ++var3_7;
            }
            while (var3_7 < var4_5) {
                var5_8 = khb.b((String)var2_2, "/\\", var3_7, var4_5);
                var1_1 = jvf.w((String)var2_2, var3_7, var5_8, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                if (!jse.i(var1_1, ".") && !jse.H((String)var1_1, "%2e")) {
                    if (!(jse.i(var1_1, "..") || jse.H((String)var1_1, "%2e.") || jse.H((String)var1_1, ".%2e") || jse.H((String)var1_1, "%2e%2e"))) {
                        var10_3 = this.f;
                        if (((CharSequence)var10_3.get(var10_3.size() - 1)).length() == 0) {
                            var10_3 = this.f;
                            var10_3.set(var10_3.size() - 1, var1_1);
                        } else {
                            this.f.add(var1_1);
                        }
                        if (var5_8 < var4_5) {
                            this.f.add("");
                        }
                    } else {
                        var1_1 = this.f;
                        if (((String)var1_1.remove(var1_1.size() - 1)).length() == 0 && !this.f.isEmpty()) {
                            var1_1 = this.f;
                            var1_1.set(var1_1.size() - 1, "");
                        } else {
                            this.f.add("");
                        }
                    }
                }
                if (var5_8 < var4_5) {
                    var3_7 = var5_8 + 1;
                    continue;
                }
                var3_7 = var5_8;
            }
        }
        if (var4_5 < var8_6 && var2_2.charAt(var4_5) == '?') {
            var3_7 = khb.a((String)var2_2, '#', var4_5, var8_6);
            this.g = jvf.v(jvf.w((String)var2_2, var4_5 + 1, var3_7, " \"'<>#", true, false, true, false, 208));
        } else {
            var3_7 = var4_5;
        }
        if (var3_7 >= var8_6) return;
        if (var2_2.charAt(var3_7) != '#') return;
        this.h = jvf.w((String)var2_2, var3_7 + 1, var8_6, "", true, false, false, true, 176);
    }

    public final String toString() {
        StringBuilder stringBuilder;
        block20: {
            int n2;
            int n3;
            Object object;
            int n4;
            Object object2;
            block22: {
                int n5;
                block21: {
                    block18: {
                        block19: {
                            stringBuilder = new StringBuilder();
                            object2 = this.a;
                            if (object2 != null) {
                                stringBuilder.append((String)object2);
                                stringBuilder.append("://");
                            } else {
                                stringBuilder.append("//");
                            }
                            if (this.b.length() > 0 || this.c.length() > 0) {
                                stringBuilder.append(this.b);
                                if (this.c.length() > 0) {
                                    stringBuilder.append(':');
                                    stringBuilder.append(this.c);
                                }
                                stringBuilder.append('@');
                            }
                            if ((object2 = this.d) != null) {
                                if (jse.E((CharSequence)object2, ':')) {
                                    stringBuilder.append('[');
                                    stringBuilder.append(this.d);
                                    stringBuilder.append(']');
                                } else {
                                    stringBuilder.append(this.d);
                                }
                            }
                            if (this.e == -1 && this.a == null) break block18;
                            n4 = this.d();
                            if (this.a == null) break block19;
                            object2 = kgm.a;
                            object2 = this.a;
                            jse.b(object2);
                            if (n4 == jvf.t((String)object2)) break block18;
                        }
                        stringBuilder.append(':');
                        stringBuilder.append(n4);
                    }
                    object2 = kgm.a;
                    object2 = this.f;
                    n5 = object2.size();
                    for (n4 = 0; n4 < n5; ++n4) {
                        stringBuilder.append('/');
                        stringBuilder.append((String)object2.get(n4));
                    }
                    if (this.g == null) break block20;
                    stringBuilder.append('?');
                    object2 = this.g;
                    jse.b(object2);
                    jse.e(object2, "<this>");
                    object = jse.p(jse.q(0, object2.size()), 2);
                    n5 = ((jsv)object).a;
                    n3 = ((jsv)object).b;
                    n2 = ((jsv)object).c;
                    if (n2 <= 0) break block21;
                    n4 = n5;
                    if (n5 <= n3) break block22;
                }
                if (n2 >= 0 || n3 > n5) break block20;
                n4 = n5;
            }
            while (true) {
                String string = (String)object2.get(n4);
                object = (String)object2.get(n4 + 1);
                if (n4 > 0) {
                    stringBuilder.append('&');
                }
                stringBuilder.append(string);
                if (object != null) {
                    stringBuilder.append('=');
                    stringBuilder.append((String)object);
                }
                if (n4 == n3) break;
                n4 += n2;
            }
        }
        if (this.h != null) {
            stringBuilder.append('#');
            stringBuilder.append(this.h);
        }
        return stringBuilder.toString();
    }
}

