/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.Log
 *  org.json.JSONException
 */
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

public final class ksk
extends kqx {
    private static final String a = "ksk";
    private final AtomicInteger b;
    private final ksn c;

    public ksk() {
        ksn ksn2 = new ksn();
        this.b = new AtomicInteger();
        this.c = ksn2;
    }

    private static long[] f(List list) {
        long[] lArray = new long[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            lArray[i2] = (Long)list.get(i2);
        }
        return lArray;
    }

    @Override
    public final long a() {
        long l2;
        long l3 = l2 = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 0x7FFFFFFFFFFFFFFDL);
        if (l2 >= -1L) {
            l3 = l2 + 2L;
        }
        return l3;
    }

    @Override
    public final void b(kqt kqt2) {
        long l2 = kqt2.a;
        int n2 = kqt2.g;
        int n3 = n2 - 1;
        if (n2 != 0) {
            n3 = n3 != 0 ? (n3 != 1 ? 0 : 2) : 1;
            int n4 = kqt2.b;
            n2 = kqt2.h;
            int n5 = n2 - 1;
            if (n2 != 0) {
                if (n5 != 1) {
                    if (n5 != 2) {
                        n2 = 3;
                        if (n5 != 3) {
                            n2 = 4;
                            if (n5 != 4) {
                                n2 = 0;
                            }
                        }
                    } else {
                        n2 = 2;
                    }
                } else {
                    n2 = 1;
                }
                int n6 = jjj.O(jjj.P(kqt2.c));
                kqw kqw2 = kqt2.d;
                int n7 = kqw2.a;
                int n8 = kqw2.b;
                int n9 = kqw2.c;
                int n10 = kqw2.d;
                kqw2 = kqt2.e;
                n5 = kqw2 == null ? -1 : kqw2.a;
                int n11 = kqw2 == null ? -1 : kqw2.b;
                int n12 = kqw2 == null ? -1 : kqw2.c;
                int n13 = kqw2 == null ? -1 : kqw2.d;
                jjj.Q(l2, n3, n4, n2, n6, n7, n8, n9, n10, n5, n11, n12, n13, kqt2.f);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void c(kqu kqu2) {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        jjj.T(kqu2.a, kqu2.b, kqu2.c, kqu2.d, jjj.O(jjj.P(kqu2.e)), ksk.f(kqu2.f), ksk.f(kqu2.g));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(long l2, kqv kqv2) {
        int n2;
        int n3;
        double d2;
        long l3;
        ksn ksn2 = this.c;
        Object object = ksn2.a;
        synchronized (object) {
            l3 = SystemClock.elapsedRealtime();
            if (ksn2.c + 1000L <= l3) {
                ksn2.b = 1;
                ksn2.c = l3;
            } else {
                if (ksn2.b > 0) {
                    // MONITOREXIT @DISABLED, blocks:[6, 9, 10] lbl11 : MonitorExitStatement: MONITOREXIT : var19_5
                    this.b.incrementAndGet();
                    return;
                }
                ksn2.b = 1;
            }
        }
        int n4 = this.b.getAndSet(0);
        try {
            l3 = kqv2.a;
            jjj.M(l3, "Request header size is negative");
            d2 = (double)l3 / 1024.0;
            n3 = jjj.N(d2, 0, 1) ? 1 : (jjj.N(d2, 1, 10) ? 2 : (jjj.N(d2, 10, 25) ? 3 : (jjj.N(d2, 25, 50) ? 4 : (jjj.N(d2, 50, 100) ? 5 : 6))));
            l3 = kqv2.b;
            jjj.M(l3, "Request body size is negative");
        }
        catch (Exception exception) {
            this.b.addAndGet(n4);
            if (Log.isLoggable((String)a, (int)3)) {
                String.format("Failed to log cronet traffic sample for CronetEngine %s: %s", l2, exception.getMessage());
            }
            return;
        }
        d2 = (double)l3 / 1024.0;
        double d3 = d2 - 0.0;
        double d4 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
        d4 = d4 == false ? 1.0 : (d4 > 0 && d2 < 10.0 ? (double)2 : (jjj.N(d2, 10, 50) ? (double)3 : (jjj.N(d2, 50, 200) ? (double)4 : (jjj.N(d2, 200, 500) ? (double)5 : (jjj.N(d2, 500, 1000) ? (double)6 : (jjj.N(d2, 1000, 5000) ? (double)7 : (double)8))))));
        {
            l3 = kqv2.c;
            jjj.M(l3, "Response header size is negative");
            d2 = (double)l3 / 1024.0;
            n2 = jjj.N(d2, 0, 1) ? 1 : (jjj.N(d2, 1, 10) ? 2 : (jjj.N(d2, 10, 25) ? 3 : (jjj.N(d2, 25, 50) ? 4 : (jjj.N(d2, 50, 100) ? 5 : 6))));
            l3 = kqv2.d;
            jjj.M(l3, "Response body size is negative");
        }
        d2 = (double)l3 / 1024.0;
        double d5 = d2 - 0.0;
        double d6 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
        d6 = d6 == false ? 1.0 : (d6 > 0 && d2 < 10.0 ? (double)2 : (jjj.N(d2, 10, 50) ? (double)3 : (jjj.N(d2, 50, 200) ? (double)4 : (jjj.N(d2, 200, 500) ? (double)5 : (jjj.N(d2, 500, 1000) ? (double)6 : (jjj.N(d2, 1000, 5000) ? (double)7 : (double)8))))));
        {
            int n5 = kqv2.e;
            l3 = ksm.a(kqv2.h);
            int n6 = (int)kqv2.f.toMillis();
            int n7 = (int)kqv2.g.toMillis();
            boolean bl2 = kqv2.i;
            boolean bl3 = kqv2.j;
            int n8 = kqv2.p - 1;
            n8 = n8 != 0 ? (n8 != 1 ? 3 : 2) : 1;
            jjj.R(l2, n3, (int)d4, n2, (int)d6, n5, l3, n6, n7, bl2, bl3, n4, n8, kqv2.k, kqv2.l, kqv2.m, jjj.O(jjj.P(kqv2.n)), jjj.O(jjj.P(kqv2.o)));
            return;
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public final void e(long var1_1, kqs var3_2, kqw var4_4, int var5_5) {
        block19: {
            block18: {
                block17: {
                    var38_6 = new ksl(var3_2.f);
                    var12_9 = var4_4 /* !! */ .a;
                    var10_10 = var4_4 /* !! */ .b;
                    var11_11 = var4_4 /* !! */ .c;
                    var9_12 = var4_4 /* !! */ .d;
                    if (--var5_5 != 1) {
                        var5_5 = var5_5 != 2 ? (var5_5 != 3 ? 0 : 3) : 2;
                        break block17;
                    }
                    var5_5 = 1;
                }
                var37_13 = var3_2.d;
                var35_14 = var3_2.c;
                var6_15 = var3_2.e;
                if (var6_15 != 0) {
                    var6_15 = var6_15 != 1 ? (var6_15 != 2 ? 4 : 3) : 2;
                    break block18;
                }
                var6_15 = 1;
            }
            var36_16 = var3_2.a;
            var33_17 = var3_2.b;
            var34_18 = var3_2.g;
            var13_19 = var3_2.h;
            var4_4 /* !! */  = (String)var38_6.a("QUIC", "connection_options", null, String.class);
            if (ksl.b((String)var4_4 /* !! */ )) ** GOTO lbl49
            var39_20 = new ArrayList();
            for (CharSequence var40_23 : var4_4 /* !! */ .split(",", -1)) {
                if (!ksl.b.contains(var40_23.toUpperCase(Locale.ROOT).trim())) continue;
                var39_20.add(var40_23);
            }
            var40_23 = new StringBuilder();
            var39_20 = var39_20.iterator();
            if (var39_20.hasNext()) {
                var4_4 /* !! */  = (CharSequence)var39_20.next();
                while (true) {
                    var40_23.append((CharSequence)var4_4 /* !! */ );
                    if (!var39_20.hasNext()) break;
                    var40_23.append(",");
                    var4_4 /* !! */  = (CharSequence)var39_20.next();
                }
            }
            var4_4 /* !! */  = var40_23.toString();
lbl49:
            // 2 sources

            var16_24 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "store_server_configs_in_properties", null, Boolean.class)));
            var39_20 = -1;
            var17_25 = (Integer)var38_6.a("QUIC", "max_server_configs_stored_in_properties", var39_20, Integer.class);
            var18_26 = (Integer)var38_6.a("QUIC", "idle_connection_timeout_seconds", var39_20, Integer.class);
            var20_27 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class)));
            var8_22 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "close_sessions_on_ip_change", null, Boolean.class)));
            var25_28 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class)));
            var7_21 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "migrate_sessions_early_v2", null, Boolean.class)));
            var21_29 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "disable_bidirectional_streams", null, Boolean.class)));
            var30_30 = (Integer)var38_6.a("QUIC", "max_time_before_crypto_handshake_seconds", var39_20, Integer.class);
            var28_31 = (Integer)var38_6.a("QUIC", "max_idle_time_before_crypto_handshake_seconds", var39_20, Integer.class);
            var22_32 = jjj.O(jjj.P((Boolean)var38_6.a("QUIC", "enable_socket_recv_optimization", null, Boolean.class)));
            var15_33 = jjj.O(jjj.P((Boolean)var38_6.a("AsyncDNS", "enable", null, Boolean.class)));
            var24_34 = jjj.O(jjj.P((Boolean)var38_6.a("StaleDNS", "enable", null, Boolean.class)));
            var26_35 = (Integer)var38_6.a("StaleDNS", "delay_ms", var39_20, Integer.class);
            var27_36 = (Integer)var38_6.a("StaleDNS", "max_expired_time_ms", var39_20, Integer.class);
            var31_37 = (Integer)var38_6.a("StaleDNS", "max_stale_uses", var39_20, Integer.class);
            var19_38 = jjj.O(jjj.P((Boolean)var38_6.a("StaleDNS", "allow_other_network", null, Boolean.class)));
            var23_39 = jjj.O(jjj.P((Boolean)var38_6.a("StaleDNS", "persist_to_disk", null, Boolean.class)));
            var29_40 = (Integer)var38_6.a("StaleDNS", "persist_delay_ms", var39_20, Integer.class);
            var14_41 = jjj.O(jjj.P((Boolean)var38_6.a("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class)));
            var32_42 = var38_6.c.length();
            if (var32_42 != 0) break block19;
lbl72:
            // 3 sources

            while (true) {
                var38_6 = null;
                ** GOTO lbl88
                break;
            }
        }
        try {
            var38_6 = Boolean.class.cast(var38_6.c.get("disable_ipv6_on_wifi"));
            ** GOTO lbl88
        }
        catch (ClassCastException var38_7) {
        }
        catch (JSONException var38_8) {
            // empty catch block
        }
        try {
            if (!Log.isLoggable((String)ksl.a, (int)2)) ** GOTO lbl72
            String.format("Failed to get %s options: %s", new Object[]{"disable_ipv6_on_wifi", var38_6.getMessage()});
            ** continue;
lbl88:
            // 2 sources

            jjj.S(var1_1, var12_9, var10_10, var11_11, var9_12, var5_5, var37_13, var35_14, var6_15, var36_16, var33_17, var34_18, var13_19, (String)var4_4 /* !! */ , var16_24, var17_25, var18_26, var20_27, var8_22, var25_28, var7_21, var21_29, var30_30, var28_31, var22_32, var15_33, var24_34, var26_35, var27_36, var31_37, var19_38, var23_39, var29_40, var14_41, jjj.O(jjj.P((Boolean)var38_6)), var3_2.i);
            return;
        }
        catch (Exception var3_3) {
            if (Log.isLoggable((String)ksk.a, (int)3)) {
                String.format("Failed to log CronetEngine:%s creation: %s", new Object[]{var1_1, var3_3.getMessage()});
            }
            return;
        }
    }
}

