/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class hcv
extends hav {
    public final transient Object[] a;
    public final transient int b;
    private final transient hac c;

    public hcv(hac hac2, Object[] objectArray, int n2) {
        this.c = hac2;
        this.a = objectArray;
        this.b = n2;
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        return ((gzm)((gzm)this).f()).b(objectArray, n2);
    }

    @Override
    public final boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            object = entry.getKey();
            if ((entry = entry.getValue()) != null && ((Object)entry).equals(this.c.get(object))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final gzx h() {
        return new hcu(this);
    }

    @Override
    public final hdx k() {
        return ((gzm)this).f().v();
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final int size() {
        return this.b;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

