/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class q {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public q(m object) {
        this.a = ((m)object).w;
        this.b = ((m)object).x;
        this.c = ((m)object).h();
        this.d = ((m)object).d();
        ArrayList arrayList = ((m)object).q;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            object = (l)arrayList.get(i2);
            this.e.add(new p((l)object));
        }
    }
}

