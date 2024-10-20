/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;

public final class hht
extends hhu {
    private final hhs c;

    public hht(hfr hfr2, int n2, hhs hhs2) {
        super(hfr2, n2);
        this.c = hhs2;
        StringBuilder stringBuilder = new StringBuilder("%");
        hfr2.f(stringBuilder);
        char c2 = true != hfr2.d() ? (char)'t' : 'T';
        stringBuilder.append(c2);
        stringBuilder.append(hhs2.G);
    }

    @Override
    public final void a(hhy object, Object object2) {
        Object object3 = this.c;
        if (!(object2 instanceof Date || object2 instanceof Calendar || object2 instanceof Long)) {
            object = ((hhy)object).d;
            char c2 = ((hhs)((Object)object3)).G;
            object3 = new StringBuilder("%t");
            ((StringBuilder)object3).append(c2);
            hhy.c((StringBuilder)object, object2, ((StringBuilder)object3).toString());
            return;
        }
        hfr hfr2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("%");
        hfr2.f(stringBuilder);
        char c3 = true != hfr2.d() ? (char)'t' : 'T';
        stringBuilder.append(c3);
        stringBuilder.append(((hhs)((Object)object3)).G);
        object3 = stringBuilder.toString();
        ((hhy)object).d.append(String.format(hfx.a, (String)object3, object2));
    }
}

