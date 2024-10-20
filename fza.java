/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class fza
extends ach {
    public int a;
    public fze b;
    public int c;
    public boolean d;
    public final boolean e;

    public fza(abw abw2) {
        block3: {
            block2: {
                jse.e(abw2, "savedStateHandle");
                this.a = -1;
                fze fze2 = fze.a;
                jse.d(fze2, "getDefaultInstance(...)");
                this.b = fze2;
                fze2 = (Bundle)abw2.a("tiktok_activity_account_state_saved_instance_state");
                if (fze2 == null) break block2;
                this.e = true;
                this.a = fze2.getInt("state_account_id", -1);
                try {
                    this.b = (fze)fvc.ar((Bundle)fze2, "state_account_info", fze.a, hwj.a());
                }
                catch (hxn hxn2) {
                    throw new RuntimeException("Failed to get AccountInfo from Bundle.", hxn2);
                }
                this.c = fze2.getInt("state_account_state", 0);
                this.d = fze2.getBoolean("tiktok_accounts_disabled");
                break block3;
            }
            this.e = false;
        }
        abw2.b("tiktok_activity_account_state_saved_instance_state", new bo(this, 5));
    }
}

