/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;

public final class nn
implements abc {
    public final nq a;
    public final String b;
    public final nl c;
    public final nu d;

    public /* synthetic */ nn(nq nq2, String string, nl nl2, nu nu2) {
        this.a = nq2;
        this.b = string;
        this.c = nl2;
        this.d = nu2;
    }

    @Override
    public final void a(abe object, aaz object2) {
        nl nl2 = this.c;
        jse.e(nl2, "$callback");
        object = this.d;
        jse.e(object, "$contract");
        nq nq2 = this.a;
        String string = this.b;
        if (aaz.ON_START == object2) {
            nq2.e.put(string, new bxt(nl2, (nu)object));
            if (nq2.f.containsKey(string)) {
                object2 = nq2.f.get(string);
                nq2.f.remove(string);
                nl2.a(object2);
            }
            if ((object2 = (nk)a.M(nq2.g, string, nk.class)) != null) {
                nq2.g.remove(string);
                nq2 = ((nk)object2).b;
                nl2.a(((nu)object).a(((nk)object2).a, (Intent)nq2));
                return;
            }
        } else {
            if (aaz.ON_STOP == object2) {
                nq2.e.remove(string);
                return;
            }
            if (aaz.ON_DESTROY == object2) {
                nq2.d(string);
            }
        }
    }
}

