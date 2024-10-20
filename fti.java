/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.util.Log
 */
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class fti {
    private final pa a = new pa();
    private final pa b = new pa();

    public static fti a(Context context, TypedArray object, int n2) {
        fti fti2;
        block6: {
            fti fti3;
            boolean bl2 = object.hasValue(n2);
            fti2 = fti3 = null;
            if (bl2) {
                n2 = object.getResourceId(n2, 0);
                fti2 = fti3;
                if (n2 != 0) {
                    context = AnimatorInflater.loadAnimator((Context)context, (int)n2);
                    if (context instanceof AnimatorSet) {
                        fti2 = fti.c(((AnimatorSet)context).getChildAnimations());
                        break block6;
                    }
                    fti2 = fti3;
                    if (context == null) break block6;
                    try {
                        object = new ArrayList();
                        object.add(context);
                        fti2 = fti.c((List)object);
                    }
                    catch (Exception exception) {
                        Log.w((String)"MotionSpec", (String)"Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(n2))), (Throwable)exception);
                        fti2 = fti3;
                    }
                }
            }
        }
        return fti2;
    }

    private static fti c(List list) {
        fti fti2 = new fti();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            Animator animator = (Animator)list.get(i2);
            if (animator instanceof ObjectAnimator) {
                animator = (ObjectAnimator)animator;
                Object object = animator.getPropertyName();
                Object object2 = animator.getValues();
                fti2.b.put(object, object2);
                object2 = animator.getPropertyName();
                object = new ftj(animator.getStartDelay(), animator.getDuration(), animator.getInterpolator());
                ((ftj)object).a = animator.getRepeatCount();
                ((ftj)object).b = animator.getRepeatMode();
                fti2.a.put(object2, object);
                continue;
            }
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
        }
        return fti2;
    }

    public final ftj b(String string) {
        if (this.a.get(string) != null) {
            return (ftj)this.a.get(string);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fti)) {
            return false;
        }
        object = (fti)object;
        return this.a.equals(((fti)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n");
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.a);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}

