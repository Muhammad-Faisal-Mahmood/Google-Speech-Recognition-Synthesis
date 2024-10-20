/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 */
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.apps.speech.tts.googletts.settings.asr.NondownloadedLanguageDialogPreference;
import java.util.Locale;

public final class byc
extends bxz
implements ilw,
ggy,
gim,
gpa {
    private byd ag;
    private Context ah;
    private final abg ai = new abg(this);
    private boolean aj;
    private final jjk al = new jjk(this);

    @Deprecated
    public byc() {
        fpk.c();
    }

    @Override
    public final void C(boolean bl2) {
        this.L();
    }

    @Override
    protected final /* synthetic */ iln H() {
        return new giq(this);
    }

    @Override
    @Deprecated
    public final Context I() {
        if (this.ah == null) {
            this.ah = new gin((be)this, super.getContext());
        }
        return this.ah;
    }

    @Override
    public final gqn K() {
        return (gqn)this.al.c;
    }

    public final byd L() {
        byd byd2 = this.ag;
        if (byd2 != null) {
            if (!this.aj) {
                return byd2;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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
    protected final void aT(dm dm2) {
        byd byd2 = this.L();
        ((hfk)((hfk)byd.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/NondownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 85, "NondownloadedLanguageDialogFragmentPeer.java")).r("#onPrepareDialogBuilder");
        Object object = (NondownloadedLanguageDialogPreference)byd2.b.G();
        Object object2 = ((NondownloadedLanguageDialogPreference)object).a;
        if (byd.a((NondownloadedLanguageDialogPreference)object)) {
            byd2.e.a(dxv.aq);
            object = new gph(byd2.g, "nondownloadedDialogTrace", byd2.b);
            String string = byd2.d.getString(2132017443, new Object[]{((byq)object2).d});
            Context context = byd2.d;
            object2 = context.getString(2132017442, new Object[]{((byq)object2).d, kh.o(context, ((byq)object2).a)});
            context = byd2.d;
            byd2 = byd2.d;
            kh.q(dm2, (DialogInterface.OnClickListener)object, string, (String)object2, context.getString(2132017464), byd2.getString(2132017216));
            return;
        }
        byd2.e.a(dxv.ao);
        object = new gph(byd2.g, "nondownloadedDialogTrace", byd2.b);
        String string = byd2.d.getString(2132017267, new Object[]{((byq)object2).d});
        Object object3 = byd2.d;
        object3 = object3.getString(2132017265, new Object[]{kh.o(object3, ((byq)object2).a)});
        object2 = byd2.d;
        byd2 = byd2.d;
        kh.q(dm2, (DialogInterface.OnClickListener)object, string, (String)object3, object2.getString(2132017266), byd2.getString(2132017216));
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
        return this.ai;
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
            if (!this.aj) {
                Object object2;
                super.onAttach((Context)object);
                object = this.ag;
                if (object == null) {
                    byd byd2;
                    Object object3;
                    try {
                        object3 = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        object = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw object;
                    }
                    object = ((brd)object3).a;
                    if (!(object instanceof byc)) {
                        IllegalStateException illegalStateException = new IllegalStateException(a.at(object, byd.class, "Attempt to inject a Fragment wrapper of type "));
                        throw illegalStateException;
                    }
                    byc byc2 = (byc)object;
                    idi.m(byc2);
                    object = ((brd)object3).b();
                    Activity activity = ((brd)object3).f.a();
                    object2 = (dxi)((brd)object3).e.j.b();
                    gbu gbu2 = (gbu)((brd)object3).c.b();
                    object3 = (gpm)((brd)object3).e.g.b();
                    this.ag = byd2 = new byd(byc2, (byx)object, (Context)activity, (dxi)object2, gbu2, (gpm)object3);
                    object2 = this.Z;
                    object = new ghx(this.al, this.ai);
                    ((abb)object2).b((abd)object);
                }
                if (!((object2 = this.D) instanceof gpa)) return;
                object = this.al;
                if (((jjk)object).c != null) return;
                ((jjk)object).c(((gpa)object2).K(), true);
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
    public final void onCancel(DialogInterface dialogInterface) {
        gpf gpf2 = this.al.e();
        try {
            this.L().e.a(dxv.ar.c(2));
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onClick(DialogInterface object, int n2) {
        this.ak = n2;
        byd byd2 = this.L();
        ((hfk)((hfk)byd.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/NondownloadedLanguageDialogFragmentPeer", "onClick", 130, "NondownloadedLanguageDialogFragmentPeer.java")).r("#onClick");
        if (n2 != -1) {
            byd2.e.a(dxv.ar.c(2));
            return;
        }
        Object object2 = (NondownloadedLanguageDialogPreference)byd2.b.G();
        if (byd.a((NondownloadedLanguageDialogPreference)object2)) {
            ((hfk)((hfk)byd.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/NondownloadedLanguageDialogFragmentPeer", "onClick", 140, "NondownloadedLanguageDialogFragmentPeer.java")).r("#onClick starting LP uninstall");
            byd2.c.b(byd2.i, ((NondownloadedLanguageDialogPreference)object2).a.a.a);
        } else {
            ((hfk)((hfk)byd.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/NondownloadedLanguageDialogFragmentPeer", "onClick", 145, "NondownloadedLanguageDialogFragmentPeer.java")).r("#onClick starting LP download");
            byx byx2 = byd2.c;
            object = byd2.h;
            object2 = ((NondownloadedLanguageDialogPreference)object2).a.a;
            byx2.a((byv)object, ((ezj)object2).a, ((ezj)object2).b);
        }
        byd2.e.a(dxv.ar.c(1));
    }

    @Override
    public final void onCreate(Bundle object) {
        this.al.j();
        try {
            super.onCreate((Bundle)object);
            object = this.L();
            ((hfk)((hfk)byd.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/NondownloadedLanguageDialogFragmentPeer", "onCreate", 78, "NondownloadedLanguageDialogFragmentPeer.java")).r("#onCreate");
            object.f.b(object.h);
            object.f.b(object.i);
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.al.j();
        try {
            layoutInflater = super.onCreateView(layoutInflater, viewGroup, bundle);
            return layoutInflater;
        }
        finally {
            gno.l();
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
            this.aj = true;
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
        this.al.h().close();
        return false;
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
        gno.l();
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

