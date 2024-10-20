/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
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
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.speech.tts.googletts.settings.asr.DownloadedLanguageDialogPreference;
import com.google.android.apps.speech.tts.googletts.settings.asr.NondownloadedLanguageDialogPreference;
import java.util.Locale;

public final class bxh
extends bxv
implements ilw,
ggy,
gim,
gpa {
    private bxm ag;
    private Context ah;
    private final abg ai = new abg(this);
    private boolean aj;
    private final jjk ak = new jjk(this);

    @Deprecated
    public bxh() {
        fpk.c();
    }

    @Override
    public final void B(Preference preference) {
        bxm bxm2 = this.J();
        ((hfk)((hfk)bxm.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AddLanguagesFragmentPeer", "onDisplayPreferenceDialog", 211, "AddLanguagesFragmentPeer.java")).r("#onDisplayPreferenceDialog");
        if (bxm2.b.getParentFragmentManager().e(preference.getKey()) != null) {
            ((hfk)((hfk)bxm.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AddLanguagesFragmentPeer", "onDisplayPreferenceDialog", 214, "AddLanguagesFragmentPeer.java")).u("onDisplayPreferenceDialog did not find fragment with tag %s", preference.getKey());
            return;
        }
        if (preference instanceof DownloadedLanguageDialogPreference) {
            ((hfk)((hfk)bxm.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AddLanguagesFragmentPeer", "onDisplayPreferenceDialog", 220, "AddLanguagesFragmentPeer.java")).r("onDisplayPreferenceDialog DownloadedLanguageDialogPreference");
            bxr bxr2 = bxs.a(preference.getKey());
            bxr2.setTargetFragment(bxm2.b, 0);
            bxr2.f(bxm2.b.getParentFragmentManager(), preference.getKey());
            return;
        }
        if (preference instanceof NondownloadedLanguageDialogPreference) {
            ((hfk)((hfk)bxm.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AddLanguagesFragmentPeer", "onDisplayPreferenceDialog", 226, "AddLanguagesFragmentPeer.java")).r("onDisplayPreferenceDialog NondownloadedLanguageDialogPreference");
            String string = preference.getKey();
            byc byc2 = new byc();
            iln.e(byc2);
            Bundle bundle = new Bundle();
            bundle.putString("key", string);
            byc2.setArguments(bundle);
            byc2.setTargetFragment(bxm2.b, 0);
            byc2.f(bxm2.b.getParentFragmentManager(), preference.getKey());
        }
    }

    @Override
    public final void G(String object) {
        bxm bxm2 = this.J();
        ((hfk)((hfk)bxm.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AddLanguagesFragmentPeer", "onCreatePreferences", 188, "AddLanguagesFragmentPeer.java")).r("#onCreatePreferences");
        bxm2.b.E(2132213760, (String)object);
        bxh bxh2 = bxm2.b;
        object = bxh2.e();
        bxm2.f = gto.i((PreferenceCategory)((PreferenceGroup)object).b(bxh2.getString(2132017523)));
        ((PreferenceGroup)((gtt)bxm2.f).a).c = false;
        bxm2.e = gto.i((PreferenceCategory)((PreferenceGroup)object).b(bxm2.b.getString(2132017201)));
        ((PreferenceGroup)((gtt)bxm2.e).a).c = false;
    }

    @Override
    @Deprecated
    public final Context I() {
        if (this.ah == null) {
            this.ah = new gin((be)this, super.getContext());
        }
        return this.ah;
    }

    public final bxm J() {
        bxm bxm2 = this.ag;
        if (bxm2 != null) {
            if (!this.aj) {
                return bxm2;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override
    public final gqn K() {
        return (gqn)this.ak.c;
    }

    @Override
    protected final /* synthetic */ iln L() {
        return new giq(this);
    }

    @Override
    public final Locale M() {
        return fvd.g(this);
    }

    @Override
    public final void N(gqn gqn2, boolean bl2) {
        this.ak.c(gqn2, bl2);
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
        this.ak.j();
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
        gpf gpf2 = this.ak.d();
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
        this.ak.j();
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
        this.ak.j();
        try {
            if (!this.aj) {
                Object object2;
                super.onAttach((Context)object);
                object = this.ag;
                if (object == null) {
                    bxm bxm2;
                    Object object3;
                    try {
                        object3 = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw illegalStateException;
                    }
                    object = ((brd)object3).a;
                    if (!(object instanceof bxh)) {
                        IllegalStateException illegalStateException = new IllegalStateException(a.at(object, bxm.class, "Attempt to inject a Fragment wrapper of type "));
                        throw illegalStateException;
                    }
                    object = (bxh)object;
                    idi.m(object);
                    byp byp2 = (byp)((brd)object3).e.A.b();
                    object2 = (goi)((brd)object3).b.b();
                    object3 = ((brd)object3).f.a();
                    this.ag = bxm2 = new bxm((bxh)object, byp2, (goi)object2, (Context)object3);
                    bxm2.j = this;
                    object = this.Z;
                    object2 = new ghx(this.ak, this.ai);
                    ((abb)object).b((abd)object2);
                }
                if (!((object = this.D) instanceof gpa)) return;
                object2 = this.ak;
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
    public final void onCreate(Bundle object) {
        this.ak.j();
        try {
            super.onCreate((Bundle)object);
            object = this.J();
            ((hfk)((hfk)bxm.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/AddLanguagesFragmentPeer", "onCreate", 179, "AddLanguagesFragmentPeer.java")).r("#onCreate");
            object.i.i(object.c.f(), object.g);
            object.i.i(object.c.e(), object.h);
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final Animation onCreateAnimation(int n2, boolean bl2, int n3) {
        this.ak.f(n2, n3);
        gno.l();
        return null;
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.j();
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
        gpf gpf2 = jjk.k(this.ak);
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
        gpf gpf2 = jjk.k(this.ak);
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
        gpf gpf2 = this.ak.a();
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
    public final LayoutInflater onGetLayoutInflater(Bundle object) {
        this.ak.j();
        try {
            object = this.getLayoutInflater((Bundle)object);
            ilr ilr2 = new ilr((LayoutInflater)object, (be)this);
            ilr2 = object.cloneInContext((Context)ilr2);
            object = new gin((be)this, (LayoutInflater)ilr2);
            object = ilr2.cloneInContext((Context)object);
            return object;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gpf gpf2 = this.ak.h();
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
        this.ak.j();
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
        gpf gpf2 = jjk.k(this.ak);
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
        this.ak.j();
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
        this.ak.j();
        try {
            super.onStart();
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onStop() {
        this.ak.j();
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
        this.ak.j();
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
        jjk jjk2 = this.ak;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setEnterTransition(object);
    }

    @Override
    public final void setExitTransition(Object object) {
        jjk jjk2 = this.ak;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setExitTransition(object);
    }

    @Override
    public final void setReenterTransition(Object object) {
        jjk jjk2 = this.ak;
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
        jjk jjk2 = this.ak;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setReturnTransition(object);
    }

    @Override
    public final void setSharedElementEnterTransition(Object object) {
        jjk jjk2 = this.ak;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setSharedElementEnterTransition(object);
    }

    @Override
    public final void setSharedElementReturnTransition(Object object) {
        jjk jjk2 = this.ak;
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

