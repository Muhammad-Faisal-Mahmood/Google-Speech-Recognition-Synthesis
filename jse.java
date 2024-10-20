/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

public class jse {
    private jse() {
    }

    public jse(byte[] byArray) {
    }

    public static List A(CharSequence charSequence) {
        return jsl.e(jse.B(charSequence));
    }

    public static jtl B(CharSequence charSequence) {
        return new jtk(jse.Q(charSequence, new String[]{"\r\n", "\n", "\r"}), (jrk)new etv(charSequence, 18), 2);
    }

    public static boolean C(CharSequence charSequence) {
        boolean bl2;
        block2: {
            jse.e(charSequence, "<this>");
            bl2 = false;
            for (int i2 = 0; i2 < charSequence.length(); ++i2) {
                if (jse.aa(charSequence.charAt(i2))) {
                    continue;
                }
                break block2;
            }
            bl2 = true;
        }
        return bl2;
    }

    public static String D(String string, int n2) {
        jse.e(string, "<this>");
        string = string.substring(0, jse.l(n2, string.length()));
        jse.d(string, "substring(...)");
        return string;
    }

    public static /* synthetic */ boolean E(CharSequence charSequence, char c2) {
        return jse.L(charSequence, c2, 0, 2) >= 0;
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, CharSequence charSequence2) {
        jse.e(charSequence, "<this>");
        jse.e(charSequence2, "other");
        return charSequence2 instanceof String ? jse.M(charSequence, (String)charSequence2, 0, 2) >= 0 : jse.J(charSequence, charSequence2, 0, charSequence.length(), false) >= 0;
    }

    public static /* synthetic */ boolean G(String string, String string2) {
        jse.e(string, "<this>");
        jse.e(string2, "suffix");
        return string.endsWith(string2);
    }

    public static boolean H(String string, String string2) {
        if (string == null) {
            return string2 == null;
        }
        return string.equalsIgnoreCase(string2);
    }

    public static int I(CharSequence charSequence, String string, int n2) {
        jse.e(charSequence, "<this>");
        jse.e(string, "string");
        n2 = !(charSequence instanceof String) ? jse.J(charSequence, string, n2, charSequence.length(), false) : ((String)charSequence).indexOf(string, n2);
        return n2;
    }

    public static int J(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl2) {
        block12: {
            int n4;
            int n5;
            block17: {
                block16: {
                    Object object;
                    block13: {
                        int n6;
                        int n7;
                        block15: {
                            block14: {
                                object = !bl2 ? new jsw(jse.k(n2, 0), jse.l(n3, charSequence.length())) : new jsv(jse.l(n2, jse.v(charSequence)), jse.k(n3, 0), -1);
                                if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) break block13;
                                n3 = ((jsv)object).a;
                                n7 = ((jsv)object).b;
                                n6 = ((jsv)object).c;
                                if (n6 <= 0) break block14;
                                n2 = n3;
                                if (n3 <= n7) break block15;
                            }
                            if (n6 >= 0 || n7 > n3) break block12;
                            n2 = n3;
                        }
                        while (true) {
                            if (jse.t((String)charSequence2, 0, (String)(object = (String)charSequence), n2, n3 = charSequence2.length(), false)) {
                                return n2;
                            }
                            if (n2 != n7) {
                                n2 += n6;
                                continue;
                            }
                            break block12;
                            break;
                        }
                    }
                    n3 = ((jsv)object).a;
                    n5 = ((jsv)object).b;
                    n4 = ((jsv)object).c;
                    if (n4 <= 0) break block16;
                    n2 = n3;
                    if (n3 <= n5) break block17;
                }
                if (n4 >= 0 || n5 > n3) break block12;
                n2 = n3;
            }
            while (true) {
                if (jse.R(charSequence2, 0, charSequence, n2, charSequence2.length())) {
                    return n2;
                }
                if (n2 == n5) break;
                n2 += n4;
            }
        }
        return -1;
    }

    public static /* synthetic */ int L(CharSequence charSequence, char c2, int n2, int n3) {
        block4: {
            jse.e(charSequence, "<this>");
            boolean bl2 = charSequence instanceof String;
            if ((n3 & 2) != 0) {
                n2 = 0;
            }
            if (!bl2) {
                jse.e(charSequence, "<this>");
                jpe jpe2 = new jsw(jse.k(n2, 0), jse.v(charSequence)).a();
                while (jpe2.a) {
                    n2 = jpe2.a();
                    char c3 = charSequence.charAt(n2);
                    if (!jse.ad((new char[]{c2})[0], c3)) continue;
                    break block4;
                }
                n2 = -1;
            } else {
                n2 = ((String)charSequence).indexOf(c2, n2);
            }
        }
        return n2;
    }

    public static /* synthetic */ int M(CharSequence charSequence, String string, int n2, int n3) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return jse.I(charSequence, string, n2);
    }

    public static /* synthetic */ int N(CharSequence charSequence, char c2, int n2, int n3) {
        block5: {
            if ((n3 & 2) != 0) {
                n2 = jse.v(charSequence);
            }
            jse.e(charSequence, "<this>");
            if (!(charSequence instanceof String)) {
                jse.e(charSequence, "<this>");
                for (n2 = jse.l(n2, jse.v(charSequence)); n2 >= 0; --n2) {
                    char c3 = charSequence.charAt(n2);
                    if (!jse.ad((new char[]{c2})[0], c3)) {
                        continue;
                    }
                    break block5;
                }
                n2 = -1;
            } else {
                n2 = ((String)charSequence).lastIndexOf(c2, n2);
            }
        }
        return n2;
    }

    public static String O(String charSequence) {
        if (charSequence.length() >= 8) {
            charSequence = charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder stringBuilder = new StringBuilder(8);
            jpe jpe2 = new jsw(1, 8 - charSequence.length()).a();
            while (jpe2.a) {
                jpe2.a();
                stringBuilder.append('0');
            }
            stringBuilder.append(charSequence);
            charSequence = stringBuilder;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ String P(String string) {
        return jsl.f(new jtk(jse.B(string), (jrk)new etv(17, null), 2), "\n");
    }

    public static /* synthetic */ jtl Q(CharSequence charSequence, String[] stringArray) {
        return new jtk(charSequence, new kak(jns.L(stringArray), 1), 3);
    }

    public static boolean R(CharSequence charSequence, int n2, CharSequence charSequence2, int n3, int n4) {
        jse.e(charSequence, "<this>");
        jse.e(charSequence2, "other");
        if (n3 >= 0 && n2 >= 0 && n2 <= charSequence.length() - n4 && n3 <= charSequence2.length() - n4) {
            for (int i2 = 0; i2 < n4; ++i2) {
                if (jse.ad(charSequence.charAt(n2 + i2), charSequence2.charAt(n3 + i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ String S(String string, char c2, char c3) {
        jse.e(string, "<this>");
        string = string.replace(c2, c3);
        jse.d(string, "replace(...)");
        return string;
    }

    public static /* synthetic */ String T(String string, String string2, String string3) {
        jse.e(string, "<this>");
        int n2 = 0;
        int n3 = jse.I(string, string2, 0);
        CharSequence charSequence = string;
        if (n3 >= 0) {
            int n4 = string2.length();
            int n5 = string.length() - n4 + string3.length();
            if (n5 >= 0) {
                int n6;
                charSequence = new StringBuilder(n5);
                do {
                    ((StringBuilder)charSequence).append(string, n2, n3);
                    ((StringBuilder)charSequence).append(string3);
                    n6 = n3 + n4;
                    if (n3 >= string.length()) break;
                    n5 = jse.I(string, string2, n3 + jse.k(n4, 1));
                    n2 = n6;
                    n3 = n5;
                } while (n5 > 0);
                ((StringBuilder)charSequence).append(string, n6, string.length());
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                throw new OutOfMemoryError();
            }
        }
        return charSequence;
    }

    public static List U(CharSequence charSequence, String string) {
        int n2 = 0;
        int n3 = jse.I(charSequence, string, 0);
        if (n3 != -1) {
            int n4;
            int n5;
            ArrayList<String> arrayList = new ArrayList<String>(10);
            do {
                arrayList.add(((Object)charSequence.subSequence(n2, n3)).toString());
                n4 = string.length() + n3;
                n5 = jse.I(charSequence, string, n4);
                n2 = n4;
                n3 = n5;
            } while (n5 != -1);
            arrayList.add(((Object)charSequence.subSequence(n4, charSequence.length())).toString());
            return arrayList;
        }
        return jns.d(((Object)charSequence).toString());
    }

    public static /* synthetic */ List V(CharSequence charSequence, char[] cArray) {
        jse.e(charSequence, "<this>");
        return jse.U(charSequence, String.valueOf(cArray[0]));
    }

    public static /* synthetic */ boolean X(String string, String string2) {
        jse.e(string, "<this>");
        return string.startsWith(string2);
    }

    public static String Y(String string, String string2) {
        jse.e(string, "<this>");
        jse.e(string2, "missingDelimiterValue");
        int n2 = jse.N(string, '.', 0, 6);
        if (n2 == -1) {
            return string2;
        }
        string = string.substring(n2 + 1, string.length());
        jse.d(string, "substring(...)");
        return string;
    }

    public static /* synthetic */ String Z(String charSequence) {
        if (!jse.C("|")) {
            Object object = jse.A(charSequence);
            int n2 = ((String)charSequence).length();
            object.size();
            jrk jrk2 = jse.ax();
            int n3 = jns.e((List)object);
            ArrayList<CharSequence> arrayList = new ArrayList<CharSequence>();
            Iterator iterator = object.iterator();
            int n4 = 0;
            while (iterator.hasNext()) {
                charSequence = iterator.next();
                if (n4 < 0) {
                    jns.i();
                }
                CharSequence charSequence2 = charSequence;
                object = null;
                if ((n4 == 0 || n4 == n3) && jse.C(charSequence2)) {
                    charSequence = null;
                } else {
                    int n5;
                    block10: {
                        int n6 = charSequence2.length();
                        for (n5 = 0; n5 < n6; ++n5) {
                            if (jse.aa(charSequence2.charAt(n5))) {
                                continue;
                            }
                            break block10;
                        }
                        n5 = -1;
                    }
                    if (n5 != -1 && jse.u((String)charSequence2, "|", n5, false)) {
                        jse.c(charSequence2, "null cannot be cast to non-null type java.lang.String");
                        object = ((String)charSequence2).substring(n5 + 1);
                        jse.d(object, "substring(...)");
                    }
                    charSequence = charSequence2;
                    if (object != null && (charSequence = (String)jrk2.a(object)) == null) {
                        charSequence = charSequence2;
                    }
                }
                if (charSequence != null) {
                    arrayList.add(charSequence);
                }
                ++n4;
            }
            charSequence = new StringBuilder(n2);
            jns.I(arrayList, (Appendable)((Object)charSequence));
            return ((StringBuilder)charSequence).toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }

    public static int a(int n2, int n3) {
        block4: {
            block3: {
                block2: {
                    if (n2 >= n3) break block2;
                    n2 = -1;
                    break block3;
                }
                if (n2 == n3) break block4;
                n2 = 1;
            }
            return n2;
        }
        return 0;
    }

    public static boolean aa(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
        {
        }
    }

    public static void ab(int n2) {
        Object object = new jsw(2, 36);
        if (((jsv)object).a <= n2 && n2 <= ((jsv)object).b) {
            return;
        }
        jsw jsw2 = new jsw(2, 36);
        object = new StringBuilder("radix ");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" was not in valid range ");
        ((StringBuilder)object).append(jsw2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static int ac(char c2) {
        return Character.digit((int)c2, 10);
    }

    public static boolean ad(char c2, char c3) {
        return c2 == c3;
    }

    public static Object ae(jqf object, jro object2, jqb jqb2) {
        block10: {
            jqf jqf2 = jqb2.d();
            object = jux.a(jqf2, (jqf)object);
            jns.at((jqf)object);
            if (object == jqf2) {
                object = new kbq((jqf)object, jqb2);
                object = jse.aj((kbq)object, object, (jro)object2);
            } else {
                if (jse.i(object.get(jqc.b), jqf2.get(jqc.b))) {
                    object = new jxh((jqf)object, jqb2);
                    jqf2 = ((jue)object).a;
                    Object object3 = kbv.b(jqf2, null);
                    try {
                        object = jse.aj((kbq)object, object, (jro)object2);
                    }
                    finally {
                        kbv.c(jqf2, object3);
                    }
                }
                object = new jvl((jqf)object, jqb2);
                jse.al((jro)object2, object, (jqb)object);
                object2 = ((jvl)object).b;
                do {
                    int n2;
                    if ((n2 = ((jua)object2).b) == 0) continue;
                    if (n2 == 2) {
                        if ((object = jwq.b(((jwp)object).B())) instanceof jut) {
                            throw ((jut)object).b;
                        }
                        break block10;
                    }
                    throw new IllegalStateException("Already suspended");
                } while (!((jvl)object).b.b(0, 1));
                object = jqh.a;
            }
        }
        if (object == jqh.a) {
            jsd.j(jqb2);
        }
        return object;
    }

    public static jwi af(jvb object, jqf jqf2, jvc jvc2, jro jro2) {
        object = jux.b((jvb)object, jqf2);
        object = jvc2.b() ? new jws((jqf)object, jro2) : new jwz((jqf)object, true);
        jvc2.a(jro2, object, (jqb)object);
        return object;
    }

    public static /* synthetic */ jvi ag(jvb object, jro jro2) {
        jqg jqg2 = jqg.a;
        jvc jvc2 = jvc.a;
        object = jux.b((jvb)object, jqg2);
        object = jvc2.b() ? new jwr((jqf)object, jro2) : new jue((jqf)object, true);
        jvc2.a(jro2, object, (jqb)object);
        return object;
    }

    public static /* synthetic */ jwi ah(jvb jvb2, jqf jqf2, jvc jvc2, jro jro2, int n2) {
        if ((n2 & 1) != 0) {
            jqf2 = jqg.a;
        }
        if ((n2 & 2) != 0) {
            jvc2 = jvc.a;
        }
        return jse.af(jvb2, jqf2, jvc2, jro2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object ai(Collection var0, jqb var1_1) {
        if (!(var1_1 instanceof jug)) ** GOTO lbl-1000
        var3_2 /* !! */  = (jug)var1_1;
        var2_3 = var3_2 /* !! */ .c;
        if ((var2_3 & -2147483648) != 0) {
            var3_2 /* !! */ .c = var2_3 + -2147483648;
            var1_1 = var3_2 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = new jug(var1_1);
        }
        var4_4 = var1_1.b;
        var3_2 /* !! */  = jqh.a;
        var2_3 = var1_1.c;
        if (var2_3 == 0) ** GOTO lbl18
        if (var2_3 == 1) {
            var0 = var1_1.a;
            jns.ak(var4_4);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            jns.ak(var4_4);
            var0 = var0.iterator();
        }
        while (var0.hasNext()) {
            var4_4 = (jwi)var0.next();
            var1_1.a = var0;
            var1_1.c = 1;
            if (var4_4.o(var1_1) != var3_2 /* !! */ ) continue;
            return var3_2 /* !! */ ;
        }
        return jon.a;
    }

    public static Object aj(kbq object, Object object2, jro object3) {
        try {
            if (!(object3 instanceof jqm)) {
                object2 = jjj.l(object3, object2, object);
            } else {
                jsl.c(object3, 2);
                object2 = object3.b(object2, object);
            }
        }
        catch (Throwable throwable) {
            object2 = new jut(throwable);
        }
        object3 = jqh.a;
        if (object2 == object3) {
            object = object3;
        } else if ((object2 = object.C(object2)) == jwq.b) {
            object = jqh.a;
        } else {
            if (object2 instanceof jut) {
                object2 = ((jut)object2).b;
                object = object.e;
                if (jve.b && object instanceof jqp) {
                    throw kbs.a((Throwable)object2, object);
                }
                throw object2;
            }
            object = jwq.b(object2);
        }
        return object;
    }

    public static void ak(jqb jqb2, jqb jqb3) {
        try {
            kba.a(jjj.n(jqb2), jon.a);
            return;
        }
        catch (Throwable throwable) {
            jse.ay(jqb3, throwable);
            return;
        }
    }

    public static void al(jro jro2, Object object, jqb jqb2) {
        try {
            kba.a(jjj.n(jjj.m(jro2, object, jqb2)), jon.a);
            return;
        }
        catch (Throwable throwable) {
            jse.ay(jqb2, throwable);
            return;
        }
    }

    public static int am(String string, int n2, int n3, int n4) {
        return (int)jse.an(string, n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     */
    public static long an(String var0, long var1_1, long var3_2, long var5_3) {
        block6: {
            block9: {
                block7: {
                    block8: {
                        var18_4 = kbu.a(var0);
                        if (var18_4 == null) {
                            return var1_1;
                        }
                        jse.ab(10);
                        var9_5 = var18_4.length();
                        if (var9_5 == 0) lbl-1000:
                        // 7 sources

                        {
                            while (true) {
                                var17_6 = null;
                                break block6;
                                break;
                            }
                        }
                        var8_7 = false;
                        var10_8 = var18_4.charAt(0);
                        var7_9 = jse.a(var10_8, 48);
                        var1_1 = -9223372036854775807L;
                        if (var7_9 >= 0) break block7;
                        var7_9 = 1;
                        if (var9_5 == 1) ** GOTO lbl-1000
                        if (var10_8 != 45) break block8;
                        var1_1 = -9223372036854775808L;
                        var8_7 = true;
                        break block9;
                    }
                    if (var10_8 != 43) ** GOTO lbl-1000
                    break block9;
                }
                var7_9 = 0;
            }
            var13_10 = 0L;
            var15_11 = -256204778801521550L;
            while (var7_9 < var9_5) {
                block10: {
                    var10_8 = jse.ac(var18_4.charAt(var7_9));
                    if (var10_8 < 0) ** GOTO lbl-1000
                    var11_12 = var15_11;
                    if (var13_10 >= var15_11) break block10;
                    if (var15_11 != -256204778801521550L) ** GOTO lbl-1000
                    var11_12 = -922337203685477580L;
                    if (var13_10 < -922337203685477580L) ** GOTO lbl-1000
                }
                if ((var13_10 *= 10L) >= var1_1 + (var15_11 = (long)var10_8)) ** break;
                ** continue;
                var13_10 -= var15_11;
                ++var7_9;
                var15_11 = var11_12;
            }
            var17_6 = var8_7 != false ? Long.valueOf(var13_10) : Long.valueOf(-var13_10);
        }
        if (var17_6 != null) {
            var1_1 = var17_6.longValue();
            if (var3_2 <= var1_1 && var1_1 <= var5_3) {
                return var1_1;
            }
            var17_6 = new StringBuilder("System property '");
            var17_6.append(var0);
            var17_6.append("' should be in range ");
            var17_6.append(var3_2);
            var17_6.append("..");
            var17_6.append(var5_3);
            var17_6.append(", but is '");
            var17_6.append(var1_1);
            var17_6.append("'");
            throw new IllegalStateException(var17_6.toString());
        }
        throw new IllegalStateException(a.aq(var18_4, var0, "System property '", "' has unrecognized value '", "'"));
    }

    public static boolean ao(String string, boolean bl2) {
        if ((string = kbu.a(string)) != null) {
            return Boolean.parseBoolean(string);
        }
        return bl2;
    }

    public static /* synthetic */ int ap(String string, int n2, int n3, int n4, int n5) {
        int n6 = (n5 & 4) != 0 ? 0 : 1;
        if ((n5 & 8) != 0) {
            n4 = Integer.MAX_VALUE;
        }
        return jse.am(string, n2, n3 | n6 ^ 1, n4);
    }

    public static /* synthetic */ long aq(String string, long l2) {
        return jse.an(string, l2, 1L, Long.MAX_VALUE);
    }

    public static long ar(long l2, long l3) {
        return l2 & (l3 ^ 0xFFFFFFFFFFFFFFFFL);
    }

    public static long as(long l2, int n2) {
        return jse.ar(l2, 0x3FFFFFFFL) | (long)n2;
    }

    public static void at(int n2) {
        if (n2 > 0) {
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Expected positive parallelism level, but got "));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void au(jqf jqf2, Throwable throwable) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : kaw.a) {
            try {
                coroutineExceptionHandler.handleException(jqf2, throwable);
            }
            catch (Throwable throwable2) {
                kaw.a(jvf.h(throwable, throwable2));
            }
            catch (kbb kbb2) {
                return;
            }
        }
        try {
            Object object = new kay(jqf2);
            jns.b(throwable, (Throwable)object);
        }
        catch (Throwable throwable3) {}
        kaw.a(throwable);
    }

    public static /* synthetic */ dml av(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    private static void aw(Throwable throwable) {
        jse.j(throwable, jse.class.getName());
    }

    private static jrk ax() {
        jsf jsf2 = "".length() == 0 ? ero.q : new etv(16);
        return jsf2;
    }

    private static void ay(jqb jqb2, Throwable throwable) {
        jqb2.bD(jns.aj(throwable));
        throw throwable;
    }

    public static void b(Object object) {
        if (object == null) {
            jse.f();
        }
    }

    public static void c(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string);
        jse.aw((Throwable)object);
        throw object;
    }

    public static void d(Object object, String string) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string.concat(" must not be null"));
        jse.aw((Throwable)object);
        throw object;
    }

    public static void e(Object object, String string) {
        if (object == null) {
            jse.g(string);
        }
    }

    public static void f() {
        NullPointerException nullPointerException = new NullPointerException();
        jse.aw(nullPointerException);
        throw nullPointerException;
    }

    public static void g(String object) {
        int n2;
        Object object2 = Thread.currentThread().getStackTrace();
        String string = jse.class.getName();
        int n3 = 0;
        do {
            n2 = ++n3;
        } while (!object2[n3].getClassName().equals(string));
        while (object2[n2].getClassName().equals(string)) {
            ++n2;
        }
        object2 = object2[n2];
        string = ((StackTraceElement)object2).getClassName();
        object2 = ((StackTraceElement)object2).getMethodName();
        StringBuilder stringBuilder = new StringBuilder("Parameter specified as non-null is null: method ");
        stringBuilder.append(string);
        stringBuilder.append(".");
        stringBuilder.append((String)object2);
        stringBuilder.append(", parameter ");
        stringBuilder.append((String)object);
        object = new NullPointerException(stringBuilder.toString());
        jse.aw((Throwable)object);
        throw object;
    }

    public static void h(String object) {
        object = new jom(a.aj((String)object, "lateinit property ", " has not been initialized"));
        jse.aw((Throwable)object);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean i(Object object, Object object2) {
        if (object != null) return object.equals(object2);
        if (object2 == null) return true;
        return false;
    }

    static void j(Throwable throwable, String string) {
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        int n2 = stackTraceElementArray.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals(stackTraceElementArray[i2].getClassName())) continue;
            n3 = i2;
        }
        throwable.setStackTrace(Arrays.copyOfRange(stackTraceElementArray, n3 + 1, n2));
    }

    public static int k(int n2, int n3) {
        if (n2 < n3) {
            return n3;
        }
        return n2;
    }

    public static int l(int n2, int n3) {
        if (n2 > n3) {
            return n3;
        }
        return n2;
    }

    public static long m(long l2, long l3) {
        if (l2 < l3) {
            return l3;
        }
        return l2;
    }

    public static long n(long l2, long l3) {
        if (l2 > l3) {
            return l3;
        }
        return l2;
    }

    public static long o(long l2, long l3, long l4) {
        if (l3 <= l4) {
            if (l2 < l3) {
                return l3;
            }
            if (l2 > l4) {
                return l4;
            }
            return l2;
        }
        StringBuilder stringBuilder = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        stringBuilder.append(l4);
        stringBuilder.append(" is less than minimum ");
        stringBuilder.append(l3);
        stringBuilder.append(".");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static jsv p(jsv jsv2, int n2) {
        jse.e(jsv2, "<this>");
        int n3 = n2;
        if (jsv2.c <= 0) {
            n3 = -n2;
        }
        n2 = jsv2.b;
        return new jsv(jsv2.a, n2, n3);
    }

    public static jsw q(int n2, int n3) {
        if (n3 <= Integer.MIN_VALUE) {
            return jsw.d;
        }
        return new jsw(n2, n3 - 1);
    }

    public static void r(Appendable appendable, Object object, jrk jrk2) {
        if (jrk2 != null) {
            appendable.append((CharSequence)jrk2.a(object));
            return;
        }
        if (object != null && !(object instanceof CharSequence)) {
            if (object instanceof Character) {
                appendable.append(((Character)object).charValue());
                return;
            }
            appendable.append(object.toString());
            return;
        }
        appendable.append((CharSequence)object);
    }

    public static String s(String object) {
        int n2;
        int n3;
        Object object2;
        Object object3 = jse.A((CharSequence)object);
        Object object4 = new ArrayList();
        Object object5 = object3.iterator();
        while (object5.hasNext()) {
            object2 = object5.next();
            if (jse.C((String)object2)) continue;
            object4.add(object2);
        }
        object5 = new ArrayList(jns.B(object4));
        object4 = object4.iterator();
        while (true) {
            block16: {
                boolean bl2 = object4.hasNext();
                n3 = 0;
                if (!bl2) break;
                object2 = (String)object4.next();
                n3 = object2.length();
                for (n2 = 0; n2 < n3; ++n2) {
                    if (jse.aa(object2.charAt(n2))) {
                        continue;
                    }
                    break block16;
                }
                n2 = -1;
            }
            n3 = n2;
            if (n2 == -1) {
                n3 = ((String)object2).length();
            }
            object5.add(n3);
        }
        object2 = object5.iterator();
        if (!object2.hasNext()) {
            object5 = null;
        } else {
            object4 = (Comparable)object2.next();
            while (true) {
                object5 = object4;
                if (!object2.hasNext()) break;
                object5 = (Comparable)object2.next();
                if (object4.compareTo(object5) <= 0) continue;
                object4 = object5;
            }
        }
        object4 = (Integer)object5;
        n2 = object4 != null ? (Integer)object4 : 0;
        int n4 = ((String)object).length();
        object3.size();
        object2 = jse.ax();
        int n5 = jns.e((List)object3);
        object5 = new ArrayList<Integer>();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            block19: {
                block18: {
                    block17: {
                        object = object3.next();
                        if (n3 < 0) {
                            jns.i();
                        }
                        object4 = object;
                        if (n3 != 0 && n3 != n5 || !jse.C((CharSequence)object4)) break block17;
                        object = null;
                        break block18;
                    }
                    jse.e(object4, "<this>");
                    if (n2 < 0) break block19;
                    String string = ((String)object4).substring(jse.l(n2, ((String)object4).length()));
                    jse.d(string, "substring(...)");
                    object = object4;
                    if (string != null && (object = (String)object2.a(string)) == null) {
                        object = object4;
                    }
                }
                if (object != null) {
                    object5.add(object);
                }
                ++n3;
                continue;
            }
            throw new IllegalArgumentException(a.ah(n2, "Requested character count ", " is less than zero."));
        }
        object = new StringBuilder(n4);
        jns.I(object5, (Appendable)object);
        return ((StringBuilder)object).toString();
    }

    public static boolean t(String string, int n2, String string2, int n3, int n4, boolean bl2) {
        jse.e(string, "<this>");
        jse.e(string2, "other");
        bl2 = !bl2 ? string.regionMatches(n2, string2, n3, n4) : string.regionMatches(true, n2, string2, n3, n4);
        return bl2;
    }

    public static boolean u(String string, String string2, int n2, boolean bl2) {
        jse.e(string, "<this>");
        if (!bl2) {
            return string.startsWith(string2, n2);
        }
        return jse.t(string, n2, string2, 0, string2.length(), true);
    }

    public static int v(CharSequence charSequence) {
        jse.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence w(CharSequence charSequence) {
        jse.e(charSequence, "<this>");
        int n2 = charSequence.length() - 1;
        int n3 = 0;
        boolean bl2 = false;
        while (n3 <= n2) {
            int n4 = true != bl2 ? n3 : n2;
            boolean bl3 = jse.aa(charSequence.charAt(n4));
            if (!bl2) {
                if (!bl3) {
                    bl2 = true;
                    continue;
                }
                ++n3;
                continue;
            }
            if (!bl3) break;
            --n2;
        }
        return charSequence.subSequence(n3, n2 + 1);
    }

    public static String x(String string, CharSequence charSequence) {
        jse.e(string, "<this>");
        jse.e(string, "<this>");
        boolean bl2 = string instanceof String ? jse.X(string, (String)charSequence) : jse.R(string, 0, charSequence, 0, charSequence.length());
        String string2 = string;
        if (bl2) {
            string2 = string.substring(charSequence.length());
            jse.d(string2, "substring(...)");
        }
        return string2;
    }

    public static String y(CharSequence charSequence, jsw jsw2) {
        jse.e(charSequence, "<this>");
        jse.e(jsw2, "range");
        int n2 = jsw2.a;
        Integer.valueOf(n2).getClass();
        int n3 = jsw2.b;
        Integer.valueOf(n3).getClass();
        return ((Object)charSequence.subSequence(n2, n3 + 1)).toString();
    }

    public static String z(String string, String string2, String string3) {
        jse.e(string, "<this>");
        jse.e(string3, "missingDelimiterValue");
        int n2 = jse.M(string, string2, 0, 6);
        if (n2 == -1) {
            return string3;
        }
        string = string.substring(n2 + string2.length(), string.length());
        jse.d(string, "substring(...)");
        return string;
    }
}

