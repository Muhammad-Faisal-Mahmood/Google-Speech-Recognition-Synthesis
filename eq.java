/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class eq
extends de
implements gr {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    ep f;
    ew g;
    ev h;
    public int i;
    public boolean j;
    public boolean k;
    public fe l;
    boolean m;
    final wq n;
    final wq o;
    public me p;
    final AmbientMode$AmbientController q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public eq(Activity activity, boolean bl2) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new en(this);
        this.o = new eo(this);
        this.q = new AmbientMode$AmbientController(this);
        activity = activity.getWindow().getDecorView();
        this.n((View)activity);
        if (!bl2) {
            this.e = activity.findViewById(0x1020002);
        }
    }

    public eq(Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new en(this);
        this.o = new eo(this);
        this.q = new AmbientMode$AmbientController(this);
        this.n(dialog.getWindow().getDecorView());
    }

    static boolean l(boolean bl2, boolean bl3) {
        if (bl3) {
            return true;
        }
        return !bl2;
    }

    private final void n(View object) {
        int n2;
        Object object2;
        ActionBarOverlayLayout actionBarOverlayLayout;
        this.b = actionBarOverlayLayout = (ActionBarOverlayLayout)object.findViewById(2131427595);
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                object2 = actionBarOverlayLayout.h;
                ((eq)object2).i = n2 = actionBarOverlayLayout.b;
                n2 = actionBarOverlayLayout.g;
                if (n2 != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(n2);
                    vy.d((View)actionBarOverlayLayout);
                }
            }
        }
        if ((actionBarOverlayLayout = object.findViewById(2131427390)) instanceof Toolbar) {
            this.p = ((Toolbar)((Object)actionBarOverlayLayout)).A();
            this.d = (ActionBarContextView)object.findViewById(2131427398);
            object = (ActionBarContainer)object.findViewById(2131427392);
            this.c = object;
            object2 = this.p;
            if (object2 != null && this.d != null && object != null) {
                this.a = ((me)object2).a();
                if ((this.p.b & 4) != 0) {
                    this.u = true;
                }
                object = this.a;
                n2 = object.getApplicationInfo().targetSdkVersion;
                kh.f((Context)object);
                this.m();
                object = this.a.obtainStyledAttributes(null, er.a, 2130968584, 0);
                if (object.getBoolean(14, false)) {
                    object2 = this.b;
                    if (((ActionBarOverlayLayout)object2).d) {
                        this.m = true;
                        ((ActionBarOverlayLayout)object2).k(true);
                    } else {
                        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    }
                }
                if ((n2 = object.getDimensionPixelSize(12, 0)) != 0) {
                    wa.j((View)this.c, n2);
                }
                object.recycle();
                return;
            }
            throw new IllegalStateException(String.valueOf(this.getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        object2 = new StringBuilder("Can't make a decor toolbar out of ");
        object = actionBarOverlayLayout != null ? actionBarOverlayLayout.getClass().getSimpleName() : "null";
        ((StringBuilder)object2).append((String)object);
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    @Override
    public final Context a() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968589, typedValue, true);
            int n2 = typedValue.resourceId;
            this.t = n2 != 0 ? new ContextThemeWrapper(this.a, n2) : this.a;
        }
        return this.t;
    }

    @Override
    public final void b(boolean bl2) {
        if (bl2 != this.v) {
            this.v = bl2;
            int n2 = this.w.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((dd)this.w.get(i2)).a();
            }
        }
    }

    @Override
    public final void c(boolean bl2) {
        if (!this.u) {
            this.d(bl2);
        }
    }

    @Override
    public final void d(boolean bl2) {
        int n2 = true != bl2 ? 0 : 4;
        this.j(n2, 4);
    }

    @Override
    public final void e(boolean bl2) {
        fe fe2;
        this.z = bl2;
        if (!bl2 && (fe2 = this.l) != null) {
            fe2.a();
        }
    }

    @Override
    public final void f(CharSequence charSequence) {
        this.p.d(charSequence);
    }

    @Override
    public final void g(CharSequence charSequence) {
        this.p.f(charSequence);
    }

    @Override
    public final void h() {
        this.j(2, 2);
    }

    public final void i(boolean bl2) {
        if (bl2) {
            if (!this.x) {
                this.x = true;
                this.k(false);
            }
        } else if (this.x) {
            this.x = false;
            this.k(false);
        }
        if (this.c.isLaidOut()) {
            bzb bzb2;
            bzb bzb3;
            if (bl2) {
                bzb3 = this.p.g(4, 100L);
                bzb2 = this.d.g(0, 200L);
            } else {
                bzb2 = this.p.g(0, 200L);
                bzb3 = this.d.g(8, 100L);
            }
            fe fe2 = new fe();
            fe2.a.add(bzb3);
            bzb3 = (View)((WeakReference)bzb3.a).get();
            long l2 = bzb3 != null ? bzb3.animate().getDuration() : 0L;
            bzb3 = (View)((WeakReference)bzb2.a).get();
            if (bzb3 != null) {
                bzb3.animate().setStartDelay(l2);
            }
            fe2.a.add(bzb2);
            fe2.b();
            return;
        }
        if (bl2) {
            this.p.e(4);
            this.d.setVisibility(0);
            return;
        }
        this.p.e(0);
        this.d.setVisibility(8);
    }

    public final void j(int n2, int n3) {
        me me2 = this.p;
        int n4 = me2.b;
        if ((n3 & 4) != 0) {
            this.u = true;
        }
        me2.b(n2 & n3 | ~n3 & n4);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k(boolean var1_1) {
        block16: {
            block17: {
                block18: {
                    block15: {
                        if (!eq.l(this.k, this.x)) break block15;
                        if (this.y) break block16;
                        this.y = true;
                        var5_2 = this.l;
                        if (var5_2 != null) {
                            var5_2.a();
                        }
                        this.c.setVisibility(0);
                        if (this.i != 0) ** GOTO lbl-1000
                        var4_4 = var1_1;
                        if (this.z) ** GOTO lbl13
                        if (var1_1) {
                            var4_4 = true;
lbl13:
                            // 2 sources

                            this.c.setTranslationY(0.0f);
                            var2_8 = var3_6 = (float)(-this.c.getHeight());
                            if (var4_4) {
                                var5_2 = new int[2];
                                var5_2[0] = false;
                                var5_2[1] = false;
                                this.c.getLocationInWindow((int[])var5_2);
                                var2_8 = var3_6 - (float)var5_2[1];
                            }
                            this.c.setTranslationY(var2_8);
                            var5_2 = new fe();
                            var6_10 = wj.t((View)this.c);
                            var6_10.Y(0.0f);
                            var6_10.al(this.q);
                            var5_2.f(var6_10);
                            if (this.j && (var6_10 = this.e) != null) {
                                var6_10.setTranslationY(var2_8);
                                var6_10 = wj.t(this.e);
                                var6_10.Y(0.0f);
                                var5_2.f(var6_10);
                            }
                            var5_2.d(eq.s);
                            var5_2.c();
                            var5_2.e(this.o);
                            this.l = var5_2;
                            var5_2.b();
                        } else lbl-1000:
                        // 2 sources

                        {
                            this.c.setAlpha(1.0f);
                            this.c.setTranslationY(0.0f);
                            if (this.j && (var5_2 = this.e) != null) {
                                var5_2.setTranslationY(0.0f);
                            }
                            this.o.a();
                        }
                        var5_2 = this.b;
                        if (var5_2 != null) {
                            vy.d((View)var5_2);
                            return;
                        }
                        break block16;
                    }
                    if (!this.y) break block16;
                    this.y = false;
                    var5_3 = this.l;
                    if (var5_3 != null) {
                        var5_3.a();
                    }
                    if (this.i != 0) break block17;
                    var4_5 = var1_1;
                    if (this.z) break block18;
                    if (!var1_1) break block17;
                    var4_5 = true;
                }
                this.c.setAlpha(1.0f);
                this.c.a(true);
                var5_3 = new fe();
                var2_9 = var3_7 = (float)(-this.c.getHeight());
                if (var4_5) {
                    var6_11 /* !! */  = new int[]{0, false};
                    this.c.getLocationInWindow(var6_11 /* !! */ );
                    var2_9 = var3_7 - (float)var6_11 /* !! */ [1];
                }
                var6_11 /* !! */  = (int[])wj.t((View)this.c);
                var6_11 /* !! */ .Y(var2_9);
                var6_11 /* !! */ .al(this.q);
                var5_3.f((bzb)var6_11 /* !! */ );
                if (this.j && (var6_11 /* !! */  = this.e) != null) {
                    var6_11 /* !! */  = wj.t((View)var6_11 /* !! */ );
                    var6_11 /* !! */ .Y(var2_9);
                    var5_3.f((bzb)var6_11 /* !! */ );
                }
                var5_3.d(eq.r);
                var5_3.c();
                var5_3.e(this.n);
                this.l = var5_3;
                var5_3.b();
                return;
            }
            this.n.a();
        }
    }

    public final void m() {
        this.p.a.requestLayout();
        this.b.e = false;
    }
}

