/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ixh {
    private final boolean a;
    private final int b;
    private final int c;
    private final ksb d;

    public ixh() {
        throw null;
    }

    public ixh(boolean bl2, ksb ksb2) {
        this.a = bl2;
        this.b = 5;
        this.c = 5;
        a.s(ksb2, "autoLoadBalancerFactory");
        this.d = ksb2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ixd a(Map var1_1) {
        block25: {
            block24: {
                try {
                    var9_3 = this.d;
                    var12_4 = null;
                    if (var1_1 == null) break block24;
                }
                catch (RuntimeException var1_2) {
                    return new ixd(iyh.d.e("failed to parse service config").d(var1_2));
                }
                try {
                    var10_5 = new ArrayList();
                    if (var1_1.containsKey("loadBalancingConfig")) {
                        var10_5.addAll(jew.g((Map)var1_1, "loadBalancingConfig"));
                    }
                    if (var10_5.isEmpty() && (var8_6 = jew.e((Map)var1_1, "loadBalancingPolicy")) != null) {
                        var10_5.add(Collections.singletonMap(var8_6.toLowerCase(Locale.ROOT), Collections.<K, V>emptyMap()));
                    }
                    if ((var8_6 = DesugarCollections.unmodifiableList(var10_5)) == null) break block24;
                    var10_5 = new ArrayList();
                    var14_8 = var8_6.iterator();
                    while (var14_8.hasNext()) {
                        var8_6 = (Map)var14_8.next();
                        if (var8_6.size() != 1) {
                            var4_11 = var8_6.size();
                            var10_5 = String.valueOf(var8_6);
                            var8_6 = new StringBuilder();
                            var8_6.append("There are ");
                            var8_6.append(var4_11);
                            var8_6.append(" fields in a LoadBalancingConfig object. Exactly one is expected. Config=");
                            var8_6.append((String)var10_5);
                            var9_3 = new RuntimeException(var8_6.toString());
                            throw var9_3;
                        }
                        var11_9 = (String)var8_6.entrySet().iterator().next().getKey();
                        var13_10 = new jjh((String)var11_9, jew.i((Map)var8_6, (String)var11_9));
                        var10_5.add(var13_10);
                    }
                    var8_6 = DesugarCollections.unmodifiableList(var10_5);
                    break block25;
                }
                catch (RuntimeException var8_7) {
                    ** GOTO lbl-1000
                }
            }
            var8_6 = null;
        }
        if (var8_6 == null || var8_6.isEmpty()) ** GOTO lbl71
        var11_9 = var9_3.b;
        var9_3 = new ArrayList();
        var8_6 = var8_6.iterator();
        while (var8_6.hasNext()) {
            var13_10 = (jjh)var8_6.next();
            var14_8 = var13_10.a;
            var10_5 = ((iwj)var11_9).a((String)var14_8);
            if (var10_5 == null) {
                var9_3.add(var14_8);
                continue;
            }
            if (!var9_3.isEmpty()) {
                Logger.getLogger(jjj.class.getName()).logp(Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", var9_3);
            }
            var8_6 = var9_3 = var10_5.b(var13_10.b);
            if (var9_3.a == null) {
                var8_6 = new jji((iwi)var10_5, var9_3.b);
                var8_6 = new ixd(var8_6);
            }
            ** GOTO lbl72
        }
        var8_6 = new ixd(iyh.d.e(a.ar(var9_3, "None of ", " specified by Service Config are available.")));
        ** GOTO lbl72
lbl-1000:
        // 1 sources

        {
            block26: {
                var9_3 = iyh.d.e("can't parse load balancer configuration").d(var8_7);
                var8_6 = new ixd((iyh)var9_3);
                break block26;
lbl71:
                // 1 sources

                var8_6 = null;
            }
            if (var8_6 == null) {
                var8_6 = null;
            } else {
                var9_3 = var8_6.a;
                if (var9_3 != null) {
                    return new ixd((iyh)var9_3);
                }
                var8_6 = var8_6.b;
            }
            var7_13 = this.a;
            var5_14 = this.b;
            var4_12 = this.c;
            if (!var7_13 || var1_1 == null || (var9_3 = jew.i((Map)var1_1, "retryThrottling")) == null) ** GOTO lbl92
            var2_15 = jew.b((Map)var9_3, "maxTokens").floatValue();
            var3_16 = jew.b((Map)var9_3, "tokenRatio").floatValue();
        }
        var6_17 = var2_15 > 0.0f;
        {
            fxf.B(var6_17, "maxToken should be greater than zero");
        }
        var6_17 = var3_16 > 0.0f;
        {
            block27: {
                fxf.B(var6_17, "tokenRatio should be greater than zero");
                var9_3 = new jic(var2_15, var3_16);
                break block27;
lbl92:
                // 1 sources

                var9_3 = null;
            }
            var15_18 = new HashMap<Object, Object>();
            var14_8 = new Object();
            var10_5 = var1_1 == null ? null : jew.i((Map)var1_1, "healthCheckConfig");
            var11_9 = jew.g((Map)var1_1, "methodConfig");
            if (var11_9 == null) {
                var1_1 = new jgd(null, var15_18, (Map)var14_8, (jic)var9_3, var8_6, (Map)var10_5);
                return new ixd(var1_1);
            } else {
                var16_19 = var11_9.iterator();
                var6_17 = var7_13;
                block9: while (var16_19.hasNext()) {
                    var11_9 = (Map)var16_19.next();
                    var13_10 = new jgb((Map)var11_9, var6_17, var5_14, var4_12);
                    if ((var11_9 = jew.g((Map)var11_9, "name")) == null || var11_9.isEmpty()) continue;
                    var17_20 = var11_9.iterator();
                    var11_9 = var12_4;
                    var7_13 = var6_17;
                    while (true) {
                        var6_17 = var7_13;
                        var12_4 = var11_9;
                        if (!var17_20.hasNext()) continue block9;
                        var18_21 = (Map)var17_20.next();
                        var12_4 = jew.e((Map)var18_21, "service");
                        var18_21 = jew.e((Map)var18_21, "method");
                        if (fxf.P((String)var12_4)) {
                            fxf.v(fxf.P((String)var18_21), "missing service name for method %s", var18_21);
                            var6_17 = var11_9 == null;
                            fxf.v(var6_17, "Duplicate default method config in service config %s", var1_1);
                            var11_9 = var13_10;
                            continue;
                        }
                        if (fxf.P((String)var18_21)) {
                            fxf.v(var14_8.containsKey(var12_4) ^ true, "Duplicate service %s", var12_4);
                            var14_8.put(var12_4, var13_10);
                            continue;
                        }
                        var12_4 = ixb.c((String)var12_4, (String)var18_21);
                        fxf.v(var15_18.containsKey(var12_4) ^ true, "Duplicate method name %s", var12_4);
                        var15_18.put(var12_4, var13_10);
                    }
                }
                var1_1 = new jgd((jgb)var12_4, var15_18, (Map)var14_8, (jic)var9_3, var8_6, (Map)var10_5);
            }
            return new ixd(var1_1);
        }
    }
}

