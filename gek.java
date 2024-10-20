/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.Iterator;

public final class gek
implements aas {
    final be a;
    final goi b;

    public gek(goi goi2, be be2) {
        this.a = be2;
        this.b = goi2;
    }

    @Override
    public final void onCreate(abe object) {
        object = new acs(this.a.getDefaultViewModelCreationExtras());
        ((acs)object).b(acb.c, Bundle.EMPTY);
        be be2 = this.a;
        this.b.b = object = (gel)new acn(be2.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging(), be2.getDefaultViewModelProviderFactory(), (acr)object).a(gel.class);
    }

    @Override
    public final void onDestroy(abe object) {
        ((gbr)this.b.a).c();
        ((gbr)this.b.a).a();
        object = (gel)this.b.b;
        Iterator iterator = ((gel)object).a.values().iterator();
        while (iterator.hasNext()) {
            ((gem)iterator.next()).b();
        }
        iterator = ((gel)object).b.values().iterator();
        while (iterator.hasNext()) {
            ((gem)iterator.next()).b();
        }
        ((gel)object).c.b();
        ((gel)object).d.clear();
    }

    @Override
    public final /* synthetic */ void onPause(abe abe2) {
        wc.f(abe2);
    }

    @Override
    public final /* synthetic */ void onResume(abe abe2) {
        wc.g(abe2);
    }

    @Override
    public final void onStart(abe object2) {
        ((gbr)this.b.a).b();
        gel gel2 = (gel)this.b.b;
        gel2.c.f();
        for (Object object2 : gel2.b.keySet()) {
            int n2 = (Integer)object2;
            fxf.C(gel2.d.contains(object2), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", n2);
        }
        ((gel)this.b.b).e.b();
    }

    @Override
    public final void onStop(abe abe2) {
        ((gel)this.b.b).e.c();
        ((gbr)this.b.a).c();
    }
}

