/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.util.DisplayMetrics
 *  androidx.window.extensions.area.ExtensionWindowAreaPresentation
 */
package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.core.util.function.Consumer;

public interface WindowAreaComponentApi3Requirements {
    public void addRearDisplayPresentationStatusListener(Consumer var1);

    public void addRearDisplayStatusListener(Consumer var1);

    public void endRearDisplayPresentationSession();

    public void endRearDisplaySession();

    public DisplayMetrics getRearDisplayMetrics();

    public ExtensionWindowAreaPresentation getRearDisplayPresentation();

    public void removeRearDisplayPresentationStatusListener(Consumer var1);

    public void removeRearDisplayStatusListener(Consumer var1);

    public void startRearDisplayPresentationSession(Activity var1, Consumer var2);

    public void startRearDisplaySession(Activity var1, Consumer var2);
}

