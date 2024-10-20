/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.FrameLayout
 *  android.widget.Toolbar
 */
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import androidx.wear.ambient.SharedLibraryVersion;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class bom
extends bh {
    private cfd k;

    public final cfd o() {
        if (this.k == null) {
            this.k = new cfd(new AmbientModeSupport$AmbientController(this));
        }
        return this.k;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (this.bb().a() == 0) {
            this.finishAfterTransition();
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        Object object;
        Object object2;
        Object object3;
        if (Build.VERSION.SDK_INT >= 35) {
            object3 = wl.b;
            object2 = new nh(0, 0, (jrk)object3);
            nh nh2 = new nh(mt.a, mt.b, (jrk)object3);
            object = this.getWindow().getDecorView();
            jse.d(object, "window.decorView");
            Object object4 = ((nh)object2).c;
            object3 = object.getResources();
            jse.d(object3, "view.resources");
            boolean bl2 = (Boolean)object4.a(object3);
            object3 = nh2.c;
            object4 = object.getResources();
            jse.d(object4, "view.resources");
            boolean bl3 = (Boolean)object3.a(object4);
            object3 = Build.VERSION.SDK_INT >= 30 ? new mx() : (Build.VERSION.SDK_INT >= 29 ? new mw() : (Build.VERSION.SDK_INT >= 28 ? new mv() : new mu()));
            object4 = this.getWindow();
            jse.d(object4, "window");
            ((kt)object3).d((nh)object2, nh2, (Window)object4, (View)object, bl2, bl3);
            object2 = this.getWindow();
            jse.d(object2, "window");
            ((kt)object3).c((Window)object2);
            wa.k(this.findViewById(0x1020002), new bon(this, 0));
        }
        super.onCreate(bundle);
        object3 = this.o();
        bundle = this.getLayoutInflater().inflate(2131624030, null, false);
        if (bundle instanceof CoordinatorLayout) {
            object2 = (CoordinatorLayout)bundle;
        }
        ((cfd)object3).c = (CollapsingToolbarLayout)bundle.findViewById(2131427574);
        ((cfd)object3).d = (AppBarLayout)bundle.findViewById(2131427434);
        object2 = ((cfd)object3).c;
        if (object2 != null) {
            ((CollapsingToolbarLayout)((Object)object2)).a.F = 1.1f;
            if (Build.VERSION.SDK_INT >= 33) {
                object2 = ((CollapsingToolbarLayout)((Object)((cfd)object3).c)).a;
                ((fwe)object2).G = 3;
                object = new SharedLibraryVersion();
                if (((fwe)object2).J != object) {
                    ((fwe)object2).J = object;
                    ((fwe)object2).g(true);
                }
            }
        }
        if ((object2 = ((cfd)object3).d) != null) {
            object2 = (rz)((AppBarLayout)object2).getLayoutParams();
            object = new AppBarLayout$Behavior();
            object.b = new fvc(null);
            ((rz)((Object)object2)).b((rw)object);
        }
        ((cfd)object3).a = (FrameLayout)bundle.findViewById(2131427580);
        ((cfd)object3).b = (Toolbar)bundle.findViewById(2131427390);
        object2 = ((cfd)object3).e;
        object3 = ((cfd)object3).b;
        object2 = (AmbientModeSupport$AmbientController)object2;
        ((bh)((AmbientModeSupport$AmbientController)object2).a).setActionBar((Toolbar)object3);
        object3 = ((bh)((AmbientModeSupport$AmbientController)object2).a).getActionBar();
        if (object3 != null) {
            object3.setDisplayHomeAsUpEnabled(true);
            object3.setHomeButtonEnabled(true);
            object3.setDisplayShowTitleEnabled(true);
        }
        super.setContentView((View)bundle);
    }

    public final boolean onNavigateUp() {
        if (this.bb().a() > 0) {
            this.bb().W();
        }
        if (this.bb().a() == 0) {
            this.finishAfterTransition();
        }
        return true;
    }

    @Override
    public final void setContentView(int n2) {
        Object object = this.k;
        object = object == null ? (ViewGroup)this.findViewById(2131427580) : ((cfd)object).a;
        if (object != null) {
            ((ViewGroup)object).removeAllViews();
        }
        LayoutInflater.from((Context)this).inflate(n2, (ViewGroup)object);
    }

    @Override
    public final void setContentView(View view) {
        Object object = this.k;
        object = object == null ? (ViewGroup)this.findViewById(2131427580) : ((cfd)object).a;
        if (object != null) {
            ((ViewGroup)object).addView(view);
        }
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Object object = this.k;
        object = object == null ? (ViewGroup)this.findViewById(2131427580) : ((cfd)object).a;
        if (object != null) {
            ((ViewGroup)object).addView(view, layoutParams);
        }
    }

    public final void setTitle(int n2) {
        this.setTitle(this.getText(n2));
    }

    public final void setTitle(CharSequence charSequence) {
        cfd cfd2 = this.o();
        Object object = cfd2.c;
        if (object != null) {
            ((CollapsingToolbarLayout)((Object)object)).e(charSequence);
        }
        ((bh)((AmbientModeSupport$AmbientController)cfd2.e).a).setTitle(charSequence);
    }
}

