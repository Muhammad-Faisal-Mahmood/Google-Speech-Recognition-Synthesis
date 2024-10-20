/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.ObjectAnimator
 *  android.animation.StateListAnimator
 *  android.view.View
 */
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

public final class fty {
    public static final int[] a = new int[]{16843848};

    public static void a(View view, float f2) {
        int n2 = view.getResources().getInteger(2131492866);
        StateListAnimator stateListAnimator = new StateListAnimator();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"elevation", (float[])new float[]{0.0f});
        long l2 = n2;
        objectAnimator = objectAnimator.setDuration(l2);
        stateListAnimator.addState(new int[]{16842910, 2130969898, -2130969899}, (Animator)objectAnimator);
        objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"elevation", (float[])new float[]{f2}).setDuration(l2);
        stateListAnimator.addState(new int[]{16842910}, (Animator)objectAnimator);
        objectAnimator = ObjectAnimator.ofFloat((Object)view, (String)"elevation", (float[])new float[]{0.0f}).setDuration(0L);
        stateListAnimator.addState(new int[0], (Animator)objectAnimator);
        view.setStateListAnimator(stateListAnimator);
    }
}

