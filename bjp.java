/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View$OnSystemUiVisibilityChangeListener
 */
import android.app.Activity;
import android.view.View;

public final class bjp
implements View.OnSystemUiVisibilityChangeListener {
    public final bjr a;
    public final Activity b;

    public /* synthetic */ bjp(bjr bjr2, Activity activity) {
        this.a = bjr2;
        this.b = activity;
    }

    public final void onSystemUiVisibilityChange(int n2) {
        this.a.lambda$copySystemUiVisibility$0$com-android-car-ui-appstyledview-AppStyledDialog(this.b, n2);
    }
}

