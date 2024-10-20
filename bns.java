/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public final class bns
implements bmk {
    public final bnu a;

    public /* synthetic */ bns(bnu bnu2) {
        this.a = bnu2;
    }

    @Override
    public final void a(bml bml2) {
        bml2 = this.a.i;
        if (bml2 == null) {
            if (Log.isLoggable((String)"CarUiToolbarController", (int)6)) {
                Log.e((String)"CarUiToolbarController", (String)"Overflow dialog was null when trying to show it!");
            }
            return;
        }
        bml2.show();
    }
}

