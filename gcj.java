/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class gcj {
    public final long a;
    public final TimeUnit b;

    public gcj() {
        throw null;
    }

    public gcj(long l2, TimeUnit timeUnit) {
        this.a = l2;
        if (timeUnit != null) {
            this.b = timeUnit;
            return;
        }
        throw new NullPointerException("Null timeUnit");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gcj) {
            object = (gcj)object;
            if (this.a == ((gcj)object).a && this.b.equals((Object)((gcj)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.a;
        return ((int)(l2 ^ l2 >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = ((Object)((Object)this.b)).toString();
        StringBuilder stringBuilder = new StringBuilder("TimeUnitPair{duration=");
        stringBuilder.append(this.a);
        stringBuilder.append(", timeUnit=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

