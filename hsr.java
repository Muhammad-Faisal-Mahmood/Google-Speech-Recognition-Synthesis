/*
 * Decompiled with CFR 0.152.
 */
public final class hsr
implements hsy {
    private final int a;
    private final Object b;

    public hsr(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final /* synthetic */ htl a() {
        if (this.a != 0) {
            return htl.a;
        }
        return htl.a;
    }

    @Override
    public final /* synthetic */ htl b(gpm gpm2) {
        if (this.a != 0) {
            return htl.a;
        }
        return htl.a;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final htl c(gpm var1_1) {
        block4: {
            var2_2 = this.a;
            var3_3 = true;
            if (var2_2 != 0) {
                var4_4 = var1_1.a;
                var1_1 = hqx.a;
                if ((var4_4 = (itw)var4_4).g((itv)var1_1) != null) {
                    var3_3 = false;
                }
                fxf.B(var3_3, "ChannelConfig provided twice");
                var1_1 = var4_4.f(hqx.a, this.b);
                return new htl(htk.a, null, null, (itw)var1_1);
            }
            fxf.B(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
            var5_6 = var1_1.a;
            var4_5 = hrf.a;
            var7_7 = (itw)var5_6;
            var6_8 = (hrf)var7_7.g((itv)var4_5);
            var4_5 = var6_8;
            if (var6_8 != null) break block4;
            var4_5 = var1_1.b;
            var1_1 = this.b;
            var4_5 = ((ixb)var4_5).b;
            var5_6 = idm.b.a;
            if (!var4_5.startsWith((String)var5_6)) ** GOTO lbl-1000
            var5_6 = var4_5.substring(var5_6.length());
            var1_1 = (idm)var1_1;
            if (var1_1.j.containsKey(var5_6)) {
                var1_1 = (hrf)var1_1.j.get(var5_6);
            } else lbl-1000:
            // 2 sources

            {
                var1_1 = null;
            }
            fxf.L(var1_1, "Could not find RpcId for method %s.Is portable_proto_filter set in your android_rpc_service?", var4_5);
            var5_6 = var7_7.f(hrf.a, var1_1);
            var4_5 = var1_1;
        }
        var1_1 = crx.a;
        var4_5 = var4_5.a();
        var1_1 = ((itw)var5_6).f((itv)var1_1, var4_5);
        return new htl(htk.a, null, null, (itw)var1_1);
    }

    @Override
    public final /* synthetic */ htl d(bzq bzq2) {
        if (this.a != 0) {
            return htl.a;
        }
        return htl.a;
    }

    @Override
    public final /* synthetic */ void e(bzq bzq2) {
    }

    @Override
    public final /* synthetic */ void f(dlm dlm2) {
    }

    @Override
    public final /* synthetic */ void g(dlm dlm2) {
    }
}

