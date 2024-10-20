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
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;

public final class fls
extends flf
implements ilw,
ggy,
gim,
gpa {
    private final abg ag = new abg(this);
    private boolean ah;
    private flx c;
    private Context d;

    @Deprecated
    public fls() {
        fpk.c();
    }

    public static fls e(fmf fmf2) {
        fls fls2 = new fls();
        iln.e(fls2);
        giq.a(fls2, fmf2);
        return fls2;
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
    protected final /* synthetic */ gih a() {
        return new gir(this);
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
                flx flx2;
                Object object2;
                super.onAttach((Context)object);
                object = this.c;
                if (object != null) return;
                try {
                    object2 = this.bn();
                }
                catch (ClassCastException classCastException) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                    throw illegalStateException;
                }
                object = ((brd)object2).a;
                Object object3 = (goi)((brd)object2).b.b();
                Object object4 = ((brd)object2).a();
                Object object5 = (hwj)((brd)object2).e.C.b();
                fxf.r(object4.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                object5 = (fmf)fvc.at(object4, fmf.a, (hwj)object5);
                idi.m(object5);
                object4 = (fma)((brd)object2).e.H.b();
                flr flr2 = (flr)((brd)object2).e.G.b();
                gpm gpm2 = (gpm)((brd)object2).e.g.b();
                Object object6 = ((brd)object2).e;
                object2 = ((brg)object6).P.a;
                object6 = (fld)((brg)object6).z.b();
                this.c = flx2 = new flx((be)object, (goi)object3, (fmf)object5, (fma)object4, flr2, gpm2, (Context)object2, (fld)object6);
                object = this.Z;
                object3 = new ghx(this.b, this.ag);
                ((abb)object).b((abd)object3);
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
    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        this.b.j();
        try {
            this.E((LayoutInflater)object, (ViewGroup)object2, (Bundle)object3);
            object3 = this.c;
            if (object3 != null) {
                if (!this.ah) {
                    ((heg)((heg)flx.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodFragmentPeer", "onCreateView", 96, "VoiceInputMethodFragmentPeer.java")).u("#onCreateView, request-id = %s", object3.c.c);
                    Object object4 = object3.f;
                    Object object5 = object3.c.c;
                    Object object6 = ((flr)object4).h;
                    object6 = new byt(object4, object5, 2);
                    object5 = "VoiceIME:transcriptionState:".concat(String.valueOf(object5));
                    object4 = new gds((hob)object6, object5);
                    object = object.inflate(2131624124, (ViewGroup)object2, false);
                    TextView textView = (TextView)object.findViewById(2131427981);
                    object6 = (TextView)object.findViewById(2131427976);
                    object2 = new gfl((View)object);
                    ((gfl)object2).e();
                    object5 = new flw((flx)object3, textView, (gfl)object2, (TextView)object6);
                    object3.j.i((gds)object4, (geg)object5);
                    object2 = (ImageView)object.findViewById(2131427973);
                    object4 = (InputMethodManager)object3.h.getSystemService("input_method");
                    if (object4 != null && (object4.getEnabledInputMethodList() == null || object4.getEnabledInputMethodList().size() > 1)) {
                        object2.setVisibility(0);
                        object4 = object3.g;
                        object6 = new bux(object3, 5);
                        object5 = new gpg((gpm)object4, "Clicked 'Previous IME' button to switch to previous IME", (View.OnClickListener)object6, 0);
                        object2.setOnClickListener((View.OnClickListener)object5);
                    } else {
                        object2.setVisibility(4);
                    }
                    object4 = (ImageView)object.findViewById(2131427980);
                    object2 = object3.g;
                    object6 = new bux(object3, 6);
                    object3 = new gpg((gpm)object2, "Clicked 'settings button' button to enter settings", (View.OnClickListener)object6, 0);
                    object4.setOnClickListener((View.OnClickListener)object3);
                    return object;
                }
                object = new IllegalStateException("peer() called after destroyed.");
                throw object;
            }
            object = new IllegalStateException("peer() called before initialized.");
            throw object;
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
            LayoutInflater layoutInflater = this.getLayoutInflater((Bundle)object);
            object = new ilr(layoutInflater, (be)this);
            layoutInflater = layoutInflater.cloneInContext((Context)object);
            object = new gin((be)this, layoutInflater);
            object = layoutInflater.cloneInContext((Context)object);
            return object;
        }
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

