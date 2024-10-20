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
import java.util.Locale;

public final class bzg
extends bzd
implements ilw,
ggy,
gim,
gpa {
    private bzk ag;
    private Context ah;
    private final abg ai = new abg(this);
    private boolean aj;
    private final jjk ak = new jjk(this);

    @Deprecated
    public bzg() {
        fpk.c();
    }

    @Override
    public final void B(Preference preference) {
        bzk bzk2 = this.O();
        ((heg)((heg)bzk.a.b()).j("com/google/android/apps/speech/tts/googletts/settings/asr/voiceime/ui/VoiceImeSettingsFragmentPeer", "onDisplayPreferenceDialog", 432, "VoiceImeSettingsFragmentPeer.java")).u("#onDisplayPreferenceDialog: %s", preference);
        if (bzk2.g.b(preference)) {
            return;
        }
        super.B(preference);
    }

    @Override
    public final void G(String object) {
        object = this.O();
        Object object2 = ((bzk)object).b;
        super.C();
        ((ata)object2).D(((ata)object2).a.e(((be)object2).requireContext(), 2132213782, ((ata)object2).e()));
        ((bzk)object).b.e().e(5);
        object2 = ((bzk)object).b;
        object2 = (PreferenceCategory)((ata)object2).e().b(((be)object2).getString(2132017461));
        boolean bl2 = kh.r(((be)((bzk)object).b).getContext());
        ((heg)((heg)bzk.a.f()).j("com/google/android/apps/speech/tts/googletts/settings/asr/voiceime/ui/VoiceImeSettingsFragmentPeer", "onCreatePreferences", 364, "VoiceImeSettingsFragmentPeer.java")).E("VoiceImeSettingsFragment: isDeveloperModeEnabled: %s, %s", bl2, object2);
        if (object2 != null) {
            ((Preference)object2).setVisible(bl2);
        }
        ((bzk)object).c().setOnPreferenceChangeListener(new bwz(((bzk)object).e, "Profanity filter Setting Changed", new byi((bzk)object, 2), 2));
        ((bzk)object).b().setOnPreferenceChangeListener(new bwz(((bzk)object).e, "Voice languages Setting Changed", new byi((bzk)object, 3), 2));
        ((bzk)object).a().setOnPreferenceChangeListener(new bwz(((bzk)object).e, "Primary language Setting Changed", new byi((bzk)object, 4), 2));
        ((bzk)object).g.c();
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

    public final bzk O() {
        bzk bzk2 = this.ag;
        if (bzk2 != null) {
            if (!this.aj) {
                return bzk2;
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
                    Object object3;
                    try {
                        object3 = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        object = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw object;
                    }
                    object = ((brd)object3).a;
                    if (!(object instanceof bzg)) {
                        IllegalStateException illegalStateException = new IllegalStateException(a.at(object, bzk.class, "Attempt to inject a Fragment wrapper of type "));
                        throw illegalStateException;
                    }
                    object = (bzg)object;
                    idi.m(object);
                    Object object4 = ((brd)object3).e.L();
                    Object object5 = (frr)((brd)object3).e.B.b();
                    Object object6 = (bmu)((brd)object3).e.l.b();
                    Object object7 = (hpq)((brd)object3).e.d.b();
                    fep fep2 = ((brd)object3).e.q();
                    Object object8 = (hpq)((brd)object3).e.b.b();
                    object2 = new fmj((fxf)object4, (frr)object5, (bmu)object6, (hpq)object7, fep2, (hpq)object8);
                    object7 = (goi)((brd)object3).b.b();
                    object5 = (gbu)((brd)object3).c.b();
                    object6 = ((brd)object3).c();
                    object8 = (byp)((brd)object3).e.A.b();
                    object4 = (dxi)((brd)object3).e.j.b();
                    fep2 = ((brd)object3).f.a();
                    this.ag = object3 = new bzk((bzg)object, (fmj)object2, (goi)object7, (gbu)object5, (grn)object6, (byp)object8, (dxi)object4, (Context)fep2);
                    ((bzk)object3).l = this;
                    object = this.Z;
                    object2 = new ghx(this.ak, this.ai);
                    ((abb)object).b((abd)object2);
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
            bzk bzk2 = this.O();
            object = bzk2.k;
            Object object2 = bzk2.c;
            Object object3 = ((fmj)object2).d;
            object3 = new fck(object2, 4);
            object2 = new gds((hob)object3, "Transcription:VoiceImeSettings");
            ((goi)object).i((gds)object2, bzk2.h);
            bzk2.d.b(bzk2.i);
            bzk2.d.b(bzk2.j);
            bzk2.k.i(bzk2.f.e(), bzk2.g.i);
            bzk2.k.i(bzk2.f.d(), bzk2.g.j);
            bzk2.d.b(bzk2.g.k);
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

