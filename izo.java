/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;

public final class izo
extends SocketAddress {
    private static final long serialVersionUID = 0L;
    private final int a;

    public izo(int n2) {
        this.a = n2;
    }

    public final boolean equals(Object object) {
        if (object instanceof izo) {
            object = (izo)object;
            if (this.a == ((izo)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BoundClientAddress[");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

