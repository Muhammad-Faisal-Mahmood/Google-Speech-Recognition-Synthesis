/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.ArrayList;

public final class fjx
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;

    public fjx(int n2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int n3) {
        this.f = n3;
        this.a = n2;
        this.e = arrayList;
        this.d = arrayList2;
        this.c = arrayList3;
        this.b = arrayList4;
    }

    public /* synthetic */ fjx(fjy fjy2, fkg fkg2, int n2, String string, fef fef2, int n3) {
        this.f = n3;
        this.b = fjy2;
        this.e = fkg2;
        this.a = n2;
        this.c = string;
        this.d = fef2;
    }

    @Override
    public final void run() {
        if (this.f != 0) {
            for (int i2 = 0; i2 < this.a; ++i2) {
                wa.l((View)((ArrayList)this.e).get(i2), (String)((ArrayList)this.d).get(i2));
                wa.l((View)((ArrayList)this.c).get(i2), (String)((ArrayList)this.b).get(i2));
            }
            return;
        }
        int n2 = this.a;
        Object object = this.e;
        ((fkg)object).a(n2);
        fjy fjy2 = (fjy)this.b;
        fjy2.c.d.remove(object);
        object = this.d;
        object = new fas(this.c, object, 13);
        fjy2.c.f.ifPresent(object);
    }
}

