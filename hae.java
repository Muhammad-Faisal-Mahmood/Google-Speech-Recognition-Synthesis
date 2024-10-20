/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Map;

abstract class hae
extends hav {
    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    public abstract hac a();

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean contains(Object object) {
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            object = this.a().get(entry.getKey());
            if (object != null && object.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final int size() {
        return this.a().size();
    }

    @Override
    public Object writeReplace() {
        return new had(this.a());
    }
}

