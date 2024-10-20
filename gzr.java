/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.EnumSet;

public final class gzr
extends hav {
    private final transient EnumSet a;
    private transient int b;

    public gzr(EnumSet enumSet) {
        this.a = enumSet;
    }

    public static hav a(EnumSet enumSet) {
        int n2 = enumSet.size();
        if (n2 != 0) {
            if (n2 != 1) {
                return new gzr(enumSet);
            }
            return new hdq((Enum)fvd.Q(enumSet));
        }
        return hdc.a;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if (collection instanceof gzr) {
            collection2 = ((gzr)collection).a;
        }
        return this.a.containsAll(collection2);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = object;
        if (object instanceof gzr) {
            object2 = ((gzr)object).a;
        }
        return this.a.equals(object2);
    }

    @Override
    public final int hashCode() {
        int n2;
        int n3 = n2 = this.b;
        if (n2 == 0) {
            this.b = n3 = this.a.hashCode();
        }
        return n3;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final hdx k() {
        return fvd.D(this.a.iterator());
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override
    public Object writeReplace() {
        return new gzq(this.a);
    }
}

