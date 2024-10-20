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
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Toast
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.Locale;

public final class fkw
extends fkn
implements ilw,
ggy,
gim,
gpa {
    private final abg ag = new abg(this);
    private boolean ah;
    private fkx c;
    private Context d;

    @Deprecated
    public fkw() {
        fpk.c();
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

    public final fkx e() {
        fkx fkx2 = this.c;
        if (fkx2 != null) {
            if (!this.ah) {
                return fkx2;
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
                    IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                    throw illegalStateException;
                }
                object = ((brd)object2).f.a();
                Object object3 = ((brd)object2).e.P;
                object2 = ((brd)object2).a;
                boolean bl2 = object2 instanceof fkw;
                object3 = ((dlm)object3).a;
                if (bl2) {
                    fkx fkx2;
                    object2 = (fkw)object2;
                    idi.m(object2);
                    this.c = fkx2 = new fkx((Activity)object, (Context)object3, (fkw)object2);
                    object = this.Z;
                    object2 = new ghx(this.b, this.ag);
                    ((abb)object).b((abd)object2);
                    return;
                }
                object = new IllegalStateException(a.at(object2, fkx.class, "Attempt to inject a Fragment wrapper of type "));
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
    public final void onCreate(Bundle object) {
        this.b.j();
        try {
            Object object2;
            block11: {
                block12: {
                    this.B((Bundle)object);
                    object2 = this.e();
                    boolean bl2 = ffi.f(((fkx)object2).c).isEmpty();
                    if (bl2) {
                        ((heg)((heg)fkx.a.g()).j("com/google/android/libraries/speech/transcription/ui/TranscriptionInitializationFragmentPeer", "onCreate", 63, "TranscriptionInitializationFragmentPeer.java")).r("ACTION_RECOGNIZE_SPEECH intent called incorrectly. Maybe you called startActivity, but you should have called startActivityForResult (or otherwise included a pending intent).");
                        ((fkx)object2).c.finish();
                        return;
                    }
                    bl2 = ffi.e(((fkx)object2).c.getIntent()).isPresent();
                    if (!bl2) break block11;
                    if (((fkx)object2).c.getCallingActivity() == null) break block12;
                    String string = ((fkx)object2).c.getCallingPackage();
                    if (((fkx)object2).c.getPackageManager().checkPermission("android.permission.RECORD_AUDIO", string) == 0) break block11;
                }
                ((heg)((heg)fkx.a.g()).j("com/google/android/libraries/speech/transcription/ui/TranscriptionInitializationFragmentPeer", "onCreate", 76, "TranscriptionInitializationFragmentPeer.java")).r("Calling package must have RECORD_AUDIO permission to request audio recording.");
                ((fkx)object2).c.finish();
                return;
            }
            Activity activity = ((fkx)object2).c;
            Toast.makeText((Context)activity, (CharSequence)activity.getString(2132017467), (int)1).show();
            if (object != null) return;
            if (kl.t(((fkx)object2).d, "android.permission.RECORD_AUDIO") == 0) {
                ((fkx)object2).a();
                return;
            }
            object = ((fkx)object2).b;
            if (((be)object).B != null) {
                by by2 = ((be)object).getParentFragmentManager();
                if (by2.r == null) return;
                object2 = new bu(((be)object).k, 1);
                by2.s.addLast(object2);
                by2.r.b(new String[]{"android.permission.RECORD_AUDIO"});
                return;
            }
            object2 = new IllegalStateException(a.ak(object, "Fragment ", " not attached to Activity"));
            throw object2;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.j();
        try {
            this.E(layoutInflater, viewGroup, bundle);
            this.e();
            layoutInflater = layoutInflater.inflate(2131624126, viewGroup, false);
            return layoutInflater;
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
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.b.j();
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
    public final void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        super.onRequestPermissionsResult(n2, stringArray, nArray);
        this.e().a();
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

