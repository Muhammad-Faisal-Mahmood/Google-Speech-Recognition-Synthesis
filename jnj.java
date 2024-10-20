/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;

public final class jnj {
    final Collection a;
    final int b;

    public jnj(iux object) {
        a.s(object, "eag");
        this.a = ((iux)object).b.size() < 10 ? ((iux)object).b : new HashSet(((iux)object).b);
        object = ((iux)object).b.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            n2 += ((SocketAddress)object.next()).hashCode();
        }
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jnj)) {
            return false;
        }
        object = (jnj)object;
        if (((jnj)object).b == this.b && ((jnj)object).a.size() == this.a.size()) {
            return ((jnj)object).a.containsAll(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}

