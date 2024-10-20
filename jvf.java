/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class jvf {
    /*
     * Unable to fully structure code
     */
    public static final int A(String var0, int var1_1, int var2_2, boolean var3_3) {
        while (var1_1 < var2_2) {
            block4: {
                var4_4 = var5_5 = var0.charAt(var1_1);
                if (var5_5 >= 32) break block4;
                if (var5_5 != 9) ** GOTO lbl-1000
                var4_4 = 9;
            }
            if (!(var4_4 >= 127 || var4_4 >= 48 && var4_4 < 58 || var4_4 >= 97 && var4_4 < 123 || var4_4 >= 65 && var4_4 < 91 || var4_4 == 58)) {
                var4_4 = 0;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = 1;
            }
            if (var4_4 == (var3_3 ^ 1)) {
                return var1_1;
            }
            ++var1_1;
        }
        return var2_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final InetAddress B(String string, int n2, int n3) {
        int n4;
        byte[] byArray = new byte[16];
        int n5 = -1;
        int n6 = -1;
        int n7 = 0;
        int n8 = n2;
        n2 = n7;
        while (true) {
            n7 = n2;
            n4 = n5;
            if (n8 >= n3) break;
            if (n2 == 16) return null;
            n7 = n8 + 2;
            if (n7 <= n3 && jse.W(string, "::", n8)) {
                if (n5 != -1) return null;
                n2 += 2;
                if (n7 == n3) {
                    n4 = n2;
                    n7 = n2;
                    break;
                }
                n5 = n2;
                n6 = n7;
            } else {
                n7 = n8;
                if (n2 != 0) {
                    if (jse.W(string, ":", n8)) {
                        n7 = n8 + 1;
                    } else {
                        int n9;
                        if (!jse.W(string, ".", n8)) return null;
                        n4 = n9 = n2 - 2;
                        n8 = n6;
                        while (n8 < n3) {
                            char c2;
                            if (n4 == 16) return null;
                            n6 = n8;
                            if (n4 != n9) {
                                if (string.charAt(n8) != '.') return null;
                                n6 = n8 + 1;
                            }
                            n7 = 0;
                            for (n8 = n6; n8 < n3 && jse.a(c2 = string.charAt(n8), 48) >= 0 && jse.a(c2, 57) <= 0; ++n8) {
                                int n10 = n7;
                                if (n7 == 0) {
                                    if (n6 != n8) return null;
                                    n10 = 0;
                                }
                                if ((n7 = n10 * 10 + c2 - 48) > 255) return null;
                            }
                            if (n8 - n6 == 0) return null;
                            byArray[n4] = (byte)n7;
                            ++n4;
                        }
                        if (n4 != n2 + 2) return null;
                        n7 = n2 + 2;
                        n4 = n5;
                        break;
                    }
                }
                n6 = n7;
            }
            n7 = 0;
            for (n8 = n6; n8 < n3 && (n4 = khb.f(string.charAt(n8))) != -1; ++n8) {
                n7 = (n7 << 4) + n4;
            }
            n4 = n8 - n6;
            if (n4 == 0 || n4 > 4) return null;
            byArray[n2] = (byte)(0xFF & n7 >>> 8);
            n4 = n2 + 2;
            byArray[n2 + 1] = (byte)(n7 & 0xFF);
            n2 = n4;
        }
        if (n7 == 16) return InetAddress.getByAddress(byArray);
        if (n4 == -1) return null;
        n2 = n7 - n4;
        System.arraycopy(byArray, n4, byArray, 16 - n2, n2);
        Arrays.fill(byArray, n4, 16 - n7 + n4, (byte)0);
        return InetAddress.getByAddress(byArray);
    }

    private static final boolean C(String string, int n2, int n3) {
        int n4 = n2 + 2;
        return n4 < n3 && string.charAt(n2) == '%' && khb.f(string.charAt(n2 + 1)) != -1 && khb.f(string.charAt(n4)) != -1;
    }

    private static final List D(Certificate[] object) {
        object = object != null ? khb.n(Arrays.copyOf(object, ((Certificate[])object).length)) : jpa.a;
        return object;
    }

    public static final String a(Object object) {
        return object.getClass().getSimpleName();
    }

    public static final String b(Object object) {
        return Integer.toHexString(System.identityHashCode(object));
    }

    public static final String c(jqb object) {
        if (object instanceof kaz) {
            object = ((kaz)object).toString();
        } else {
            StringBuilder stringBuilder;
            Object object2;
            try {
                object2 = jvf.b(object);
                stringBuilder = new StringBuilder();
                stringBuilder.append(object);
                stringBuilder.append("@");
                stringBuilder.append((String)object2);
                object2 = stringBuilder.toString();
            }
            catch (Throwable throwable) {
                object2 = jns.aj(throwable);
            }
            if (joe.a(object2) != null) {
                object2 = object.getClass().getName();
                object = jvf.b(object);
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object2);
                stringBuilder.append("@");
                stringBuilder.append((String)object);
                object2 = stringBuilder.toString();
            }
            object = (String)object2;
        }
        return object;
    }

    public static final Object d(long l2, jqb jqb2) {
        if (l2 > 0L) {
            Object object = new jul(jjj.n(jqb2), 1);
            ((jul)object).r();
            if (l2 < Long.MAX_VALUE) {
                jvf.e(((jul)object).b).c(l2, (jul)object);
            }
            if ((object = ((jul)object).a()) == jqh.a) {
                jsd.j(jqb2);
            }
            if (object == jqh.a) {
                return object;
            }
        }
        return jon.a;
    }

    public static final jvj e(jqf object) {
        object = (object = object.get(jqc.b)) instanceof jvj ? (jvj)object : null;
        Object object2 = object;
        if (object == null) {
            object2 = jvh.a;
        }
        return object2;
    }

    public static final Object f(jro object, jqb jqb2) {
        kbq kbq2 = new kbq(jqb2.d(), jqb2);
        object = jse.aj(kbq2, kbq2, (jro)object);
        if (object == jqh.a) {
            jsd.j(jqb2);
        }
        return object;
    }

    public static final jvb g(jqf jqf2) {
        jqf jqf3 = jqf2;
        if (jqf2.get(jwi.c) == null) {
            jqf3 = jqf2.plus(new jwk());
        }
        return new kav(jqf3);
    }

    public static final Throwable h(Throwable throwable, Throwable throwable2) {
        if (throwable == throwable2) {
            return throwable;
        }
        throwable2 = new RuntimeException("Exception while trying to handle coroutine exception", throwable2);
        jns.b(throwable2, throwable);
        return throwable2;
    }

    public static final void i(jqf jqf2, Throwable throwable) {
        block3: {
            CoroutineExceptionHandler coroutineExceptionHandler;
            try {
                coroutineExceptionHandler = (CoroutineExceptionHandler)jqf2.get(CoroutineExceptionHandler.c);
                if (coroutineExceptionHandler == null) break block3;
            }
            catch (Throwable throwable2) {
                jse.au(jqf2, jvf.h(throwable, throwable2));
                return;
            }
            coroutineExceptionHandler.handleException(jqf2, throwable);
            return;
        }
        jse.au(jqf2, throwable);
    }

    public static /* synthetic */ void j(jwi jwi2) {
        jwi2.r(null);
    }

    public static final juy k(Executor executor) {
        jvn jvn2 = executor instanceof jvn ? (jvn)executor : null;
        if (jvn2 != null) {
            return jvn2.a;
        }
        return new jwb(executor);
    }

    public static final CancellationException l(String object, Throwable throwable) {
        object = new CancellationException((String)object);
        ((Throwable)object).initCause(throwable);
        return object;
    }

    public static final void m(jvm object, jqb jqb2, boolean bl2) {
        Object object2 = ((jvm)object).g();
        Object object3 = ((jvm)object).k(object2);
        object = object3 != null ? jns.aj((Throwable)object3) : ((jvm)object).c(object2);
        if (bl2) {
            Object object4;
            block4: {
                jse.c(jqb2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
                object3 = (kaz)jqb2;
                jqb2 = ((kaz)object3).b;
                object4 = ((kaz)object3).d;
                object2 = jqb2.d();
                object4 = kbv.b((jqf)object2, object4);
                jqb2 = object4 != kbv.a ? jux.c(jqb2, (jqf)object2, object4) : null;
                try {
                    ((kaz)object3).b.bD(object);
                    if (jqb2 == null || ((jxh)jqb2).S()) break block4;
                    return;
                }
                catch (Throwable throwable) {
                    if (jqb2 == null || ((jxh)jqb2).S()) {
                        kbv.c((jqf)object2, object4);
                    }
                    throw throwable;
                }
            }
            kbv.c((jqf)object2, object4);
            return;
        }
        jqb2.bD(object);
    }

    public static final boolean n(int n2) {
        return n2 == 1 || n2 == 2;
        {
        }
    }

    public static final String o(long l2) {
        CharSequence charSequence;
        if (l2 <= -999500000L) {
            l2 = (l2 - 500000000L) / 1000000000L;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" s ");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l2 <= -999500L) {
            l2 = (l2 - 500000L) / 1000000L;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" ms");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l2 <= 0L) {
            l2 = (l2 - 500L) / 1000L;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" \u00b5s");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l2 < 999500L) {
            l2 = (l2 + 500L) / 1000L;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" \u00b5s");
            charSequence = ((StringBuilder)charSequence).toString();
        } else if (l2 < 999500000L) {
            l2 = (l2 + 500000L) / 1000000L;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" ms");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            l2 = (l2 + 500000000L) / 1000000000L;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(" s ");
            charSequence = ((StringBuilder)charSequence).toString();
        }
        charSequence = String.format("%6s", Arrays.copyOf(new Object[]{charSequence}, 1));
        jse.d(charSequence, "format(...)");
        return charSequence;
    }

    public static final void p(khd khd2, khf khf2, String string) {
        Logger logger = khh.b;
        string = String.format("%-22s", Arrays.copyOf(new Object[]{string}, 1));
        jse.d(string, "format(...)");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(khf2.b);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append(khd2.a);
        logger.fine(stringBuilder.toString());
    }

    public static final kgv q(kgv object) {
        kgx kgx2 = object != null ? ((kgv)object).g : null;
        kgv kgv2 = object;
        if (kgx2 != null) {
            object = new kgu((kgv)object);
            ((kgu)object).c = null;
            kgv2 = ((kgu)object).a();
        }
        return kgv2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String r(String object) {
        block15: {
            jse.e(object, "<this>");
            boolean bl2 = jse.F((CharSequence)object, ":");
            int n2 = -1;
            int n3 = 0;
            if (bl2) {
                InetAddress inetAddress = jse.X((String)object, "[") && jse.G((String)object, "]") ? jvf.B((String)object, 1, ((String)object).length() - 1) : jvf.B((String)object, 0, ((String)object).length());
                if (inetAddress == null) {
                    return null;
                }
                byte[] byArray = inetAddress.getAddress();
                int n4 = byArray.length;
                if (n4 == 16) {
                    int n5;
                    jse.b(byArray);
                    n4 = 0;
                    int n6 = 0;
                    while (n4 < byArray.length) {
                        for (n5 = n4; n5 < 16 && byArray[n5] == 0 && byArray[n5 + 1] == 0; n5 += 2) {
                        }
                        int n7 = n5 - n4;
                        int n8 = n6;
                        int n9 = n2;
                        if (n7 > n6) {
                            n8 = n6;
                            n9 = n2;
                            if (n7 >= 4) {
                                n8 = n7;
                                n9 = n4;
                            }
                        }
                        n4 = n5 + 2;
                        n6 = n8;
                        n2 = n9;
                    }
                    object = new klm();
                    n4 = n3;
                    while (n4 < byArray.length) {
                        if (n4 == n2) {
                            ((klm)object).F(58);
                            n4 = n5 = n4 + n6;
                            if (n5 != 16) continue;
                            ((klm)object).F(58);
                            n4 = n5;
                            continue;
                        }
                        if (n4 > 0) {
                            ((klm)object).F(58);
                        }
                        ((klm)object).O(khb.z(byArray[n4]) << 8 | khb.z(byArray[n4 + 1]));
                        n4 += 2;
                    }
                    return ((klm)object).k();
                }
                if (n4 != 4) throw new AssertionError((Object)a.aj((String)object, "Invalid IPv6 address: '", "'"));
                return inetAddress.getHostAddress();
            }
            try {
                String string = IDN.toASCII((String)object);
                jse.d(string, "toASCII(...)");
                object = Locale.US;
                jse.d(object, "US");
                object = string.toLowerCase((Locale)object);
                jse.d(object, "toLowerCase(...)");
                if (object.length() == 0) break block15;
                n2 = ((String)object).length();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                int n10;
                char c2 = ((String)object).charAt(i2);
                if (jse.a(c2, 31) <= 0 || jse.a(c2, 127) >= 0 || (n10 = jse.L(" #%/:?@[\\]", c2, 0, 6)) != -1) return null;
                continue;
            }
            return object;
        }
        return null;
    }

    public static final kgz s(String object) {
        block14: {
            block15: {
                block12: {
                    block13: {
                        jse.e(object, "javaName");
                        int n2 = object.hashCode();
                        if (n2 == 79201641) break block12;
                        if (n2 == 79923350) break block13;
                        switch (n2) {
                            default: {
                                break block14;
                            }
                            case -503070501: {
                                if (object.equals("TLSv1.3")) {
                                    object = kgz.a;
                                    break;
                                }
                                break block14;
                            }
                            case -503070502: {
                                if (object.equals("TLSv1.2")) {
                                    object = kgz.b;
                                    break;
                                }
                                break block14;
                            }
                            case -503070503: {
                                if (object.equals("TLSv1.1")) {
                                    object = kgz.c;
                                    break;
                                }
                                break block14;
                            }
                        }
                        break block15;
                    }
                    if (!object.equals("TLSv1")) break block14;
                    object = kgz.d;
                    break block15;
                }
                if (!object.equals("SSLv3")) break block14;
                object = kgz.e;
            }
            return object;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(object)));
    }

    public static final int t(String string) {
        block4: {
            int n2;
            block3: {
                block2: {
                    jse.e(string, "scheme");
                    if (!jse.i(string, "http")) break block2;
                    n2 = 80;
                    break block3;
                }
                if (jse.i(string, "https")) break block4;
                n2 = -1;
            }
            return n2;
        }
        return 443;
    }

    /*
     * Unable to fully structure code
     */
    public static /* synthetic */ String u(String var0, int var1_1, int var2_2, boolean var3_3, int var4_4) {
        block11: {
            var5_5 = var2_2;
            if ((var4_4 & 2) != 0) {
                var5_5 = var0.length();
            }
            var2_2 = 0;
            var6_6 = 1;
            if (1 == (var4_4 & 1)) {
                var1_1 = 0;
            }
            if ((var4_4 & 4) == 0) {
                var2_2 = 1;
            }
            var4_4 = var3_3 & var2_2;
            jse.e(var0, "<this>");
            for (var2_2 = var1_1; var2_2 < var5_5; ++var2_2) {
                var7_7 = var0.charAt(var2_2);
                if (var7_7 != 37) {
                    if (var7_7 != 43 || var4_4 == 0) continue;
                    var4_4 = var6_6;
                }
                var8_8 = new klm();
                var8_8.K(var0, var1_1, var2_2);
                var1_1 = var2_2;
                while (var1_1 < var5_5) {
                    var2_2 = var6_6 = var0.codePointAt(var1_1);
                    if (var6_6 != 37) ** GOTO lbl34
                    var7_7 = var1_1 + 2;
                    if (var7_7 < var5_5) {
                        var2_2 = khb.f(var0.charAt(var1_1 + 1));
                        var6_6 = khb.f(var0.charAt(var7_7));
                        if (var2_2 != -1 && var6_6 != -1) {
                            var8_8.F((var2_2 << 4) + var6_6);
                            var1_1 = Character.charCount(37) + var7_7;
                            continue;
                        }
                        var6_6 = 37;
                    } else {
                        var2_2 = 37;
lbl34:
                        // 2 sources

                        var6_6 = var2_2;
                        if (var2_2 == 43) {
                            var6_6 = var2_2;
                            if (var4_4 != 0) {
                                var8_8.F(32);
                                ++var1_1;
                                continue;
                            }
                        }
                    }
                    var8_8.L(var6_6);
                    var1_1 += Character.charCount(var6_6);
                }
                var0 = var8_8.k();
                break block11;
            }
            var0 = var0.substring(var1_1, var5_5);
            jse.d(var0, "substring(...)");
        }
        return var0;
    }

    public static final List v(String string) {
        jse.e(string, "<this>");
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = 0;
        while (n2 <= string.length()) {
            String string2;
            int n3;
            int n4 = n3 = jse.L(string, '&', n2, 4);
            if (n3 == -1) {
                n4 = string.length();
            }
            if ((n3 = jse.L(string, '=', n2, 4)) != -1 && n3 <= n4) {
                string2 = string.substring(n2, n3);
                jse.d(string2, "substring(...)");
                arrayList.add(string2);
                string2 = string.substring(n3 + 1, n4);
                jse.d(string2, "substring(...)");
                arrayList.add(string2);
            } else {
                string2 = string.substring(n2, n4);
                jse.d(string2, "substring(...)");
                arrayList.add(string2);
                arrayList.add(null);
            }
            n2 = n4 + 1;
        }
        return arrayList;
    }

    public static /* synthetic */ String w(String string, int n2, int n3, String string2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n4) {
        block9: {
            int n5 = (n4 & 2) != 0 ? string.length() : n3;
            int n6 = 0;
            if (1 == (n4 & 1)) {
                n2 = 0;
            }
            n3 = (n4 & 8) != 0 ? 0 : 1;
            int n7 = n3 & bl2;
            n3 = (n4 & 0x10) != 0 ? 0 : 1;
            int n8 = n3 & bl3;
            n3 = (n4 & 0x20) != 0 ? 0 : 1;
            int n9 = n3 & bl4;
            n3 = (n4 & 0x40) != 0 ? n6 : 1;
            int n10 = n3 & bl5;
            jse.e(string, "<this>");
            for (n3 = n2; n3 < n5; n3 += Character.charCount(n6)) {
                block10: {
                    block12: {
                        block11: {
                            n6 = string.codePointAt(n3);
                            n4 = n9;
                            if (n6 < 32) break block10;
                            n4 = n9;
                            if (n6 == 127) break block10;
                            if (n6 < 128) break block11;
                            n4 = n9;
                            if (n10 == 0) break block10;
                        }
                        n4 = n9;
                        if (jse.E(string2, (char)n6)) break block10;
                        if (n6 != 37) break block12;
                        n4 = n9;
                        if (n7 == 0) break block10;
                        if (n8 == 0) break block12;
                        n4 = n9;
                        if (!jvf.C(string, n3, n5)) break block10;
                    }
                    if (n6 != 43 || n9 == 0) continue;
                    n4 = 1;
                }
                klm klm2 = new klm();
                klm2.K(string, n2, n3);
                Object object = null;
                block1: for (n6 = n3; n6 < n5; n6 += Character.charCount(n3)) {
                    Object object2;
                    block13: {
                        block15: {
                            block14: {
                                n2 = string.codePointAt(n6);
                                if (n7 != 0) {
                                    n3 = n2;
                                    if (n2 == 9) continue;
                                    n3 = n2;
                                    if (n2 == 10) continue;
                                    n3 = n2;
                                    if (n2 == 12) continue;
                                    if (n2 == 13) {
                                        n3 = 13;
                                        continue;
                                    }
                                }
                                if (n2 == 43 && n4 != 0) {
                                    object2 = 1 != n7 ? "%2B" : "+";
                                    klm2.P((String)object2);
                                    n3 = n2;
                                    continue;
                                }
                                if (n2 < 32 || n2 == 127 || n2 >= 128 && n10 == 0 || jse.E(string2, (char)n2)) break block13;
                                if (n2 != 37) break block14;
                                if (n7 == 0 || n8 != 0 && !jvf.C(string, n6, n5)) break block13;
                                n3 = 37;
                                break block15;
                            }
                            n3 = n2;
                        }
                        klm2.L(n2);
                        continue;
                    }
                    object2 = object;
                    if (object == null) {
                        object2 = new klm();
                    }
                    ((klm)object2).L(n2);
                    while (true) {
                        object = object2;
                        n3 = n2;
                        if (((klm)object2).y()) continue block1;
                        n3 = ((klm)object2).d();
                        klm2.F(37);
                        klm2.F(kgm.a[(n3 & 0xFF) >> 4]);
                        klm2.F(kgm.a[n3 & 0xF]);
                    }
                }
                string = klm2.k();
                break block9;
            }
            string = string.substring(n2, n5);
            jse.d(string, "substring(...)");
        }
        return string;
    }

    public static final void x(String string) {
        if (string.length() > 0) {
            int n2 = string.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                char c2 = string.charAt(i2);
                if (c2 >= '!' && c2 < '\u007f') {
                    continue;
                }
                throw new IllegalArgumentException(khb.k("Unexpected char %#04x at %d in header name: %s", c2, i2, string).toString());
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static final void y(String string, String string2) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\t' || c2 >= ' ' && c2 < '\u007f') continue;
            String string3 = khb.k("Unexpected char %#04x at %d in %s value", c2, i2, string2);
            string = khb.w(string2) ? "" : ": ".concat(String.valueOf(string));
            throw new IllegalArgumentException(String.valueOf(string3).concat(string));
        }
    }

    public static final kgj z(SSLSession sSLSession) {
        jse.e(sSLSession, "<this>");
        Object object = sSLSession.getCipherSuite();
        if (object != null) {
            if (!jse.i(object, "TLS_NULL_WITH_NULL_NULL") && !jse.i(object, "SSL_NULL_WITH_NULL_NULL")) {
                kfy kfy2 = kfy.t.t((String)object);
                Object object2 = sSLSession.getProtocol();
                if (object2 != null) {
                    if (!jse.i("NONE", object2)) {
                        object = kgz.a;
                        object2 = jvf.s(object2);
                        try {
                            object = jvf.D(sSLSession.getPeerCertificates());
                        }
                        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
                            object = jpa.a;
                        }
                        return new kgj((kgz)((Object)object2), kfy2, jvf.D(sSLSession.getLocalCertificates()), new gfu(object, 2));
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == ".concat((String)object));
        }
        throw new IllegalStateException("cipherSuite == null");
    }
}

