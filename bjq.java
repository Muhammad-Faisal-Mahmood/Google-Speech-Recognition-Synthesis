/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowManager$LayoutParams
 */
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.List;

final class bjq
extends wt {
    int b;
    int c;
    WindowManager.LayoutParams d;
    int e;
    boolean f;
    final int g;
    final Window h;
    final bjr i;

    public bjq(bjr bjr2, Window window) {
        this.h = window;
        this.i = bjr2;
        this.g = (int)bnv.a(bjr.-$$Nest$fgetmContext(bjr2).getResources(), 32);
    }

    private static final boolean e(ilo ilo2) {
        return (ilo2.f() & 8) != 0;
    }

    @Override
    public final void a() {
        if (!this.f) {
            bjr.-$$Nest$mupdateAttributes(this.i);
            bjr.-$$Nest$mcopyWindowInsets(this.i);
        }
    }

    @Override
    public final void b(List object) {
        WindowManager.LayoutParams layoutParams;
        block4: {
            layoutParams = object.iterator();
            while (layoutParams.hasNext()) {
                object = (ilo)layoutParams.next();
                if (!bjq.e((ilo)object)) continue;
                break block4;
            }
            object = null;
        }
        if (object != null) {
            float f2;
            layoutParams = this.d;
            int n2 = this.c;
            layoutParams.height = (int)((float)n2 - (float)(n2 - this.b) * ((ilo)object).e());
            this.h.setAttributes(this.d);
            if (this.f) {
                n2 = this.g;
                f2 = ((ilo)object).e();
            } else {
                n2 = this.g;
                f2 = ((ilo)object).e();
                n2 = -n2;
            }
            float f3 = n2;
            object = this.i;
            bjr.-$$Nest$fgetmContent((bjr)object).setPadding(bjr.-$$Nest$fgetmContent((bjr)object).getPaddingLeft(), bjr.-$$Nest$fgetmContent(this.i).getPaddingTop(), bjr.-$$Nest$fgetmContent(this.i).getPaddingRight(), (int)((float)this.e + f3 * f2));
        }
    }

    @Override
    public final void c(ilo object) {
        if (!bjq.e((ilo)object)) {
            return;
        }
        this.h.setSoftInputMode(48);
        object = new WindowManager.LayoutParams();
        this.d = object;
        object.copyFrom(this.h.getAttributes());
        this.c = this.d.height;
        Window window = this.h;
        object = new int[2];
        window.getDecorView().getRootView().getLocationOnScreen((int[])object);
        Object object2 = object[0];
        Object object3 = object[1];
        this.e = bjr.-$$Nest$fgetmContent(this.i).getPaddingBottom();
        this.d.gravity = 51;
        sk$$ExternalSyntheticApiModelOutline1.m(this.d, 0);
        this.d.x = (int)object2;
        this.d.y = (int)object3;
        this.h.setAttributes(this.d);
    }

    @Override
    public final void d(ilo object, ws object2) {
        if (!bjq.e((ilo)object)) {
            return;
        }
        Object object3 = wb.a(this.h.getDecorView().getRootView()).f(8);
        object = tg.a;
        int n2 = 0;
        boolean bl2 = object3 != object;
        this.f = bl2;
        object = this.i.getWindowLayoutParams();
        int n3 = n2;
        if (this.f) {
            int n4;
            object2 = ((ws)object2).b;
            int n5 = Build.VERSION.SDK_INT;
            n3 = n4 = ((tg)object2).e;
            if (n5 < 32) {
                object2 = bnv.e(bjr.-$$Nest$fgetmContext(this.i));
                n3 = n4;
                if (object2 != null) {
                    n3 = n4 - wb.a((View)object2.getWindow().getDecorView().getRootView()).f((int)7).e;
                }
            }
            object2 = this.h;
            object3 = new int[2];
            object2.getDecorView().getRootView().getLocationOnScreen((int[])object3);
            n4 = (int)(object3[1] + ((WindowManager.LayoutParams)object).height);
            n5 = bnv.g((Context)bjr.-$$Nest$fgetmContext((bjr)this.i)).heightPixels - n3;
            n3 = n2;
            if (n5 < n4) {
                n3 = n4 - n5 - this.g;
            }
        }
        this.b = ((WindowManager.LayoutParams)object).height - n3;
    }
}

