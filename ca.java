/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public final class ca
extends ach {
    public static final ack a = new acy(1);
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final boolean e;
    public boolean f = false;
    public boolean g = false;

    public ca(boolean bl2) {
        this.e = bl2;
    }

    public final void a(be be2) {
        if (!this.g && !this.b.containsKey(be2.k)) {
            this.b.put(be2.k, be2);
            if (by.S(2)) {
                Objects.toString(be2);
            }
        }
    }

    public final void b(be be2, boolean bl2) {
        if (by.S(3)) {
            Objects.toString(be2);
        }
        this.c(be2.k, bl2);
    }

    public final void c(String string, boolean bl2) {
        Object object = (ca)this.c.get(string);
        if (object != null) {
            if (bl2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((ca)object).c.keySet());
                int n2 = arrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    ((ca)object).c((String)arrayList.get(i2), true);
                }
            }
            ((ach)object).d();
            this.c.remove(string);
        }
        if ((object = (bzb)this.d.get(string)) != null) {
            ((bzb)object).S();
            this.d.remove(string);
        }
    }

    @Override
    protected final void d() {
        if (by.S(3)) {
            ((Object)this).toString();
        }
        this.f = true;
    }

    public final void e(be be2) {
        if (!this.g && this.b.remove(be2.k) != null && by.S(2)) {
            Objects.toString(be2);
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ca)object;
            if (this.b.equals(((ca)object).b) && this.c.equals(((ca)object).c) && this.d.equals(((ca)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(be be2) {
        if (this.b.containsKey(be2.k) && this.e) {
            return this.f;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("} Fragments (");
        Iterator<Object> iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") Child Non Config (");
        iterator = this.c.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") ViewModelStores (");
        iterator = this.d.keySet().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

