/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class iux {
    public static final itr a = new itr("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final its c;
    private final int d;

    public iux(SocketAddress socketAddress) {
        this(socketAddress, its.a);
    }

    public iux(SocketAddress socketAddress, its its2) {
        this(Collections.singletonList(socketAddress), its2);
    }

    public iux(List list, its its2) {
        fxf.r(list.isEmpty() ^ true, "addrs is empty");
        this.b = list = DesugarCollections.unmodifiableList(new ArrayList(list));
        a.s(its2, "attrs");
        this.c = its2;
        this.d = list.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof iux)) {
            return false;
        }
        object = (iux)object;
        if (this.b.size() == ((iux)object).b.size()) {
            for (int i2 = 0; i2 < this.b.size(); ++i2) {
                if (((SocketAddress)this.b.get(i2)).equals(((iux)object).b.get(i2))) continue;
                return false;
            }
            return this.c.equals(((iux)object).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        Object object = this.c;
        String string = String.valueOf(this.b);
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

