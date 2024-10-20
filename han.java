/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

final class han
extends hba {
    private static final long serialVersionUID = 0L;
    final hap a;

    public han(hap hap2) {
        this.a = hap2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override
    public final boolean contains(Object object) {
        if (object instanceof hci) {
            if (((hci)(object = (hci)object)).a() <= 0) {
                return false;
            }
            if (this.a.a(((hci)object).a) == ((hci)object).a()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final int size() {
        return this.a.n().size();
    }

    @Override
    public Object writeReplace() {
        return new hao(this.a);
    }
}

