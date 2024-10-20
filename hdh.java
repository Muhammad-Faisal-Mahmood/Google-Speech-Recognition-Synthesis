/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class hdh
extends hdp {
    final Set a;
    final Set b;

    public hdh(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override
    public final hdx a() {
        return new hdg(this.a, this.b);
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object) || this.b.contains(object);
        {
        }
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override
    public final int size() {
        int n2 = this.a.size();
        hdx hdx2 = ((hdq)this.b).k();
        while (hdx2.hasNext()) {
            Object e2 = hdx2.next();
            if (this.a.contains(e2)) continue;
            ++n2;
        }
        return n2;
    }
}

