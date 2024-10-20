/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class crc {
    private final int a;

    public crc(int n2) {
        this.a = n2;
    }

    public void a() {
    }

    public final boolean equals(Object object) {
        if (!(object instanceof crc)) {
            return false;
        }
        object = (crc)object;
        return this.a == ((crc)object).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("java_hash=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

