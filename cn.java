/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ContextWrapper
 */
import android.app.Application;
import android.content.ContextWrapper;

public final class cn
implements aav,
awh,
aco {
    public abg a = null;
    public awg b = null;
    private final be c;
    private final Runnable d;
    private ack e;
    private final bzb f;

    public cn(be be2, bzb bzb2, Runnable runnable) {
        this.c = be2;
        this.f = bzb2;
        this.d = runnable;
    }

    public final void a(aaz aaz2) {
        this.a.d(aaz2);
    }

    final void b() {
        if (this.a == null) {
            awg awg2;
            this.a = new abg(this);
            this.b = awg2 = xm.g(this);
            awg2.a();
            this.d.run();
        }
    }

    @Override
    public final acr getDefaultViewModelCreationExtras() {
        Object object;
        block4: {
            object = this.c.requireContext().getApplicationContext();
            while (object instanceof ContextWrapper) {
                if (object instanceof Application) {
                    object = (Application)object;
                    break block4;
                }
                object = ((ContextWrapper)object).getBaseContext();
            }
            object = null;
        }
        acs acs2 = new acs();
        if (object != null) {
            acs2.b(acj.b, object);
        }
        object = this.c;
        acs2.b(acb.a, object);
        acs2.b(acb.b, this);
        object = this.c.l;
        if (object != null) {
            acs2.b(acb.c, object);
        }
        return acs2;
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        be be2 = this.c;
        Object object = be2.getDefaultViewModelProviderFactory();
        if (!object.equals(be2.ac)) {
            this.e = object;
            return object;
        }
        if (this.e == null) {
            block4: {
                be2 = this.c.requireContext().getApplicationContext();
                while (be2 instanceof ContextWrapper) {
                    if (be2 instanceof Application) {
                        be2 = (Application)be2;
                        break block4;
                    }
                    be2 = ((ContextWrapper)be2).getBaseContext();
                }
                be2 = null;
            }
            object = this.c;
            this.e = new ace((Application)be2, (awh)object, ((be)object).l);
        }
        return this.e;
    }

    @Override
    public final abb getLifecycle() {
        this.b();
        return this.a;
    }

    @Override
    public final awf getSavedStateRegistry() {
        this.b();
        return (awf)this.b.b;
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        this.b();
        return this.f;
    }
}

