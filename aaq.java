/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;

@Deprecated
final class aaq {
    final int a;
    final Method b;

    public aaq(int n2, Method method) {
        this.a = n2;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aaq)) {
            return false;
        }
        object = (aaq)object;
        return this.a == ((aaq)object).a && this.b.getName().equals(((aaq)object).b.getName());
    }

    public final int hashCode() {
        int n2 = this.b.getName().hashCode();
        return this.a * 31 + n2;
    }
}

