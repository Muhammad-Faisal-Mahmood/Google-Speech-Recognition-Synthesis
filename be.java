/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 */
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class be
implements ComponentCallbacks,
View.OnCreateContextMenuListener,
abe,
aco,
aav,
awh {
    static final Object e = new Object();
    public by A;
    public bm B;
    public by C;
    public be D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    boolean L;
    boolean M = true;
    public boolean N;
    public ViewGroup O;
    public View P;
    public boolean Q;
    public boolean R = true;
    public ba S;
    Handler T;
    Runnable U;
    public boolean V;
    public LayoutInflater W;
    public boolean X;
    public aba Y;
    public abg Z;
    private int a;
    public cn aa;
    public abo ab;
    ack ac;
    awg ad;
    public final AtomicInteger ae;
    public final ArrayList af;
    private final bc b;
    public int f = -1;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Boolean j;
    public String k = UUID.randomUUID().toString();
    public Bundle l;
    public be m;
    public String mPreviousWho;
    public String n = null;
    public int o;
    public Boolean p = null;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public be() {
        this.C = new by();
        this.U = new ak(this, 5, null);
        this.Y = aba.e;
        this.ab = new abo();
        this.ae = new AtomicInteger();
        this.af = new ArrayList();
        this.b = new av(this);
        this.f();
    }

    public be(int n2) {
        this();
        this.a = n2;
    }

    private final void aU(bc bc2) {
        if (this.f >= 0) {
            bc2.a();
            return;
        }
        this.af.add(bc2);
    }

    private final int aV() {
        aba aba2 = this.Y;
        if (aba2 != aba.b && this.D != null) {
            return Math.min(aba2.ordinal(), this.D.aV());
        }
        return aba2.ordinal();
    }

    private final be c(boolean bl2) {
        Object object;
        Object object2;
        if (bl2) {
            object2 = new aac(this);
            zy.d((aai)object2);
            object = zy.b(this);
            if (((zx)object).b.contains((Object)zw.h) && zy.e((zx)object, this.getClass(), object2.getClass())) {
                zy.c((zx)object, (aai)object2);
            }
        }
        if ((object2 = this.m) != null) {
            return object2;
        }
        object2 = this.A;
        if (object2 != null && (object = this.n) != null) {
            return ((by)object2).c((String)object);
        }
        return null;
    }

    private final nm e(nu nu2, oj oj2, nl nl2) {
        if (this.f <= 1) {
            this.aU(new az(this, oj2, new AtomicReference(), nu2, nl2));
            return new au();
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private final void f() {
        this.Z = new abg(this);
        this.ad = xm.g(this);
        this.ac = null;
        if (!this.af.contains(this.b)) {
            this.aU(this.b);
        }
    }

    @Deprecated
    public static be instantiate(Context context, String string) {
        return be.instantiate(context, string, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Deprecated
    public static be instantiate(Context object, String string, Bundle bundle) {
        try {
            object = object.getClassLoader();
            int n2 = bl.a;
            try {
                object = bl.a((ClassLoader)object, string);
            }
            catch (ClassCastException classCastException) {
                object = new StringBuilder("Unable to instantiate fragment ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(": make sure class is a valid subclass of Fragment");
                bb bb2 = new bb(((StringBuilder)object).toString(), classCastException);
                throw bb2;
            }
            catch (ClassNotFoundException classNotFoundException) {
                object = new StringBuilder("Unable to instantiate fragment ");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(": make sure class name exists");
                bb bb3 = new bb(((StringBuilder)object).toString(), classNotFoundException);
                throw bb3;
            }
            object = (be)((Class)object).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(object.getClass().getClassLoader());
                ((be)object).setArguments(bundle);
            }
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new bb(a.aj(string, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), invocationTargetException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new bb(a.aj(string, "Unable to instantiate fragment ", ": could not find Fragment constructor"), noSuchMethodException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new bb(a.aj(string, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), illegalAccessException);
        }
        catch (InstantiationException instantiationException) {
            throw new bb(a.aj(string, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), instantiationException);
        }
    }

    final kl A() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return null;
        }
        return ba2.u;
    }

    public bj bd() {
        return new aw(this);
    }

    public void d(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C.noteStateNotSaved();
        this.y = true;
        this.aa = new cn(this, this.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging(), new ak(this, 4));
        layoutInflater = this.onCreateView(layoutInflater, viewGroup, bundle);
        this.P = layoutInflater;
        if (layoutInflater != null) {
            this.aa.b();
            if (by.S(3)) {
                Objects.toString(this.P);
                ((Object)this).toString();
            }
            we.f(this.P, this.aa);
            wf.d(this.P, this.aa);
            xm.f(this.P, this.aa);
            this.ab.g(this.aa);
            return;
        }
        if (this.aa.a == null) {
            this.aa = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object;
        printWriter.print(string);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(string);
        printWriter.print("mState=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.z);
        printWriter.print(string);
        printWriter.print("mAdded=");
        printWriter.print(this.q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.u);
        printWriter.print(" mInLayout=");
        printWriter.println(this.v);
        printWriter.print(string);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.M);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.L);
        printWriter.print(string);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.R);
        if (this.A != null) {
            printWriter.print(string);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A);
        }
        if (this.B != null) {
            printWriter.print(string);
            printWriter.print("mHost=");
            printWriter.println(this.B);
        }
        if (this.D != null) {
            printWriter.print(string);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.l != null) {
            printWriter.print(string);
            printWriter.print("mArguments=");
            printWriter.println(this.l);
        }
        if (this.g != null) {
            printWriter.print(string);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.g);
        }
        if (this.h != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.i);
        }
        if ((object = this.c(false)) != null) {
            printWriter.print(string);
            printWriter.print("mTarget=");
            printWriter.print(object);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.o);
        }
        printWriter.print(string);
        printWriter.print("mPopDirection=");
        printWriter.println(this.x());
        if (this.g() != 0) {
            printWriter.print(string);
            printWriter.print("getEnterAnim=");
            printWriter.println(this.g());
        }
        if (this.h() != 0) {
            printWriter.print(string);
            printWriter.print("getExitAnim=");
            printWriter.println(this.h());
        }
        if (this.i() != 0) {
            printWriter.print(string);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(this.i());
        }
        if (this.j() != 0) {
            printWriter.print(string);
            printWriter.print("getPopExitAnim=");
            printWriter.println(this.j());
        }
        if (this.O != null) {
            printWriter.print(string);
            printWriter.print("mContainer=");
            printWriter.println(this.O);
        }
        if (this.P != null) {
            printWriter.print(string);
            printWriter.print("mView=");
            printWriter.println(this.P);
        }
        if (this.getContext() != null) {
            acv.a(this).c(string, printWriter);
        }
        printWriter.print(string);
        object = new StringBuilder("Child ");
        ((StringBuilder)object).append(this.C);
        ((StringBuilder)object).append(":");
        printWriter.println(((StringBuilder)object).toString());
        this.C.C(String.valueOf(string).concat("  "), fileDescriptor, printWriter, stringArray);
    }

    public final int g() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return 0;
        }
        return ba2.b;
    }

    public final bh getActivity() {
        bm bm2 = this.B;
        if (bm2 == null) {
            return null;
        }
        return (bh)bm2.b;
    }

    public final boolean getAllowEnterTransitionOverlap() {
        Object object = this.S;
        if (object != null && (object = ((ba)object).p) != null) {
            return (Boolean)object;
        }
        return true;
    }

    public final boolean getAllowReturnTransitionOverlap() {
        Object object = this.S;
        if (object != null && (object = ((ba)object).o) != null) {
            return (Boolean)object;
        }
        return true;
    }

    public final Bundle getArguments() {
        return this.l;
    }

    public final by getChildFragmentManager() {
        if (this.B != null) {
            return this.C;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        bm bm2 = this.B;
        if (bm2 == null) {
            return null;
        }
        return bm2.c;
    }

    @Override
    public acr getDefaultViewModelCreationExtras() {
        Context context;
        block5: {
            context = this.requireContext().getApplicationContext();
            while (context instanceof ContextWrapper) {
                if (context instanceof Application) {
                    context = (Application)context;
                    break block5;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            context = null;
        }
        if (context == null && by.S(3)) {
            Objects.toString(this.requireContext().getApplicationContext());
        }
        acs acs2 = new acs();
        if (context != null) {
            acs2.b(acj.b, context);
        }
        acs2.b(acb.a, this);
        acs2.b(acb.b, this);
        context = this.l;
        if (context != null) {
            acs2.b(acb.c, context);
        }
        return acs2;
    }

    @Override
    public ack getDefaultViewModelProviderFactory() {
        if (this.A != null) {
            if (this.ac == null) {
                Context context;
                block5: {
                    context = this.requireContext().getApplicationContext();
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Application) {
                            context = (Application)context;
                            break block5;
                        }
                        context = ((ContextWrapper)context).getBaseContext();
                    }
                    context = null;
                }
                if (context == null && by.S(3)) {
                    Objects.toString(this.requireContext().getApplicationContext());
                }
                this.ac = new ace((Application)context, this, this.l);
            }
            return this.ac;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final Object getEnterTransition() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return null;
        }
        return ba2.i;
    }

    public final Object getExitTransition() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return null;
        }
        return ba2.k;
    }

    @Deprecated
    public final by getFragmentManager() {
        return this.A;
    }

    public final Object getHost() {
        bm bm2 = this.B;
        if (bm2 == null) {
            return null;
        }
        return bm2.e();
    }

    public final int getId() {
        return this.E;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = layoutInflater = this.W;
        if (layoutInflater == null) {
            layoutInflater2 = this.l(null);
        }
        return layoutInflater2;
    }

    @Deprecated
    public final LayoutInflater getLayoutInflater(Bundle object) {
        object = this.B;
        if (object != null) {
            object = ((bm)object).c();
            object.setFactory2((LayoutInflater.Factory2)this.C.c);
            return object;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override
    public abb getLifecycle() {
        return this.Z;
    }

    @Deprecated
    public final acv getLoaderManager() {
        return acv.a(this);
    }

    public final be getParentFragment() {
        return this.D;
    }

    public final by getParentFragmentManager() {
        by by2 = this.A;
        if (by2 != null) {
            return by2;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final Object getReenterTransition() {
        Object object;
        Object object2 = this.S;
        if (object2 == null) {
            return null;
        }
        object2 = object = ((ba)object2).l;
        if (object == e) {
            object2 = this.getExitTransition();
        }
        return object2;
    }

    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        aaa aaa2 = new aaa(this);
        zy.d(aaa2);
        zx zx2 = zy.b(this);
        if (zx2.b.contains((Object)zw.f) && zy.e(zx2, this.getClass(), aaa2.getClass())) {
            zy.c(zx2, aaa2);
        }
        return this.J;
    }

    public final Object getReturnTransition() {
        Object object;
        Object object2 = this.S;
        if (object2 == null) {
            return null;
        }
        object2 = object = ((ba)object2).j;
        if (object == e) {
            object2 = this.getEnterTransition();
        }
        return object2;
    }

    @Override
    public final awf getSavedStateRegistry() {
        return (awf)this.ad.b;
    }

    public final Object getSharedElementEnterTransition() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return null;
        }
        return ba2.m;
    }

    public final Object getSharedElementReturnTransition() {
        Object object;
        Object object2 = this.S;
        if (object2 == null) {
            return null;
        }
        object2 = object = ((ba)object2).n;
        if (object == e) {
            object2 = this.getSharedElementEnterTransition();
        }
        return object2;
    }

    public final String getString(int n2) {
        return this.getResources().getString(n2);
    }

    public final String getString(int n2, Object ... objectArray) {
        return this.getResources().getString(n2, objectArray);
    }

    public final String getTag() {
        return this.G;
    }

    @Deprecated
    public final be getTargetFragment() {
        return this.c(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        aab aab2 = new aab(this);
        zy.d(aab2);
        zx zx2 = zy.b(this);
        if (zx2.b.contains((Object)zw.h) && zy.e(zx2, this.getClass(), aab2.getClass())) {
            zy.c(zx2, aab2);
        }
        return this.o;
    }

    public final CharSequence getText(int n2) {
        return this.getResources().getText(n2);
    }

    @Deprecated
    public final boolean getUserVisibleHint() {
        return this.R;
    }

    public final View getView() {
        return this.P;
    }

    public final abe getViewLifecycleOwner() {
        cn cn2 = this.aa;
        if (cn2 != null) {
            return cn2;
        }
        throw new IllegalStateException(a.ak(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final abn getViewLifecycleOwnerLiveData() {
        return this.ab;
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        if (this.A != null) {
            if (this.aV() != aba.b.ordinal()) {
                bzb bzb2;
                ca ca2 = this.A.x;
                bzb bzb3 = bzb2 = (bzb)ca2.d.get(this.k);
                if (bzb2 == null) {
                    bzb3 = new bzb(null, null);
                    ca2.d.put(this.k, bzb3);
                }
                return bzb3;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final int h() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return 0;
        }
        return ba2.c;
    }

    public final boolean hasOptionsMenu() {
        return this.L;
    }

    public final int i() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return 0;
        }
        return ba2.d;
    }

    public final boolean isAdded() {
        return this.B != null && this.q;
    }

    public final boolean isDetached() {
        return this.I;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isHidden() {
        boolean bl2;
        boolean bl3 = this.H;
        boolean bl4 = bl2 = true;
        if (bl3) return bl4;
        if (this.A == null) return false;
        be be2 = this.D;
        if (be2 == null) return false;
        if (!be2.isHidden()) return false;
        return bl2;
    }

    public final boolean isInLayout() {
        return this.v;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isMenuVisible() {
        boolean bl2;
        boolean bl3 = this.M;
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        if (this.A == null) return true;
        if (by.ab(this.D)) return true;
        return bl2;
    }

    public final boolean isRemoving() {
        return this.r;
    }

    public final boolean isResumed() {
        return this.f >= 7;
    }

    public final boolean isStateSaved() {
        by by2 = this.A;
        if (by2 == null) {
            return false;
        }
        return by2.V();
    }

    public final boolean isVisible() {
        View view;
        return this.isAdded() && !this.isHidden() && (view = this.P) != null && view.getWindowToken() != null && this.P.getVisibility() == 0;
    }

    public final int j() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return 0;
        }
        return ba2.e;
    }

    public final ba k() {
        if (this.S == null) {
            this.S = new ba();
        }
        return this.S;
    }

    public final LayoutInflater l(Bundle bundle) {
        bundle = this.onGetLayoutInflater(bundle);
        this.W = bundle;
        return bundle;
    }

    final ArrayList m() {
        Object object = this.S;
        if (object != null && (object = ((ba)object).g) != null) {
            return object;
        }
        return new ArrayList();
    }

    final ArrayList n() {
        Object object = this.S;
        if (object != null && (object = ((ba)object).h) != null) {
            return object;
        }
        return new ArrayList();
    }

    final void o(boolean bl2) {
        ViewGroup viewGroup;
        Object object = this.S;
        if (object != null) {
            ((ba)object).s = false;
        }
        if (this.P != null && (viewGroup = this.O) != null && (object = this.A) != null) {
            object = cz.c(viewGroup, (by)object);
            ((cz)object).h();
            if (bl2) {
                this.B.d.post((Runnable)new ak(object, 7, null));
            } else {
                ((cz)object).f();
            }
            object = this.T;
            if (object != null) {
                object.removeCallbacks(this.U);
                this.T = null;
            }
        }
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.N = true;
    }

    @Deprecated
    public void onActivityResult(int n2, int n3, Intent intent) {
        if (by.S(2)) {
            ((Object)this).toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.N = true;
    }

    public void onAttach(Context object) {
        this.N = true;
        object = this.B;
        object = object == null ? null : object.b;
        if (object != null) {
            this.N = false;
            this.onAttach((Activity)object);
        }
    }

    @Deprecated
    public final void onAttachFragment(be be2) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.N = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle object) {
        this.N = true;
        this.r();
        object = this.C;
        if (((by)object).k > 0) {
            return;
        }
        ((by)object).p();
    }

    public Animation onCreateAnimation(int n2, boolean bl2, int n3) {
        return null;
    }

    public Animator onCreateAnimator(int n2, boolean bl2, int n3) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n2 = this.a;
        if (n2 != 0) {
            return layoutInflater.inflate(n2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.N = true;
    }

    @Deprecated
    public final void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.N = true;
    }

    public void onDetach() {
        this.N = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return this.getLayoutInflater(bundle);
    }

    public final void onHiddenChanged(boolean bl2) {
    }

    @Deprecated
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.N = true;
    }

    public void onLowMemory() {
        this.N = true;
    }

    public final void onMultiWindowModeChanged(boolean bl2) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.N = true;
    }

    public final void onPictureInPictureModeChanged(boolean bl2) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public final void onPrimaryNavigationFragmentChanged(boolean bl2) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
    }

    public void onResume() {
        this.N = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.N = true;
    }

    public void onStop() {
        this.N = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.N = true;
    }

    public final void p() {
        this.f();
        this.mPreviousWho = this.k;
        this.k = UUID.randomUUID().toString();
        this.q = false;
        this.r = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.z = 0;
        this.A = null;
        this.C = new by();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    public final void postponeEnterTransition() {
        this.k().s = true;
    }

    public final void postponeEnterTransition(long l2, TimeUnit timeUnit) {
        this.k().s = true;
        Object object = this.T;
        if (object != null) {
            object.removeCallbacks(this.U);
        }
        this.T = (object = this.A) != null ? object.l.d : new Handler(Looper.getMainLooper());
        this.T.removeCallbacks(this.U);
        this.T.postDelayed(this.U, timeUnit.toMillis(l2));
    }

    public final void q() {
        Object object = this.g;
        object = object != null ? object.getBundle("savedInstanceState") : null;
        this.onViewCreated(this.P, (Bundle)object);
        this.C.A(2);
    }

    public final void r() {
        Bundle bundle = this.g;
        if (bundle != null && (bundle = bundle.getBundle("childFragmentManager")) != null) {
            this.C.J((Parcelable)bundle);
            this.C.p();
        }
    }

    public final nm registerForActivityResult(nu nu2, nl nl2) {
        return this.e(nu2, new ay(this, 1), nl2);
    }

    public final nm registerForActivityResult(nu nu2, nq nq2, nl nl2) {
        return this.e(nu2, new ay(nq2, 0), nl2);
    }

    public final void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)this);
    }

    @Deprecated
    public final void requestPermissions(String[] stringArray, int n2) {
        if (this.B != null) {
            by by2 = this.getParentFragmentManager();
            if (by2.r != null) {
                bu bu2 = new bu(this.k, n2);
                by2.s.addLast(bu2);
                by2.r.b(stringArray);
                return;
            }
            jse.e(stringArray, "permissions");
            return;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to Activity"));
    }

    public final bh requireActivity() {
        bh bh2 = this.getActivity();
        if (bh2 != null) {
            return bh2;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.l;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = this.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final by requireFragmentManager() {
        return this.getParentFragmentManager();
    }

    public final Object requireHost() {
        Object object = this.getHost();
        if (object != null) {
            return object;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to a host."));
    }

    public final be requireParentFragment() {
        Object object = this.D;
        if (object == null) {
            if (this.getContext() == null) {
                throw new IllegalStateException(a.ak(this, "Fragment ", " is not attached to any Fragment or host"));
            }
            object = new StringBuilder("Fragment ");
            ((StringBuilder)object).append(this);
            ((StringBuilder)object).append(" is not a child Fragment, it is directly attached to ");
            ((StringBuilder)object).append(this.getContext());
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        return object;
    }

    public final View requireView() {
        View view = this.P;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void s(int n2, int n3, int n4, int n5) {
        int n6 = n2;
        int n7 = n3;
        int n8 = n4;
        if (this.S == null) {
            n6 = n2;
            n7 = n3;
            n8 = n4;
            if (n2 == 0) {
                n6 = n2 = 0;
                n7 = n3;
                n8 = n4;
                if (n3 == 0) {
                    if (n4 == 0) {
                        if (n5 == 0) return;
                        n7 = 0;
                        n8 = 0;
                        n6 = n2;
                    } else {
                        n7 = 0;
                        n8 = n4;
                        n6 = n2;
                    }
                }
            }
        }
        this.k().b = n6;
        this.k().c = n7;
        this.k().d = n8;
        this.k().e = n5;
    }

    public final void setAllowEnterTransitionOverlap(boolean bl2) {
        this.k().p = bl2;
    }

    public final void setAllowReturnTransitionOverlap(boolean bl2) {
        this.k().o = bl2;
    }

    public void setArguments(Bundle bundle) {
        by by2 = this.A;
        if (by2 != null && by2.V()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.l = bundle;
    }

    public final void setEnterSharedElementCallback$ar$class_merging$ar$class_merging(kl kl2) {
        this.k().t = kl2;
    }

    public void setEnterTransition(Object object) {
        this.k().i = object;
    }

    public final void setExitSharedElementCallback$ar$class_merging$ar$class_merging(kl kl2) {
        this.k().u = kl2;
    }

    public void setExitTransition(Object object) {
        this.k().k = object;
    }

    @Deprecated
    public final void setHasOptionsMenu(boolean bl2) {
        if (this.L != bl2) {
            this.L = bl2;
            if (this.isAdded() && !this.isHidden()) {
                this.B.j();
            }
        }
    }

    public final void setInitialSavedState(bd bd2) {
        if (this.A == null) {
            Bundle bundle;
            Bundle bundle2 = bundle = null;
            if (bd2 != null && (bundle2 = bd2.a) == null) {
                bundle2 = bundle;
            }
            this.g = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final void setMenuVisibility(boolean bl2) {
        if (this.M != bl2) {
            this.M = bl2;
            if (this.L && this.isAdded() && !this.isHidden()) {
                this.B.j();
            }
        }
    }

    public void setReenterTransition(Object object) {
        this.k().l = object;
    }

    @Deprecated
    public void setRetainInstance(boolean bl2) {
        Object object = new aae(this);
        zy.d((aai)object);
        zx zx2 = zy.b(this);
        if (zx2.b.contains((Object)zw.f) && zy.e(zx2, this.getClass(), object.getClass())) {
            zy.c(zx2, (aai)object);
        }
        this.J = bl2;
        object = this.A;
        if (object != null) {
            if (bl2) {
                ((by)object).x.a(this);
                return;
            }
            ((by)object).x.e(this);
            return;
        }
        this.K = true;
    }

    public void setReturnTransition(Object object) {
        this.k().j = object;
    }

    public void setSharedElementEnterTransition(Object object) {
        this.k().m = object;
    }

    public void setSharedElementReturnTransition(Object object) {
        this.k().n = object;
    }

    /*
     * Unable to fully structure code
     */
    @Deprecated
    public final void setTargetFragment(be var1_1, int var2_2) {
        if (var1_1 != null) {
            var3_3 = new aaf(this, var1_1, var2_2);
            zy.d((aai)var3_3);
            var4_4 = zy.b(this);
            if (var4_4.b.contains((Object)zw.h) && zy.e((zx)var4_4, this.getClass(), var3_3.getClass())) {
                zy.c((zx)var4_4, (aai)var3_3);
            }
        }
        var4_4 = this.A;
        var3_3 = var1_1 != null ? var1_1.A : null;
        if (var4_4 != null && var3_3 != null && var4_4 != var3_3) {
            throw new IllegalArgumentException(a.ak(var1_1, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        var3_3 = var1_1;
        while (var3_3 != null) {
            if (!var3_3.equals(this)) {
                var3_3 = super.c(false);
                continue;
            }
            var3_3 = new StringBuilder("Setting ");
            var3_3.append(var1_1);
            var3_3.append(" as the target of ");
            var3_3.append(this);
            var3_3.append(" would create a target cycle");
            throw new IllegalArgumentException(var3_3.toString());
        }
        if (var1_1 == null) {
            this.n = null;
lbl28:
            // 2 sources

            while (true) {
                this.m = null;
                break;
            }
        } else {
            if (this.A != null && var1_1.A != null) {
                this.n = var1_1.k;
                ** continue;
            }
            this.n = null;
            this.m = var1_1;
        }
        this.o = var2_2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean bl2) {
        boolean bl3;
        Object object = new aag(this, bl2);
        zy.d((aai)object);
        zx zx2 = zy.b(this);
        if (zx2.b.contains((Object)zw.g) && zy.e(zx2, this.getClass(), object.getClass())) {
            zy.c(zx2, (aai)object);
        }
        if (!this.R && bl2 && this.f < 5 && (object = this.A) != null && this.isAdded() && this.X) {
            ((by)object).ai(((by)object).ah(this));
        }
        this.R = bl2;
        int n2 = this.f;
        boolean bl4 = bl3 = false;
        if (n2 < 5) {
            bl4 = bl3;
            if (!bl2) {
                bl4 = true;
            }
        }
        this.Q = bl4;
        if (this.g != null) {
            this.j = bl2;
        }
    }

    public final boolean shouldShowRequestPermissionRationale(String string) {
        bm bm2 = this.B;
        if (bm2 != null) {
            return bm2.o(string);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        this.startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        bm bm2 = this.B;
        if (bm2 != null) {
            bm2.t(intent, -1, bundle);
            return;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to Activity"));
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int n2) {
        if (this.B != null) {
            by by2 = this.getParentFragmentManager();
            if (by2.p != null) {
                bu bu2 = new bu(this.k, n2);
                by2.s.addLast(bu2);
                by2.p.b(intent);
                return;
            }
            by2.l.t(intent, n2, null);
            return;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to Activity"));
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int n2, Bundle bundle) {
        if (this.B != null) {
            by by2 = this.getParentFragmentManager();
            if (by2.p != null) {
                bu bu2 = new bu(this.k, n2);
                by2.s.addLast(bu2);
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                by2.p.b(intent);
                return;
            }
            by2.l.t(intent, n2, bundle);
            return;
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to Activity"));
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender object, int n2, Intent object2, int n3, int n4, int n5, Bundle bundle) {
        if (this.B != null) {
            if (by.S(2)) {
                ((Object)this).toString();
                Objects.toString(object);
                Objects.toString(object2);
                Objects.toString(bundle);
            }
            Object object3 = this.getParentFragmentManager();
            if (((by)object3).q != null) {
                if (bundle != null) {
                    if (object2 == null) {
                        object2 = new Intent();
                        object2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (by.S(2)) {
                        Objects.toString(bundle);
                        Objects.toString(object2);
                        ((Object)this).toString();
                    }
                    object2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                object = new ns((IntentSender)object);
                ((ns)object).a = object2;
                ((ns)object).b(n4, n3);
                object2 = ((ns)object).a();
                object = new bu(this.k, n2);
                ((by)object3).s.addLast(object);
                if (by.S(2)) {
                    ((Object)this).toString();
                }
                ((by)object3).q.b(object2);
                return;
            }
            object3 = ((by)object3).l;
            jse.e(object, "intent");
            if (n2 == -1) {
                object3 = ((bm)object3).b;
                if (object3 != null) {
                    object3.startIntentSenderForResult((IntentSender)object, -1, object2, n3, n4, n5, bundle);
                    return;
                }
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(a.ak(this, "Fragment ", " not attached to Activity"));
    }

    public final void startPostponedEnterTransition() {
        if (this.S != null && this.k().s) {
            if (this.B == null) {
                this.k().s = false;
                return;
            }
            if (Looper.myLooper() != this.B.d.getLooper()) {
                this.B.d.postAtFrontOfQueue((Runnable)new ak(this, 6, null));
                return;
            }
            this.o(true);
        }
    }

    public final void t(View view) {
        this.k().r = view;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("} (");
        stringBuilder.append(this.k);
        if (this.E != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.G);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    final void u(int n2) {
        if (this.S == null && n2 == 0) {
            return;
        }
        this.k();
        this.S.f = n2;
    }

    public final void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    final void v(boolean bl2) {
        if (this.S == null) {
            return;
        }
        this.k().a = bl2;
    }

    final void w(ArrayList arrayList, ArrayList arrayList2) {
        this.k();
        ba ba2 = this.S;
        ba2.g = arrayList;
        ba2.h = arrayList2;
    }

    final boolean x() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return false;
        }
        return ba2.a;
    }

    public final boolean y() {
        return this.z > 0;
    }

    final kl z() {
        ba ba2 = this.S;
        if (ba2 == null) {
            return null;
        }
        return ba2.t;
    }
}

