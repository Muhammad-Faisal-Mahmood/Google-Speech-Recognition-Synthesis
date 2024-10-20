/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class jsl {
    public static final /* synthetic */ dml A(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    public static final /* synthetic */ dml B(hwp hwp2) {
        jse.e(hwp2, "builder");
        return new dml(hwp2);
    }

    public static void a(Object object, String string) {
        object = object == null ? "null" : object.getClass().getName();
        object = new ClassCastException(a.ao(string, (String)object, " cannot be cast to "));
        jse.j((Throwable)object, jsl.class.getName());
        throw object;
    }

    public static boolean b(Object object, int n2) {
        int n3;
        return object instanceof jnv && (n3 = object instanceof jsb ? ((jsb)object).i() : (object instanceof jqz ? 0 : (object instanceof jrk ? 1 : (object instanceof jro ? 2 : (object instanceof jrp ? 3 : (object instanceof jrq ? 4 : (object instanceof jrr ? 5 : (object instanceof jrs ? 6 : (object instanceof jrt ? 7 : (object instanceof jru ? 8 : (object instanceof jrv ? 9 : (object instanceof jra ? 10 : (object instanceof jrb ? 11 : (object instanceof jrc ? 12 : (object instanceof jrd ? 13 : (object instanceof jre ? 14 : (object instanceof jrf ? 15 : (object instanceof jrg ? 16 : (object instanceof jrh ? 17 : (object instanceof jri ? 18 : (object instanceof jrj ? 19 : (object instanceof jrl ? 20 : (object instanceof jrm ? 21 : (object instanceof jrn ? 22 : -1)))))))))))))))))))))))) == n2;
    }

    public static void c(Object object, int n2) {
        if (object != null && !jsl.b(object, n2)) {
            jsl.a(object, a.af(n2, "kotlin.jvm.functions.Function"));
        }
    }

    public static jtl d(jtl jtl2) {
        if (jtl2 instanceof jte) {
            return jtl2;
        }
        return new jte(jtl2);
    }

    public static List e(jtl jtl2) {
        Iterator iterator = jtl2.a();
        if (!iterator.hasNext()) {
            return jpa.a;
        }
        jtl2 = iterator.next();
        if (!iterator.hasNext()) {
            return jns.d(jtl2);
        }
        ArrayList<jtl> arrayList = new ArrayList<jtl>();
        arrayList.add(jtl2);
        while (iterator.hasNext()) {
            arrayList.add((jtl)iterator.next());
        }
        return arrayList;
    }

    public static /* synthetic */ String f(jtl object, CharSequence charSequence) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((CharSequence)"");
        object = object.a();
        int n2 = 0;
        while (object.hasNext()) {
            Object e2 = object.next();
            if (++n2 > 1) {
                stringBuilder.append(charSequence);
            }
            jse.r(stringBuilder, e2, null);
        }
        stringBuilder.append((CharSequence)"");
        return stringBuilder.toString();
    }

    public static final long g(long l2, jty enum_, jty jty2) {
        jse.e(enum_, "sourceUnit");
        jse.e((Object)jty2, "targetUnit");
        enum_ = ((jty)enum_).h;
        return jty2.h.convert(l2, (TimeUnit)enum_);
    }

    public static final long h(long l2, jty enum_, jty jty2) {
        jse.e(enum_, "sourceUnit");
        jse.e((Object)jty2, "targetUnit");
        enum_ = ((jty)enum_).h;
        return jty2.h.convert(l2, (TimeUnit)enum_);
    }

    public static final long i(long l2) {
        long l3 = jtw.a;
        int n2 = jtx.a;
        return l2 + l2 + 1L;
    }

    public static final long j(long l2) {
        return l2 * 1000000L;
    }

    public static final long k(long l2) {
        return l2 / 1000000L;
    }

    public static final long l(long l2, jty jty2) {
        jse.e((Object)jty2, "unit");
        long l3 = jsl.h(4611686018426999999L, jty.a, jty2);
        if (new jsy(-l3, l3).b(l2)) {
            l2 = jsl.h(l2, jty2, jty.a);
            l3 = jtw.a;
            int n2 = jtx.a;
            return l2 + l2;
        }
        return jsl.i(jse.o(jsl.g(l2, jty2, jty.c), -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final Object m(Object object, jqb jqb2) {
        Object object2 = object;
        if (object instanceof jut) {
            object = object2 = ((jut)object).b;
            if (jve.b) {
                object = object2;
                if (jqb2 instanceof jqp) {
                    object = kbs.a((Throwable)object2, (jqp)((Object)jqb2));
                }
            }
            object2 = jns.aj((Throwable)object);
        }
        return object2;
    }

    public static final Object n(Object object) {
        Throwable throwable = joe.a(object);
        if (throwable == null) {
            return object;
        }
        return new jut(throwable);
    }

    public static final jur o(Object object) {
        jur jur2 = new jur();
        jur2.O(object);
        return jur2;
    }

    public static final void p(jur jur2, Object object) {
        Throwable throwable = joe.a(object);
        if (throwable == null) {
            jur2.O(object);
            return;
        }
        jur2.O(new jut(throwable));
    }

    public static final jul q(jqb object) {
        Object object2;
        if (!(object instanceof kaz)) {
            return new jul((jqb)object, 1);
        }
        kaz kaz2 = (kaz)object;
        juc juc2 = kaz2.f;
        while (true) {
            block9: {
                block8: {
                    block7: {
                        if ((object2 = juc2.a) != null) break block7;
                        kaz2.f.c(kba.b);
                        object2 = null;
                        break block8;
                    }
                    if (!(object2 instanceof jul)) break block9;
                    if (!kaz2.f.d(object2, kba.b)) continue;
                    object2 = (jul)object2;
                }
                if (object2 != null) {
                    boolean bl2 = jve.a;
                    object = ((jul)object2).d.a;
                    if (object instanceof jus) {
                        object = ((jus)object).d;
                    }
                    ((jul)object2).c.b = 0x1FFFFFFF;
                    ((jul)object2).d.c(juf.a);
                    return object2;
                }
                return new jul((jqb)object, 2);
            }
            if (object2 != kba.b && !(object2 instanceof Throwable)) break;
        }
        Objects.toString(object2);
        throw new IllegalStateException("Inconsistent state ".concat(object2.toString()));
    }

    public static final void r(jul jul2, jvq jvq2) {
        jul2.t(new juj(jvq2, 2));
    }

    public static /* synthetic */ void s(jul jul2) {
        jul2.A(null);
    }

    public static final kfy u(String string) {
        kfy kfy2 = new kfy(string);
        kfy.b.put(string, kfy2);
        return kfy2;
    }

    public static final String v(Certificate object) {
        jse.e(object, "certificate");
        if (object instanceof X509Certificate) {
            jse.e(object, "<this>");
            Object object2 = klp.a;
            object = ((X509Certificate)object).getPublicKey().getEncoded();
            jse.d(object, "getEncoded(...)");
            jse.e(object, "<this>");
            jse.e(object, "<this>");
            int n2 = ((Object)object).length;
            long l2 = n2;
            kmp.x(l2, 0L, l2);
            object = new klp(jns.ab((byte[])object, n2));
            byte[] byArray = ((klp)object).b;
            object2 = MessageDigest.getInstance("SHA-256");
            ((MessageDigest)object2).update(byArray, 0, ((klp)object).b());
            object = ((MessageDigest)object2).digest();
            jse.b(object);
            return "sha256/".concat(new klp((byte[])object).c());
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public static final int w(String string, String string2, int n2) {
        int n3 = string.length();
        while (n2 < n3) {
            if (jse.E(string2, string.charAt(n2))) {
                return n2;
            }
            ++n2;
        }
        return string.length();
    }

    public static int x(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 17: {
                return 19;
            }
            case 16: {
                return 18;
            }
            case 15: {
                return 17;
            }
            case 14: {
                return 16;
            }
            case 13: {
                return 15;
            }
            case 12: {
                return 14;
            }
            case 11: {
                return 13;
            }
            case 10: {
                return 12;
            }
            case 9: {
                return 11;
            }
            case 8: {
                return 10;
            }
            case 7: {
                return 9;
            }
            case 6: {
                return 8;
            }
            case 5: {
                return 7;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 2;
            }
            case -1: 
        }
        return 1;
    }

    public static int y(int n2) {
        if (n2 != 99) {
            switch (n2) {
                default: {
                    return 0;
                }
                case 14: {
                    return 15;
                }
                case 13: {
                    return 14;
                }
                case 12: {
                    return 13;
                }
                case 11: {
                    return 12;
                }
                case 10: {
                    return 11;
                }
                case 9: {
                    return 10;
                }
                case 8: {
                    return 9;
                }
                case 7: {
                    return 8;
                }
                case 6: {
                    return 7;
                }
                case 5: {
                    return 6;
                }
                case 4: {
                    return 5;
                }
                case 3: {
                    return 4;
                }
                case 2: {
                    return 3;
                }
                case 1: {
                    return 2;
                }
                case 0: 
            }
            return 1;
        }
        return 100;
    }

    public static /* synthetic */ int z(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kfy t(String string) {
        synchronized (this) {
            Object object;
            jse.e(string, "javaName");
            Object object2 = object = (kfy)kfy.b.get(string);
            if (object == null) {
                object = kfy.b;
                if (jse.X(string, "TLS_")) {
                    object2 = string.substring(4);
                    jse.d(object2, "substring(...)");
                    object2 = "SSL_".concat(String.valueOf(object2));
                } else if (jse.X(string, "SSL_")) {
                    object2 = string.substring(4);
                    jse.d(object2, "substring(...)");
                    object2 = "TLS_".concat(String.valueOf(object2));
                } else {
                    object2 = string;
                }
                object2 = object = (kfy)object.get(object2);
                if (object == null) {
                    object2 = new kfy(string);
                }
                kfy.b.put(string, object2);
            }
            return object2;
        }
    }
}

