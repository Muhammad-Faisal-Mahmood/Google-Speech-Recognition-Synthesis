/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.UUID;

public final class gpu {
    public final UUID a;
    public final int b;

    public gpu(UUID uUID, int n2) {
        this.a = uUID;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof gpu)) {
            return false;
        }
        object = (gpu)object;
        return this.b == ((gpu)object).b && Objects.equals(this.a, ((gpu)object).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}

