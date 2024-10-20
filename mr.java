/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Trace
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class mr
extends db
implements abe,
aco,
aav,
awh,
ng,
nr,
st,
su,
cs,
ct,
vf {
    private final awg a;
    private final jny b;
    private final CopyOnWriteArrayList c;
    private final CopyOnWriteArrayList d;
    private final CopyOnWriteArrayList e;
    public final ni g = new ni();
    public final nq h;
    public final CopyOnWriteArrayList i;
    public final mo j;
    private final CopyOnWriteArrayList l;
    private boolean m;
    private boolean n;
    private final CopyOnWriteArrayList nC;
    private final jny o;
    private final jny p;
    private final bmu q = new bmu(new kd(this, 5, null));
    private bzb r;

    public mr() {
        awg awg2;
        this.a = awg2 = xm.g(this);
        this.j = new mo(this);
        this.b = new jog(new mq(this, 0));
        new AtomicInteger();
        this.h = new nq(this);
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.nC = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        if (this.getLifecycle() != null) {
            this.getLifecycle().b(new mm(this, 1));
            this.getLifecycle().b(new mm(this, 0));
            this.getLifecycle().b(new mm(this, 2, null));
            awg2.a();
            acb.c(this);
            this.getSavedStateRegistry().b("android:support:activity-result", new bo(this, 3));
            this.z(new mn(this, 0));
            this.o = new jog(new mq(this, 1));
            this.p = new jog(new mq(this, 2));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static final /* synthetic */ void x(mr mr2) {
        super.onBackPressed();
    }

    public final void A() {
        if (this.r == null) {
            ilo ilo2 = (ilo)this.getLastNonConfigurationInstance();
            if (ilo2 != null) {
                this.r = (bzb)ilo2.a;
            }
            if (this.r == null) {
                this.r = new bzb(null, null);
            }
        }
    }

    public final void B() {
        View view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        we.f(view, this);
        view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        wf.d(view, this);
        view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        xm.f(view, this);
        view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        kh.c(view, this);
        view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        jse.e(view, "<this>");
        view.setTag(2131427826, (Object)this);
    }

    public final giu C() {
        return (giu)this.b.a();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.B();
        View view2 = this.getWindow().getDecorView();
        jse.d(view2, "window.decorView");
        this.j.a(view2);
        super.addContentView(view, layoutParams);
    }

    @Override
    public final nq d() {
        return this.h;
    }

    @Override
    public final void f(um um2) {
        jse.e(um2, "listener");
        this.c.add(um2);
    }

    @Override
    public final void g(um um2) {
        jse.e(um2, "listener");
        this.e.add(um2);
    }

    @Override
    public acr getDefaultViewModelCreationExtras() {
        acq acq2;
        Bundle bundle = null;
        acs acs2 = new acs(null);
        if (this.getApplication() != null) {
            acq2 = acj.b;
            Application application = this.getApplication();
            jse.d(application, "application");
            acs2.b(acq2, application);
        }
        acs2.b(acb.a, this);
        acs2.b(acb.b, this);
        acq2 = this.getIntent();
        if (acq2 != null) {
            bundle = acq2.getExtras();
        }
        if (bundle != null) {
            acs2.b(acb.c, bundle);
        }
        return acs2;
    }

    @Override
    public ack getDefaultViewModelProviderFactory() {
        return (ack)this.o.a();
    }

    @Override
    public final nf getOnBackPressedDispatcher() {
        return (nf)this.p.a();
    }

    @Override
    public final awf getSavedStateRegistry() {
        return (awf)this.a.b;
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        if (this.getApplication() != null) {
            this.A();
            bzb bzb2 = this.r;
            jse.b(bzb2);
            return bzb2;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override
    public final void h(um um2) {
        jse.e(um2, "listener");
        this.nC.add(um2);
    }

    @Override
    public final void i(um um2) {
        jse.e(um2, "listener");
        this.d.add(um2);
    }

    @Override
    public final void k(um um2) {
        jse.e(um2, "listener");
        this.c.remove(um2);
    }

    @Override
    public final void l(um um2) {
        jse.e(um2, "listener");
        this.e.remove(um2);
    }

    @Override
    public final void m(um um2) {
        jse.e(um2, "listener");
        this.nC.remove(um2);
    }

    @Override
    public final void n(um um2) {
        jse.e(um2, "listener");
        this.d.remove(um2);
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        if (!this.h.e(n2, n3, intent)) {
            super.onActivityResult(n2, n3, intent);
        }
    }

    public void onBackPressed() {
        this.getOnBackPressedDispatcher().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        jse.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((um)iterator.next()).a(configuration);
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.a.b(bundle);
        this.g.b((Context)this);
        super.onCreate(bundle);
        int n2 = abt.a;
        wd.m(this);
    }

    public boolean onCreatePanelMenu(int n2, Menu menu) {
        jse.e(menu, "menu");
        if (n2 == 0) {
            super.onCreatePanelMenu(0, menu);
            this.q.d(menu, this.getMenuInflater());
        }
        return true;
    }

    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        jse.e(menuItem, "item");
        if (super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        if (n2 == 0) {
            return this.q.f(menuItem);
        }
        return false;
    }

    public final void onMultiWindowModeChanged(boolean bl2) {
        if (!this.m) {
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((um)iterator.next()).a(new gfb(bl2));
            }
        }
    }

    public final void onMultiWindowModeChanged(boolean bl2, Configuration configuration) {
        jse.e(configuration, "newConfig");
        this.m = true;
        super.onMultiWindowModeChanged(bl2, configuration);
        for (um um2 : this.e) {
            jse.e(configuration, "newConfig");
            um2.a(new gfb(bl2));
        }
        return;
        finally {
            this.m = false;
        }
    }

    protected void onNewIntent(Intent intent) {
        jse.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((um)iterator.next()).a(intent);
        }
    }

    public final void onPanelClosed(int n2, Menu menu) {
        jse.e(menu, "menu");
        Iterator iterator = ((CopyOnWriteArrayList)this.q.a).iterator();
        while (iterator.hasNext()) {
            ((by)((AmbientMode$AmbientController)iterator.next()).a).u(menu);
        }
        super.onPanelClosed(n2, menu);
    }

    public final void onPictureInPictureModeChanged(boolean bl2) {
        if (!this.n) {
            Iterator iterator = this.nC.iterator();
            while (iterator.hasNext()) {
                ((um)iterator.next()).a(new gfb(bl2));
            }
        }
    }

    public void onPictureInPictureModeChanged(boolean bl2, Configuration configuration) {
        jse.e(configuration, "newConfig");
        this.n = true;
        super.onPictureInPictureModeChanged(bl2, configuration);
        for (um um2 : this.nC) {
            jse.e(configuration, "newConfig");
            um2.a(new gfb(bl2));
        }
        return;
        finally {
            this.n = false;
        }
    }

    public final boolean onPreparePanel(int n2, View view, Menu menu) {
        jse.e(menu, "menu");
        if (n2 == 0) {
            super.onPreparePanel(0, view, menu);
            this.q.e(menu);
        }
        return true;
    }

    public void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        jse.e(stringArray, "permissions");
        jse.e(nArray, "grantResults");
        Intent intent = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", stringArray).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", nArray);
        if (!this.h.e(n2, -1, intent)) {
            super.onRequestPermissionsResult(n2, stringArray, nArray);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        Object object;
        Object object2 = object = this.r;
        if (object == null) {
            ilo ilo2 = (ilo)this.getLastNonConfigurationInstance();
            object2 = object;
            if (ilo2 != null) {
                object2 = ilo2.a;
            }
        }
        if (object2 == null) {
            return null;
        }
        object = new ilo();
        ((ilo)object).a = object2;
        return object;
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        jse.e(bundle, "outState");
        if (this.getLifecycle() instanceof abg) {
            abb abb2 = this.getLifecycle();
            jse.c(abb2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((abg)abb2).e(aba.c);
        }
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    public final void onTrimMemory(int n2) {
        super.onTrimMemory(n2);
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((um)iterator.next()).a(n2);
        }
    }

    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
    }

    @Override
    public final void r(AmbientMode$AmbientController ambientMode$AmbientController) {
        jse.e(ambientMode$AmbientController, "provider");
        this.q.I(ambientMode$AmbientController);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reportFullyDrawn() {
        Iterator iterator;
        giu giu2;
        try {
            if (yj.o()) {
                yj.m("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            giu2 = this.C();
            Object object = giu2.b;
            synchronized (object) {
                giu2.a = true;
                iterator = giu2.c.iterator();
            }
        }
        catch (Throwable throwable) {
            Trace.endSection();
            throw throwable;
        }
        {
            while (true) {
                if (!iterator.hasNext()) {
                    giu2.c.clear();
                    // MONITOREXIT @DISABLED, blocks:[3, 5, 6] lbl17 : MonitorExitStatement: MONITOREXIT : var1_2
                    Trace.endSection();
                    return;
                }
                ((jqz)iterator.next()).a();
            }
        }
    }

    @Override
    public final void s(AmbientMode$AmbientController ambientMode$AmbientController) {
        jse.e(ambientMode$AmbientController, "provider");
        this.q.J(ambientMode$AmbientController);
    }

    public void setContentView(int n2) {
        this.B();
        View view = this.getWindow().getDecorView();
        jse.d(view, "window.decorView");
        this.j.a(view);
        super.setContentView(n2);
    }

    public void setContentView(View view) {
        this.B();
        View view2 = this.getWindow().getDecorView();
        jse.d(view2, "window.decorView");
        this.j.a(view2);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.B();
        View view2 = this.getWindow().getDecorView();
        jse.d(view2, "window.decorView");
        this.j.a(view2);
        super.setContentView(view, layoutParams);
    }

    public void startActivityForResult(Intent intent, int n2) {
        jse.e(intent, "intent");
        super.startActivityForResult(intent, n2);
    }

    public void startActivityForResult(Intent intent, int n2, Bundle bundle) {
        jse.e(intent, "intent");
        super.startActivityForResult(intent, n2, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int n2, Intent intent, int n3, int n4, int n5) {
        jse.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, n2, intent, n3, n4, n5);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int n2, Intent intent, int n3, int n4, int n5, Bundle bundle) {
        jse.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, n2, intent, n3, n4, n5, bundle);
    }

    public final void y(nf nf2) {
        this.getLifecycle().b(new aax(nf2, this, 1));
    }

    public final void z(nj nj2) {
        ni ni2 = this.g;
        Context context = ni2.b;
        if (context != null) {
            nj2.a(context);
        }
        ni2.a.add(nj2);
    }
}

