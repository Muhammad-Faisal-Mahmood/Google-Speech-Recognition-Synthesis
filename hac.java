/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Map;
import j$.util.Map$_CC;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class hac
implements java.util.Map,
Serializable,
Map {
    private static final long serialVersionUID = 912559L;
    private transient hav a;
    private transient hav b;
    private transient gzm c;

    public static gzy h(int n2) {
        fvd.al(n2, "expectedSize");
        return new gzy(n2);
    }

    public static hac i(java.util.Map object) {
        if (object instanceof hac && !(object instanceof SortedMap)) {
            object = (hac)object;
            ((hac)object).c();
            return object;
        }
        int n2 = (object = object.entrySet()) instanceof Collection ? object.size() : 4;
        gzy gzy2 = new gzy(n2);
        gzy2.f((Iterable)object);
        return gzy2.b();
    }

    public static hac j(Object object, Object object2) {
        fvd.aj(object, object2);
        return hcy.a(1, new Object[]{object, object2});
    }

    public static hac m(Object object, Object object2, Object object3) {
        fvd.aj("fza", object);
        fvd.aj("gby", object2);
        fvd.aj("gel", object3);
        return hcy.a(3, new Object[]{"fza", object, "gby", object2, "gel", object3});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public hdx b() {
        throw null;
    }

    public abstract void c();

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object compute(Object object, BiFunction biFunction) {
        return Map$_CC.$default$compute(this, object, biFunction);
    }

    public final /* synthetic */ Object computeIfAbsent(Object object, Function function) {
        return Map$_CC.$default$computeIfAbsent(this, object, function);
    }

    public final /* synthetic */ Object computeIfPresent(Object object, BiFunction biFunction) {
        return Map$_CC.$default$computeIfPresent(this, object, biFunction);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.g().contains(object);
    }

    public abstract gzm d();

    public abstract hav e();

    @Override
    public boolean equals(Object object) {
        return fvd.s(this, object);
    }

    public abstract hav f();

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map$_CC.$default$forEach(this, biConsumer);
    }

    public final gzm g() {
        gzm gzm2;
        gzm gzm3 = gzm2 = this.c;
        if (gzm2 == null) {
            this.c = gzm3 = this.d();
        }
        return gzm3;
    }

    public abstract Object get(Object var1);

    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            return object;
        }
        return object2;
    }

    @Override
    public final int hashCode() {
        return hhk.n(this.k());
    }

    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }

    public final hav k() {
        hav hav2;
        hav hav3 = hav2 = this.a;
        if (hav2 == null) {
            this.a = hav3 = this.e();
        }
        return hav3;
    }

    public final hav l() {
        hav hav2;
        hav hav3 = hav2 = this.b;
        if (hav2 == null) {
            this.b = hav3 = this.f();
        }
        return hav3;
    }

    public final /* synthetic */ Object merge(Object object, Object object2, BiFunction biFunction) {
        return Map$_CC.$default$merge(this, object, object2, biFunction);
    }

    @Deprecated
    public final Object put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object putIfAbsent(Object object, Object object2) {
        return Map$_CC.$default$putIfAbsent(this, object, object2);
    }

    @Deprecated
    public final Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ boolean remove(Object object, Object object2) {
        return Map$_CC.$default$remove(this, object, object2);
    }

    public final /* synthetic */ Object replace(Object object, Object object2) {
        return Map$_CC.$default$replace(this, object, object2);
    }

    public final /* synthetic */ boolean replace(Object object, Object object2, Object object3) {
        return Map$_CC.$default$replace(this, object, object2, object3);
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map$_CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        return fvd.r(this);
    }

    public Object writeReplace() {
        return new hab(this);
    }
}

