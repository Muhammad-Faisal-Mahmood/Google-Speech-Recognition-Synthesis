/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Window
 */
import android.content.Context;
import android.view.Window;

public final class gic
implements gib,
ilw {
    public final ni a = new ni();
    public final abg b = new abg(this);
    public final awg c = xm.g(this);
    public final nf d = new nf(new bpw(19));
    public gif e;
    public Window f;
    public bzb g;
    public bzb h;

    @Override
    public final Context a() {
        return this.e;
    }

    @Override
    public final by b() {
        bzb bzb2 = this.h;
        a.s(bzb2, "Called before init()");
        return bzb2.ab();
    }

    @Override
    public final Object bn() {
        return this.e.bn();
    }

    public final bzb c() {
        bzb bzb2 = this.h;
        a.s(bzb2, "Called before init()");
        return bzb2;
    }

    @Override
    public final acr getDefaultViewModelCreationExtras() {
        acs acs2 = new acs();
        acs2.b(acj.b, fvc.ao(this.e.getApplicationContext()));
        acs2.b(acb.a, this);
        acs2.b(acb.b, this);
        return acs2;
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        ace ace2 = new ace(fvc.ao(this.e.getApplicationContext()), this, null);
        return ((ikx)idi.e(this, ikx.class)).f().n(ace2);
    }

    @Override
    public final abb getLifecycle() {
        return this.b;
    }

    @Override
    public final awf getSavedStateRegistry() {
        return (awf)this.c.b;
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        return this.g;
    }
}

