/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;

public final class aaj
extends aai {
    public aaj(be be2, ViewGroup viewGroup) {
        jse.e(be2, "fragment");
        StringBuilder stringBuilder = new StringBuilder("Attempting to add fragment ");
        stringBuilder.append(be2);
        stringBuilder.append(" to container ");
        stringBuilder.append(viewGroup);
        stringBuilder.append(" which is not a FragmentContainerView");
        super(be2, stringBuilder.toString());
    }
}

