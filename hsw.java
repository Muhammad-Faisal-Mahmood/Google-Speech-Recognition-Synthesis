/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;

final class hsw {
    public final URI a;
    public final long b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    private final long f;
    private final long g;

    public hsw() {
        throw null;
    }

    public hsw(URI uRI, long l2, long l3, long l4, Integer n2, Integer n3, Integer n4) {
        this.a = uRI;
        this.b = l2;
        this.f = l3;
        this.g = l4;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Integer n2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof hsw)) break block4;
                    object = (hsw)object;
                    if (!this.a.equals(((hsw)object).a) || this.b != ((hsw)object).b || this.f != ((hsw)object).f || this.g != ((hsw)object).g || !((n2 = this.c) == null ? ((hsw)object).c == null : n2.equals(((hsw)object).c)) || !((n2 = this.d) == null ? ((hsw)object).d == null : n2.equals(((hsw)object).d))) break block4;
                    n2 = this.e;
                    object = ((hsw)object).e;
                    if (n2 != null) break block5;
                    if (object != null) break block4;
                    break block6;
                }
                if (!n2.equals(object)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        Integer n3 = this.c;
        int n4 = 0;
        int n5 = n3 == null ? 0 : n3.hashCode();
        long l2 = this.b;
        long l3 = this.f;
        long l4 = this.g;
        int n6 = (int)(l2 ^ l2 >>> 32);
        int n7 = (int)(l3 >>> 32 ^ l3);
        int n8 = (int)(l4 >>> 32 ^ l4);
        n3 = this.d;
        int n9 = n3 == null ? 0 : n3.hashCode();
        n3 = this.e;
        if (n3 != null) {
            n4 = n3.hashCode();
        }
        return ((((((n2 ^ 0xF4243) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ n5) * 1000003 ^ n9) * 1000003 ^ n4;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("ChannelRuntimeConfig{uri=");
        stringBuilder.append(string);
        stringBuilder.append(", grpcIdleTimeoutMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append(", grpcKeepAliveTimeMillis=");
        stringBuilder.append(this.f);
        stringBuilder.append(", grpcKeepAliveTimeoutMillis=");
        stringBuilder.append(this.g);
        stringBuilder.append(", trafficStatsUid=");
        stringBuilder.append(this.c);
        stringBuilder.append(", trafficStatsTag=");
        stringBuilder.append(this.d);
        stringBuilder.append(", maxMessageSize=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

