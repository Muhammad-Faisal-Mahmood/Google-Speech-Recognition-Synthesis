/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class qk
extends qg {
    public qg[] ar = new qg[4];
    public int as = 0;

    public final void T(ArrayList arrayList, int n2, qz qz2) {
        int n3 = 0;
        int n4 = 0;
        while (true) {
            if (n4 >= this.as) break;
            qz2.d(this.ar[n4]);
            ++n4;
        }
        for (int i2 = n3; i2 < this.as; ++i2) {
            ki.h(this.ar[i2], n2, arrayList, qz2);
        }
    }
}

