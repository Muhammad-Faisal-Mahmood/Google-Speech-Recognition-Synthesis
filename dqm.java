/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dqm {
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern f;
    private static final Pattern g;
    private final jnu h;

    static {
        hav.r("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        d = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        a = Pattern.compile("([^\\?]+)(\\?+)");
        e = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
        c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
        f = Pattern.compile("([a-zA-Z0-9-_]+)");
        g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public dqm(jnu jnu2) {
        this.h = jnu2;
    }

    static String a(String object) {
        if (((Matcher)(object = e.matcher((CharSequence)object))).matches()) {
            return ((Matcher)object).group(1);
        }
        return null;
    }

    static String b(String string) {
        if (string == null) {
            return null;
        }
        Matcher matcher = g.matcher(string);
        if (matcher.find()) {
            string = matcher.replaceFirst("<ip>");
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    public final kfl c(Iterable var1_1) {
        var8_2 = kdy.a.l();
        var9_3 = var1_1.iterator();
        while (var9_3.hasNext()) {
            var11_10 = (dql)var9_3.next();
            var10_9 = kdx.a.l();
            var2_4 = var11_10.e;
            if (var2_4 > 0) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.b |= 128;
                var1_1.j = var2_4;
            }
            if ((var2_4 = var11_10.d) > 0) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.b |= 64;
                var1_1.i = var2_4;
            }
            if ((var4_6 = var11_10.c) > 0L) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.b |= 8;
                var1_1.f = (int)var4_6;
            }
            if ((var4_6 = var11_10.b) > 0L) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.b |= 16;
                var1_1.g = (int)var4_6;
            }
            var2_4 = var11_10.j;
            if (!var10_9.b.B()) {
                var10_9.u();
            }
            var1_1 = (kdx)var10_9.b;
            var1_1.b |= 32;
            var1_1.h = var2_4;
            if (var11_10.s >= 0) {
                var1_1 = kdz.a.l();
                var2_4 = var11_10.s;
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var6_7 = (kdz)var1_1.b;
                var6_7.b |= 1;
                var6_7.c = var2_4;
                var6_7 = (kdz)var1_1.o();
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var6_7.getClass();
                var1_1.x = var6_7;
                var1_1.b |= 0x400000;
            }
            if ((var1_1 = var11_10.k) != null) {
                if (fxf.P((String)var1_1)) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 = null;
                        break;
                    }
                } else {
                    var6_7 = dqm.d.matcher((CharSequence)var1_1);
                    if (var6_7.find()) {
                        var1_1 = var6_7.group(0);
                    } else {
                        ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector", "extractContentType", 396, "NetworkMetricCollector.java")).u("contentType extraction failed for %s, skipping logging path", var1_1);
                        ** continue;
                    }
                }
                if (var1_1 != null) {
                    if (!var10_9.b.B()) {
                        var10_9.u();
                    }
                    var6_7 = (kdx)var10_9.b;
                    var6_7.b |= 1;
                    var6_7.c = var1_1;
                }
            }
            if (fxf.P((String)(var1_1 = var11_10.i))) {
                while (true) {
                    var2_4 = 1;
                    break;
                }
            } else if (var1_1.equals("http/1.1")) {
                var2_4 = 2;
            } else if (var1_1.equals("spdy/2")) {
                var2_4 = 3;
            } else if (var1_1.equals("spdy/3")) {
                var2_4 = 4;
            } else if (var1_1.equals("spdy/3.1")) {
                var2_4 = 5;
            } else if (var1_1.startsWith("h2")) {
                var2_4 = 6;
            } else if (var1_1.equals("quic/1+spdy/3")) {
                var2_4 = 7;
            } else {
                if (!var1_1.equals("http/2+quic/43")) ** continue;
                var2_4 = 8;
            }
            if (!var10_9.b.B()) {
                var10_9.u();
            }
            var1_1 = (kdx)var10_9.b;
            var1_1.k = var2_4 - 1;
            var1_1.b |= 256;
            ((djq)this.h).a();
            var1_1 = var11_10.f;
            if (var1_1 != null) {
                if (var11_10.h) {
                    var6_7 = var11_10.g;
                    if (!var10_9.b.B()) {
                        var10_9.u();
                    }
                    var7_8 = (kdx)var10_9.b;
                    var7_8.b = 4 | var7_8.b;
                    var7_8.e = var1_1;
                    var1_1 = var6_7;
                } else {
                    var7_8 = dqm.a((String)var1_1);
                    ((djq)this.h).a();
                    if (fxf.P((String)var1_1)) {
                        while (true) {
                            var6_7 = null;
                            break;
                        }
                    } else {
                        var6_7 = dqm.a((String)var1_1);
                        if (var6_7 != null) {
                            var1_1 = var6_7;
                        }
                        var3_5 = var6_7 != null ? 1 : 0;
                        var6_7 = dqm.a.matcher((CharSequence)var1_1);
                        if (var6_7.find()) {
                            var1_1 = var6_7.group(1);
                            var3_5 = 1;
                        }
                        var6_7 = dqm.b((String)var1_1);
                        var2_4 = var3_5;
                        if (var6_7 != null) {
                            var2_4 = var3_5;
                            if (!var6_7.equals(var1_1)) {
                                var2_4 = 1;
                            }
                        }
                        var3_5 = var2_4;
                        var1_1 = var6_7;
                        if (var6_7 != null) {
                            var12_11 = dqm.g.matcher((CharSequence)var6_7);
                            var3_5 = var2_4;
                            var1_1 = var6_7;
                            if (var12_11.find()) {
                                var1_1 = var12_11.replaceFirst("<ip>");
                                var3_5 = 1;
                            }
                        }
                        var6_7 = var1_1;
                        if (var1_1 != null) {
                            var6_7 = var1_1;
                            if (var3_5 == 0) {
                                if (!(var1_1 = dqm.f.matcher((CharSequence)var1_1)).find()) ** continue;
                                var6_7 = var1_1.group(1);
                            }
                        }
                    }
                    var1_1 = var7_8;
                    if (var6_7 != null) {
                        if (!var10_9.b.B()) {
                            var10_9.u();
                        }
                        var1_1 = (kdx)var10_9.b;
                        var1_1.b |= 2;
                        var1_1.d = var6_7;
                        var1_1 = var7_8;
                    }
                }
            } else {
                var1_1 = null;
            }
            if (var1_1 != null && (var1_1 = dqm.b((String)var1_1)) != null) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var6_7 = (kdx)var10_9.b;
                var6_7.b |= 0x200000;
                var6_7.w = var1_1;
            }
            if ((var6_7 = var11_10.l) != null) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.l = var6_7;
                var1_1.b |= 512;
            }
            var6_7 = (kdw)gto.h(kdw.b(var11_10.m)).e(kdw.a);
            if (!var10_9.b.B()) {
                var10_9.u();
            }
            var1_1 = (kdx)var10_9.b;
            var1_1.m = var6_7.c;
            var1_1.b |= 1024;
            var6_7 = kdv.a.l();
            var2_4 = var11_10.u;
            if (var2_4 != 0) {
                if (!var6_7.b.B()) {
                    var6_7.u();
                }
                var1_1 = (kdv)var6_7.b;
                var1_1.c = var2_4 - 2;
                var1_1.b |= 1;
            }
            if (!var10_9.b.B()) {
                var10_9.u();
            }
            var1_1 = (kdx)var10_9.b;
            var6_7 = (kdv)var6_7.o();
            var6_7.getClass();
            var1_1.n = var6_7;
            var1_1.b |= 2048;
            var2_4 = var11_10.v;
            if (var2_4 != 0) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.o = var2_4 - 1;
                var1_1.b |= 4096;
            }
            var1_1 = var11_10.n;
            var4_6 = var11_10.a;
            if (var4_6 > 0L) {
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.b |= 16384;
                var1_1.p = var4_6;
            }
            if (var11_10.q > 0) {
                var1_1 = kdu.a.l();
                var2_4 = var11_10.q;
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var6_7 = var1_1.b;
                var7_8 = (kdu)var6_7;
                var7_8.b |= 1;
                var7_8.c = var2_4;
                if (var11_10.r > 0) {
                    if (!var6_7.B()) {
                        var1_1.u();
                    }
                    var6_7 = (kdu)var1_1.b;
                    var6_7.b |= 2;
                    var6_7.d = 1;
                }
                var1_1 = (kdu)var1_1.o();
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var6_7 = (kdx)var10_9.b;
                var1_1.getClass();
                var6_7.y = var1_1;
                var6_7.b |= 0x800000;
            }
            if ((var1_1 = var11_10.t).g()) {
                var4_6 = (Long)var1_1.c();
                if (!var10_9.b.B()) {
                    var10_9.u();
                }
                var1_1 = (kdx)var10_9.b;
                var1_1.b |= 0x1000000;
                var1_1.z = var4_6;
            }
            var2_4 = var11_10.w;
            if (!var10_9.b.B()) {
                var10_9.u();
            }
            var6_7 = var10_9.b;
            var1_1 = (kdx)var6_7;
            if (var2_4 != 0) {
                var1_1.q = var2_4 - 1;
                var1_1.b |= 32768;
                var2_4 = a.D(var11_10.o);
                if (!var6_7.B()) {
                    var10_9.u();
                }
                var1_1 = var10_9.b;
                var6_7 = (kdx)var1_1;
                if (var2_4 != 0) {
                    var6_7.r = var2_4 - 1;
                    var6_7.b |= 65536;
                    var2_4 = var11_10.p;
                    if (!var1_1.B()) {
                        var10_9.u();
                    }
                    var6_7 = var10_9.b;
                    var1_1 = (kdx)var6_7;
                    var1_1.b |= 131072;
                    var1_1.s = var2_4;
                    if (!var6_7.B()) {
                        var10_9.u();
                    }
                    var1_1 = (kdx)var10_9.b;
                    var1_1.b |= 262144;
                    var1_1.t = 0;
                    if (!var8_2.b.B()) {
                        var8_2.u();
                    }
                    var1_1 = (kdy)var8_2.b;
                    var6_7 = (kdx)var10_9.o();
                    var6_7.getClass();
                    var1_1.c();
                    var1_1.b.add(var6_7);
                    continue;
                }
                throw null;
            }
            throw null;
        }
        var6_7 = kfl.a.l();
        if (!var6_7.b.B()) {
            var6_7.u();
        }
        var1_1 = (kfl)var6_7.b;
        var7_8 = (kdy)var8_2.o();
        var7_8.getClass();
        var1_1.h = var7_8;
        var1_1.b |= 32;
        return (kfl)var6_7.o();
    }
}

