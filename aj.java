/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.graphics.Rect
 *  android.graphics.Typeface
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewPropertyAnimator
 */
import android.animation.Animator;
import android.app.Application;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.Iterator;

public final class aj
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public aj(bzb bzb2, Typeface typeface, int n2) {
        this.c = n2;
        this.a = bzb2;
        this.b = typeface;
    }

    public /* synthetic */ aj(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    public /* synthetic */ aj(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public aj(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    @Override
    public final void run() {
        int n2 = this.c;
        int n3 = 0;
        int n4 = 0;
        Object object = false;
        switch (n2) {
            default: {
                int n5 = ((jle)this.b).e();
                ((AmbientMode$AmbientController)this.a).a(n5);
                return;
            }
            case 19: {
                object = (ade)this.b;
                if (((ade)object).f()) {
                    ((ade)object).c();
                } else {
                    ((ade)object).b(this.a);
                }
                ((ade)object).f = 3;
                return;
            }
            case 18: {
                Object object2 = this.a;
                object = this.b;
                object2 = "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(object2));
                object = (Throwable)object;
                Log.e((String)"FragmentStrictMode", (String)object2, (Throwable)object);
                throw object;
            }
            case 17: {
                this.b.a(this.a);
                return;
            }
            case 16: {
                Object object3 = ((bzb)this.a).a;
                if (object3 != null) {
                    object = (Typeface)this.b;
                    ((tb)object3).a((Typeface)object);
                }
                return;
            }
            case 15: {
                object = this.b;
                ((tb)this.a).a((Typeface)object);
                return;
            }
            case 14: {
                try {
                    if (sg.d != null) {
                        sg.d.invoke(this.b, this.a, object, "AppCompat recreation");
                        return;
                    }
                    sg.e.invoke(this.b, this.a, object);
                    return;
                }
                catch (Throwable throwable) {
                    Log.e((String)"ActivityRecreator", (String)"Exception while invoking performStopActivity", (Throwable)throwable);
                    return;
                }
                catch (RuntimeException runtimeException) {
                    if (runtimeException.getClass() == RuntimeException.class && runtimeException.getMessage() != null && runtimeException.getMessage().startsWith("Unable to stop")) {
                        throw runtimeException;
                    }
                    return;
                }
            }
            case 13: {
                Object object4 = this.b;
                object = this.a;
                ((Application)object4).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
                return;
            }
            case 12: {
                Object object5;
                object = this.b;
                ((sf)object).a = object5 = this.a;
                return;
            }
            case 11: {
                object = this.a;
                ((mr)this.b).y((nf)object);
                return;
            }
            case 10: {
                Object object6;
                int n5;
                object = this.a;
                n3 = object.size();
                for (n5 = n4; n5 < n3; ++n5) {
                    lg lg2 = (lg)object.get(n5);
                    Object object7 = this.b;
                    View view = lg2.itemView;
                    object6 = view.animate();
                    object7 = (kk)object7;
                    ((kk)object7).i.add(lg2);
                    object6.alpha(1.0f).setDuration(120L).setListener((Animator.AnimatorListener)new iq((kk)object7, lg2, view, (ViewPropertyAnimator)object6)).start();
                }
                ((ArrayList)this.a).clear();
                object6 = this.b;
                object = this.a;
                ((kk)object6).f.remove(object);
                return;
            }
            case 9: {
                Object object8;
                int n5;
                Object object9 = this.a;
                n4 = object9.size();
                for (n5 = n3; n5 < n4; ++n5) {
                    iu iu2 = (iu)object9.get(n5);
                    Object object10 = this.b;
                    object8 = iu2.a;
                    object = null;
                    object8 = object8 == null ? null : ((lg)object8).itemView;
                    lg lg3 = iu2.b;
                    if (lg3 != null) {
                        object = lg3.itemView;
                    }
                    if (object8 != null) {
                        lg3 = object8.animate().setDuration(250L);
                        kk kk2 = (kk)object10;
                        kk2.l.add(iu2.a);
                        lg3.translationX(iu2.e - iu2.c);
                        lg3.translationY(iu2.f - iu2.d);
                        lg3.alpha(0.0f).setListener((Animator.AnimatorListener)new is(kk2, iu2, (ViewPropertyAnimator)lg3, (View)object8)).start();
                    }
                    if (object == null) continue;
                    object8 = object.animate();
                    object10 = (kk)object10;
                    ((kk)object10).l.add(iu2.b);
                    object8.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener((Animator.AnimatorListener)new it((kk)object10, iu2, (ViewPropertyAnimator)object8, (View)object)).start();
                }
                ((ArrayList)this.a).clear();
                object8 = this.b;
                object = this.a;
                ((kk)object8).h.remove(object);
                return;
            }
            case 8: {
                Object object11;
                int n5;
                object = this.a;
                n4 = object.size();
                for (n5 = 0; n5 < n4; ++n5) {
                    iv iv2 = (iv)object.get(n5);
                    Object object12 = this.b;
                    object11 = iv2.a;
                    int n6 = iv2.b;
                    n2 = iv2.c;
                    int n7 = iv2.d;
                    n3 = iv2.e;
                    View view = ((lg)object11).itemView;
                    n3 -= n2;
                    if ((n7 -= n6) != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (n3 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    iv2 = view.animate();
                    object12 = (kk)object12;
                    ((kk)object12).j.add(object11);
                    iv2.setDuration(250L).setListener((Animator.AnimatorListener)new ir((kk)object12, (lg)object11, n7, view, n3, (ViewPropertyAnimator)iv2)).start();
                }
                ((ArrayList)this.a).clear();
                object = this.b;
                object11 = this.a;
                ((kk)object).g.remove(object11);
                return;
            }
            case 7: {
                Object object13 = this.a;
                object = this.b;
                try {
                    object13.run();
                    return;
                }
                finally {
                    ((dr)object).a();
                }
            }
            case 6: {
                object = this.b;
                cz cz2 = (cz)this.a;
                cz2.b.remove(object);
                cz2.c.remove(object);
                return;
            }
            case 5: {
                Object object14 = this.b;
                object = (cz)this.a;
                if (((cz)object).b.contains(object14)) {
                    cy cy2 = (cy)object14;
                    object14 = cy2.a;
                    cy2 = cy2.c.P;
                    jse.d(cy2, "operation.fragment.mView");
                    ((cx)((Object)object14)).a((View)cy2, ((cz)object).a);
                }
                return;
            }
            case 4: {
                Object object15 = this.a;
                jse.e(object15, "$container");
                Iterator iterator = ((an)this.b).a.iterator();
                while (iterator.hasNext()) {
                    cy cy3 = ((ao)iterator.next()).a;
                    object = cy3.c.P;
                    if (object == null) continue;
                    cy3.a.a((View)object, (ViewGroup)object15);
                }
                return;
            }
            case 3: {
                object = this.b;
                x.b((cy)this.a, (an)object);
                return;
            }
            case 2: {
                object = this.b;
                x.b((cy)this.a, (an)object);
                return;
            }
            case 1: {
                object = this.b;
                jse.e(object, "$operation");
                ((cz)this.a).d((cy)object);
                return;
            }
            case 0: 
        }
        Object object16 = this.a;
        object = (Rect)this.b;
        cm.y((View)object16, (Rect)object);
    }
}

