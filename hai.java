/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hai
extends gzx {
    final gzx a;

    public hai(gzx gzx2) {
        this.a = gzx2;
    }

    public final Object get(int n2) {
        return ((Map.Entry)this.a.get(n2)).getValue();
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

