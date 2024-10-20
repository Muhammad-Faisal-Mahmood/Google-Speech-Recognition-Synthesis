/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class jnn
extends iwf {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public jnn(List object, AtomicInteger atomicInteger) {
        fxf.r(object.isEmpty() ^ true, "empty list");
        this.a = object;
        this.b = atomicInteger;
        object = object.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            n2 += ((iwf)object.next()).hashCode();
        }
        this.c = n2;
    }

    @Override
    public final iwb a(iwc iwc2) {
        int n2 = this.b.getAndIncrement();
        int n3 = this.a.size();
        return ((iwf)this.a.get((n2 & Integer.MAX_VALUE) % n3)).a(iwc2);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof jnn)) {
            return false;
        }
        if ((object = (jnn)object) == this) {
            return true;
        }
        return this.c == ((jnn)object).c && this.b == ((jnn)object).b && this.a.size() == ((jnn)object).a.size() && new HashSet(this.a).containsAll(((jnn)object).a);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        gtn gtn2 = fxf.Q(jnn.class);
        gtn2.b("subchannelPickers", this.a);
        return gtn2.toString();
    }
}

