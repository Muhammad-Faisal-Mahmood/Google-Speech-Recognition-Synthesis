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
import com.google.android.apps.speech.tts.googletts.settings.asr.DownloadedLanguageDialogPreference;
import java.util.Locale;

public final class bxr
extends bxx
implements ilw,
ggy,
gim,
gpa {
    private bxs ag;
    private Context ah;
    private final abg ai = new abg(this);
    private boolean aj;
    private final jjk al = new jjk(this);

    @Deprecated
    public bxr() {
        fpk.c();
    }

    @Override
    public final void C(boolean bl2) {
        this.H();
    }

    public final bxs H() {
        bxs bxs2 = this.ag;
        if (bxs2 != null) {
            if (!this.aj) {
                return bxs2;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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
    protected final /* synthetic */ iln J() {
        return new giq(this);
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
    protected final void aT(dm object) {
        Object object2 = this.H();
        ((hfk)((hfk)bxs.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 93, "DownloadedLanguageDialogFragmentPeer.java")).r("#onPrepareDialogBuilder");
        Object object3 = (DownloadedLanguageDialogPreference)((bxs)object2).b.G();
        if (bxs.f((DownloadedLanguageDialogPreference)object3)) {
            ((hfk)((hfk)bxs.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 98, "DownloadedLanguageDialogFragmentPeer.java")).r("#onPrepareDialogBuilder download-pending dialog");
            ((bxs)object2).e.a(dxv.aq);
            byq byq2 = ((DownloadedLanguageDialogPreference)((bxs)object2).b.G()).a;
            object3 = new gph(((bxs)object2).f, "downloadedDialogTrace", ((bxs)object2).b);
            String string = ((bxs)object2).d.getString(2132017443, new Object[]{bxs.b(byq2)});
            Object object4 = ((bxs)object2).d;
            object4 = object4.getString(2132017442, new Object[]{byq2.d, kh.o(object4, (ezj)byq2.b.c())});
            object2 = ((bxs)object2).d;
            kh.q((dm)object, (DialogInterface.OnClickListener)object3, string, (String)object4, object2.getString(2132017464), object2.getString(2132017216));
            return;
        }
        if (bxs.g((DownloadedLanguageDialogPreference)object3) && bxs.e((DownloadedLanguageDialogPreference)object3)) {
            ((hfk)((hfk)bxs.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 101, "DownloadedLanguageDialogFragmentPeer.java")).r("#onPrepareDialogBuilder three-button dialog");
            ((bxs)object2).e.a(dxv.ap);
            byq byq3 = ((DownloadedLanguageDialogPreference)((bxs)object2).b.G()).a;
            gph gph2 = new gph(((bxs)object2).f, "downloadedDialogTrace", ((bxs)object2).b);
            object3 = ((bxs)object2).d.getString(2132017267, new Object[]{bxs.b(byq3)});
            Object object5 = ((bxs)object2).d;
            object5 = object5.getString(2132017265, new Object[]{kh.o(object5, (ezj)byq3.b.c())});
            byq3 = ((bxs)object2).d;
            kh.q((dm)object, gph2, (String)object3, (String)object5, byq3.getString(2132017266), byq3.getString(2132017502));
            object2 = ((bxs)object2).b;
            object = ((dm)object).a;
            ((di)object).k = ((di)object).a.getText(2132017216);
            ((di)object).l = object2;
            return;
        }
        if (bxs.g((DownloadedLanguageDialogPreference)object3)) {
            ((hfk)((hfk)bxs.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 104, "DownloadedLanguageDialogFragmentPeer.java")).r("#onPrepareDialogBuilder download-only dialog");
            ((bxs)object2).e.a(dxv.ap);
            byq byq4 = ((DownloadedLanguageDialogPreference)((bxs)object2).b.G()).a;
            gph gph3 = new gph(((bxs)object2).f, "downloadedDialogTrace", ((bxs)object2).b);
            object3 = ((bxs)object2).d.getString(2132017267, new Object[]{bxs.b(byq4)});
            Object object6 = ((bxs)object2).d;
            object6 = object6.getString(2132017265, new Object[]{kh.o(object6, (ezj)byq4.b.c())});
            object2 = ((bxs)object2).d;
            kh.q((dm)object, gph3, (String)object3, (String)object6, object2.getString(2132017266), object2.getString(2132017216));
            return;
        }
        if (bxs.e((DownloadedLanguageDialogPreference)object3)) {
            ((hfk)((hfk)bxs.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 107, "DownloadedLanguageDialogFragmentPeer.java")).r("#onPrepareDialogBuilder uninstall-only dialog");
            ((bxs)object2).e.a(dxv.aq);
            Object object7 = ((DownloadedLanguageDialogPreference)((bxs)object2).b.G()).a;
            object3 = new gph(((bxs)object2).f, "downloadedDialogTrace", ((bxs)object2).b);
            object7 = ((bxs)object2).d.getString(2132017503, new Object[]{bxs.b((byq)object7)});
            object2 = ((bxs)object2).d;
            kh.q((dm)object, (DialogInterface.OnClickListener)object3, (String)object7, object2.getString(2132017501), object2.getString(2132017502), object2.getString(2132017216));
            return;
        }
        ((hfk)((hfk)bxs.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onPrepareDialogBuilder", 110, "DownloadedLanguageDialogFragmentPeer.java")).r("DownloadedLanguageDialogPreference cannot be mutated. This preference should be greyed out.");
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
                    Object object3;
                    try {
                        object3 = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw illegalStateException;
                    }
                    object = ((brd)object3).a;
                    if (!(object instanceof bxr)) {
                        IllegalStateException illegalStateException = new IllegalStateException(a.at(object, bxs.class, "Attempt to inject a Fragment wrapper of type "));
                        throw illegalStateException;
                    }
                    bxr bxr2 = (bxr)object;
                    idi.m(bxr2);
                    byx byx2 = ((brd)object3).b();
                    gbu gbu2 = (gbu)((brd)object3).c.b();
                    object = ((brd)object3).f.a();
                    object2 = (dxi)((brd)object3).e.j.b();
                    gpm gpm2 = (gpm)((brd)object3).e.g.b();
                    this.ag = object3 = new bxs(bxr2, byx2, gbu2, (Context)object, (dxi)object2, gpm2);
                    object = this.Z;
                    object2 = new ghx(this.al, this.ai);
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
    public final void onCancel(DialogInterface dialogInterface) {
        gpf gpf2 = this.al.e();
        try {
            this.H().e.a(dxv.ar.c(2));
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onClick(DialogInterface object, int n2) {
        this.ak = n2;
        object = this.H();
        ((hfk)((hfk)bxs.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onClick", 123, "DownloadedLanguageDialogFragmentPeer.java")).s("#onClick: %d", n2);
        DownloadedLanguageDialogPreference downloadedLanguageDialogPreference = (DownloadedLanguageDialogPreference)((bxs)object).b.G();
        if (bxs.g(downloadedLanguageDialogPreference) && bxs.e(downloadedLanguageDialogPreference) && !bxs.f(downloadedLanguageDialogPreference)) {
            ((hfk)((hfk)bxs.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onClick", 129, "DownloadedLanguageDialogFragmentPeer.java")).r("#onClick running for three-button dialog.");
            if (n2 == -1) {
                ((bxs)object).c(downloadedLanguageDialogPreference);
                return;
            }
            if (n2 == -2) {
                ((bxs)object).d(downloadedLanguageDialogPreference);
                return;
            }
            ((bxs)object).e.a(dxv.ar.c(2));
            return;
        }
        ((hfk)((hfk)bxs.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onClick", 140, "DownloadedLanguageDialogFragmentPeer.java")).r("#onClick running for two-button dialog.");
        if (n2 != -1) {
            ((bxs)object).e.a(dxv.ar.c(2));
            return;
        }
        if (bxs.f(downloadedLanguageDialogPreference)) {
            ((bxs)object).d(downloadedLanguageDialogPreference);
            return;
        }
        if (bxs.g(downloadedLanguageDialogPreference)) {
            ((bxs)object).c(downloadedLanguageDialogPreference);
            return;
        }
        if (bxs.e(downloadedLanguageDialogPreference)) {
            ((bxs)object).d(downloadedLanguageDialogPreference);
            return;
        }
        ((hfk)((hfk)bxs.a.h()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onClick", 153, "DownloadedLanguageDialogFragmentPeer.java")).r("DownloadedLanguageDialogPreference cannot be mutated. It should be impossible for #onClick to have been triggered.");
    }

    @Override
    public final void onCreate(Bundle object) {
        this.al.j();
        try {
            super.onCreate((Bundle)object);
            object = this.H();
            ((hfk)((hfk)bxs.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/DownloadedLanguageDialogFragmentPeer", "onCreate", 85, "DownloadedLanguageDialogFragmentPeer.java")).r("#onCreate");
            object.c.b(object.h);
            object.c.b(object.g);
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

