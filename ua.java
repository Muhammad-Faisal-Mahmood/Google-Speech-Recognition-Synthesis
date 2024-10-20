/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.List;

final class ua {
    final String a;
    final String b;
    final List c;

    public ua(String string, String string2, List list) {
        this.a = string;
        this.b = string2;
        this.c = list;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ua)) {
            return false;
        }
        object = (ua)object;
        return Objects.equals(this.a, ((ua)object).a) && Objects.equals(this.b, ((ua)object).b) && Objects.equals(this.c, ((ua)object).c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}

