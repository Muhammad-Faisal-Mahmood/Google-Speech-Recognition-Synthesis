/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class fly {
    public final int a;
    public final int b;

    public fly(int n2, int n3) {
        this.a = Math.min(n2, n3);
        this.b = Math.max(n2, n3);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof fly)) {
            return false;
        }
        object = (fly)object;
        return this.a == ((fly)object).a && this.b == ((fly)object).b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

