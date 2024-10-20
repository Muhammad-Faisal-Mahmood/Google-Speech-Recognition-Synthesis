/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
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
import android.content.ContextWrapper;
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
import java.util.Locale;

public final class byf
extends byb
implements ilw,
ggy,
gim,
gpa {
    private bym ag;
    private Context ah;
    private final abg ai = new abg(this);
    private boolean aj;
    private final jjk ak = new jjk(this);

    @Deprecated
    public byf() {
        fpk.c();
    }

    @Override
    public final void B(Preference preference) {
        bym bym2 = this.O();
        ((hfk)((hfk)bym.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentPeer", "onDisplayPreferenceDialog", 114, "SettingsFragmentPeer.java")).u("#onDisplayPreferenceDialog: %s", preference);
        bym2.e.b(preference);
    }

    @Override
    public final void G(String object) {
        bym bym2 = this.O();
        ((hfk)((hfk)bym.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentPeer", "onCreatePreferences", 92, "SettingsFragmentPeer.java")).r("#onCreatePreferences");
        bym2.b.E(2132213762, (String)object);
        Object object2 = bym2.b;
        object = ((ata)object2).e();
        object2 = (PreferenceCategory)((PreferenceGroup)object).b(((be)object2).getString(2132017461));
        boolean bl2 = kh.r(((be)bym2.b).getContext());
        ((hfk)((hfk)bym.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/SettingsFragmentPeer", "onCreatePreferences", 103, "SettingsFragmentPeer.java")).u("SettingsPage: isDeveloperModeEnabled: %s", bl2);
        if (object2 != null) {
            ((Preference)object2).setVisible(bl2);
        }
        ((PreferenceGroup)object).e(2);
        bym2.e.c();
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
        return (gqn)this.ak.c;
    }

    @Override
    public final Locale M() {
        return fvd.g(this);
    }

    @Override
    public final void N(gqn gqn2, boolean bl2) {
        this.ak.c(gqn2, bl2);
    }

    public final bym O() {
        bym bym2 = this.ag;
        if (bym2 != null) {
            if (!this.aj) {
                return bym2;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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
                    bym bym2;
                    Object object3;
                    try {
                        object3 = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        object = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw object;
                    }
                    object = ((brd)object3).a;
                    if (!(object instanceof byf)) {
                        IllegalStateException illegalStateException = new IllegalStateException(a.at(object, bym.class, "Attempt to inject a Fragment wrapper of type "));
                        throw illegalStateException;
                    }
                    object2 = (byf)object;
                    idi.m(object2);
                    grn grn2 = ((brd)object3).c();
                    object = (byp)((brd)object3).e.A.b();
                    goi goi2 = (goi)((brd)object3).b.b();
                    gbu gbu2 = (gbu)((brd)object3).c.b();
                    dxi dxi2 = (dxi)((brd)object3).e.j.b();
                    object3 = ((brd)object3).f.a();
                    this.ag = bym2 = new bym((byf)object2, grn2, (byp)object, goi2, gbu2, dxi2, (Context)object3);
                    bym2.g = this;
                    object2 = this.Z;
                    object = new ghx(this.ak, this.ai);
                    ((abb)object2).b((abd)object);
                }
                if (!((object2 = this.D) instanceof gpa)) return;
                object = this.ak;
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
    public final void onCreate(Bundle object) {
        this.ak.j();
        try {
            super.onCreate((Bundle)object);
            object = this.O();
            object.f.i(object.c.e(), object.e.i);
            object.f.i(object.c.d(), object.e.j);
            object.d.b(object.e.k);
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
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.ak.j();
        try {
            bundle = this.getLayoutInflater(bundle);
            ContextWrapper contextWrapper = new ilr((LayoutInflater)bundle, (be)this);
            bundle = bundle.cloneInContext((Context)contextWrapper);
            contextWrapper = new gin((be)this, (LayoutInflater)bundle);
            bundle = bundle.cloneInContext((Context)contextWrapper);
            return bundle;
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

