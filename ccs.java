/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.os.Message
 */
import android.accounts.Account;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import androidx.wear.ambient.AmbientMode$AmbientController;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;

public class ccs {
    public final Context b;
    public final String c;
    public final cco d;
    public final cdj e;
    public final Looper f;
    public final int g;
    public final ccv h;
    protected final cea i;
    public final bzo j;
    public final bxt k;

    public ccs(Context context) {
        this(context, chs.a, cco.a, ccr.a);
        cmj.b(context.getApplicationContext());
    }

    public ccs(Context object, Activity object2, bxt object3, cco object4, ccr ccr2) {
        Object object5;
        block15: {
            block18: {
                block21: {
                    block14: {
                        block20: {
                            block16: {
                                block19: {
                                    block13: {
                                        block17: {
                                            a.s(object, "Null context is not permitted.");
                                            a.s(ccr2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
                                            Context context = object.getApplicationContext();
                                            a.s(context, "The provided context did not have an application context.");
                                            this.b = context;
                                            int n2 = Build.VERSION.SDK_INT;
                                            bzo bzo2 = null;
                                            object5 = n2 >= 30 && object != null && Build.VERSION.SDK_INT >= 30 ? sk$$ExternalSyntheticApiModelOutline1.m((Context)object) : null;
                                            this.c = object5;
                                            bzo bzo3 = bzo2;
                                            if (Build.VERSION.SDK_INT >= 31) {
                                                bzo3 = bzo2;
                                                if (object != null) {
                                                    bzo3 = new bzo(ut$$ExternalSyntheticApiModelOutline0.m((Context)object), null);
                                                }
                                            }
                                            this.j = bzo3;
                                            this.k = object3;
                                            this.d = object4;
                                            this.f = ccr2.b;
                                            this.e = object4 = new cdj((bxt)object3, (cco)object4, (String)object5);
                                            this.h = new cdu(this);
                                            this.i = object5 = cea.c(context);
                                            this.g = ((cea)object5).h.getAndIncrement();
                                            object = ccr2.c;
                                            if (object2 == null || object2 instanceof GoogleApiActivity || Looper.myLooper() != Looper.getMainLooper()) break block15;
                                            if (!(object2 instanceof bh)) break block16;
                                            object3 = (bh)object2;
                                            object = (WeakReference)ceq.a.get(object3);
                                            if (object == null) break block17;
                                            object = object2 = (ceq)((Reference)object).get();
                                            if (object2 != null) break block18;
                                        }
                                        try {
                                            object2 = (ceq)((bh)object3).bb().e("SLifecycleFragmentImpl");
                                            if (object2 == null) break block13;
                                            object = object2;
                                        }
                                        catch (ClassCastException classCastException) {
                                            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException);
                                        }
                                        if (!((be)object2).r) break block19;
                                    }
                                    object = new ceq();
                                    object2 = new y(((bh)object3).bb());
                                    ((ce)object2).m((be)object, "SLifecycleFragmentImpl");
                                    ((ce)object2).i();
                                }
                                ceq.a.put(object3, new WeakReference<Object>(object));
                                break block18;
                            }
                            object = (WeakReference)cee.a.get(object2);
                            if (object == null) break block20;
                            object = object3 = (cee)((Reference)object).get();
                            if (object3 != null) break block18;
                        }
                        try {
                            object3 = (cee)object2.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                            if (object3 == null) break block14;
                            object = object3;
                        }
                        catch (ClassCastException classCastException) {
                            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException);
                        }
                        if (!object3.isRemoving()) break block21;
                    }
                    object = new cee();
                    object2.getFragmentManager().beginTransaction().add((Fragment)object, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                cee.a.put(object2, new WeakReference<Object>(object));
            }
            object2 = object3 = (cdt)object.c(cdt.class);
            if (object3 == null) {
                object2 = new cdt((ced)object, (cea)object5);
            }
            ((cdt)object2).e.add(object4);
            ((cea)object5).f((cdt)object2);
        }
        object = ((cea)object5).m;
        object.sendMessage(object.obtainMessage(7, (Object)this));
    }

    public ccs(Context context, bxt bxt2, cco cco2, ccr ccr2) {
        this(context, null, bxt2, cco2, ccr2);
    }

    private final ckz a(int n2, ces ces2) {
        bzo bzo2 = new bzo(null);
        int n3 = ces2.c;
        cea cea2 = this.i;
        cea2.i(bzo2, n3, this);
        cdg cdg2 = new cdg(n2, ces2, bzo2);
        ces2 = cea2.m;
        ces2.sendMessage(ces2.obtainMessage(4, new dvy(cdg2, cea2.i.get(), this)));
        return (ckz)bzo2.a;
    }

    public final cei b(Object object, String string) {
        return kl.ay(object, this.f, string);
    }

    public final cfd c() {
        cfd cfd2 = new cfd();
        Object object = this.d;
        boolean bl2 = object instanceof ccm;
        Object object2 = null;
        if (bl2 && (object = ((ccm)object).a()) != null) {
            object = ((GoogleSignInAccount)object).c;
            if (object != null) {
                object2 = new Account((String)object, "com.google");
            }
        } else {
            object = this.d;
            if (object instanceof ccl) {
                object2 = ((ccl)object).a();
            }
        }
        cfd2.a = object2;
        object2 = this.d;
        object2 = object2 instanceof ccm ? ((object2 = ((ccm)object2).a()) == null ? Collections.emptySet() : object2.a()) : Collections.emptySet();
        if (cfd2.b == null) {
            cfd2.b = new ov();
        }
        ((ov)cfd2.b).addAll((Collection)object2);
        cfd2.d = this.b.getClass().getName();
        cfd2.c = this.b.getPackageName();
        return cfd2;
    }

    public final ckz d(ces ces2) {
        return this.a(0, ces2);
    }

    public final void e(int n2, cdl object) {
        boolean bl2;
        boolean bl3 = ((BasePendingResult)object).d;
        boolean bl4 = bl2 = true;
        if (!bl3) {
            bl4 = (Boolean)BasePendingResult.b.get() != false ? bl2 : false;
        }
        ((BasePendingResult)object).d = bl4;
        cea cea2 = this.i;
        object = new dvy(new cde(n2, (cdl)object), cea2.i.get(), this);
        object = cea2.m.obtainMessage(4, object);
        cea2.m.sendMessage((Message)object);
    }

    public final void f(cdl cdl2) {
        this.e(2, cdl2);
    }

    public final void g(ces ces2) {
        this.a(2, ces2);
    }

    public final ckz h(bmu object) {
        a.s(((cem)((bmu)object).c).a(), "Listener has already been released.");
        bzo bzo2 = new bzo(null);
        cem cem2 = (cem)((bmu)object).c;
        int n2 = cem2.d;
        cea cea2 = this.i;
        cea2.i(bzo2, n2, this);
        object = new cdf(new bmu(cem2, (AmbientMode$AmbientController)((bmu)object).b, (Runnable)((bmu)object).a, null), bzo2);
        cem2 = cea2.m;
        cem2.sendMessage(cem2.obtainMessage(8, new dvy((cdi)object, cea2.i.get(), this)));
        return (ckz)bzo2.a;
    }
}

