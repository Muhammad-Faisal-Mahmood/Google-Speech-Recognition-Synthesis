/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.window.OnBackInvokedDispatcher
 */
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

public class ms
extends Dialog
implements abe,
ng,
awh {
    private abg a;
    private final awg b = xm.g(this);
    private final nf c = new nf(new kd(this, 8, null));

    public ms(Context context, int n2) {
        super(context, n2);
    }

    private final abg a() {
        abg abg2;
        abg abg3 = abg2 = this.a;
        if (abg2 == null) {
            this.a = abg3 = new abg(this);
        }
        return abg3;
    }

    public static final void e(ms ms2) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jse.e(view, "view");
        this.d();
        super.addContentView(view, layoutParams);
    }

    public final void d() {
        Window window = this.getWindow();
        jse.b(window);
        window = window.getDecorView();
        jse.d(window, "window!!.decorView");
        we.f((View)window, this);
        window = this.getWindow();
        jse.b(window);
        window = window.getDecorView();
        jse.d(window, "window!!.decorView");
        kh.c((View)window, this);
        window = this.getWindow();
        jse.b(window);
        window = window.getDecorView();
        jse.d(window, "window!!.decorView");
        xm.f((View)window, this);
    }

    @Override
    public final abb getLifecycle() {
        return this.a();
    }

    @Override
    public final nf getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override
    public final awf getSavedStateRegistry() {
        return (awf)this.b.b;
    }

    public final void onBackPressed() {
        this.c.b();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            nf nf2 = this.c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = a$$ExternalSyntheticApiModelOutline0.m(this);
            jse.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            nf2.c(onBackInvokedDispatcher);
        }
        this.b.b(bundle);
        this.a().d(aaz.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle bundle = super.onSaveInstanceState();
        jse.d(bundle, "super.onSaveInstanceState()");
        this.b.c(bundle);
        return bundle;
    }

    protected final void onStart() {
        super.onStart();
        this.a().d(aaz.ON_RESUME);
    }

    protected void onStop() {
        this.a().d(aaz.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public void setContentView(int n2) {
        this.d();
        super.setContentView(n2);
    }

    public void setContentView(View view) {
        jse.e(view, "view");
        this.d();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jse.e(view, "view");
        this.d();
        super.setContentView(view, layoutParams);
    }
}

