/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class dmz {
    public final long a;
    public final long b;

    public dmz() {
        throw null;
    }

    public dmz(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public static dmz a() {
        return new dmz(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public static dmz b() {
        return new dmz(SystemClock.elapsedRealtime(), cgw.q().toMillis());
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dmz) {
            object = (dmz)object;
            if (this.a == ((dmz)object).a && this.b == ((dmz)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.b;
        long l3 = this.a;
        int n2 = (int)(l3 ^ l3 >>> 32);
        return (int)(l2 ^ l2 >>> 32) ^ (n2 ^ 0xF4243) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PrimesInstant{elapsedRealtimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

