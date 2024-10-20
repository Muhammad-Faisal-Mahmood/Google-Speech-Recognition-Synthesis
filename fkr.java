/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import j$.util.Optional;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Function;

public final class fkr
extends fkm
implements ilw,
ggy,
gim,
gpa {
    private final abg ag = new abg(this);
    private boolean ah;
    private fkv c;
    private Context d;

    @Deprecated
    public fkr() {
        fpk.c();
    }

    static fkr e(fdl fdl2) {
        fkr fkr2 = new fkr();
        iln.e(fkr2);
        giq.a(fkr2, fdl2);
        return fkr2;
    }

    @Override
    @Deprecated
    public final Context I() {
        if (this.d == null) {
            this.d = new gin((be)this, super.getContext());
        }
        return this.d;
    }

    @Override
    public final gqn K() {
        return (gqn)this.b.c;
    }

    @Override
    public final Locale M() {
        return fvd.g(this);
    }

    @Override
    public final void N(gqn gqn2, boolean bl2) {
        this.b.c(gqn2, bl2);
    }

    @Override
    protected final /* synthetic */ iln a() {
        return new giq(this);
    }

    public final fkv f() {
        fkv fkv2 = this.c;
        if (fkv2 != null) {
            if (!this.ah) {
                return fkv2;
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
        return this.ag;
    }

    @Override
    public final void onAttach(Activity activity) {
        this.b.j();
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
        this.b.j();
        try {
            if (!this.ah) {
                Object object2;
                super.onAttach((Context)object);
                object = this.c;
                if (object != null) return;
                try {
                    object2 = this.bn();
                }
                catch (ClassCastException classCastException) {
                    object = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                    throw object;
                }
                object = ((brd)object2).f.a();
                bmu bmu2 = (bmu)((brd)object2).e.E.b();
                Object object3 = (goi)((brd)object2).b.b();
                gpm gpm2 = (gpm)((brd)object2).e.g.b();
                Object object4 = ((brd)object2).a();
                Object object5 = (hwj)((brd)object2).e.C.b();
                fxf.r(object4.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                object4 = (fdl)fvc.at(object4, fdl.a, (hwj)object5);
                idi.m(object4);
                object2 = ((brd)object2).a;
                if (object2 instanceof fkr) {
                    object2 = (fkr)object2;
                    idi.m(object2);
                    this.c = object5 = new fkv((Activity)object, bmu2, (goi)object3, gpm2, (fdl)object4, (fkr)object2);
                    object = this.Z;
                    object3 = new ghx(this.b, this.ag);
                    ((abb)object).b((abd)object3);
                    return;
                }
                object = new IllegalStateException(a.at(object2, fkv.class, "Attempt to inject a Fragment wrapper of type "));
                throw object;
            }
            object = new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            throw object;
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
    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        this.b.j();
        try {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            fkv fkv2;
            block34: {
                int n2;
                boolean bl2;
                Object object9;
                Object object10;
                Object object11;
                block36: {
                    block33: {
                        block37: {
                            boolean bl3;
                            block35: {
                                this.E((LayoutInflater)object, viewGroup, (Bundle)object2);
                                fkv2 = this.f();
                                object8 = fkv2.f;
                                object7 = fkv2.d;
                                object6 = fkv2.b.getIntent();
                                object5 = ffi.f(fkv2.b);
                                object4 = ((fdl)object7).c;
                                object2 = (fha)((HashMap)((bmu)object8).a).get(object4);
                                if (object2 != null) break block34;
                                object11 = ((bmu)object8).b;
                                object10 = (bmu)((fpo)object11).b.b();
                                object10.getClass();
                                object9 = (hpq)((fpo)object11).f.b();
                                object9.getClass();
                                object2 = (dxi)((fpo)object11).e.b();
                                object2.getClass();
                                object3 = new fha((bmu)object10, (hpq)object9, (dxi)object2, ((ffw)((fpo)object11).c).a(), ((fei)((fpo)object11).a).a(), ((ilt)((fpo)object11).d).a(), (fdl)object7);
                                bl2 = ((fha)object3).g == null;
                                fxf.A(bl2);
                                object11 = ffi.h((Intent)object6, ((fha)object3).i.m);
                                bl2 = ffi.k((Intent)object6);
                                object2 = Optional.empty();
                                if ("com.google.android.apps.search.transcription.embedded".equals(object5)) {
                                    object2 = ffi.b((Intent)object6);
                                }
                                object7 = ffi.e((Intent)object6);
                                object10 = fgu.a();
                                if (((Optional)object2).isPresent()) {
                                    ((fgt)object10).g((Optional)object2);
                                    ((fgt)object10).w(true);
                                }
                                if (((Optional)object7).isPresent()) {
                                    ((fgt)object10).f((Optional)object7);
                                }
                                if ((bl3 = ((fha)object3).i.b.contains(object5)) || ((String)object5).equals(((fha)object3).f.getPackageName())) break block35;
                                if (((fha)object3).i.j && !((String)object5).contains("com.google.android") && ffi.g((Intent)object6).equals("web_search")) {
                                    ((heg)((heg)fha.a.f()).j("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService", "getTranscriptionParams", 358, "TranscriptionDataService.java")).r("#UseS3ExperimentShort experiment");
                                    ((fgt)object10).c = ffi.g((Intent)object6);
                                }
                                break block36;
                            }
                            ((heg)((heg)fha.a.f()).j("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService", "enableFirstPartyAppFeatures", 387, "TranscriptionDataService.java")).r("#enableFirstPartyAppFeatures");
                            bl3 = object6.hasExtra("com.google.recognition.extra.ENABLE_PREBUILT_PHRASES_BIASING");
                            if (!bl3 || object6.getByteArrayExtra("com.google.recognition.extra.ENABLE_PREBUILT_PHRASES_BIASING") == null) break block37;
                            if (ffi.k((Intent)object6)) {
                                ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPrebuiltPhrasesBiasing", 728, "IntentParsingUtil.java")).r("Prebuilt biasing doesn't work when preferOffline is set.");
                                object2 = Optional.empty();
                                break block33;
                            } else {
                                block32: {
                                    try {
                                        object9 = object6.getByteArrayExtra("com.google.recognition.extra.ENABLE_PREBUILT_PHRASES_BIASING");
                                        fxf.K(object9);
                                        object2 = hwj.a();
                                        object7 = bqt.a;
                                        n2 = ((Object)object9).length;
                                    }
                                    catch (hxn hxn2) {
                                        // empty catch block
                                        break block32;
                                    }
                                    try {
                                        object2 = hwv.o((hwv)object7, (byte[])object9, 0, n2, (hwj)object2);
                                        hwv.D((hwv)object2);
                                        object2 = Optional.of((bqt)object2);
                                        break block33;
                                    }
                                    catch (hxn hxn3) {}
                                }
                                a.as(ffi.a.g(), "Failed to parse prebuilt phrases biasing config from intent.", "com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getPrebuiltPhrasesBiasing", '\u02e6', "IntentParsingUtil.java", (Throwable)object2);
                                object2 = Optional.empty();
                            }
                            break block33;
                        }
                        object2 = Optional.empty();
                    }
                    if (!object6.hasExtra("com.google.recognition.extra.EXPERIMENT_IDS")) {
                        n2 = gzx.d;
                        object7 = hct.a;
                    } else {
                        object7 = object6.getStringArrayListExtra("com.google.recognition.extra.EXPERIMENT_IDS");
                        if (object7 != null && !object7.isEmpty()) {
                            object7 = gzx.o((Collection)object7);
                        } else {
                            ((heg)((heg)ffi.a.g()).j("com/google/android/libraries/speech/transcription/recognition/IntentParsingUtil", "getExperimentIds", 756, "IntentParsingUtil.java")).r("No valid strings passed to EXTRA_EXPERIMENT_IDS; ignoring it");
                            n2 = gzx.d;
                            object7 = hct.a;
                        }
                    }
                    if (((Optional)object2).isPresent()) {
                        ((fgt)object10).C((Optional)object2);
                    }
                    if (!((AbstractCollection)object7).isEmpty()) {
                        ((fgt)object10).p((gzx)object7);
                    }
                }
                ((fgt)object10).u(ffi.a((Intent)object6));
                ((fgt)object10).t((String)object11);
                ((fgt)object10).K((String)object5);
                ((fgt)object10).B((String)object5);
                ((fgt)object10).o(fgs.b);
                n2 = bl2 ? 2 : 3;
                ((fgt)object10).d = n2;
                ((fgt)object10).D(bl2);
                ((fgt)object10).m(true);
                ((fgt)object10).E(true);
                ((fgt)object10).J(5000);
                ((fgt)object10).d(fhq.j(((fgt)object10).a(), ((fha)object3).i.a));
                object2 = ((fgt)object10).a();
                object6 = ((fgu)object2).b;
                object7 = new bof(object6, 19);
                ((fha)object3).f((Function)object7);
                ((fha)object3).b.a(dxv.aS.b("requestId", ((fha)object3).e));
                ((fha)object3).b.a(dxv.aT.b("requestId", ((fha)object3).e).j());
                if ((((fha)object3).d.b & 2) != 0) {
                    object11 = ((fha)object3).b;
                    object5 = dxv.b.b("requestId", ((fha)object3).e);
                    object6 = hkx.k;
                    object7 = hkx.a.l();
                    object10 = ((fha)object3).d.d;
                    if (!((hwp)object7).b.B()) {
                        ((hwp)object7).u();
                    }
                    object9 = ((hwp)object7).b;
                    hkx hkx2 = (hkx)object9;
                    object10.getClass();
                    hkx2.b |= 1;
                    hkx2.c = object10;
                    object10 = ((fha)object3).e;
                    if (!((hwv)object9).B()) {
                        ((hwp)object7).u();
                    }
                    object9 = ((hwp)object7).b;
                    hkx2 = (hkx)object9;
                    object10.getClass();
                    hkx2.b = 2 | hkx2.b;
                    hkx2.d = object10;
                    object10 = ((fgu)object2).d;
                    if (!((hwv)object9).B()) {
                        ((hwp)object7).u();
                    }
                    object9 = ((hwp)object7).b;
                    hkx2 = (hkx)object9;
                    object10.getClass();
                    hkx2.b |= 4;
                    hkx2.e = object10;
                    object10 = ((fgu)object2).b;
                    if (!((hwv)object9).B()) {
                        ((hwp)object7).u();
                    }
                    object9 = (hkx)((hwp)object7).b;
                    object10.getClass();
                    ((hkx)object9).b |= 8;
                    ((hkx)object9).f = object10;
                    ((dyj)object5).u((gpm)object6, (hkx)((hwp)object7).o());
                    object11.a((dyk)object5);
                } else {
                    object7 = ((fha)object3).b;
                    object6 = dxv.a.b("requestId", ((fha)object3).e);
                    object5 = hkx.k;
                    object11 = hkx.a.l();
                    Object object12 = ((fha)object3).e;
                    if (!((hwp)object11).b.B()) {
                        ((hwp)object11).u();
                    }
                    object9 = ((hwp)object11).b;
                    object10 = (hkx)object9;
                    object12.getClass();
                    ((hkx)object10).b = 2 | ((hkx)object10).b;
                    ((hkx)object10).d = object12;
                    object10 = ((fgu)object2).d;
                    if (!((hwv)object9).B()) {
                        ((hwp)object11).u();
                    }
                    object9 = ((hwp)object11).b;
                    object12 = (hkx)object9;
                    object10.getClass();
                    ((hkx)object12).b |= 4;
                    ((hkx)object12).e = object10;
                    object10 = ((fgu)object2).b;
                    if (!((hwv)object9).B()) {
                        ((hwp)object11).u();
                    }
                    object9 = (hkx)((hwp)object11).b;
                    object10.getClass();
                    ((hkx)object9).b |= 8;
                    ((hkx)object9).f = object10;
                    ((dyj)object6).u((gpm)object5, (hkx)((hwp)object11).o());
                    object7.a((dyk)object6);
                }
                if (((fgu)object2).i) {
                    ((fha)object3).b.a(dxv.p.b("requestId", ((fha)object3).e));
                }
                if (((fgu)object2).g.isPresent()) {
                    ((fha)object3).b.a(dxv.q.b("requestId", ((fha)object3).e));
                }
                object7 = new fgy((fha)object3);
                object6 = new fgz((fha)object3);
                ((fha)object3).h = ((fha)object3).j.k((fgu)object2, (ffk)object7, (fgr)object6);
                object7 = ((fha)object3).c;
                object2 = new fgm(object3, 3);
                ((fha)object3).g = object7.bf(gqk.j((Callable)object2));
                ((fha)object3).d("start transcription", ((fha)object3).g);
                ((HashMap)((bmu)object8).a).put(object4, object3);
                object2 = object3;
            }
            object7 = ((bmu)object8).c;
            object7 = new fck(object2, 3);
            object3 = fha.b((String)object4);
            object2 = new gds((hob)object7, object3);
            viewGroup = object.inflate(2131624125, viewGroup, false);
            object7 = (TextView)viewGroup.findViewById(2131427965);
            object3 = (TextView)viewGroup.findViewById(2131427969);
            object = fkv2.b.getIntent().hasExtra("android.speech.extra.PROMPT") ? fkv2.b.getIntent().getStringExtra("android.speech.extra.PROMPT") : fkv2.b.getString(2132017473);
            object3.setText((CharSequence)object);
            object = new gfl((View)viewGroup);
            ((gfl)object).e();
            object8 = fkv2.c;
            object4 = new bux(fkv2, 3);
            object6 = new gpg((gpm)object8, "Clicked 'mic image' to stop listening", (View.OnClickListener)object4, 0);
            ((gfl)object).b((View.OnClickListener)object6, fkv2.b.getString(2132017474));
            object4 = (Button)viewGroup.findViewById(2131427974);
            object6 = fkv2.c;
            object5 = new bux(fkv2, 4);
            object8 = new gpg((gpm)object6, "Clicked 'Try again button'", (View.OnClickListener)object5, 0);
            object4.setOnClickListener((View.OnClickListener)object8);
            object8 = new fku(fkv2, (TextView)object7, (TextView)object3, (gfl)object, (Button)object4);
            object = fkv2.e;
            object7 = gec.a;
            fpk.c();
            fxf.B(true, "Callbacks that implement BackgroundCallbacks must be registered with subscribeWithBackground().");
            object3 = new ww((goi)object, (gds)object2, (gec)((Object)object7), (geg)object8, 10);
            ((gbr)((goi)object).a).execute((Runnable)object3);
            return viewGroup;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final void onDetach() {
        gpf gpf2 = this.b.a();
        try {
            this.C();
            this.ah = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final LayoutInflater onGetLayoutInflater(Bundle object) {
        this.b.j();
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
    public final void onStop() {
        block7: {
            this.b.j();
            this.D();
            Object object = this.f();
            if (((fkv)object).b.isChangingConfigurations()) break block7;
            Object object2 = ((fkv)object).f;
            object = ((fkv)object).d;
            object2 = ((bmu)object2).a;
            object = ((fdl)object).c;
            if ((object = (fha)((HashMap)object2).remove(object)) == null) break block7;
            object2 = ((fha)object).g;
            if (object2 == null) break block7;
            object2 = fxf.aC(new hpn[]{object2});
            fgm fgm2 = new fgm(object, 4);
            ((fha)object).d("remove state", ((cxt)object2).B(fgm2, ((fha)object).c));
        }
        return;
        finally {
            gno.l();
        }
    }

    @Override
    public final void setArguments(Bundle bundle) {
        boolean bl2;
        Bundle bundle2 = this.l;
        boolean bl3 = bl2 = true;
        if (bundle2 != null) {
            bl3 = bundle2 == bundle ? bl2 : false;
        }
        fxf.B(bl3, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.setArguments(bundle);
    }

    @Override
    public final void setRetainInstance(boolean bl2) {
        a.j(bl2);
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

