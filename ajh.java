/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ajh {
    public final long a;
    public final float b;
    public final long c;

    public ajh(ajg ajg2) {
        this.a = ajg2.a;
        this.b = ajg2.b;
        this.c = ajg2.c;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ajh)) {
            return false;
        }
        object = (ajh)object;
        return this.a == ((ajh)object).a && this.b == ((ajh)object).b && this.c == ((ajh)object).c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), this.c});
    }
}

