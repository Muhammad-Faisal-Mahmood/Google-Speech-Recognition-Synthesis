/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.SharedLibraryVersion;

public final class bbu {
    private final long a;
    private final long b;

    public bbu(long l2, long l3) {
        this.a = l2;
        this.b = l3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && jse.i(this.getClass(), object.getClass())) {
            object = (bbu)object;
            if (((bbu)object).a == this.a && ((bbu)object).b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return SharedLibraryVersion.a(this.a) * 31 + SharedLibraryVersion.a(this.b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append(", flexIntervalMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

