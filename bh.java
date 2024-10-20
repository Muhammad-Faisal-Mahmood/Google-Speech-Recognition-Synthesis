/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.MenuItem
 *  android.view.View
 */
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class bh
extends mr {
    final abg a;
    boolean b;
    boolean c;
    boolean d = true;
    public final bzb e = new bzb(new bg(this));

    public bh() {
        this.a = new abg(this);
        this.getSavedStateRegistry().b("android:support:lifecycle", new bo(this, 1));
        this.f(new bf(this, 1));
        bf bf2 = new bf(this, 0);
        this.i.add(bf2);
        this.z(new mn((mr)this, 1));
    }

    private static boolean o(by object, aba aba2) {
        object = ((by)object).h().iterator();
        boolean bl2 = false;
        while (object.hasNext()) {
            be be2 = (be)object.next();
            if (be2 == null) continue;
            boolean bl3 = bl2;
            if (be2.getHost() != null) {
                bl3 = bl2 | bh.o(be2.getChildFragmentManager(), aba2);
            }
            cn cn2 = be2.aa;
            bl2 = bl3;
            if (cn2 != null) {
                bl2 = bl3;
                if (((abg)cn2.getLifecycle()).b.a(aba.d)) {
                    be2.aa.a.e(aba2);
                    bl2 = true;
                }
            }
            if (!be2.Z.b.a(aba.d)) continue;
            be2.Z.e(aba2);
            bl2 = true;
        }
        return bl2;
    }

    public final by bb() {
        return this.e.ab();
    }

    final View bc(View view, String string, Context context, AttributeSet attributeSet) {
        return ((bm)this.e.a).e.c.onCreateView(view, string, context, attributeSet);
    }

    final void c() {
        while (bh.o(this.bb(), aba.c)) {
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void dump(String var1_1, FileDescriptor var2_2, PrintWriter var3_3, String[] var4_4) {
        block11: {
            block12: {
                super.dump(var1_1, var2_2, var3_3, var4_4);
                if (var4_4 == null || var4_4.length == 0) break block11;
                var5_5 = var4_4[0];
                switch (var5_5.hashCode()) {
                    default: {
                        break block11;
                    }
                    case 1455016274: {
                        if (var5_5.equals("--autofill")) break block12;
                        break block11;
                    }
                    case 1159329357: {
                        if (!var5_5.equals("--contentcapture") || Build.VERSION.SDK_INT < 29) break block11;
                        break block12;
                    }
                    case 472614934: {
                        if (!var5_5.equals("--list-dumpables")) break block11;
                        ** GOTO lbl18
                    }
                    case 100470631: {
                        if (!var5_5.equals("--dump-dumpable")) break block11;
lbl18:
                        // 2 sources

                        if (Build.VERSION.SDK_INT < 33) break block11;
                        break block12;
                    }
                    case -645125871: 
                }
                if (!var5_5.equals("--translation") || Build.VERSION.SDK_INT < 31) break block11;
            }
            return;
        }
        var3_3.print(var1_1);
        var3_3.print("Local FragmentActivity ");
        var3_3.print(Integer.toHexString(System.identityHashCode(this)));
        var3_3.println(" State:");
        var5_5 = String.valueOf(var1_1).concat("  ");
        var3_3.print(var5_5);
        var3_3.print("mCreated=");
        var3_3.print(this.b);
        var3_3.print(" mResumed=");
        var3_3.print(this.c);
        var3_3.print(" mStopped=");
        var3_3.print(this.d);
        if (this.getApplication() != null) {
            acv.a(this).c(var5_5, var3_3);
        }
        this.e.ab().C(var1_1, var2_2, var3_3, var4_4);
    }

    @Deprecated
    public void e() {
    }

    @Override
    protected void onActivityResult(int n2, int n3, Intent intent) {
        this.e.ai();
        super.onActivityResult(n2, n3, intent);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.d(aaz.ON_CREATE);
        this.e.ac();
    }

    public final View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        View view2 = this.bc(view, string, context, attributeSet);
        if (view2 == null) {
            return super.onCreateView(view, string, context, attributeSet);
        }
        return view2;
    }

    public final View onCreateView(String string, Context context, AttributeSet attributeSet) {
        View view = this.bc(null, string, context, attributeSet);
        if (view == null) {
            return super.onCreateView(string, context, attributeSet);
        }
        return view;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.e.ad();
        this.a.d(aaz.ON_DESTROY);
    }

    @Override
    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        if (n2 == 6) {
            return ((bm)this.e.a).e.O(menuItem);
        }
        return false;
    }

    protected void onPause() {
        super.onPause();
        this.c = false;
        this.e.ae();
        this.a.d(aaz.ON_PAUSE);
    }

    protected void onPostResume() {
        super.onPostResume();
        this.a.d(aaz.ON_RESUME);
        this.e.af();
    }

    @Override
    public void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        this.e.ai();
        super.onRequestPermissionsResult(n2, stringArray, nArray);
    }

    protected void onResume() {
        this.e.ai();
        super.onResume();
        this.c = true;
        this.e.ak();
    }

    protected void onStart() {
        this.e.ai();
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            ((bm)this.e.a).e.n();
        }
        this.e.ak();
        this.a.d(aaz.ON_START);
        this.e.ag();
    }

    public final void onStateNotSaved() {
        this.e.ai();
    }

    protected void onStop() {
        super.onStop();
        this.d = true;
        this.c();
        this.e.ah();
        this.a.d(aaz.ON_STOP);
    }
}

