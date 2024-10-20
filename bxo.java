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

public final class bxo
extends bxw
implements ilw,
ggy,
gim,
gpa {
    private bxp ah;
    private Context ai;
    private final abg aj = new abg(this);
    private boolean al;
    private final jjk am = new jjk(this);

    @Deprecated
    public bxo() {
        fpk.c();
    }

    public final bxp H() {
        bxp bxp2 = this.ah;
        if (bxp2 != null) {
            if (!this.al) {
                return bxp2;
            }
            throw new IllegalStateException("peer() called after destroyed.");
        }
        throw new IllegalStateException("peer() called before initialized.");
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
    protected final /* synthetic */ iln J() {
        return new giq(this);
    }

    @Override
    public final gqn K() {
        return (gqn)this.am.c;
    }

    @Override
    public final Locale M() {
        return fvd.g(this);
    }

    @Override
    public final void N(gqn gqn2, boolean bl2) {
        this.am.c(gqn2, bl2);
    }

    @Override
    public final Dialog a(Bundle bundle) {
        bxp bxp2 = this.H();
        bundle = super.a(bundle);
        bxp2.b.a(dxv.as);
        return bundle;
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
        this.am.j();
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
        gpf gpf2 = this.am.d();
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
        this.am.j();
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
        this.am.j();
        try {
            if (!this.al) {
                Object object2;
                super.onAttach((Context)object);
                object = this.ah;
                if (object == null) {
                    try {
                        object = this.bn();
                    }
                    catch (ClassCastException classCastException) {
                        IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                        throw illegalStateException;
                    }
                    object2 = (dxi)((brd)object).e.j.b();
                    this.ah = object = new bxp((dxi)object2);
                    ((bxp)object).c = this;
                    object2 = this.Z;
                    object = new ghx(this.am, this.aj);
                    ((abb)object2).b((abd)object);
                }
                if (!((object2 = this.D) instanceof gpa)) return;
                object = this.am;
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
        gpf gpf2 = this.am.e();
        try {
            this.H().b.a(dxv.at.c(2));
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        this.am.j();
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
        this.am.f(n2, n3);
        gno.l();
        return null;
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.am.j();
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
        gpf gpf2 = jjk.k(this.am);
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
        gpf gpf2 = jjk.k(this.am);
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
        gpf gpf2 = this.am.a();
        try {
            super.onDetach();
            this.al = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        gpf gpf2 = this.am.g();
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
        this.am.j();
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
        this.am.h().close();
        return false;
    }

    @Override
    public final void onPause() {
        this.am.j();
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
        gpf gpf2 = jjk.k(this.am);
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
        this.am.j();
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
        this.am.j();
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
        this.am.j();
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
        this.am.j();
        gno.l();
    }

    @Override
    public final void setEnterTransition(Object object) {
        jjk jjk2 = this.am;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setEnterTransition(object);
    }

    @Override
    public final void setExitTransition(Object object) {
        jjk jjk2 = this.am;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setExitTransition(object);
    }

    @Override
    public final void setReenterTransition(Object object) {
        jjk jjk2 = this.am;
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
        jjk jjk2 = this.am;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setReturnTransition(object);
    }

    @Override
    public final void setSharedElementEnterTransition(Object object) {
        jjk jjk2 = this.am;
        if (jjk2 != null) {
            jjk2.b(true);
        }
        super.setSharedElementEnterTransition(object);
    }

    @Override
    public final void setSharedElementReturnTransition(Object object) {
        jjk jjk2 = this.am;
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

