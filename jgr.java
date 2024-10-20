/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;

final class jgr
implements iwg {
    public jgw a;
    final jgx b;

    public jgr(jgx jgx2) {
        this.b = jgx2;
    }

    @Override
    public final void a(iuj object) {
        if (!this.b.m) {
            jgx.e.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{object, this.a.a});
            this.a.d = object;
            if (this.b.h.f()) {
                jgw jgw2 = this.a;
                object = this.b;
                if (jgw2 == ((jgx)object).g.get(((jgx)object).h.b())) {
                    this.b.h(this.a);
                }
            }
            return;
        }
        jgx.e.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{object, this.a.a});
    }
}

