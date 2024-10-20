/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class at
extends be
implements DialogInterface.OnCancelListener,
DialogInterface.OnDismissListener {
    public final DialogInterface.OnDismissListener a;
    private int ak = 0;
    private final abp ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    public boolean b = true;
    public Dialog c;
    public boolean d = false;
    private Handler nD;
    private final Runnable nE = new ak(this, 3, null);
    private final DialogInterface.OnCancelListener nF = new ap(this);
    private int nG = 0;
    private boolean nH = true;
    private int nI = -1;
    private boolean nJ;

    public at() {
        this.a = new aq(this);
        this.ao = new ar(this);
    }

    private final void B(boolean bl2, boolean bl3) {
        if (this.aq) {
            return;
        }
        this.aq = true;
        this.ar = false;
        Object object = this.c;
        if (object != null) {
            object.setOnDismissListener(null);
            this.c.dismiss();
            if (!bl3) {
                if (Looper.myLooper() == this.nD.getLooper()) {
                    this.onDismiss((DialogInterface)this.c);
                } else {
                    this.nD.post(this.nE);
                }
            }
        }
        this.ap = true;
        if (this.nI >= 0) {
            object = this.getParentFragmentManager();
            int n2 = this.nI;
            if (n2 >= 0) {
                ((by)object).E(new bw((by)object, n2), bl2);
                this.nI = -1;
                return;
            }
            throw new IllegalArgumentException(a.af(n2, "Bad id: "));
        }
        object = new y(this.getParentFragmentManager());
        ((ce)object).q();
        ((ce)object).j(this);
        if (bl2) {
            ((ce)object).i();
            return;
        }
        ((ce)object).h();
    }

    public Dialog a(Bundle bundle) {
        if (by.S(3)) {
            ((Object)this).toString();
        }
        return new ms(this.requireContext(), this.ak);
    }

    @Override
    public final bj bd() {
        return new as(this, new aw(this));
    }

    public void c() {
        this.B(false, false);
    }

    @Override
    public final void d(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.d(layoutInflater, viewGroup, bundle);
        if (this.P == null && this.c != null && bundle != null && (layoutInflater = bundle.getBundle("android:savedDialogState")) != null) {
            this.c.onRestoreInstanceState((Bundle)layoutInflater);
        }
    }

    public final void e(by object, String string) {
        this.aq = false;
        this.ar = true;
        object = new y((by)object);
        ((ce)object).q();
        ((ce)object).m(this, string);
        ((ce)object).h();
    }

    public final void f(by object, String string) {
        this.aq = false;
        this.ar = true;
        object = new y((by)object);
        ((ce)object).q();
        ((ce)object).m(this, string);
        ((ce)object).b();
    }

    @Override
    public void onAttach(Context object) {
        super.onAttach((Context)object);
        abo abo2 = this.ab;
        abn.a("observeForever");
        Object object2 = this.ao;
        object = new abk(abo2, (abp)object2);
        object2 = (abm)abo2.c.f(object2, object);
        if (!(object2 instanceof abl)) {
            if (object2 == null) {
                ((abm)object).d(true);
            }
            if (!this.ar) {
                this.aq = false;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.nD = new Handler();
        boolean bl2 = this.F == 0;
        this.b = bl2;
        if (bundle != null) {
            this.nG = bundle.getInt("android:style", 0);
            this.ak = bundle.getInt("android:theme", 0);
            this.nH = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.nI = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ap = true;
            dialog.setOnDismissListener(null);
            this.c.dismiss();
            if (!this.aq) {
                this.onDismiss((DialogInterface)this.c);
            }
            this.c = null;
            this.d = false;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (!this.ar && !this.aq) {
            this.aq = true;
        }
        this.ab.f(this.ao);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.ap) {
            if (by.S(3)) {
                ((Object)this).toString();
            }
            this.B(true, true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflater;
        block13: {
            block12: {
                layoutInflater = this.getLayoutInflater(bundle);
                if (!this.b || this.nJ) break block13;
                if (this.d) break block12;
                try {
                    block14: {
                        block16: {
                            block15: {
                                this.nJ = true;
                                bundle = this.a(bundle);
                                this.c = bundle;
                                if (!this.b) break block14;
                                int n2 = this.nG;
                                if (n2 == 1 || n2 == 2) break block15;
                                if (n2 != 3) break block16;
                                Window window = bundle.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            }
                            bundle.requestWindowFeature(1);
                        }
                        if ((bundle = this.getContext()) instanceof Activity) {
                            this.c.setOwnerActivity((Activity)bundle);
                        }
                        this.c.setCancelable(this.nH);
                        this.c.setOnCancelListener(this.nF);
                        this.c.setOnDismissListener(this.a);
                        this.d = true;
                        break block12;
                    }
                    this.c = null;
                }
                finally {
                    this.nJ = false;
                }
            }
            if (by.S(2)) {
                ((Object)this).toString();
            }
            if ((bundle = this.c) == null) return layoutInflater;
            return layoutInflater.cloneInContext(bundle.getContext());
        }
        if (!by.S(2)) return layoutInflater;
        ((Object)this).toString();
        return layoutInflater;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        int n2;
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog = dialog.onSaveInstanceState();
            dialog.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", (Bundle)dialog);
        }
        if ((n2 = this.nG) != 0) {
            bundle.putInt("android:style", n2);
        }
        if ((n2 = this.ak) != 0) {
            bundle.putInt("android:theme", n2);
        }
        if (!this.nH) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        if ((n2 = this.nI) != -1) {
            bundle.putInt("android:backStackId", n2);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ap = false;
            dialog.show();
            dialog = this.c.getWindow().getDecorView();
            we.f((View)dialog, this);
            wf.d((View)dialog, this);
            xm.f((View)dialog, this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (this.c != null && bundle != null && (bundle = bundle.getBundle("android:savedDialogState")) != null) {
            this.c.onRestoreInstanceState(bundle);
        }
    }
}

