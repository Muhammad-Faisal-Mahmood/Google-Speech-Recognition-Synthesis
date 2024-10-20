/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.format.Formatter
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class fcn
extends fcv
implements ilw,
ggy,
gim,
gpa {
    private fct ah;
    private Context ai;
    private final abg aj = new abg(this);
    private boolean ak;
    private final jjk al = new jjk(this);

    @Deprecated
    public fcn() {
        fpk.c();
    }

    public final fct B() {
        fct fct2 = this.ah;
        if (fct2 != null) {
            if (!this.ak) {
                return fct2;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override
    protected final /* synthetic */ iln C() {
        return new giq(this);
    }

    @Override
    @Deprecated
    public final Context I() {
        if (this.ai == null) {
            this.ai = new gin((be)this, super.getContext());
        }
        return this.ai;
    }

    @Override
    public final gqn K() {
        return (gqn)this.al.c;
    }

    @Override
    public final Locale M() {
        return fvd.g(this);
    }

    @Override
    public final void N(gqn gqn2, boolean bl2) {
        this.al.c(gqn2, bl2);
    }

    @Override
    public final Dialog a(Bundle object) {
        super.a((Bundle)object);
        fct fct2 = this.B();
        Object object2 = new fva((Context)fct2.b);
        ((fva)object2).k(fct2.b.getString(2132017267, new Object[]{fct2.l}));
        if (fct2.k) {
            object = fct2.b;
            object = object.getString(2132017265, new Object[]{Formatter.formatFileSize((Context)object, (long)fct2.m)});
        } else {
            object = "";
        }
        ((fva)object2).h((CharSequence)object);
        ((fva)object2).j(new fco(fct2, 0));
        ((fva)object2).i(new fco(fct2, 2));
        object = ((dm)object2).b();
        object.setCanceledOnTouchOutside(true);
        if (!fct2.k) {
            Object object3 = (fcl)fct2.f;
            object2 = new fck(fxf.aj(((fcl)object3).c.a(), new dti(18), ((fcl)object3).d), 2);
            object3 = ((fcl)object3).e;
            object2 = new gds((hob)object2, "LanguagePack:displayNames");
            fct2.r.i((gds)object2, fct2.p);
        }
        fct2.h.a(dxv.am);
        return object;
    }

    @Override
    public final void c() {
        gpf gpf2 = gno.i();
        try {
            super.c();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return this.I();
    }

    @Override
    public final abb getLifecycle() {
        return this.aj;
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        this.al.j();
        try {
            super.onActivityCreated(bundle);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onActivityResult(int n2, int n3, Intent intent) {
        gpf gpf2 = this.al.d();
        try {
            super.onActivityResult(n2, n3, intent);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onAttach(Activity activity) {
        this.al.j();
        try {
            super.onAttach(activity);
            return;
        }
        finally {
            gno.l();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onAttach(Context object) {
        this.al.j();
        try {
            if (!this.ak) {
                Object object2;
                super.onAttach((Context)object);
                object = this.ah;
                if (object == null) {
                    Object object3;
                    try {
                        object3 = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw illegalStateException;
                    }
                    object = ((brd)object3).f.a();
                    object2 = ((brd)object3).a;
                    if (!(object2 instanceof fcn)) {
                        object = new IllegalStateException(a.at(object2, fct.class, "Attempt to inject a Fragment wrapper of type "));
                        throw object;
                    }
                    fcn fcn2 = (fcn)object2;
                    idi.m(fcn2);
                    hwj hwj2 = (hwj)((brd)object3).e.C.b();
                    object2 = (gbu)((brd)object3).c.b();
                    Object object4 = ((brd)object3).e;
                    Object object5 = ((brg)object4).L();
                    Object object6 = ((brg)object4).n();
                    Object object7 = ((brg)object4).q();
                    Object object8 = (Executor)((brg)object4).b.b();
                    object4 = new fcl((fxf)object5, (fbt)object6, (fep)object7, (Executor)object8);
                    object5 = (goi)((brd)object3).b.b();
                    object8 = ((brd)object3).e.n();
                    dxi dxi2 = (dxi)((brd)object3).e.j.b();
                    object6 = (gpm)((brd)object3).e.g.b();
                    Object object9 = ((brd)object3).e.n();
                    feh feh2 = ((brd)object3).e.p();
                    hpr hpr2 = (hpr)((brd)object3).e.b.b();
                    Optional<bzo> optional = Optional.of(((brd)object3).e.S());
                    object7 = new fch((fbt)object9, feh2, hpr2, optional);
                    object9 = (hth)((brd)object3).e.D.b();
                    this.ah = object3 = new fct((Activity)object, fcn2, hwj2, (gbu)object2, (fcj)object4, (goi)object5, (fbt)object8, dxi2, (gpm)object6, (fch)object7, (hth)object9);
                    object = this.Z;
                    object2 = new ghx(this.al, this.aj);
                    ((abb)object).b((abd)object2);
                }
                if (!((object = this.D) instanceof gpa)) return;
                object2 = this.al;
                if (((jjk)object2).c != null) return;
                ((jjk)object2).c(((gpa)object).K(), true);
                return;
            }
            object = new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            throw object;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onCancel(DialogInterface object) {
        gpf gpf2 = this.al.e();
        try {
            object = this.B();
            ((heg)((heg)fct.a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadDialogFragmentPeer", "onCancel", 343, "DownloadDialogFragmentPeer.java")).r("#onCancel");
            object.h.a(dxv.an.c(2));
            object.b.finish();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onCreate(Bundle object) {
        this.al.j();
        try {
            super.onCreate((Bundle)object);
            fct fct2 = this.B();
            Bundle bundle = fct2.c.l;
            if (bundle != null) {
                void var1_5;
                String string;
                boolean bl2 = bundle.containsKey("com.google.recognition.extra.DISPLAY_NAME");
                String string2 = string = "";
                if (bl2) {
                    String string3 = string;
                    if (!fxf.P(bundle.getString("com.google.recognition.extra.DISPLAY_NAME"))) {
                        String string4 = bundle.getString("com.google.recognition.extra.DISPLAY_NAME");
                    }
                }
                fct2.l = var1_5;
                fct2.m = bundle.getLong("com.google.recognition.extra.DOWNLOAD_SIZE", 0L);
                fct2.k = bundle.getBoolean("FromPublicModelManager", false);
                fct2.n = bundle.getString("RequestId", "-1");
            }
            if (fct2.k) return;
            fct2.e.b(fct2.q);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final Animation onCreateAnimation(int n2, boolean bl2, int n3) {
        this.al.f(n2, n3);
        gno.l();
        return null;
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        this.al.j();
        try {
            super.onCreateView(layoutInflater, (ViewGroup)object, (Bundle)object2);
            object2 = this.B();
            layoutInflater = layoutInflater.inflate(2131624048, object, false);
            String string = ((fct)object2).a();
            if (string == null) {
                ((heg)((heg)fct.a.g()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadDialogFragmentPeer", "onCreateView", 325, "DownloadDialogFragmentPeer.java")).r("Locale must be specified");
                ((fct)object2).b();
                ((fct)object2).h.a(dxv.an.c(4));
            } else if (!((fct)object2).k) {
                object = ((fct)object2).f;
                Object object3 = ((fcl)object).b.c(gsl.a, hdc.a, Optional.empty());
                ezz ezz2 = new ezz(string, 10);
                object3 = fxf.ak((hpn)object3, ezz2, ((fcl)object).d);
                object = ((fcl)object).e;
                object = new fck(object3, 0);
                object3 = new gds((hob)object, "LanguagePack:languagePack");
                ((fct)object2).r.i((gds)object3, ((fct)object2).o);
            }
            return layoutInflater;
        }
        finally {
            try {
                gno.l();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
        }
    }

    @Override
    public final void onDestroy() {
        gpf gpf2 = jjk.k(this.al);
        try {
            super.onDestroy();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onDestroyView() {
        gpf gpf2 = jjk.k(this.al);
        try {
            super.onDestroyView();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onDetach() {
        gpf gpf2 = this.al.a();
        try {
            super.onDetach();
            this.ak = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        gpf gpf2 = this.al.g();
        try {
            super.onDismiss(dialogInterface);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.al.j();
        try {
            bundle = super.onGetLayoutInflater(bundle);
            gin gin2 = new gin((be)this, (LayoutInflater)bundle);
            bundle = bundle.cloneInContext((Context)gin2);
            return bundle;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gpf gpf2 = this.al.h();
        try {
            boolean bl2 = super.onOptionsItemSelected(menuItem);
            return bl2;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onPause() {
        this.al.j();
        try {
            super.onPause();
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onResume() {
        gpf gpf2 = jjk.k(this.al);
        try {
            super.onResume();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        this.al.j();
        try {
            super.onSaveInstanceState(bundle);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onStart() {
        this.al.j();
        try {
            super.onStart();
            fxf.ac(this);
            if (this.b) {
                fxf.ab(this);
            }
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onStop() {
        this.al.j();
        try {
            super.onStop();
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onViewCreated(View view, Bundle bundle) {
        this.al.j();
        try {
            super.onViewCreated(view, bundle);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void setEnterTransition(Object object) {
        jjk jjk2 = this.al;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setEnterTransition(object);
    }

    @Override
    public final void setExitTransition(Object object) {
        jjk jjk2 = this.al;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setExitTransition(object);
    }

    @Override
    public final void setReenterTransition(Object object) {
        jjk jjk2 = this.al;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setReenterTransition(object);
    }

    @Override
    public final void setRetainInstance(boolean bl2) {
        a.j(bl2);
    }

    @Override
    public final void setReturnTransition(Object object) {
        jjk jjk2 = this.al;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setReturnTransition(object);
    }

    @Override
    public final void setSharedElementEnterTransition(Object object) {
        jjk jjk2 = this.al;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setSharedElementEnterTransition(object);
    }

    @Override
    public final void setSharedElementReturnTransition(Object object) {
        jjk jjk2 = this.al;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setSharedElementReturnTransition(object);
    }

    @Override
    public final void startActivity(Intent intent) {
        if (fvd.n(intent, ((be)this).getContext().getApplicationContext())) {
            gqk.l(intent);
        }
        super.startActivity(intent);
    }

    @Override
    public final void startActivity(Intent intent, Bundle bundle) {
        if (fvd.n(intent, ((be)this).getContext().getApplicationContext())) {
            gqk.l(intent);
        }
        super.startActivity(intent, bundle);
    }
}

