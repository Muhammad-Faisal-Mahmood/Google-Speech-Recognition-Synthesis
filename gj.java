/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.ViewTreeObserver;

public final class gj
implements ViewTreeObserver.OnGlobalLayoutListener {
    final Object a;
    private final int b;

    public gj(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onGlobalLayout() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                ViewTreeObserver viewTreeObserver;
                if (n2 != 2) {
                    ib ib2 = ((hy)this.a).d;
                    if (ib2.isAttachedToWindow() && ib2.getGlobalVisibleRect(((hy)this.a).c)) {
                        ((hy)this.a).n();
                        hy.m((hy)this.a);
                        return;
                    }
                    ((jw)this.a).k();
                    return;
                }
                if (!((ib)((Object)this.a)).b.u()) {
                    ((ib)((Object)this.a)).b();
                }
                if ((viewTreeObserver = ((ib)((Object)this.a)).getViewTreeObserver()) != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                }
                return;
            }
            if (((fm)this.a).u() && ((fm)this.a).b.size() > 0 && !((jw)((dvy)((fm)this.a).b.get((int)0)).b).p) {
                Object object = ((fm)this.a).d;
                if (object != null && object.isShown()) {
                    object = ((fm)this.a).b.iterator();
                    while (object.hasNext()) {
                        ((jw)((dvy)object.next()).b).s();
                    }
                } else {
                    ((fm)this.a).k();
                }
            }
            return;
        }
        if (((gk)this.a).u()) {
            gk gk2 = (gk)this.a;
            if (!gk2.a.p) {
                gk2 = gk2.c;
                if (gk2 != null && gk2.isShown()) {
                    ((gk)this.a).a.s();
                    return;
                }
                ((gk)this.a).k();
            }
        }
    }
}

