/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.UiModeManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.location.Location
 *  android.location.LocationManager
 *  android.media.AudioManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.AndroidRuntimeException
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.view.Window$Callback
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 *  android.widget.TextView
 *  android.window.OnBackInvokedDispatcher
 */
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class eg
extends ds
implements LayoutInflater.Factory2,
fq {
    private static final pa N = new pa();
    private static final int[] O = new int[]{16842836};
    public static final boolean i = "robolectric".equals(Build.FINGERPRINT) ^ true;
    boolean A;
    boolean B;
    boolean C;
    public ee D;
    public boolean E;
    boolean F;
    public Configuration G;
    public int H;
    public boolean I;
    public int J;
    public Rect K;
    public Rect L;
    public bzb M;
    private dy P;
    private CharSequence Q;
    private ef R;
    private TextView S;
    private boolean T;
    private boolean U;
    private boolean V;
    private ee[] W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private boolean ab;
    private eb ac;
    private eb ad;
    private final Runnable ae;
    private boolean af;
    private AppCompatViewInflater ag;
    private OnBackInvokedDispatcher ah;
    private OnBackInvokedCallback ai;
    private ef aj;
    final Object j;
    final Context k;
    public Window l;
    final dq m;
    de n;
    MenuInflater o;
    public io p;
    ew q;
    public ActionBarContextView r;
    public PopupWindow s;
    public Runnable t;
    public boolean u;
    public boolean v;
    ViewGroup w;
    public View x;
    boolean y;
    boolean z;

    public eg(Context object, Window window, dq object2, Object object3) {
        Object var5_5 = null;
        this.M = null;
        this.u = true;
        this.Z = -100;
        this.ae = new ak(this, 11, null);
        this.k = object;
        this.m = object2;
        this.j = object3;
        if (object3 instanceof Dialog) {
            object2 = object;
            while (true) {
                object = var5_5;
                if (object2 == null) break;
                if (object2 instanceof dp) {
                    object = (dp)object2;
                    break;
                }
                object = var5_5;
                if (!(object2 instanceof ContextWrapper)) break;
                object2 = ((ContextWrapper)object2).getBaseContext();
            }
            if (object != null) {
                this.Z = ((eg)((dp)object).bk()).Z;
            }
        }
        if (this.Z == -100 && (object2 = (Integer)((pa)(object = N)).get(this.j.getClass().getName())) != null) {
            this.Z = (Integer)object2;
            ((pa)object).remove(this.j.getClass().getName());
        }
        if (window != null) {
            this.S(window);
        }
        hj.f();
    }

    private final eb Q(Context context) {
        if (this.ad == null) {
            this.ad = new dz(this, context);
        }
        return this.ad;
    }

    private final eb R(Context context) {
        if (this.ac == null) {
            if (bmu.d == null) {
                context = context.getApplicationContext();
                bmu.d = new bmu(context, (LocationManager)context.getSystemService("location"));
            }
            this.ac = new ec(this, bmu.d);
        }
        return this.ac;
    }

    private final void S(Window object) {
        if (this.l == null) {
            Object object2 = object.getCallback();
            if (!(object2 instanceof dy)) {
                object2 = new dy(this, (Window.Callback)object2);
                this.P = object2;
                object.setCallback((Window.Callback)object2);
                object2 = AmbientDelegate.z(this.k, null, O);
                Drawable drawable = ((AmbientDelegate)object2).s(0);
                if (drawable != null) {
                    object.setBackgroundDrawable(drawable);
                }
                ((AmbientDelegate)object2).v();
                this.l = object;
                if (Build.VERSION.SDK_INT >= 33 && this.ah == null) {
                    object = this.j;
                    this.ah = object instanceof Activity && ((Activity)object).getWindow() != null ? a$$ExternalSyntheticApiModelOutline0.m((Activity)this.j) : null;
                    this.G();
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private final void T() {
        Object object;
        if (this.l == null && (object = this.j) instanceof Activity) {
            this.S(((Activity)object).getWindow());
        }
        if (this.l != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private final void U(int n2) {
        this.J = 1 << n2 | this.J;
        if (!this.I) {
            View view = this.l.getDecorView();
            Runnable runnable = this.ae;
            int[] nArray = wj.a;
            view.postOnAnimation(runnable);
            this.I = true;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final void V(ee ee2, KeyEvent object) {
        block24: {
            int n2;
            WindowManager windowManager;
            block21: {
                block20: {
                    void var2_17;
                    ViewGroup.LayoutParams layoutParams;
                    block23: {
                        block22: {
                            ViewGroup viewGroup;
                            block19: {
                                ViewGroup.LayoutParams layoutParams2;
                                Window.Callback callback;
                                if (ee2.m) return;
                                if (this.F) {
                                    return;
                                }
                                if (ee2.a == 0) {
                                    if ((this.k.getResources().getConfiguration().screenLayout & 0xF) == 4) return;
                                }
                                if ((callback = this.w()) != null && !callback.onMenuOpened(ee2.a, (Menu)ee2.h)) {
                                    this.A(ee2, true);
                                    return;
                                }
                                windowManager = (WindowManager)this.k.getSystemService("window");
                                if (windowManager == null) return;
                                if (!this.K(ee2, (KeyEvent)object)) return;
                                viewGroup = ee2.e;
                                if (viewGroup == null || ee2.n) break block19;
                                View view = ee2.g;
                                if (view == null || (layoutParams2 = view.getLayoutParams()) == null || layoutParams2.width != -1) break block20;
                                n2 = -1;
                                break block21;
                            }
                            if (viewGroup == null) {
                                Context context = this.s();
                                TypedValue typedValue = new TypedValue();
                                Resources.Theme theme = context.getResources().newTheme();
                                theme.setTo(context.getTheme());
                                theme.resolveAttribute(2130968581, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    theme.applyStyle(typedValue.resourceId, true);
                                }
                                theme.resolveAttribute(2130969695, typedValue, true);
                                if (typedValue.resourceId != 0) {
                                    theme.applyStyle(typedValue.resourceId, true);
                                } else {
                                    theme.applyStyle(2132083739, true);
                                }
                                nx nx2 = new nx(context, 0);
                                nx2.getTheme().setTo(theme);
                                ee2.j = nx2;
                                TypedArray typedArray = nx2.obtainStyledAttributes(er.j);
                                ee2.b = typedArray.getResourceId(86, 0);
                                ee2.d = typedArray.getResourceId(1, 0);
                                typedArray.recycle();
                                ee2.e = new ed(this, ee2.j);
                                ee2.c = 81;
                                if (ee2.e == null) return;
                            } else if (ee2.n && viewGroup.getChildCount() > 0) {
                                ee2.e.removeAllViews();
                            }
                            View view = ee2.g;
                            if (view == null) break block22;
                            ee2.f = view;
                            break block23;
                        }
                        if (ee2.h == null) break block24;
                        if (this.R == null) {
                            this.R = new ef(this, 0);
                        }
                        ef ef2 = this.R;
                        if (ee2.i == null) {
                            fo fo2 = ee2.i = new fo(ee2.j);
                            fo2.e = ef2;
                            ee2.h.g(fo2);
                        }
                        fo fo3 = ee2.i;
                        ViewGroup viewGroup = ee2.e;
                        if (fo3.d == null) {
                            fo3.d = (ExpandedMenuView)fo3.b.inflate(2131623949, viewGroup, false);
                            if (fo3.f == null) {
                                fo3.f = new fn(fo3);
                            }
                            fo3.d.setAdapter((ListAdapter)fo3.f);
                            fo3.d.setOnItemClickListener(fo3);
                        }
                        ee2.f = fo3.d;
                        if (ee2.f == null) break block24;
                    }
                    if (ee2.f == null || ee2.g == null && ee2.i.a().getCount() <= 0) break block24;
                    ViewGroup.LayoutParams layoutParams3 = layoutParams = ee2.f.getLayoutParams();
                    if (layoutParams == null) {
                        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    n2 = ee2.b;
                    ee2.e.setBackgroundResource(n2);
                    ViewParent viewParent = ee2.f.getParent();
                    if (viewParent instanceof ViewGroup) {
                        ((ViewGroup)viewParent).removeView(ee2.f);
                    }
                    ee2.e.addView(ee2.f, (ViewGroup.LayoutParams)var2_17);
                    if (!ee2.f.hasFocus()) {
                        ee2.f.requestFocus();
                    }
                }
                n2 = -2;
            }
            ee2.l = false;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(n2, -2, 0, 0, 1002, 0x820000, -3);
            layoutParams.gravity = ee2.c;
            layoutParams.windowAnimations = ee2.d;
            windowManager.addView((View)ee2.e, (ViewGroup.LayoutParams)layoutParams);
            ee2.m = true;
            if (ee2.a != 0) return;
            this.G();
            return;
        }
        ee2.n = true;
    }

    private final void W() {
        if (!this.v) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private final void X(boolean bl2) {
        this.P(bl2, true);
    }

    final void A(ee ee2, boolean bl2) {
        io io2;
        if (bl2 && ee2.a == 0 && (io2 = this.p) != null && io2.s()) {
            this.z(ee2.h);
            return;
        }
        WindowManager windowManager = (WindowManager)this.k.getSystemService("window");
        if (windowManager != null && ee2.m && (io2 = ee2.e) != null) {
            windowManager.removeView((View)io2);
            if (bl2) {
                this.y(ee2.a, ee2, null);
            }
        }
        ee2.k = false;
        ee2.l = false;
        ee2.m = false;
        ee2.f = null;
        ee2.n = true;
        if (this.D == ee2) {
            this.D = null;
        }
        if (ee2.a == 0) {
            this.G();
        }
    }

    public final void B(int n2) {
        ee ee2 = this.N(n2);
        if (ee2.h != null) {
            Bundle bundle = new Bundle();
            ee2.h.o(bundle);
            if (bundle.size() > 0) {
                ee2.p = bundle;
            }
            ee2.h.s();
            ee2.h.clear();
        }
        ee2.o = true;
        ee2.n = true;
        if ((n2 == 108 || n2 == 0) && this.p != null) {
            ee2 = this.N(0);
            ee2.k = false;
            this.K(ee2, null);
        }
    }

    public final void C() {
        bzb bzb2 = this.M;
        if (bzb2 != null) {
            bzb2.U();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void D() {
        block44: {
            void var5_18;
            void var5_14;
            Object object;
            block47: {
                LayoutInflater layoutInflater;
                block45: {
                    block46: {
                        if (this.v) break block44;
                        TypedArray typedArray = this.k.obtainStyledAttributes(er.j);
                        if (!typedArray.hasValue(117)) {
                            typedArray.recycle();
                            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
                        }
                        if (typedArray.getBoolean(126, false)) {
                            this.p(1);
                        } else if (typedArray.getBoolean(117, false)) {
                            this.p(108);
                        }
                        if (typedArray.getBoolean(118, false)) {
                            this.p(109);
                        }
                        if (typedArray.getBoolean(119, false)) {
                            this.p(10);
                        }
                        this.B = typedArray.getBoolean(0, false);
                        typedArray.recycle();
                        this.T();
                        this.l.getDecorView();
                        layoutInflater = LayoutInflater.from((Context)this.k);
                        if (this.C) break block45;
                        if (!this.B) break block46;
                        ViewGroup viewGroup = (ViewGroup)layoutInflater.inflate(2131623948, null);
                        this.z = false;
                        this.y = false;
                        break block47;
                    }
                    if (this.y) {
                        io io2;
                        void var5_7;
                        TypedValue typedValue = new TypedValue();
                        this.k.getTheme().resolveAttribute(2130968588, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            nx nx2 = new nx(this.k, typedValue.resourceId);
                        } else {
                            Context context = this.k;
                        }
                        object = (ViewGroup)LayoutInflater.from((Context)var5_7).inflate(2131623959, null);
                        this.p = io2 = (io)object.findViewById(2131427595);
                        io2.n(this.w());
                        if (this.z) {
                            this.p.c(109);
                        }
                        if (this.T) {
                            this.p.c(2);
                        }
                        Method method = object;
                        if (this.U) {
                            this.p.c(5);
                            Method method2 = object;
                        }
                        break block47;
                    } else {
                        Object var5_11 = null;
                    }
                    break block47;
                }
                if (this.A) {
                    ViewGroup viewGroup = (ViewGroup)layoutInflater.inflate(2131623958, null);
                } else {
                    ViewGroup viewGroup = (ViewGroup)layoutInflater.inflate(2131623957, null);
                }
            }
            if (var5_14 == null) {
                StringBuilder stringBuilder = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                stringBuilder.append(this.y);
                stringBuilder.append(", windowActionBarOverlay: ");
                stringBuilder.append(this.z);
                stringBuilder.append(", android:windowIsFloating: ");
                stringBuilder.append(this.B);
                stringBuilder.append(", windowActionModeOverlay: ");
                stringBuilder.append(this.A);
                stringBuilder.append(", windowNoTitle: ");
                stringBuilder.append(this.C);
                stringBuilder.append(" }");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            wa.k((View)var5_14, new dt(this));
            if (this.p == null) {
                this.S = (TextView)var5_14.findViewById(2131427952);
            }
            try {
                object = var5_14.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                if (!((AccessibleObject)object).isAccessible()) {
                    ((Method)object).setAccessible(true);
                }
                ((Method)object).invoke((Object)var5_14, null);
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout)var5_14.findViewById(2131427391);
            object = (ViewGroup)this.l.findViewById(0x1020002);
            if (object != null) {
                while (object.getChildCount() > 0) {
                    View view = object.getChildAt(0);
                    object.removeViewAt(0);
                    contentFrameLayout.addView(view);
                }
                object.setId(-1);
                contentFrameLayout.setId(0x1020002);
                if (object instanceof FrameLayout) {
                    ((FrameLayout)object).setForeground(null);
                }
            }
            this.l.setContentView((View)var5_14);
            contentFrameLayout.i = new AmbientMode$AmbientController(this);
            this.w = var5_14;
            Object object2 = this.j;
            if (object2 instanceof Activity) {
                CharSequence charSequence = ((Activity)object2).getTitle();
            } else {
                CharSequence charSequence = this.Q;
            }
            if (!TextUtils.isEmpty((CharSequence)var5_18)) {
                object = this.p;
                if (object != null) {
                    object.o((CharSequence)var5_18);
                } else {
                    object = this.n;
                    if (object != null) {
                        ((de)object).g((CharSequence)var5_18);
                    } else {
                        object = this.S;
                        if (object != null) {
                            object.setText((CharSequence)var5_18);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout)this.w.findViewById(0x1020002);
            object = this.l.getDecorView();
            int n2 = object.getPaddingLeft();
            int n3 = object.getPaddingTop();
            int n4 = object.getPaddingRight();
            int n5 = object.getPaddingBottom();
            contentFrameLayout2.h.set(n2, n3, n4, n5);
            if (contentFrameLayout2.isLaidOut()) {
                contentFrameLayout2.requestLayout();
            }
            object = this.k.obtainStyledAttributes(er.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            object.getValue(124, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new TypedValue();
            }
            object.getValue(125, contentFrameLayout2.c);
            if (object.hasValue(122)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                object.getValue(122, contentFrameLayout2.d);
            }
            if (object.hasValue(123)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                object.getValue(123, contentFrameLayout2.e);
            }
            if (object.hasValue(120)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                object.getValue(120, contentFrameLayout2.f);
            }
            if (object.hasValue(121)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new TypedValue();
                }
                object.getValue(121, contentFrameLayout2.g);
            }
            object.recycle();
            contentFrameLayout2.requestLayout();
            this.v = true;
            ee ee2 = this.N(0);
            if (!this.F && ee2.h == null) {
                this.U(108);
                return;
            }
        }
    }

    public final void E() {
        this.D();
        if (this.y && this.n == null) {
            Object object = this.j;
            if (object instanceof Activity) {
                this.n = new eq((Activity)object, this.z);
            } else if (object instanceof Dialog) {
                this.n = new eq((Dialog)object);
            }
            object = this.n;
            if (object != null) {
                ((de)object).c(this.af);
            }
        }
    }

    @Override
    public final void F(fs object) {
        object = this.p;
        if (object != null && object.p() && (!ViewConfiguration.get((Context)this.k).hasPermanentMenuKey() || this.p.r())) {
            Window.Callback callback = this.w();
            if (this.p.s()) {
                this.p.q();
                if (!this.F) {
                    callback.onPanelClosed(108, (Menu)this.N((int)0).h);
                    return;
                }
            } else if (callback != null && !this.F) {
                if (this.I && (1 & this.J) != 0) {
                    this.l.getDecorView().removeCallbacks(this.ae);
                    this.ae.run();
                }
                object = this.N(0);
                fs fs2 = ((ee)object).h;
                if (fs2 != null && !((ee)object).o && callback.onPreparePanel(0, ((ee)object).g, (Menu)fs2)) {
                    callback.onMenuOpened(108, (Menu)((ee)object).h);
                    this.p.u();
                }
            }
            return;
        }
        object = this.N(0);
        ((ee)object).n = true;
        this.A((ee)object, false);
        this.V((ee)object, null);
    }

    final void G() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ah != null && (this.N((int)0).m || this.q != null)) {
                if (this.ai == null) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = this.ah;
                    Objects.requireNonNull(this);
                    na na2 = new na(this, 1);
                    a$$ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, 1000000, na2);
                    this.ai = na2;
                    return;
                }
            } else {
                OnBackInvokedCallback onBackInvokedCallback = this.ai;
                if (onBackInvokedCallback != null) {
                    a$$ExternalSyntheticApiModelOutline0.m(this.ah, onBackInvokedCallback);
                    this.ai = null;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    final boolean H(KeyEvent var1_1) {
        block15: {
            block20: {
                block28: {
                    block25: {
                        block26: {
                            block27: {
                                block23: {
                                    block24: {
                                        block22: {
                                            block21: {
                                                block18: {
                                                    block16: {
                                                        block17: {
                                                            block19: {
                                                                var6_3 = this.j;
                                                                var4_4 = var6_3 instanceof vd;
                                                                var5_5 = true;
                                                                var3_6 = true;
                                                                if ((var4_4 || var6_3 instanceof ei) && (var6_3 = this.l.getDecorView()) != null && wj.q((View)var6_3, var1_1)) {
                                                                    return true;
                                                                }
                                                                if (var1_1.getKeyCode() == 82) {
                                                                    var6_3 = this.P;
                                                                    var7_7 = this.l.getCallback();
                                                                    try {
                                                                        var6_3.a = true;
                                                                        var4_4 = var7_7.dispatchKeyEvent(var1_1);
                                                                        if (var4_4) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                    finally {
                                                                        var6_3.a = false;
                                                                    }
                                                                }
                                                                var2_8 = var1_1.getKeyCode();
                                                                if (var1_1.getAction() != 0) break block16;
                                                                if (var2_8 == 4) break block17;
                                                                if (var2_8 != 82) break block18;
                                                                var4_4 = var5_5;
                                                                if (var1_1.getRepeatCount() != 0) break block15;
                                                                var6_3 = this.N(0);
                                                                if (!var6_3.m) break block19;
                                                                var4_4 = var5_5;
                                                                break block15;
                                                            }
                                                            this.K((ee)var6_3, var1_1);
                                                            return true;
                                                        }
                                                        if ((var1_1.getFlags() & 128) == 0) {
                                                            var3_6 = false;
                                                        }
                                                        this.X = var3_6;
                                                        return false;
                                                    }
                                                    if (var2_8 == 4) break block20;
                                                    if (var2_8 == 82) break block21;
                                                }
lbl43:
                                                // 2 sources

                                                while (true) {
                                                    var4_4 = false;
                                                    break block15;
                                                    break;
                                                }
                                            }
                                            if (this.q == null) break block22;
                                            var4_4 = var5_5;
                                            break block15;
                                        }
                                        var6_3 = this.N(0);
                                        var7_7 = this.p;
                                        if (var7_7 == null || !var7_7.p() || ViewConfiguration.get((Context)this.k).hasPermanentMenuKey()) break block23;
                                        if (this.p.s()) break block24;
                                        var4_4 = var5_5;
                                        if (this.F) break block15;
                                        var4_4 = var5_5;
                                        if (!this.K((ee)var6_3, var1_1)) break block15;
                                        var3_6 = this.p.u();
                                        break block25;
                                    }
                                    var3_6 = this.p.q();
                                    break block25;
                                }
                                var3_6 = var6_3.m;
                                if (var3_6 || var6_3.l) break block26;
                                var4_4 = var5_5;
                                if (!var6_3.k) break block15;
                                if (!var6_3.o) break block27;
                                var6_3.k = false;
                                var4_4 = var5_5;
                                if (!this.K((ee)var6_3, var1_1)) break block15;
                            }
                            this.V((ee)var6_3, var1_1);
                            break block28;
                        }
                        this.A((ee)var6_3, true);
                    }
                    var4_4 = var5_5;
                    if (!var3_6) break block15;
                }
                var1_1 = (AudioManager)this.k.getApplicationContext().getSystemService("audio");
                if (var1_1 != null) {
                    var1_1.playSoundEffect(0);
                    var4_4 = var5_5;
                } else {
                    Log.w((String)"AppCompatDelegate", (String)"Couldn't get audio manager");
                    var4_4 = var5_5;
                }
                break block15;
            }
            var4_4 = var5_5;
            ** while (!this.I())
        }
        return var4_4;
    }

    public final boolean I() {
        boolean bl2 = this.X;
        this.X = false;
        Object object = this.N(0);
        if (((ee)object).m) {
            if (!bl2) {
                this.A((ee)object, true);
            }
            return true;
        }
        object = this.q;
        if (object != null) {
            ((ew)object).f();
            return true;
        }
        object = this.b();
        if (object != null && (object = ((eq)object).p) != null && ((Toolbar)(object = ((me)object).a)).x()) {
            ((Toolbar)object).j();
            return true;
        }
        return false;
    }

    @Override
    public final boolean J(fs object, MenuItem menuItem) {
        Window.Callback callback = this.w();
        if (callback != null && !this.F && (object = this.u(((fs)object).a())) != null) {
            return callback.onMenuItemSelected(((ee)object).a, menuItem);
        }
        return false;
    }

    public final boolean K(ee object, KeyEvent object2) {
        block22: {
            int n2;
            Window.Callback callback;
            Object object3;
            block23: {
                block24: {
                    block26: {
                        Context context;
                        block25: {
                            if (this.F) {
                                return false;
                            }
                            if (((ee)object).k) {
                                return true;
                            }
                            object3 = this.D;
                            if (object3 != null && object3 != object) {
                                this.A((ee)object3, false);
                            }
                            if ((callback = this.w()) != null) {
                                ((ee)object).g = callback.onCreatePanelView(((ee)object).a);
                            }
                            n2 = (n2 = ((ee)object).a) != 0 && n2 != 108 ? 0 : 1;
                            if (n2 != 0 && (object3 = this.p) != null) {
                                object3.m();
                            }
                            if (((ee)object).g != null) break block22;
                            object3 = ((ee)object).h;
                            if (object3 != null && !((ee)object).o) break block23;
                            if (object3 != null) break block24;
                            context = this.k;
                            int n3 = ((ee)object).a;
                            if (n3 == 0) break block25;
                            object3 = context;
                            if (n3 != 108) break block26;
                        }
                        object3 = context;
                        if (this.p != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(2130968588, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                object3 = context.getResources().newTheme();
                                object3.setTo(theme);
                                object3.applyStyle(typedValue.resourceId, true);
                                object3.resolveAttribute(2130968589, typedValue, true);
                            } else {
                                theme.resolveAttribute(2130968589, typedValue, true);
                                object3 = null;
                            }
                            Object object4 = object3;
                            if (typedValue.resourceId != 0) {
                                object4 = object3;
                                if (object3 == null) {
                                    object4 = context.getResources().newTheme();
                                    object4.setTo(theme);
                                }
                                object4.applyStyle(typedValue.resourceId, true);
                            }
                            object3 = context;
                            if (object4 != null) {
                                object3 = new nx(context, 0);
                                object3.getTheme().setTo((Resources.Theme)object4);
                            }
                        }
                    }
                    object3 = new fs((Context)object3);
                    ((fs)object3).b = this;
                    ((ee)object).a((fs)object3);
                    if (((ee)object).h == null) {
                        return false;
                    }
                }
                if (n2 != 0 && (object3 = this.p) != null) {
                    if (this.aj == null) {
                        this.aj = new ef(this, 1);
                    }
                    object3.l(((ee)object).h, this.aj);
                }
                ((ee)object).h.s();
                if (!callback.onCreatePanelMenu(((ee)object).a, (Menu)((ee)object).h)) {
                    ((ee)object).a(null);
                    if (n2 != 0 && (object = this.p) != null) {
                        object.l(null, this.aj);
                    }
                    return false;
                }
                ((ee)object).o = false;
            }
            ((ee)object).h.s();
            object3 = ((ee)object).p;
            if (object3 != null) {
                ((ee)object).h.n((Bundle)object3);
                ((ee)object).p = null;
            }
            if (!callback.onPreparePanel(0, ((ee)object).g, (Menu)((ee)object).h)) {
                if (n2 != 0 && (object2 = this.p) != null) {
                    object2.l(null, this.aj);
                }
                ((ee)object).h.r();
                return false;
            }
            n2 = object2 != null ? object2.getDeviceId() : -1;
            boolean bl2 = KeyCharacterMap.load((int)n2).getKeyboardType() != 1;
            ((ee)object).h.setQwertyMode(bl2);
            ((ee)object).h.r();
        }
        ((ee)object).k = true;
        ((ee)object).l = false;
        this.D = object;
        return true;
    }

    public final boolean L() {
        ViewGroup viewGroup;
        return this.v && (viewGroup = this.w) != null && viewGroup.isLaidOut();
    }

    public final void M() {
        this.X(true);
    }

    public final ee N(int n2) {
        ee[] eeArray;
        Object object;
        block6: {
            block5: {
                object = this.W;
                if (object == null) break block5;
                eeArray = object;
                if (((ee[])object).length > n2) break block6;
            }
            eeArray = new ee[n2 + 1];
            if (object != null) {
                System.arraycopy(object, 0, eeArray, 0, ((ee[])object).length);
            }
            this.W = eeArray;
        }
        ee ee2 = eeArray[n2];
        object = ee2;
        if (ee2 == null) {
            eeArray[n2] = object = new ee(n2);
        }
        return object;
    }

    public final boolean O(ee object, int n2, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((((ee)object).k || this.K((ee)object, keyEvent)) && (object = ((ee)object).h) != null) {
            return ((fs)object).performShortcut(n2, keyEvent, 1);
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final void P(boolean var1_1, boolean var2_2) {
        block46: {
            block45: {
                block44: {
                    block42: {
                        block43: {
                            if (this.F) {
                                return;
                            }
                            var7_3 = this.q();
                            var3_4 = this.r(this.k, var7_3);
                            var9_5 = Build.VERSION.SDK_INT < 33 ? this.x(this.k) : null;
                            var10_7 = var9_5;
                            if (!var2_2) {
                                var10_7 = var9_5;
                                if (var9_5 != null) {
                                    var10_7 = kh.h(this.k.getResources().getConfiguration());
                                }
                            }
                            var12_8 = this.t(this.k, var3_4, (tw)var10_7, null, false);
                            var11_9 = this.k;
                            var2_2 = this.ab;
                            var6_10 = 0;
                            if (var2_2 || !(this.j instanceof Activity)) ** GOTO lbl31
                            var9_5 = var11_9.getPackageManager();
                            if (var9_5 == null) {
                                var4_11 = 0;
                            } else {
                                block41: {
                                    var3_4 = Build.VERSION.SDK_INT >= 29 ? 0x100C0000 : 786432;
                                    var13_12 = new ComponentName((Context)var11_9, this.j.getClass());
                                    var9_5 = var9_5.getActivityInfo(var13_12, var3_4);
                                    if (var9_5 == null) break block41;
                                    try {
                                        this.aa = var9_5.configChanges;
                                    }
                                    catch (PackageManager.NameNotFoundException var9_6) {
                                        this.aa = 0;
                                    }
                                }
                                this.ab = true;
                                var4_11 = this.aa;
                            }
                            var9_5 = var11_9 = this.G;
                            if (var11_9 == null) {
                                var9_5 = this.k.getResources().getConfiguration();
                            }
                            var3_4 = var9_5.uiMode;
                            var8_13 = var12_8.uiMode & 48;
                            var11_9 = kh.h((Configuration)var9_5);
                            var9_5 = var10_7 == null ? null : kh.h(var12_8);
                            var3_4 = (var3_4 & 48) != var8_13 ? 512 : 0;
                            var5_14 = var3_4;
                            if (var9_5 != null) {
                                var5_14 = var3_4;
                                if (!var11_9.equals(var9_5)) {
                                    var5_14 = var3_4 | 8196;
                                }
                            }
                            var3_4 = var6_10;
                            if ((~var4_11 & var5_14) == 0) break block42;
                            var3_4 = var6_10;
                            if (!var1_1) break block42;
                            var3_4 = var6_10;
                            if (!this.E) break block42;
                            if (eg.i) break block43;
                            var3_4 = var6_10;
                            if (!this.Y) break block42;
                        }
                        var10_7 = this.j;
                        var3_4 = var6_10;
                        if (var10_7 instanceof Activity) {
                            var3_4 = var6_10;
                            if (!((Activity)var10_7).isChild()) {
                                if (Build.VERSION.SDK_INT >= 31 && (var5_14 & 8192) != 0) {
                                    ((Activity)this.j).getWindow().getDecorView().setLayoutDirection(var12_8.getLayoutDirection());
                                }
                                se.a((Activity)this.j);
                                var3_4 = 1;
                            }
                        }
                    }
                    if (var3_4 != 0 || var5_14 == 0) break block44;
                    var11_9 = this.k.getResources();
                    var10_7 = new Configuration(var11_9.getConfiguration());
                    var10_7.uiMode = var11_9.getConfiguration().uiMode & -49 | var8_13;
                    if (var9_5 != null) {
                        kh.i((Configuration)var10_7, (tw)var9_5);
                    }
                    var11_9.updateConfiguration((Configuration)var10_7, null);
                    var3_4 = this.H;
                    if (var3_4 != 0) {
                        this.k.setTheme(var3_4);
                        this.k.getTheme().applyStyle(this.H, true);
                    }
                    if ((var5_14 & var4_11) == var5_14 && (var11_9 = this.j) instanceof Activity) {
                        if ((var11_9 = (Activity)var11_9) instanceof abe) {
                            if (((abe)var11_9).getLifecycle().a().a(aba.c)) {
                                var11_9.onConfigurationChanged((Configuration)var10_7);
                            }
                        } else if (this.Y && !this.F) {
                            var11_9.onConfigurationChanged((Configuration)var10_7);
                        }
                    }
                    break block45;
                }
                if (var3_4 == 0) break block46;
            }
            if ((var10_7 = this.j) instanceof dp) {
                if ((var5_14 & 512) != 0) {
                    ((dp)var10_7).v();
                }
                if ((var5_14 & 4) != 0) {
                    ((dp)this.j).u();
                }
            }
        }
        if (var9_5 != null) {
            ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(kh.h(this.k.getResources().getConfiguration()).e()));
        }
        if (var7_3 == 0) {
            this.R(this.k).d();
        } else {
            var9_5 = this.ac;
            if (var9_5 != null) {
                var9_5.c();
            }
            if (var7_3 == 3) {
                this.Q(this.k).d();
                return;
            }
        }
        var9_5 = this.ad;
        if (var9_5 != null) {
            var9_5.c();
        }
    }

    @Override
    public final Context a() {
        return this.k;
    }

    @Override
    public final de b() {
        this.E();
        return this.n;
    }

    @Override
    public final View c(int n2) {
        this.D();
        return this.l.findViewById(n2);
    }

    @Override
    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        this.D();
        ((ViewGroup)this.w.findViewById(0x1020002)).addView(view, layoutParams);
        this.P.a(this.l.getCallback());
    }

    @Override
    public final void e() {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.k);
        if (layoutInflater.getFactory() == null) {
            layoutInflater.setFactory2((LayoutInflater.Factory2)this);
            return;
        }
        if (!(layoutInflater.getFactory2() instanceof eg)) {
            Log.i((String)"AppCompatDelegate", (String)"The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override
    public final void f() {
        if (this.n != null) {
            this.b();
            this.U(0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void g() {
        Object object;
        if (this.j instanceof Activity) {
            Object object2 = ds.g;
            synchronized (object2) {
                ds.i(this);
            }
        }
        if (this.I) {
            this.l.getDecorView().removeCallbacks(this.ae);
        }
        this.F = true;
        if (this.Z != -100 && (object = this.j) instanceof Activity && ((Activity)object).isChangingConfigurations()) {
            object = this.j;
            N.put(object.getClass().getName(), this.Z);
        } else {
            object = this.j;
            N.remove(object.getClass().getName());
        }
        object = this.ac;
        if (object != null) {
            ((eb)object).c();
        }
        if ((object = this.ad) != null) {
            ((eb)object).c();
        }
    }

    @Override
    public final void h() {
        de de2 = this.b();
        if (de2 != null) {
            de2.e(false);
        }
    }

    @Override
    public final void j(int n2) {
        this.D();
        ViewGroup viewGroup = (ViewGroup)this.w.findViewById(0x1020002);
        viewGroup.removeAllViews();
        LayoutInflater.from((Context)this.k).inflate(n2, viewGroup);
        this.P.a(this.l.getCallback());
    }

    @Override
    public final void k(View view) {
        this.D();
        ViewGroup viewGroup = (ViewGroup)this.w.findViewById(0x1020002);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.P.a(this.l.getCallback());
    }

    @Override
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        this.D();
        ViewGroup viewGroup = (ViewGroup)this.w.findViewById(0x1020002);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.P.a(this.l.getCallback());
    }

    @Override
    public final void m(CharSequence charSequence) {
        this.Q = charSequence;
        Object object = this.p;
        if (object == null) {
            object = this.n;
            if (object != null) {
                ((de)object).g(charSequence);
                return;
            }
            object = this.S;
            if (object != null) {
                object.setText(charSequence);
            }
            return;
        }
        object.o(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void o() {
        this.E = true;
        this.X(false);
        this.T();
        Object object = this.j;
        if (object instanceof Activity) {
            try {
                object = rw.v((Activity)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object = null;
            }
            if (object != null) {
                object = this.n;
                if (object == null) {
                    this.af = true;
                } else {
                    ((de)object).c(true);
                }
            }
            object = ds.g;
            synchronized (object) {
                ds.i(this);
                ov ov2 = ds.f;
                WeakReference<eg> weakReference = new WeakReference<eg>(this);
                ov2.add(weakReference);
            }
        }
        this.G = new Configuration(this.k.getResources().getConfiguration());
        this.Y = true;
    }

    public final View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        return this.v(view, string, context, attributeSet);
    }

    public final View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return this.v(null, string, context, attributeSet);
    }

    @Override
    public final void p(int n2) {
        int n3;
        if (n2 == 8) {
            Log.i((String)"AppCompatDelegate", (String)"You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            n3 = 108;
        } else {
            n3 = n2;
            if (n2 == 9) {
                Log.i((String)"AppCompatDelegate", (String)"You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                n3 = 109;
            }
        }
        if (this.C && n3 == 108) {
            return;
        }
        if (this.y && n3 == 1) {
            this.y = false;
        }
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 != 5) {
                    if (n3 != 10) {
                        if (n3 != 108) {
                            if (n3 != 109) {
                                this.l.requestFeature(n3);
                                return;
                            }
                            this.W();
                            this.z = true;
                            return;
                        }
                        this.W();
                        this.y = true;
                        return;
                    }
                    this.W();
                    this.A = true;
                    return;
                }
                this.W();
                this.U = true;
                return;
            }
            this.W();
            this.T = true;
            return;
        }
        this.W();
        this.C = true;
    }

    public final int q() {
        int n2 = this.Z;
        if (n2 != -100) {
            return n2;
        }
        return ds.b;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final int r(Context object, int n2) {
        int n3;
        block17: {
            boolean bl2;
            block16: {
                void var1_6;
                void var1_4;
                Object object2;
                long l2;
                Object object3;
                block15: {
                    if (n3 == -100) return -1;
                    if (n3 == -1) return n3;
                    if (n3 != 0) {
                        if (n3 == true) return n3;
                        if (n3 == 2) return n3;
                        if (n3 != 3) throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        if (!((dz)this.Q((Context)object)).a.isPowerSaveMode()) return 1;
                        return 2;
                    }
                    if (((UiModeManager)object.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) return -1;
                    object3 = ((ec)this.R((Context)object)).b;
                    l2 = ((em)((bmu)object3).a).b;
                    object2 = ((bmu)object3).a;
                    if (l2 <= System.currentTimeMillis()) break block15;
                    bl2 = ((em)object2).a;
                    break block16;
                }
                n3 = kl.t((Context)((bmu)object3).c, "android.permission.ACCESS_COARSE_LOCATION");
                Object object4 = null;
                if (n3 == 0) {
                    Location location = ((bmu)object3).j("network");
                } else {
                    Object var1_3 = null;
                }
                if (kl.t((Context)((bmu)object3).c, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    object4 = ((bmu)object3).j("gps");
                }
                if (!(object4 != null && var1_4 != null ? object4.getTime() <= var1_4.getTime() : object4 == null)) {
                    Location location = object4;
                }
                if (var1_6 == null) break block17;
                object3 = ((bmu)object3).a;
                long l3 = System.currentTimeMillis();
                if (el.a == null) {
                    el.a = new el();
                }
                object4 = el.a;
                ((el)object4).a(l3 - 86400000L, var1_6.getLatitude(), var1_6.getLongitude());
                ((el)object4).a(l3, var1_6.getLatitude(), var1_6.getLongitude());
                n3 = ((el)object4).d;
                l2 = ((el)object4).c;
                long l4 = ((el)object4).b;
                ((el)object4).a(l3 + 86400000L, var1_6.getLatitude(), var1_6.getLongitude());
                long l5 = ((el)object4).c;
                if (l2 != -1L && l4 != -1L) {
                    if (l3 > l4) {
                        l2 = l5;
                    } else if (l3 > l2) {
                        l2 = l4;
                    }
                    l2 += 60000L;
                } else {
                    l2 = l3 + 43200000L;
                }
                bl2 = 1 == n3;
                em em2 = (em)object3;
                em2.a = bl2;
                em2.b = l2;
                bl2 = ((em)object2).a;
            }
            if (bl2) return 2;
            return 1;
        }
        Log.i((String)"TwilightManager", (String)"Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        n3 = Calendar.getInstance().get(11);
        if (n3 < 6) return 2;
        if (n3 >= 22) return 2;
        return 1;
    }

    final Context s() {
        de de2 = this.b();
        de2 = de2 != null ? de2.a() : null;
        de de3 = de2;
        if (de2 == null) {
            de3 = this.k;
        }
        return de3;
    }

    public final Configuration t(Context context, int n2, tw tw2, Configuration configuration, boolean bl2) {
        n2 = n2 != 1 ? (n2 != 2 ? (bl2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30) : 32) : 16;
        context = new Configuration();
        context.fontScale = 0.0f;
        if (configuration != null) {
            context.setTo(configuration);
        }
        context.uiMode = n2 | context.uiMode & 0xFFFFFFCF;
        if (tw2 != null) {
            kh.i((Configuration)context, tw2);
        }
        return context;
    }

    final ee u(Menu menu) {
        ee[] eeArray = this.W;
        int n2 = eeArray != null ? eeArray.length : 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            ee ee2 = eeArray[i2];
            if (ee2 == null || ee2.h != menu) continue;
            return ee2;
        }
        return null;
    }

    public final View v(View view, String string, Context context, AttributeSet attributeSet) {
        if (this.ag == null) {
            TypedArray typedArray = this.k.obtainStyledAttributes(er.j);
            String string2 = typedArray.getString(116);
            typedArray.recycle();
            if (string2 == null) {
                this.ag = new AppCompatViewInflater();
            } else {
                try {
                    this.ag = (AppCompatViewInflater)this.k.getClassLoader().loadClass(string2).getDeclaredConstructor(null).newInstance(null);
                }
                catch (Throwable throwable) {
                    Log.i((String)"AppCompatDelegate", (String)a.aj(string2, "Failed to instantiate custom view inflater ", ". Falling back to default."), (Throwable)throwable);
                    this.ag = new AppCompatViewInflater();
                }
            }
        }
        return this.ag.createView(view, string, context, attributeSet, false, false, true, false);
    }

    final Window.Callback w() {
        return this.l.getCallback();
    }

    final tw x(Context object) {
        if (Build.VERSION.SDK_INT < 33) {
            tw tw2 = ds.c;
            if (tw2 == null) {
                return null;
            }
            tw tw3 = kh.h(object.getApplicationContext().getResources().getConfiguration());
            if (tw2.g()) {
                object = tw.a;
            } else {
                LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
                for (int i2 = 0; i2 < tw2.a() + tw3.a(); ++i2) {
                    object = i2 < tw2.a() ? tw2.f(i2) : tw3.f(i2 - tw2.a());
                    if (object == null) continue;
                    linkedHashSet.add(object);
                }
                object = tw.b(linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
            if (((tw)object).g()) {
                return tw3;
            }
            return object;
        }
        return null;
    }

    final void y(int n2, ee object, Menu menu) {
        Menu menu2 = menu;
        if (menu == null) {
            menu2 = ((ee)object).h;
        }
        if (((ee)object).m && !this.F) {
            object = this.P;
            menu = this.l.getCallback();
            try {
                ((dy)object).b = true;
                menu.onPanelClosed(n2, menu2);
                return;
            }
            finally {
                ((dy)object).b = false;
            }
        }
    }

    final void z(fs fs2) {
        if (this.V) {
            return;
        }
        this.V = true;
        this.p.a();
        Window.Callback callback = this.w();
        if (callback != null && !this.F) {
            callback.onPanelClosed(108, (Menu)fs2);
        }
        this.V = false;
    }
}

