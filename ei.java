/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window$Callback
 */
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class ei
extends ms
implements dq {
    private ds a;
    private final vd b = new eh(this);

    public ei(Context context, int n2) {
        super(context, ei.a(context, n2));
        ds ds2 = this.b();
        ((eg)ds2).H = n2 = ei.a(context, n2);
        ds2.o();
    }

    private static int a(Context context, int n2) {
        if (n2 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969073, typedValue, true);
            return typedValue.resourceId;
        }
        return n2;
    }

    private final void f() {
        we.f(this.getWindow().getDecorView(), this);
        xm.f(this.getWindow().getDecorView(), this);
        kh.c(this.getWindow().getDecorView(), this);
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f();
        this.b().d(view, layoutParams);
    }

    public final ds b() {
        if (this.a == null) {
            int n2 = ds.b;
            this.a = new eg(this.getContext(), this.getWindow(), this, this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void dismiss() {
        super.dismiss();
        this.b().g();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        return ve.a(this.b, view, (Window.Callback)this, keyEvent);
    }

    public final View findViewById(int n2) {
        return this.b().c(n2);
    }

    public final void invalidateOptionsMenu() {
        this.b().f();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.b().e();
        super.onCreate(bundle);
        this.b().o();
    }

    @Override
    protected final void onStop() {
        super.onStop();
        this.b().h();
    }

    @Override
    public final void q(ew ew2) {
    }

    @Override
    public final void setContentView(int n2) {
        this.f();
        this.b().j(n2);
    }

    @Override
    public final void setContentView(View view) {
        this.f();
        this.b().k(view);
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.f();
        this.b().l(view, layoutParams);
    }

    public final void setTitle(int n2) {
        super.setTitle(n2);
        this.b().m(this.getContext().getString(n2));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.b().m(charSequence);
    }

    @Override
    public final void w() {
    }
}

