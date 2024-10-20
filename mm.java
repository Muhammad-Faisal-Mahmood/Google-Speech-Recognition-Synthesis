/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.view.ViewTreeObserver;

public final class mm
implements abc {
    public final Object a;
    private final int b;

    public /* synthetic */ mm(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public mm(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(abe object, aaz aaz2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (aaz2 == aaz.ON_DESTROY) {
                                object.getLifecycle().c(this);
                                ((ixw)this.a).a();
                            }
                            return;
                        }
                        if (aaz2 == aaz.ON_DESTROY) {
                            object = (ilr)((Object)this.a);
                            ((ilr)((Object)object)).a = null;
                            ((ilr)((Object)object)).b = null;
                            ((ilr)((Object)object)).c = null;
                        }
                        return;
                    }
                    object = this.a;
                    if (aaz2 == aaz.ON_START) {
                        ((awi)object).f = true;
                        return;
                    }
                    if (aaz2 == aaz.ON_STOP) {
                        ((awi)object).f = false;
                    }
                    return;
                }
                ((mr)this.a).A();
                ((db)this.a).getLifecycle().c(this);
                return;
            }
            if (aaz2 == aaz.ON_STOP && (object = ((mr)this.a).getWindow()) != null && (object = object.peekDecorView()) != null) {
                object.cancelPendingInputEvents();
            }
            return;
        }
        if (aaz2 == aaz.ON_DESTROY) {
            object = (mr)this.a;
            ((mr)object).g.a();
            if (!object.isChangingConfigurations()) {
                ((mr)object).getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging().S();
            }
            object = ((mr)object).j;
            ((mo)object).b.getWindow().getDecorView().removeCallbacks((Runnable)object);
            ((mo)object).b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)object);
        }
    }
}

