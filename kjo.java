/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class kjo
implements Closeable {
    public static final Logger a;
    public final klo b;
    private final kjn c;
    private final kis d;

    static {
        Logger logger = Logger.getLogger(kiv.class.getName());
        jse.d(logger, "getLogger(...)");
        a = logger;
    }

    public kjo(klo kmk2) {
        jse.e(kmk2, "source");
        this.b = kmk2;
        kmk2 = new kjn((klo)kmk2);
        this.c = kmk2;
        this.d = new kis(kmk2);
    }

    private final List b(int n2, int n3, int n4, int n5) {
        Object object;
        Object object2;
        block10: {
            object2 = this.c;
            ((kjn)object2).d = n2;
            ((kjn)object2).a = n2;
            ((kjn)object2).e = n3;
            ((kjn)object2).b = n4;
            ((kjn)object2).c = n5;
            while (true) {
                klp klp2;
                object2 = this.d;
                if (((kis)object2).c.y()) break block10;
                n2 = khb.z(((kis)object2).c.d());
                if (n2 == 128) break;
                if ((n2 & 0x80) == 128) {
                    n3 = (n2 = ((kis)object2).b(n2, 127)) - 1;
                    if (kis.h(n3)) {
                        object = kiu.a;
                        object = kiu.a[n3];
                        ((kis)object2).b.add(object);
                        continue;
                    }
                    object = kiu.a;
                    n3 = kiu.a.length;
                    n3 = ((kis)object2).a(n2 - 62);
                    if (n3 >= 0 && n3 < ((kir[])(object = ((kis)object2).d)).length) {
                        object2 = ((kis)object2).b;
                        object = object[n3];
                        jse.b(object);
                        object2.add(object);
                        continue;
                    }
                    object2 = new StringBuilder("Header index too large ");
                    ((StringBuilder)object2).append(n2);
                    throw new IOException(((StringBuilder)object2).toString());
                }
                if (n2 == 64) {
                    object = kiu.a;
                    object = ((kis)object2).d();
                    kiu.a((klp)object);
                    ((kis)object2).g(new kir((klp)object, ((kis)object2).d()));
                    continue;
                }
                if ((n2 & 0x40) == 64) {
                    ((kis)object2).g(new kir(((kis)object2).c(((kis)object2).b(n2, 63) - 1), ((kis)object2).d()));
                    continue;
                }
                if ((n2 & 0x20) == 32) {
                    ((kis)object2).a = n2 = ((kis)object2).b(n2, 31);
                    if (n2 >= 0 && n2 <= 4096) {
                        n3 = ((kis)object2).f;
                        if (n2 >= n3) continue;
                        if (n2 == 0) {
                            ((kis)object2).e();
                            continue;
                        }
                        ((kis)object2).f(n3 - n2);
                        continue;
                    }
                    throw new IOException(a.af(n2, "Invalid dynamic table size update "));
                }
                if (n2 != 16 && n2 != 0) {
                    klp2 = ((kis)object2).c(((kis)object2).b(n2, 15) - 1);
                    object = ((kis)object2).d();
                    ((kis)object2).b.add(new kir(klp2, (klp)object));
                    continue;
                }
                object = kiu.a;
                object = ((kis)object2).d();
                kiu.a((klp)object);
                klp2 = ((kis)object2).d();
                ((kis)object2).b.add(new kir((klp)object, klp2));
            }
            throw new IOException("index == 0");
        }
        object2 = this.d.b;
        object = jns.s((Iterable)object2);
        object2.clear();
        return object;
    }

    private final void c() {
        this.b.f();
        this.b.d();
        byte[] byArray = khb.a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean a(boolean var1_1, kjd var2_2) {
        block78: {
            block79: {
                var6_7 = 0;
                var4_8 = 0;
                var3_9 = 0;
                try {
                    this.b.w(9L);
                }
                catch (EOFException var2_6) {
                    return false;
                }
                var5_10 = khb.g(this.b);
                if (var5_10 > 16384) break block78;
                var10_11 = khb.z(this.b.d());
                var8_12 = khb.z(this.b.d());
                var9_13 = this.b.f();
                var7_14 = var9_13 & 0x7FFFFFFF;
                var21_15 = kjo.a;
                if (var21_15.isLoggable(Level.FINE)) {
                    var20_16 /* !! */  = kiv.a;
                    var21_15.fine(kiv.b(true, var7_14, var5_10, var10_11, var8_12));
                }
                if (!var1_1) break block79;
                if (var10_11 != 4) {
                    var2_2 = kiv.a;
                    throw new IOException("Expected a SETTINGS frame but was ".concat(String.valueOf(kiv.a(var10_11))));
                }
                ** GOTO lbl-1000
            }
            switch (var10_11) {
                default: {
                    this.b.x(var5_10);
                    break;
                }
                case 8: {
                    if (var5_10 == 4) {
                        var12_22 = (long)this.b.f() & 0x7FFFFFFFL;
                        if (var12_22 != 0L) {
                            if (var7_14 == 0) {
                                var2_2 = var2_2.a;
                                synchronized (var2_2) {
                                    var2_2.t += var12_22;
                                    var2_2.notifyAll();
                                    break;
                                }
                            }
                            var2_2 = var2_2.a.a(var7_14);
                            if (var2_2 == null) break;
                            synchronized (var2_2) {
                                var2_2.d(var12_22);
                                break;
                            }
                        }
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    throw new IOException(a.af(var5_10, "TYPE_WINDOW_UPDATE length !=4: "));
                }
                case 7: {
                    if (var5_10 >= 8) {
                        if (var7_14 == 0) {
                            var20_16 /* !! */  = this.b;
                            var5_10 -= 8;
                            var4_8 = var20_16 /* !! */ .f();
                            var6_7 = var20_16 /* !! */ .f();
                            if (kmp.F(var6_7) != null) {
                                var20_16 /* !! */  = klp.a;
                                if (var5_10 > 0) {
                                    var20_16 /* !! */  = this.b.p(var5_10);
                                }
                                jse.e(var20_16 /* !! */ , "debugData");
                                var20_16 /* !! */ .b();
                                var20_16 /* !! */  = var2_2.a;
                                synchronized (var20_16 /* !! */ ) {
                                    var21_15 = var20_16 /* !! */ .c.values().toArray(new kjs[0]);
                                    var20_16 /* !! */ .g = true;
                                }
                                var21_15 = (kjs[])var21_15;
                                var5_10 = ((Object)var21_15).length;
                                while (var3_9 < var5_10) {
                                    var20_16 /* !! */  = var21_15[var3_9];
                                    if (var20_16 /* !! */ .a > var4_8 && var20_16 /* !! */ .l()) {
                                        var20_16 /* !! */ .j(kiq.h);
                                        var2_2.a.b(var20_16 /* !! */ .a);
                                    }
                                    ++var3_9;
                                }
                                break;
                                {
                                    catch (Throwable var2_3) {
                                        throw var2_3;
                                    }
                                }
                            }
                            throw new IOException(a.af(var6_7, "TYPE_GOAWAY unexpected error code: "));
                        }
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    throw new IOException(a.af(var5_10, "TYPE_GOAWAY length < 8: "));
                }
                case 6: {
                    if (var5_10 != 8) ** GOTO lbl111
                    if (var7_14 != 0) ** GOTO lbl110
                    var20_16 /* !! */  = this.b;
                    var4_8 = var20_16 /* !! */ .f();
                    var3_9 = var20_16 /* !! */ .f();
                    if ((var8_12 & 1) == 0) ** GOTO lbl106
                    var2_2 = var2_2.a;
                    synchronized (var2_2) {
                        if (var4_8 == 1) ** GOTO lbl102
                        if (var4_8 == 2) ** GOTO lbl100
                        if (var4_8 != 3) break;
                        ++var2_2.o;
                        var2_2.notifyAll();
                        break;
lbl100:
                        // 1 sources

                        ++var2_2.n;
                        break;
lbl102:
                        // 1 sources

                        ++var2_2.l;
                        break;
                    }
lbl106:
                    // 1 sources

                    var20_16 /* !! */  = var2_2.a;
                    var2_2 = new kjb(String.valueOf(var20_16 /* !! */ .d).concat(" ping"), (kjl)var20_16 /* !! */ , var4_8, var3_9);
                    var20_16 /* !! */ .i.f((khd)var2_2);
                    break;
lbl110:
                    // 1 sources

                    throw new IOException("TYPE_PING streamId != 0");
lbl111:
                    // 1 sources

                    throw new IOException(a.af(var5_10, "TYPE_PING length != 8: "));
                }
                case 5: {
                    if (var7_14 != 0) {
                        var3_9 = var6_7;
                        if ((var8_12 & 8) != 0) {
                            var3_9 = khb.z(this.b.d());
                        }
                        var4_8 = this.b.f() & 0x7FFFFFFF;
                        var20_16 /* !! */  = this.b(kmp.E(var5_10 - 4, var8_12, var3_9), var3_9, var8_12, var7_14);
                        jse.e(var20_16 /* !! */ , "requestHeaders");
                        jse.e(var20_16 /* !! */ , "requestHeaders");
                        var2_2 = var2_2.a;
                        synchronized (var2_2) {
                            var21_15 = var2_2.w;
                            var22_24 = var4_8;
                            if (var21_15.contains(var22_24)) {
                                var2_2.k(var4_8, kiq.b);
                                break;
                            }
                            var2_2.w.add(var22_24);
                            // MONITOREXIT @DISABLED, blocks:[67, 19, 5, 22, 27] lbl139 : MonitorExitStatement: MONITOREXIT : var2_2
                            var23_29 = var2_2.j;
                            var21_15 = var2_2.d;
                            var22_24 = new StringBuilder();
                            var22_24.append((String)var21_15);
                        }
                        var22_24.append("[");
                        var22_24.append(var4_8);
                        var22_24.append("] onRequest");
                        var23_29.f(new kjg(var22_24.toString(), (kjl)var2_2, var4_8, (List)var20_16 /* !! */ ));
                        break;
                        {
                            catch (Throwable var20_20) {
                                throw var20_20;
                            }
                        }
                    }
                    throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                }
                case 4: lbl-1000:
                // 2 sources

                {
                    if (var7_14 != 0) ** GOTO lbl199
                    if ((var8_12 & 1) != 0) {
                        if (var5_10 == 0) break;
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    if (var5_10 % 6 != 0) ** GOTO lbl198
                    var21_15 = new kjx();
                    var20_16 /* !! */  = jse.p(jse.q(0, var5_10), 6);
                    var3_9 = var20_16 /* !! */ .a;
                    var6_7 = var20_16 /* !! */ .b;
                    var7_14 = var20_16 /* !! */ .c;
                    if (var7_14 <= 0) ** GOTO lbl162
                    var4_8 = var3_9;
                    if (var3_9 <= var6_7) ** GOTO lbl165
lbl162:
                    // 2 sources

                    if (var7_14 >= 0) ** GOTO lbl194
                    var4_8 = var3_9;
                    if (var6_7 > var3_9) ** GOTO lbl194
lbl165:
                    // 2 sources

                    while (true) {
                        var5_10 = (char)this.b.t();
                        var8_12 = this.b.f();
                        if (var5_10 == 2) ** GOTO lbl184
                        if (var5_10 == 3) ** GOTO lbl182
                        if (var5_10 == 4) ** GOTO lbl178
                        if (var5_10 != 5) {
                            var3_9 = var5_10;
                        } else if (var8_12 >= 16384 && var8_12 <= 0xFFFFFF) {
                            var3_9 = var5_10;
                        } else {
                            throw new IOException(a.af(var8_12, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
lbl178:
                            // 1 sources

                            if (var8_12 >= 0) {
                                var3_9 = 7;
                            } else {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
lbl182:
                                // 1 sources

                                var3_9 = 4;
                            }
                        }
                        ** GOTO lbl190
lbl184:
                        // 1 sources

                        var3_9 = var5_10;
                        if (var8_12 != 0) {
                            if (var8_12 == 1) {
                                var3_9 = var5_10;
                            } else {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                        }
lbl190:
                        // 7 sources

                        var21_15.g(var3_9, var8_12);
                        if (var4_8 == var6_7) break;
                        var4_8 += var7_14;
                    }
lbl194:
                    // 3 sources

                    var20_16 /* !! */  = var2_2.a;
                    var2_2 = new kjc(String.valueOf(var20_16 /* !! */ .d).concat(" applyAndAckSettings"), (kjd)var2_2, (kjx)var21_15);
                    var20_16 /* !! */ .i.f((khd)var2_2);
                    break;
lbl198:
                    // 1 sources

                    throw new IOException(a.af(var5_10, "TYPE_SETTINGS length % 6 != 0: "));
lbl199:
                    // 1 sources

                    throw new IOException("TYPE_SETTINGS streamId != 0");
                }
                case 3: {
                    if (var5_10 == 4) {
                        if (var7_14 != 0) {
                            var3_9 = this.b.f();
                            var20_16 /* !! */  = kmp.F(var3_9);
                            if (var20_16 /* !! */  != null) {
                                var2_2 = var2_2.a;
                                if (kjl.n(var7_14)) {
                                    var20_16 /* !! */  = var2_2.j;
                                    var22_25 = var2_2.d;
                                    var21_15 = new StringBuilder();
                                    var21_15.append(var22_25);
                                    var21_15.append("[");
                                    var21_15.append(var7_14);
                                    var21_15.append("] onReset");
                                    var20_16 /* !! */ .f(new kjh(var21_15.toString(), (kjl)var2_2, var7_14));
                                    break;
                                }
                                if ((var2_2 = var2_2.b(var7_14)) == null) break;
                                var2_2.j((kiq)var20_16 /* !! */ );
                                break;
                            }
                            throw new IOException(a.af(var3_9, "TYPE_RST_STREAM unexpected error code: "));
                        }
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    throw new IOException(a.ah(var5_10, "TYPE_RST_STREAM length: ", " != 4"));
                }
                case 2: {
                    if (var5_10 == 5) {
                        if (var7_14 != 0) {
                            this.c();
                            break;
                        }
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    throw new IOException(a.ah(var5_10, "TYPE_PRIORITY length: ", " != 5"));
                }
                case 1: {
                    if (var7_14 == 0) ** GOTO lbl302
                    var3_9 = (var8_12 & 8) != 0 ? khb.z(this.b.d()) : 0;
                    var4_8 = var5_10;
                    if ((var8_12 & 32) != 0) {
                        this.c();
                        var4_8 = var5_10 - 5;
                    }
                    var20_16 /* !! */  = this.b(kmp.E(var4_8, var8_12, var3_9), var3_9, var8_12, var7_14);
                    jse.e(var20_16 /* !! */ , "headerBlock");
                    var2_2 = var2_2.a;
                    if (kjl.n(var7_14)) {
                        jse.e(var20_16 /* !! */ , "requestHeaders");
                        var21_15 = var2_2.j;
                        var23_30 = var2_2.d;
                        var22_26 = new StringBuilder();
                        var22_26.append(var23_30);
                        var22_26.append("[");
                        var22_26.append(var7_14);
                        var22_26.append("] onHeaders");
                        var21_15.f(new kjf(var22_26.toString(), (kjl)var2_2, var7_14, (List)var20_16 /* !! */ ));
                        break;
                    }
                    synchronized (var2_2) {
                        var21_15 = var2_2.a(var7_14);
                        var1_1 = 1 == (var8_12 & 1);
                        if (var21_15 != null) ** GOTO lbl299
                        var11_33 = var2_2.g;
                        if (!var11_33) ** GOTO lbl271
                        break;
lbl271:
                        // 2 sources

                        var3_9 = var2_2.e;
                        if (var7_14 > var3_9) ** GOTO lbl275
                        break;
lbl275:
                        // 2 sources

                        var3_9 = var2_2.f;
                        if ((var9_13 & 1) != var3_9 % 2) ** GOTO lbl279
                        break;
lbl279:
                        // 2 sources

                        var21_15 = khb.p((List)var20_16 /* !! */ );
                        var20_16 /* !! */  = new kjs(var7_14, (kjl)var2_2, false, var1_1, (kgk)var21_15);
                        var2_2.e = var7_14;
                        var2_2.c.put(var7_14, var20_16 /* !! */ );
                        var21_15 = var2_2.h.a();
                        var22_27 = var2_2.d;
                        var23_31 /* !! */  = new StringBuilder();
                        var23_31 /* !! */ .append((String)var22_27);
                        var23_31 /* !! */ .append("[");
                        var23_31 /* !! */ .append(var7_14);
                        var23_31 /* !! */ .append("] onStream");
                        var23_31 /* !! */  = var23_31 /* !! */ .toString();
                        var22_27 = new kja((String)var23_31 /* !! */ , (kjl)var2_2, (kjs)var20_16 /* !! */ );
                        var21_15.f((khd)var22_27);
                        break;
lbl299:
                        // 1 sources

                        // MONITOREXIT @DISABLED, blocks:[18, 22, 10, 31] lbl310 : MonitorExitStatement: MONITOREXIT : var2_2
                        var21_15.i(khb.p((List)var20_16 /* !! */ ), var1_1);
                        break;
                    }
lbl302:
                    // 1 sources

                    throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                }
                case 0: {
                    if (var7_14 == 0) ** GOTO lbl386
                    var6_7 = var8_12 & 1;
                    if ((var8_12 & 32) != 0) ** GOTO lbl385
                    var3_9 = var4_8;
                    if ((var8_12 & 8) != 0) {
                        var3_9 = khb.z(this.b.d());
                    }
                    var4_8 = kmp.E(var5_10, var8_12, var3_9);
                    var14_34 = var4_8;
                    var20_16 /* !! */  = this.b;
                    jse.e(var20_16 /* !! */ , "source");
                    var21_15 = var2_2.a;
                    if (!kjl.n(var7_14)) ** GOTO lbl333
                    jse.e(var20_16 /* !! */ , "source");
                    var2_2 = new klm();
                    var20_16 /* !! */ .w(var14_34);
                    var20_16 /* !! */ .b((klm)var2_2, var14_34);
                    var20_16 /* !! */  = new StringBuilder();
                    var20_16 /* !! */ .append(var21_15.d);
                    var20_16 /* !! */ .append("[");
                    var20_16 /* !! */ .append(var7_14);
                    var20_16 /* !! */ .append("] onData");
                    var2_2 = new kje(var20_16 /* !! */ .toString(), (kjl)var21_15, var7_14, (klm)var2_2, var4_8);
                    var21_15.j.f((khd)var2_2);
                    ** GOTO lbl383
lbl333:
                    // 1 sources

                    if ((var21_15 = var21_15.a(var7_14)) != null) ** GOTO lbl338
                    var2_2.a.k(var7_14, kiq.b);
                    var2_2.a.g(var14_34);
                    var20_16 /* !! */ .x(var14_34);
                    ** GOTO lbl383
lbl338:
                    // 1 sources

                    jse.e(var20_16 /* !! */ , "source");
                    jse.e(var20_16 /* !! */ , "source");
                    var2_2 = var21_15.g;
                    var22_28 = var2_2.f;
                    var12_23 = var14_34;
                    var4_8 = var6_7;
lbl344:
                    // 4 sources

                    while (var12_23 > 0L) {
                        var22_28 = var2_2.f;
                        synchronized (var22_28) {
                            var1_1 = var2_2.b;
                            var18_36 = var2_2.d.b;
                            var16_35 = var2_2.a;
                            // MONITOREXIT @DISABLED, blocks:[32, 20, 22, 11, 44] lbl365 : MonitorExitStatement: MONITOREXIT : var22_28
                            if (var18_36 + var12_23 <= var16_35) ** GOTO lbl356
                            var20_16 /* !! */ .x(var12_23);
                            var2_2.f.h(kiq.d);
                            ** GOTO lbl381
lbl356:
                            // 1 sources

                            if (!var1_1) ** GOTO lbl359
                            var20_16 /* !! */ .x(var12_23);
                            ** GOTO lbl381
                        }
lbl359:
                        // 1 sources

                        var16_35 = var20_16 /* !! */ .b(var2_2.c, var12_23);
                        if (var16_35 == -1L) ** GOTO lbl377
                        var12_23 -= var16_35;
                        var22_28 = var2_2.f;
                        synchronized (var22_28) {
                            if (!var2_2.e) ** GOTO lbl368
                            var2_2.c.v();
                            ** GOTO lbl344
lbl368:
                            // 1 sources

                            var23_32 = var2_2.d;
                            var16_35 = var23_32.b;
                            var23_32.E(var2_2.c);
                            if (var16_35 != 0L) ** GOTO lbl344
                            var22_28.notifyAll();
                            continue;
                        }
lbl377:
                        // 1 sources

                        throw new EOFException();
                        {
                            catch (Throwable var2_5) {
                                throw var2_5;
                            }
                        }
                    }
                    var2_2.c(var14_34);
lbl381:
                    // 3 sources

                    if (var4_8 != 0) {
                        var21_15.i(khb.b, true);
                    }
lbl383:
                    // 5 sources

                    this.b.x(var3_9);
                    break;
lbl385:
                    // 1 sources

                    throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
lbl386:
                    // 1 sources

                    throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                }
            }
            return true;
        }
        throw new IOException(a.af(var5_10, "FRAME_SIZE_ERROR: "));
    }

    @Override
    public final void close() {
        this.b.close();
    }
}

