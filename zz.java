/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;

public final class zz
extends aai {
    public zz(be be2, ViewGroup viewGroup) {
        jse.e(be2, "fragment");
        StringBuilder stringBuilder = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
        stringBuilder.append(be2);
        stringBuilder.append(" to container ");
        stringBuilder.append(viewGroup);
        super(be2, stringBuilder.toString());
    }
}

