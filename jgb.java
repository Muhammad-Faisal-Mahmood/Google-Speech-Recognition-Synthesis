/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public final class jgb {
    static final itv a = new itv("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final jie f;
    final jec g;

    public jgb(Map map, boolean bl2, int n2, int n3) {
        long l2;
        boolean bl3;
        this.b = jew.d(map, "timeout");
        this.c = jew.a(map, "waitForReady");
        Map map2 = jew.c(map, "maxResponseMessageBytes");
        this.d = map2;
        if (map2 != null) {
            bl3 = (Integer)((Object)map2) >= 0;
            fxf.v(bl3, "maxInboundMessageSize %s exceeds bounds", map2);
        }
        map2 = jew.c(map, "maxRequestMessageBytes");
        this.e = map2;
        if (map2 != null) {
            bl3 = (Integer)((Object)map2) >= 0;
            fxf.v(bl3, "maxOutboundMessageSize %s exceeds bounds", map2);
        }
        if ((map2 = bl2 ? jew.i(map, "retryPolicy") : null) == null) {
            map2 = null;
        } else {
            Number number = jew.c(map2, "maxAttempts");
            a.s(number, "maxAttempts cannot be empty");
            int n4 = (Integer)number;
            bl3 = n4 >= 2;
            fxf.t(bl3, "maxAttempts must be greater than 1: %s", n4);
            n2 = Math.min(n4, n2);
            number = jew.d(map2, "initialBackoff");
            a.s(number, "initialBackoff cannot be empty");
            long l3 = (Long)number;
            bl3 = l3 > 0L;
            fxf.u(bl3, "initialBackoffNanos must be greater than 0: %s", l3);
            number = jew.d(map2, "maxBackoff");
            a.s(number, "maxBackoff cannot be empty");
            l2 = (Long)number;
            bl3 = l2 > 0L;
            fxf.u(bl3, "maxBackoff must be greater than 0: %s", l2);
            number = jew.b(map2, "backoffMultiplier");
            a.s(number, "backoffMultiplier cannot be empty");
            double d2 = (Double)number;
            bl3 = d2 > 0.0;
            fxf.v(bl3, "backoffMultiplier must be greater than 0: %s", number);
            number = jew.d(map2, "perAttemptRecvTimeout");
            bl3 = number == null || (Long)number >= 0L;
            fxf.v(bl3, "perAttemptRecvTimeout cannot be negative: %s", number);
            map2 = jjj.a(map2, "retryableStatusCodes");
            bl3 = map2 != null;
            fvd.an(bl3, "%s is required in retry policy", "retryableStatusCodes");
            fvd.an(map2.contains((Object)iye.a) ^ true, "%s must not contain OK", "retryableStatusCodes");
            bl3 = number != null || !map2.isEmpty();
            fxf.r(bl3, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            map2 = new jie(n2, l3, l2, d2, (Long)number, (Set)((Object)map2));
        }
        this.f = map2;
        map = bl2 ? jew.i(map, "hedgingPolicy") : null;
        if (map == null) {
            map = null;
        } else {
            map2 = jew.c(map, "maxAttempts");
            a.s(map2, "maxAttempts cannot be empty");
            n2 = (Integer)((Object)map2);
            bl2 = n2 >= 2;
            fxf.t(bl2, "maxAttempts must be greater than 1: %s", n2);
            n2 = Math.min(n2, n3);
            map2 = jew.d(map, "hedgingDelay");
            a.s(map2, "hedgingDelay cannot be empty");
            l2 = (Long)((Object)map2);
            bl2 = l2 >= 0L;
            fxf.u(bl2, "hedgingDelay must not be negative: %s", l2);
            map = jjj.a(map, "nonFatalStatusCodes");
            if (map == null) {
                map = DesugarCollections.unmodifiableSet(EnumSet.noneOf(iye.class));
            } else {
                fvd.an(map.contains((Object)iye.a) ^ true, "%s must not contain OK", "nonFatalStatusCodes");
            }
            map = new jec(n2, l2, (Set)((Object)map));
        }
        this.g = map;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof jgb)) {
            return false;
        }
        object = (jgb)object;
        return a.k(this.b, ((jgb)object).b) && a.k(this.c, ((jgb)object).c) && a.k(this.d, ((jgb)object).d) && a.k(this.e, ((jgb)object).e) && a.k(this.f, ((jgb)object).f) && a.k(this.g, ((jgb)object).g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("timeoutNanos", this.b);
        gtn2.b("waitForReady", this.c);
        gtn2.b("maxInboundMessageSize", this.d);
        gtn2.b("maxOutboundMessageSize", this.e);
        gtn2.b("retryPolicy", this.f);
        gtn2.b("hedgingPolicy", this.g);
        return gtn2.toString();
    }
}

