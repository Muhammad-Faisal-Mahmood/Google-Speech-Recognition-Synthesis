/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 */
import android.accounts.Account;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.Set;

public final class cfd {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public cfd() {
        this.e = ckh.b;
    }

    public cfd(AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        this.e = ambientModeSupport$AmbientController;
    }

    public final cfe a() {
        Object object = this.a;
        Object object2 = this.b;
        Object object3 = this.c;
        String string = (String)this.d;
        object3 = (String)object3;
        return new cfe((Account)object, (Set)object2, (String)object3, string, (ckh)this.e);
    }
}

