/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

public final class gzp
extends haa {
    private final transient EnumMap a;

    public gzp(EnumMap enumMap) {
        this.a = enumMap;
        fxf.q(enumMap.isEmpty() ^ true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override
    public final hdx a() {
        return new hbx(this.a.entrySet().iterator());
    }

    @Override
    public final hdx b() {
        return fvd.D(this.a.keySet().iterator());
    }

    @Override
    public final void c() {
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Object object2 = object;
        if (object instanceof gzp) {
            object2 = ((gzp)object).a;
        }
        return this.a.equals(object2);
    }

    @Override
    public final Object get(Object object) {
        return this.a.get(object);
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public Object writeReplace() {
        return new gzo(this.a);
    }
}

