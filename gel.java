/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.time.Instant;
import j$.util.Map$_EL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

public final class gel
extends ach {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final gbt c = new gbt("SubscriptionMixinVM");
    public final Set d = new HashSet();
    public final gbr e;
    public final Executor f;
    public final cgw g;
    public final bmu i;

    public gel(cgw object, bmu bmu2, Executor executor) {
        this.g = object;
        this.i = bmu2;
        this.f = executor;
        this.e = object = new gbr(executor, gda.a);
        ((gbr)object).c();
    }

    public final void a(gds object, gen gen2, geg geg2) {
        int n2;
        fpk.c();
        Object object2 = geg2.getClass();
        Object object3 = new fbi(this, object, 3);
        object3 = (gem)Map$_EL.computeIfAbsent(this.a, object2, (Function)object3);
        fpk.c();
        Object object4 = this.c;
        object2 = ((gbt)object4).c;
        Object object5 = geg2.getClass();
        if (((pa)object2).containsKey(object5)) {
            n2 = (Integer)((gbt)object4).c.get(object5);
        } else {
            n2 = gbt.a.getAndIncrement();
            ((gbt)object4).c.put(object5, (Object)n2);
        }
        object5 = ((gbt)object4).b.put((Object)n2, geg2);
        boolean bl2 = geg2 instanceof gef;
        boolean bl3 = false;
        bl2 = !bl2 || !(geg2 instanceof gdn);
        fxf.q(bl2);
        object4 = ((gem)object3).e;
        object2 = ((ged)object4).a;
        Object object6 = ((gem)object3).i;
        bl2 = bl3;
        if (((ged)object4).c != Long.MAX_VALUE) {
            bl2 = true;
        }
        object6 = cgw.p();
        fxf.B(bl2, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        fxf.K(geg2);
        ((gem)object3).e = new ged((gds)object, ((gds)object).b, gen2, ((ged)object4).c + 1L, 3, ((ged)object4).d.c((gds)object, (Instant)object6));
        object = ((gem)object3).f;
        ((gem)object3).f = new gei(((gei)object).b + 1L, geg2, ((gei)object).d, ((gei)object).e, gsl.a);
        if (((gem)object3).j == null) {
            ((gem)object3).j = new AmbientModeSupport$AmbientController(object3);
            ((gem)object3).k.U(((gem)object3).e.a, ((gem)object3).j);
        } else if (!((gem)object3).e.a.equals(object2)) {
            ((gem)object3).k.V(object2, ((gem)object3).j);
            ((gem)object3).k.U(((gem)object3).e.a, ((gem)object3).j);
        }
        if (object5 == null && ((gem)object3).f.e.g()) {
            fxf.B(((gem)object3).f.f.g() ^ true, "Cannot be the case that subscription has data.");
            object = ((gem)object3).f;
            ((gem)object3).f = gem.j((gei)object, (ivu)((gei)object).e.c());
            fxf.B(((gem)object3).f.f.g(), "Callbacks did not accept pinned data after rotation.");
            if (((gem)object3).f.c instanceof gdn && !((gem)object3).g.g()) {
                ((gem)object3).f = ((gem)object3).f.a(true);
                gem.e((gdn)((Object)((gem)object3).f.c));
            }
            return;
        }
        ((gem)object3).d(((gem)object3).e.d);
    }

    @Override
    protected final void d() {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((gem)iterator.next()).a();
        }
        iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            ((gem)iterator.next()).a();
        }
        this.e.a().clear();
    }
}

