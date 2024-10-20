/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class gkh {
    public final long a;
    public final long b;
    public final Map c;

    public gkh() {
        throw null;
    }

    public gkh(long l2, long l3, Map map) {
        this.a = l2;
        this.b = l3;
        this.c = map;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gkh) {
            object = (gkh)object;
            if (this.a == ((gkh)object).a && this.b == ((gkh)object).b && fvd.s(this.c, ((gkh)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.b;
        long l3 = this.a;
        int n2 = (int)(l3 ^ l3 >>> 32);
        Map map = this.c;
        return (((int)(l2 ^ l2 >>> 32) ^ (n2 ^ 0xF4243) * 1000003) * 1000003 ^ map.hashCode()) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        String string = fvd.r(this.c);
        StringBuilder stringBuilder = new StringBuilder("SyncConfig{minSyncInterval=");
        stringBuilder.append(this.a);
        stringBuilder.append(", timeout=");
        stringBuilder.append(this.b);
        stringBuilder.append(", constraints=");
        stringBuilder.append(string);
        stringBuilder.append(", allowMultiprocess=false}");
        return stringBuilder.toString();
    }
}

