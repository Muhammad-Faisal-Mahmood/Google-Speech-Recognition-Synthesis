/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 */
import android.app.Notification;

public final class cwe
implements hny {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;

    public /* synthetic */ cwe(csu csu2, sk sk2, String string, sp sp2, int n2, int n3) {
        this.f = n3;
        this.e = csu2;
        this.d = sk2;
        this.b = string;
        this.c = sp2;
        this.a = n2;
    }

    public /* synthetic */ cwe(cwj cwj2, int n2, cth cth2, ctf ctf2, ctt ctt2, int n3) {
        this.f = n3;
        this.b = cwj2;
        this.a = n2;
        this.c = cth2;
        this.d = ctf2;
        this.e = ctt2;
    }

    @Override
    public final hpn a(Object object) {
        if (this.f != 0) {
            boolean bl2 = (Boolean)object;
            Object object2 = this.e;
            if (bl2 && ((csu)object2).j == 2) {
                int n2 = this.a;
                object = this.c;
                Object object3 = this.b;
                sk sk2 = (sk)this.d;
                sk2.n = "status";
                sk2.e((CharSequence)object3);
                sk2.i(0x1080081);
                sk2.g(true);
                sk2.h(0, 0, false);
                sk2 = sk2.a();
                ((sp)object).a(n2, (Notification)sk2);
            }
            object = (csu)object2;
            if (((csu)object).g.g()) {
                ((csv)((csu)object).g.c()).d();
            }
            return hpj.a;
        }
        if (!((Boolean)object).booleanValue() && this.a != 4) {
            object = this.e;
            Object object4 = this.d;
            Object object5 = this.c;
            Object object6 = this.b;
            object5 = (cth)object5;
            long l2 = ((cth)object5).l;
            object = ((cwj)object6).r((cth)object5, (ctf)object4, (ctt)object, l2);
        } else {
            object = hpj.a;
        }
        return object;
    }
}

