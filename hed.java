/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

final class hed {
    public final int a;
    public final TimeUnit b;

    public hed(int n2, TimeUnit timeUnit) {
        this.a = n2;
        hhk.h((Object)timeUnit, "time unit");
        this.b = timeUnit;
    }

    public final boolean equals(Object object) {
        if (object instanceof hed) {
            object = (hed)object;
            if (this.a == ((hed)object).a && this.b == ((hed)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 37 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = ((Object)((Object)this.b)).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

