/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ftb
implements jnu {
    private static final Charset b;
    private static final List c;
    public volatile fta a;
    private final Map d;
    private final Object e = new Object();
    private final String f;

    static {
        new ftb("");
        b = Charset.forName("UTF-8");
        c = new ArrayList();
    }

    private ftb(String string) {
        this.d = new HashMap(10);
        this.f = string;
    }

    public static long a(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes(b));
            long l2 = ByteBuffer.wrap(messageDigest.digest()).getLong();
            return l2;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ftb e(String string) {
        synchronized (ftb.class) {
            ftb ftb2;
            boolean bl2;
            Object object = c.iterator();
            do {
                if (!object.hasNext()) {
                    object = new ftb(string);
                    c.add(object);
                    return object;
                }
                ftb2 = (ftb)object.next();
            } while (!(bl2 = ftb2.f.equals(string)));
            return ftb2;
        }
    }

    @Override
    public final /* synthetic */ Object b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final fsu c(String string, fsw ... fswArray) {
        Object object = this.e;
        synchronized (object) {
            fsu fsu2 = (fsu)this.d.get(string);
            if (fsu2 != null) {
                fsu2.f(fswArray);
                return fsu2;
            }
            fsu2 = new fsu(string, this, fswArray);
            this.d.put(fsu2.b, fsu2);
            return fsu2;
        }
    }

    public final fta d() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gsa f() {
        var7_1 = new ArrayList<Object>();
        var8_2 = this.e;
        synchronized (var8_2) {
            for (Object var13_8 : this.d.values()) {
                var1_4 = var13_8.c.length > 0 ? 10 : 1;
                var12_7 = new HashMap(var1_4);
                var10_6 = new fsy(var13_8.b, var13_8.c);
                var9_5 = var13_8.a;
                synchronized (var9_5) {
                    var10_6.c = var13_8.d;
                    var10_6.d = var13_8.e;
                    var13_8.d = var12_7;
                    var13_8.e = 0;
                }
                var7_1.add(var10_6);
            }
        }
        var9_5 = gsa.a.l();
        var3_9 = var7_1.size();
        var1_4 = 0;
        block9: while (true) {
            block33: {
                if (var1_4 >= var3_9) {
                    return (gsa)var9_5.o();
                }
                var10_6 = (fsy)var7_1.get(var1_4);
                if (var10_6.d != 0) break block33;
                var8_2 = null;
                ** GOTO lbl60
            }
            var8_2 = hup.a.l();
            var5_12 = ftb.a(var10_6.a);
            if (!var8_2.b.B()) {
                var8_2.u();
            }
            var11_3 = (hup)var8_2.b;
            var11_3.b |= 2;
            var11_3.c = var5_12;
            var11_3 = var10_6.b;
            var4_11 = ((fsw[])var11_3).length;
            for (var2_10 = 0; var2_10 < var4_11; ++var2_10) {
                var5_12 = ftb.a(var11_3[var2_10].a);
                if (!var8_2.b.B()) {
                    var8_2.u();
                }
                var13_8 = (hup)var8_2.b;
                var12_7 = var13_8.d;
                if (!var12_7.c()) {
                    var13_8.d = hwv.r((hxe)var12_7);
                }
                var13_8.d.e(var5_12);
            }
            var11_3 = var10_6.c.entrySet().iterator();
            while (true) {
                block35: {
                    block36: {
                        block34: {
                            if (!var11_3.hasNext()) break block34;
                            var13_8 = (Map.Entry)var11_3.next();
                            var12_7 = huo.a.l();
                            var16_15 = (fsq)var13_8.getKey();
                            var13_8 = (fsr)var13_8.getValue();
                            if (var10_6.b.length <= 0) break block35;
                            var15_14 = var10_6.a;
                            var14_13 = new ArrayList<E>(var16_15.c.length);
                            break block36;
                        }
                        var8_2 = (hup)var8_2.o();
lbl60:
                        // 2 sources

                        if (var8_2 != null) {
                            if (!var9_5.b.B()) {
                                var9_5.u();
                            }
                            var10_6 = (gsa)var9_5.b;
                            var11_3 = var10_6.b;
                            if (!var11_3.c()) {
                                var10_6.b = hwv.s((hxk)var11_3);
                            }
                            var10_6.b.add(var8_2);
                        }
                        ++var1_4;
                        continue block9;
                    }
                    for (var2_10 = 0; var2_10 < var16_15.c.length; ++var2_10) {
                        var17_16 = hum.a.l();
                        var18_17 = var16_15.c[var2_10];
                        if (var18_17 instanceof String) {
                            var19_18 = (String)var18_17;
                            if (!var17_16.b.B()) {
                                var17_16.u();
                            }
                            var18_17 = (hum)var17_16.b;
                            var19_18.getClass();
                            var18_17.b = 1;
                            var18_17.c = var19_18;
                        } else if (var18_17 instanceof Integer) {
                            var18_17 = (Integer)var18_17;
                            var18_17.intValue();
                            if (!var17_16.b.B()) {
                                var17_16.u();
                            }
                            var19_18 = (hum)var17_16.b;
                            var19_18.b = 2;
                            var19_18.c = var18_17;
                        } else {
                            if (!(var18_17 instanceof Boolean)) {
                                var7_1 = String.valueOf(var18_17);
                                var8_2 = new StringBuilder("Metric ");
                                var8_2.append((String)var15_14);
                                var8_2.append(" has field ");
                                var8_2.append(var2_10);
                                var8_2.append(" with an unexpected value: ");
                                var8_2.append((String)var7_1);
                                throw new IllegalArgumentException(var8_2.toString());
                            }
                            var19_18 = (Boolean)var18_17;
                            var19_18.booleanValue();
                            if (!var17_16.b.B()) {
                                var17_16.u();
                            }
                            var18_17 = (hum)var17_16.b;
                            var18_17.b = 3;
                            var18_17.c = var19_18;
                        }
                        var14_13.add((hum)var17_16.o());
                    }
                    if (!var12_7.b.B()) {
                        var12_7.u();
                    }
                    var15_14 = (huo)var12_7.b;
                    var16_15 = var15_14.c;
                    if (!var16_15.c()) {
                        var15_14.c = hwv.s((hxk)var16_15);
                    }
                    hvc.g((Iterable)var14_13, var15_14.c);
                }
                var14_13 = var13_8.a();
                if (!var12_7.b.B()) {
                    var12_7.u();
                }
                var13_8 = (huo)var12_7.b;
                var14_13.getClass();
                var13_8.d = var14_13;
                var13_8.b |= 1;
                if (!var8_2.b.B()) {
                    var8_2.u();
                }
                var13_8 = (hup)var8_2.b;
                var14_13 = (huo)var12_7.o();
                var14_13.getClass();
                var12_7 = var13_8.e;
                if (!var12_7.c()) {
                    var13_8.e = hwv.s((hxk)var12_7);
                }
                var13_8.e.add(var14_13);
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final fsx g(String string, fsw ... fswArray) {
        Object object = this.e;
        synchronized (object) {
            fsx fsx2 = (fsx)this.d.get(string);
            if (fsx2 != null) {
                fsx2.f(fswArray);
                return fsx2;
            }
            fsx2 = new fsx(string, this, fswArray);
            this.d.put(fsx2.b, fsx2);
            return fsx2;
        }
    }
}

