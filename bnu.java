/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.car.ui.FocusParkingView;
import com.android.car.ui.toolbar.TabLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public final class bnu
implements bnq {
    private final Set A;
    private final bml B;
    private final boolean C;
    private bnp D;
    private boolean E;
    private bmp F;
    private final bmv G;
    private List H;
    private final List I;
    private final List J;
    private final boolean K;
    private final boolean L;
    private final bmj M;
    public final ViewGroup a;
    public final Context b;
    public final Set c;
    public final Set d;
    public List e;
    public final List f;
    public final bli g;
    public View[] h;
    public AlertDialog i;
    private final View j;
    private final ImageView k;
    private final ImageView l;
    private final ViewGroup m;
    private final ViewGroup n;
    private final bok o;
    private bjh p = new bjh(new bzb(""));
    private final bok q;
    private bjh r = new bjh(new bzb(""));
    private final ViewGroup s;
    private final TabLayout t;
    private final FrameLayout u;
    private bna v;
    private final CharSequence w;
    private final Set x = new HashSet();
    private final Set y = new HashSet();
    private final Set z = new HashSet();

    public bnu(Context context, View view) {
        ArrayList arrayList;
        this.A = new HashSet();
        this.c = new HashSet();
        this.d = new HashSet();
        new HashSet();
        this.D = bnp.a;
        this.E = false;
        this.F = bmp.d;
        this.G = bmv.a;
        this.H = Collections.emptyList();
        this.e = new ArrayList();
        this.f = arrayList = new ArrayList();
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.M = new bnr(this);
        this.b = context;
        bmh bmh2 = new bmh(context);
        bmh2.h = ((Context)bmh2.a.get()).getDrawable(2131230924);
        bmh2.g = ((Context)bmh2.a.get()).getString(2132017232);
        bmh2.i = new bns(this);
        this.B = bmh2.a();
        this.C = context.getResources().getBoolean(2131034135);
        this.K = context.getResources().getBoolean(2131034132);
        context.getResources().getBoolean(2131034130);
        this.L = context.getResources().getBoolean(2131034133);
        this.w = context.getString(2132017231);
        bmh2 = bnv.h(view, 2131427516);
        this.j = bmh2;
        this.t = (TabLayout)bnv.i(view, 2131427540);
        this.k = (ImageView)bnv.i(view, 2131427527);
        this.l = (ImageView)bnv.i(view, 2131427520);
        this.m = (ViewGroup)bnv.i(view, 2131427528);
        this.a = (ViewGroup)bnv.i(view, 2131427526);
        this.n = (ViewGroup)bnv.i(view, 2131427542);
        this.q = (bok)bnv.i(view, 2131427537);
        this.o = (bok)bnv.i(view, 2131427541);
        this.s = (ViewGroup)bnv.i(view, 2131427544);
        ImageView imageView = (ImageView)bnv.i(view, 2131427543);
        this.u = (FrameLayout)bnv.i(view, 2131427535);
        view = (ProgressBar)bnv.i(view, 2131427529);
        if (bmh2 != null) {
            bmh2.setBackground(context.getDrawable(2131230957));
        }
        this.g = new bli(arrayList);
        this.c();
    }

    public final bla a(bml bml2) {
        bla bla2 = bml2.a ? new bla(bkx.b) : new bla(bkx.a);
        bla2.a = bml2.i;
        bla2.g = bml2.o;
        bla2.a(bml2.m);
        bla2.f = bml2.l;
        bla2.b(bml2.h);
        bla2.i = new eky(this, bml2, null);
        return bla2;
    }

    public final void b() {
        Object object2 = this.i;
        int n2 = 0;
        boolean bl2 = object2 == null ? false : object2.isShowing();
        this.f.clear();
        for (Object object2 : this.e) {
            if (!object2.n) continue;
            this.f.add(this.a((bml)object2));
        }
        object2 = new bjg(this.b);
        bli bli2 = this.g;
        View view = LayoutInflater.from((Context)object2.c).inflate(2131623966, null);
        Object object3 = (RecyclerView)bnv.i(view, 2131427717);
        ((RecyclerView)object3).ac(new LinearLayoutManager());
        ((RecyclerView)object3).ab(bli2);
        object3.setFocusable(false);
        object2.a.setView(view);
        object3 = LayoutInflater.from((Context)object2.c).inflate(2131623967, null);
        view = (TextView)bnv.i((View)object3, 2131427463);
        TextView textView = (TextView)bnv.i((View)object3, 2131427462);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        vl.a((View)textView, new akt(textView, 17));
        bli2 = (ImageView)bnv.i((View)object3, 2131427461);
        view.setText(null);
        int n3 = true != TextUtils.isEmpty(null) ? 0 : 8;
        view.setVisibility(n3);
        textView.setText(null);
        n3 = true != TextUtils.isEmpty(null) ? n2 : 8;
        textView.setVisibility(n3);
        bli2.setImageDrawable(null);
        bli2.setVisibility(8);
        if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
            object2.a.setCustomTitle((View)object3);
        }
        if (object2.c.getResources().getBoolean(2131034114)) {
            object3 = object2.c;
            object2.a.setNegativeButton((CharSequence)object3.getString(2132017217), (DialogInterface.OnClickListener)new buw(1));
        }
        object2.b = object2.a.create();
        object2.d = (ViewGroup)object2.b.getWindow().getDecorView().getRootView();
        object3 = new FocusParkingView(object2.c);
        object2.d.addView((View)object3);
        object2.d.setOnApplyWindowInsetsListener(object2.e);
        object3 = object2.f;
        object2.a.setOnDismissListener((DialogInterface.OnDismissListener)object3);
        this.i = object2.b;
        if (bl2) {
            this.g.notifyDataSetChanged();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c() {
        var7_1 /* !! */  = this.F;
        var5_2 = this.E;
        var8_3 = var7_1 /* !! */ ;
        if (var5_2 != 0) {
            if (this.D == bnp.a) {
                var8_3 = bmp.d;
            } else {
                var8_3 = var7_1 /* !! */ ;
                if (var7_1 /* !! */  == bmp.d) {
                    var8_3 = bmp.a;
                }
            }
        }
        var7_1 /* !! */  = this.G;
        if (var5_2 != 0) {
            var7_1 /* !! */  = this.D;
            var7_1 /* !! */  = var7_1 /* !! */  == bnp.c ? bmv.b : (var7_1 /* !! */  == bnp.d ? bmv.c : bmv.a);
        }
        var5_2 = this.t.b.isEmpty();
        var6_4 = 1;
        var3_6 = var1_5 = var5_2 ^ 1;
        if (this.E) {
            var3_6 = var1_5;
            if (this.D != bnp.a) {
                var9_7 /* !! */  = bnp.b;
                var3_6 = 0;
            }
        }
        var2_8 = var7_1 /* !! */  != bmv.a;
        var10_9 = this.v;
        var9_7 /* !! */  = null;
        var4_10 = 8;
        if (var10_9 == null && var2_8) {
            var10_9 = new bna(this.b);
            var10_9.l = var11_11 = this.w;
            if (!var10_9.m) {
                var10_9.k.setHint((CharSequence)var11_11);
            }
            var10_9.j.setImageResource(2131230926);
            var10_9.k.setText(null);
            var11_11 = var10_9.k;
            var11_11.setSelection(var11_11.getText().length());
            var11_11 = this.z;
            var10_9.r = this.x;
            var10_9.t = var11_11;
            var11_11 = this.A;
            var10_9.s = this.y;
            var10_9.u = var11_11;
            var10_9.setVisibility(8);
            var11_11 = new FrameLayout.LayoutParams(-1, -1);
            this.u.addView((View)var10_9, (ViewGroup.LayoutParams)var11_11);
            var10_9.i.c(null);
            this.v = var10_9;
        }
        for (Object var11_11 : this.I) {
            var5_2 = var7_1 /* !! */  == bmv.b ? 1 : 0;
            if (var5_2 == var11_11.a) continue;
            var11_11.a = var5_2;
            if (!var11_11.b.c) continue;
            var11_11.a();
        }
        var10_9 = new gp(this, 19, null);
        var1_5 = var8_3.ordinal();
        if (var1_5 != 1) {
            if (var1_5 != 2) {
                this.k.setImageResource(2131230916);
            } else {
                this.k.setImageResource(2131230920);
            }
        } else {
            this.k.setImageResource(2131230918);
        }
        var11_11 = this.k;
        var1_5 = var8_3 != bmp.d ? 0 : 8;
        var11_11.setVisibility(var1_5);
        var11_11 = this.l;
        var1_5 = 4;
        var11_11.setVisibility(4);
        this.s.setVisibility(8);
        var11_11 = this.m;
        if (var8_3 == bmp.d) {
            if (!this.K) {
                var1_5 = 8;
            }
        } else {
            var1_5 = 0;
        }
        var11_11.setVisibility(var1_5);
        if (var8_3 != bmp.d) {
            this.m.setOnClickListener((View.OnClickListener)var10_9);
        } else {
            this.m.setOnClickListener(null);
        }
        var10_9 = this.m;
        var10_9.setClickable(var10_9.hasOnClickListeners());
        this.s.setOnClickListener(null);
        this.s.setClickable(false);
        var10_9 = this.m;
        if (var8_3 != bmp.d) {
            var9_7 /* !! */  = this.b.getString(2132017235);
        }
        var10_9.setContentDescription((CharSequence)var9_7 /* !! */ );
        var8_3 = this.n;
        var1_5 = (var3_6 == 0 || this.C != false) && var2_8 == false ? 0 : 8;
        var8_3.setVisibility(var1_5);
        var8_3 = this.q;
        var1_5 = true != TextUtils.isEmpty((CharSequence)this.r.a()) ? 0 : 8;
        var8_3.setVisibility(var1_5);
        var8_3 = this.t;
        var1_5 = var3_6 != 0 && (this.G == bmv.a || this.C != false) ? 0 : 8;
        var8_3.setVisibility(var1_5);
        var8_3 = this.v;
        if (var8_3 != null) {
            if (var2_8) {
                var5_2 = var7_1 /* !! */  == bmv.c ? 1 : 0;
                if (var5_2 != var8_3.v) {
                    if (var5_2 != 0) {
                        var8_3.k.setPaddingRelative(var8_3.o, 0, var8_3.q, 0);
                        var8_3.k.setImeOptions(6);
                        var8_3.j.setVisibility(8);
                    } else {
                        var8_3.k.setPaddingRelative(var8_3.p, 0, var8_3.q, 0);
                        var8_3.k.setImeOptions(3);
                        var8_3.j.setVisibility(0);
                    }
                    var8_3.v = var5_2;
                    var8_3.h.restartInput((View)var8_3.k);
                }
                this.v.setVisibility(0);
            } else {
                var8_3.setVisibility(8);
            }
        }
        var7_1 /* !! */  = this.a;
        var1_5 = var4_10;
        if (!var2_8) {
            var1_5 = 0;
        }
        var7_1 /* !! */ .setVisibility(var1_5);
        var8_3 = this.B;
        if (var2_8) ** GOTO lbl-1000
        var7_1 /* !! */  = this.e.iterator();
        var1_5 = 0;
        while (var7_1 /* !! */ .hasNext()) {
            if (!((bml)var7_1 /* !! */ .next()).n) continue;
            ++var1_5;
        }
        if (var1_5 > 0) {
            var5_2 = var6_4;
        } else lbl-1000:
        // 2 sources

        {
            var5_2 = 0;
        }
        var8_3.n = var5_2;
        var8_3.c();
    }

    @Override
    public final boolean isStateSet() {
        return this.E;
    }

    @Override
    public final void setLogo(Drawable drawable) {
        if (!this.L) {
            return;
        }
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void setMenuItems(List object) {
        object = Collections.emptyList();
        ArrayList<bml> arrayList = new ArrayList<bml>();
        Object object2 = new ArrayList<bml>();
        int n2 = 0;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        synchronized (this) {
            Object object3;
            if (object.equals(this.H)) {
                return;
            }
            View[] viewArray = object.iterator();
            while (viewArray.hasNext()) {
                object3 = (bml)viewArray.next();
                if (((bml)object3).k == bmi.b) {
                    object2.add(object3);
                    ((bml)object3).b(this.M);
                    continue;
                }
                arrayList.add((bml)object3);
            }
            this.H = viewArray = new ArrayList(object);
            this.e = object2;
            this.I.clear();
            this.a.removeAllViews();
            if (!object2.isEmpty()) {
                arrayList.add(this.B);
                this.b();
            }
            viewArray = new View[arrayList.size()];
            this.h = viewArray;
            while (true) {
                if (n2 >= arrayList.size()) {
                    // MONITOREXIT @DISABLED, blocks:[4, 7, 9] lbl33 : MonitorExitStatement: MONITOREXIT : this
                    this.c();
                    return;
                }
                object2 = (bml)arrayList.get(n2);
                object = new bmn((bml)object2, this.a);
                this.I.add(object);
                object2 = new bnt(this, viewArray, n2, atomicInteger);
                object3 = new ayn(((bmn)object).c.getContext());
                ViewGroup viewGroup = ((bmn)object).c;
                bmm bmm2 = new bmm((bmn)object, (Consumer)object2);
                Object object4 = ((ayn)object3).a;
                object = object2 = (ol)((uo)((om)((ayn)object3).c).c).a();
                if (object2 == null) {
                    object = new ol();
                }
                ((ol)object).a = (LayoutInflater)object4;
                ((ol)object).b = (Handler)((ayn)object3).d;
                ((ol)object).d = 2131624020;
                ((ol)object).c = viewGroup;
                ((ol)object).g = bmm2;
                ((ol)object).f = null;
                object2 = ((ayn)object3).c;
                try {
                    ((om)object2).b.put(object);
                    ++n2;
                }
                catch (InterruptedException interruptedException) {
                    object2 = new RuntimeException("Failed to enqueue async inflate request", interruptedException);
                    throw object2;
                }
            }
        }
    }

    @Override
    public final void setNavButtonMode(bmp bmp2) {
        if (bmp2 != this.F) {
            this.F = bmp2;
            this.c();
        }
    }

    @Override
    public final void setNavButtonMode(bnk enum_) {
        int n2 = enum_.ordinal();
        enum_ = n2 != 0 ? (n2 != 1 ? (n2 != 2 ? bmp.d : bmp.c) : bmp.b) : bmp.a;
        this.setNavButtonMode((bmp)enum_);
    }

    @Override
    public final void setState(bnp bnp2) {
        if (this.D == bnp2 && this.E) {
            return;
        }
        this.D = bnp2;
        this.E = true;
        this.c();
    }

    @Override
    public final void setSubtitle(CharSequence object) {
        this.r = object = new bjh(new bzb(""));
        this.q.a((bjh)object);
        this.c();
    }

    @Override
    public final void setTabs(List list) {
        int n2;
        this.J.clear();
        int n3 = n2 = -1;
        if (list != null) {
            if (list.isEmpty()) {
                n3 = n2;
            } else if (list.size() > 0) {
                n3 = 0;
            } else {
                throw new IllegalArgumentException("Tab position is invalid: 0");
            }
        }
        TabLayout tabLayout = this.t;
        tabLayout.b = list == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(new ArrayList(list));
        tabLayout.c = n3;
        tabLayout.removeAllViews();
        for (n3 = 0; n3 < tabLayout.b.size(); ++n3) {
            tabLayout.addView(LayoutInflater.from((Context)tabLayout.getContext()).inflate(tabLayout.a, (ViewGroup)tabLayout, false));
            tabLayout.a(n3);
        }
        this.c();
    }

    @Override
    public final void setTitle(int n2) {
        this.setTitle(this.b.getString(2132017506));
    }

    @Override
    public final void setTitle(CharSequence object) {
        object = object == null ? new bjh(new bzb("")) : new bjh(new bzb((CharSequence)object));
        this.p = object;
        this.o.a((bjh)object);
        this.c();
    }
}

