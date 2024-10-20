/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  gqv
 */
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class ghu
extends fot
implements gpa {
    protected final jjk b = new jjk(this);

    protected final void B(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected final void C() {
        super.onDetach();
    }

    protected final void D() {
        super.onStop();
    }

    protected final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public gqn K() {
        throw null;
    }

    @Override
    public void N(gqn gqn2, boolean bl2) {
        throw null;
    }

    @Override
    public final void onActivityCreated(Bundle bundle) {
        this.b.i();
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
        gpf gpf2 = this.b.d();
        try {
            super.onActivityResult(n2, n3, intent);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public void onAttach(Context object) {
        super.onAttach((Context)object);
        be be2 = this.D;
        if (be2 instanceof gpa) {
            object = this.b;
            if (((jjk)object).c == null) {
                ((jjk)object).c(((gpa)((Object)be2)).K(), true);
            }
        }
        object = this.b;
        ((be)((jjk)object).a).getChildFragmentManager().X(((gng)fvd.l(((be)((jjk)object).a).getContext(), gng.class)).c().g(gqv.a));
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.b.i();
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
        this.b.f(n2, n3);
        gno.l();
        return null;
    }

    @Override
    public final Animator onCreateAnimator(int n2, boolean bl2, int n3) {
        gno.h();
        if (n2 != 0 || n3 != 0) {
            this.b.c(gqn.b(), true);
        }
        gno.l();
        return null;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
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
        gpf gpf2 = jjk.k(this.b);
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
        gpf gpf2 = jjk.k(this.b);
        try {
            super.onDestroyView();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public void onDetach() {
        gpf gpf2 = this.b.a();
        try {
            super.onDetach();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gpf gpf2 = this.b.h();
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
        this.b.i();
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
        gpf gpf2 = jjk.k(this.b);
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
        this.b.i();
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
        this.b.i();
        try {
            super.onStart();
            return;
        }
        finally {
            gno.l();
        }
    }

    @Override
    public void onStop() {
        this.b.i();
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
        this.b.i();
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
        boolean bl2 = object != null;
        this.b.b(bl2);
        super.setEnterTransition(object);
    }

    @Override
    public final void setExitTransition(Object object) {
        boolean bl2 = object != null;
        this.b.b(bl2);
        super.setExitTransition(object);
    }

    @Override
    public final void setReenterTransition(Object object) {
        boolean bl2 = object != null;
        this.b.b(bl2);
        super.setReenterTransition(object);
    }

    @Override
    public final void setReturnTransition(Object object) {
        boolean bl2 = object != null;
        this.b.b(bl2);
        super.setReturnTransition(object);
    }

    @Override
    public final void setSharedElementEnterTransition(Object object) {
        boolean bl2 = object != null;
        this.b.b(bl2);
        super.setSharedElementEnterTransition(object);
    }

    @Override
    public final void setSharedElementReturnTransition(Object object) {
        boolean bl2 = object != null;
        this.b.b(bl2);
        super.setSharedElementReturnTransition(object);
    }
}

