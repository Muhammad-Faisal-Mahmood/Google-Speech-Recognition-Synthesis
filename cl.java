/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 *  android.transition.Transition$TransitionListener
 *  android.transition.TransitionManager
 *  android.transition.TransitionSet
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class cl
extends cm {
    private static boolean A(Transition transition) {
        return !cl.x(transition.getTargetIds()) || !cl.x(transition.getTargetNames()) || !cl.x(transition.getTargetTypes());
        {
        }
    }

    @Override
    public final Object a(Object object) {
        if (object != null) {
            return ((Transition)object).clone();
        }
        return null;
    }

    @Override
    public final Object b(Object object, Object object2, Object object3) {
        Transition transition = (Transition)object;
        object2 = (Transition)object2;
        object3 = (Transition)object3;
        if (transition != null && object2 != null) {
            object = new TransitionSet().addTransition(transition).addTransition((Transition)object2).setOrdering(1);
        } else {
            object = transition;
            if (transition == null) {
                object = object2 != null ? object2 : null;
            }
        }
        if (object3 != null) {
            object2 = new TransitionSet();
            if (object != null) {
                object2.addTransition((Transition)object);
            }
            object2.addTransition((Transition)object3);
            return object2;
        }
        return object;
    }

    @Override
    public final Object c(Object object) {
        if (object == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition)object);
        return transitionSet;
    }

    @Override
    public final void d(Object object, View view) {
        ((Transition)object).addTarget(view);
    }

    @Override
    public final void e(Object object, ArrayList arrayList) {
        block2: {
            int n2;
            int n3;
            block3: {
                if ((object = (Transition)object) == null) break block2;
                boolean bl2 = object instanceof TransitionSet;
                n3 = 0;
                if (!bl2) break block3;
                object = (TransitionSet)object;
                int n4 = object.getTransitionCount();
                for (n2 = n3; n2 < n4; ++n2) {
                    this.e(object.getTransitionAt(n2), arrayList);
                }
                break block2;
            }
            if (cl.A((Transition)object) || !cl.x(object.getTargets())) break block2;
            n3 = arrayList.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object.addTarget((View)arrayList.get(n2));
            }
        }
    }

    @Override
    public final void f(ViewGroup viewGroup, Object object) {
        TransitionManager.beginDelayedTransition((ViewGroup)viewGroup, (Transition)((Transition)object));
    }

    public final void g(Object object, ArrayList arrayList, ArrayList arrayList2) {
        block4: {
            List list;
            int n2;
            int n3;
            block3: {
                object = (Transition)object;
                boolean bl2 = object instanceof TransitionSet;
                if (!bl2) break block3;
                object = (TransitionSet)object;
                n3 = object.getTransitionCount();
                for (n2 = 0; n2 < n3; ++n2) {
                    this.g(object.getTransitionAt(n2), arrayList, arrayList2);
                }
                break block4;
            }
            if (cl.A((Transition)object) || (list = object.getTargets()) == null || list.size() != arrayList.size() || !list.containsAll(arrayList)) break block4;
            n2 = arrayList2 == null ? 0 : arrayList2.size();
            for (n3 = 0; n3 < n2; ++n3) {
                object.addTarget((View)arrayList2.get(n3));
            }
            n2 = arrayList.size();
            while (--n2 >= 0) {
                object.removeTarget((View)arrayList.get(n2));
            }
        }
    }

    @Override
    public final void h(Object object, View view, ArrayList arrayList) {
        ((Transition)object).addListener((Transition.TransitionListener)new ch(view, arrayList));
    }

    @Override
    public final void i(Object object, Rect rect) {
        ((Transition)object).setEpicenterCallback((Transition.EpicenterCallback)new ck(rect));
    }

    @Override
    public final void j(Object object, View view) {
        if (view != null) {
            object = (Transition)object;
            Rect rect = new Rect();
            cl.y(view, rect);
            object.setEpicenterCallback((Transition.EpicenterCallback)new cg(rect));
        }
    }

    @Override
    public final void k(Object object, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet)object;
        object = transitionSet.getTargets();
        object.clear();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            cl.v((List)object, (View)arrayList.get(i2));
        }
        object.add(view);
        arrayList.add(view);
        this.e(transitionSet, arrayList);
    }

    @Override
    public final void l(Object object, ArrayList arrayList, ArrayList arrayList2) {
        if ((object = (TransitionSet)object) != null) {
            object.getTargets().clear();
            object.getTargets().addAll(arrayList2);
            this.g(object, arrayList, arrayList2);
        }
    }

    @Override
    public final boolean m(Object object) {
        return object instanceof Transition;
    }

    @Override
    public final boolean n() {
        if (by.S(4)) {
            Log.i((String)"FragmentManager", (String)"Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
        return false;
    }

    @Override
    public final boolean o(Object object) {
        if (by.S(2)) {
            Objects.toString(object);
        }
        return false;
    }

    @Override
    public final Object p(Object object, Object object2) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            transitionSet.addTransition((Transition)object);
        }
        transitionSet.addTransition((Transition)object2);
        return transitionSet;
    }

    @Override
    public final void q(Object object, Object object2, ArrayList arrayList, Object object3, ArrayList arrayList2) {
        ((Transition)object).addListener((Transition.TransitionListener)new ci(this, object2, arrayList, object3, arrayList2));
    }

    @Override
    public final void r(Object object, tu tu2, Runnable runnable) {
        ((Transition)object).addListener((Transition.TransitionListener)new cj(runnable));
    }
}

