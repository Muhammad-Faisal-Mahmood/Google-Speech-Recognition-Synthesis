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
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Locale;

public final class bzp
extends bzn
implements ilw,
ggy,
gim,
gpa {
    private bzq ag;
    private Context ah;
    private final abg ai = new abg(this);
    private boolean aj;
    private final jjk ak = new jjk(this);

    @Deprecated
    public bzp() {
        fpk.c();
    }

    @Override
    protected final /* synthetic */ iln B() {
        return new giq(this);
    }

    public final bzq D() {
        bzq bzq2 = this.ag;
        if (bzq2 != null) {
            if (!this.aj) {
                return bzq2;
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

    @Override
    public final Dialog a(Bundle object) {
        super.a((Bundle)object);
        fva fva2 = new fva(((be)this.D().a).requireContext());
        object = fva2.a;
        object.f = object.a.getText(2132017451);
        fva2.a.m = true;
        object = ((dm)fva2).b();
        object.setCanceledOnTouchOutside(true);
        return object;
    }

    @Override
    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return this.I();
    }

    @Override
    public final acr getDefaultViewModelCreationExtras() {
        acs acs2 = new acs(super.getDefaultViewModelCreationExtras());
        acs2.b(acb.c, new Bundle());
        return acs2;
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
                    try {
                        object = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw illegalStateException;
                    }
                    object = ((brd)object).a;
                    if (!(object instanceof bzp)) {
                        IllegalStateException illegalStateException = new IllegalStateException(a.at(object, bzq.class, "Attempt to inject a Fragment wrapper of type "));
                        throw illegalStateException;
                    }
                    object2 = (bzp)object;
                    idi.m(object2);
                    object = new bzq(object2, null);
                    this.ag = object;
                    object2 = this.Z;
                    object = new ghx(this.ak, this.ai);
                    ((abb)object2).b((abd)object);
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
    public final void onCancel(DialogInterface dialogInterface) {
        gpf gpf2 = this.ak.e();
        try {
            ((be)this.D().a).requireActivity().finish();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        this.ak.j();
        try {
            super.onCreate(bundle);
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
    public final void onDismiss(DialogInterface dialogInterface) {
        gpf gpf2 = this.ak.g();
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
        this.ak.j();
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
        this.ak.h().close();
        return false;
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
        gno.l();
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

