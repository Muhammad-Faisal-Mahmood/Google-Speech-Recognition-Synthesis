/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Map;
import j$.util.Map$_CC;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class ot
extends pa
implements java.util.Map,
Map {
    on a;
    op b;
    or c;

    public ot() {
    }

    public ot(int n2) {
        super(n2);
    }

    public ot(pa pa2) {
        super(null);
        int n2 = pa2.f;
        this.h(this.f + n2);
        int n3 = this.f;
        if (n3 == 0) {
            if (n2 > 0) {
                jns.W(pa2.d, this.d, 0, 0, n2);
                jns.X(pa2.e, this.e, 0, 0, n2 + n2);
                this.f = n2;
                return;
            }
        } else {
            for (int i2 = 0; i2 < n2; ++i2) {
                this.put(pa2.d(i2), pa2.g(i2));
            }
        }
    }

    public final boolean a(Collection collection) {
        int n2 = this.f;
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            if (collection.contains(this.d(i2))) continue;
            this.e(i2);
        }
        return n2 != this.f;
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

    public final Set entrySet() {
        on on2;
        on on3 = on2 = this.a;
        if (on2 == null) {
            this.a = on3 = new on(this);
        }
        return on3;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map$_CC.$default$forEach(this, biConsumer);
    }

    public final Set keySet() {
        op op2;
        op op3 = op2 = this.b;
        if (op2 == null) {
            this.b = op3 = new op(this);
        }
        return op3;
    }

    public final /* synthetic */ Object merge(Object object, Object object2, BiFunction biFunction) {
        return Map$_CC.$default$merge(this, object, object2, biFunction);
    }

    public final void putAll(java.util.Map object) {
        this.h(this.f + object.size());
        for (Map.Entry entry : object.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map$_CC.$default$replaceAll(this, biFunction);
    }

    public final Collection values() {
        or or2;
        or or3 = or2 = this.c;
        if (or2 == null) {
            this.c = or3 = new or(this);
        }
        return or3;
    }
}

