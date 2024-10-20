/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class hvg
extends AbstractList
implements hxk {
    private boolean a;

    public hvg(boolean bl2) {
        this.a = bl2;
    }

    public void add(int n2, Object object) {
        this.bp();
        super.add(n2, object);
    }

    @Override
    public boolean add(Object object) {
        this.bp();
        return super.add(object);
    }

    public final boolean addAll(int n2, Collection collection) {
        this.bp();
        return super.addAll(n2, collection);
    }

    @Override
    public boolean addAll(Collection collection) {
        this.bp();
        return super.addAll(collection);
    }

    @Override
    public final void b() {
        if (this.a) {
            this.a = false;
        }
    }

    protected final void bp() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean c() {
        return this.a;
    }

    @Override
    public final void clear() {
        this.bp();
        super.clear();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        if (!(object instanceof RandomAccess)) {
            return super.equals(object);
        }
        object = (List)object;
        int n2 = this.size();
        if (n2 == object.size()) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.get(i2).equals(object.get(i2))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n2 = this.size();
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = n3 * 31 + this.get(i2).hashCode();
        }
        return n3;
    }

    public Object remove(int n2) {
        this.bp();
        return super.remove(n2);
    }

    @Override
    public final boolean remove(Object object) {
        this.bp();
        int n2 = this.indexOf(object);
        if (n2 == -1) {
            return false;
        }
        this.remove(n2);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.bp();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.bp();
        return super.retainAll(collection);
    }

    public Object set(int n2, Object object) {
        this.bp();
        return super.set(n2, object);
    }
}

