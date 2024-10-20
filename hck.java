/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hck
extends hdo {
    final gxx a;

    public hck() {
        throw null;
    }

    public hck(gxx gxx2) {
        this.a = gxx2;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean contains(Object object) {
        return object instanceof hci && ((hci)(object = (hci)object)).a() > 0 && this.a.a(((hci)object).a) == ((hci)object).a();
    }

    @Override
    public final Iterator iterator() {
        return this.a.e();
    }

    @Override
    public final boolean remove(Object object) {
        if (object instanceof hci) {
            object = (hci)object;
            Object object2 = ((hci)object).a;
            int n2 = ((hci)object).a();
            if (n2 != 0) {
                return this.a.g(object2, n2);
            }
        }
        return false;
    }

    @Override
    public final int size() {
        return this.a.b();
    }
}

