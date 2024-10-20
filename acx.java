/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Objects;

final class acx
implements abp {
    public final adc a;
    public boolean b = false;
    public final eyu c;

    public acx(adc adc2, eyu eyu2) {
        this.a = adc2;
        this.c = eyu2;
    }

    @Override
    public final void a(Object object) {
        if (acv.b(2)) {
            Objects.toString(this.a);
            adc.e(object);
        }
        this.b = true;
        eyu eyu2 = this.c;
        object = (List)object;
        eyu2.a.clear();
        eyu2.a.addAll((Collection)object);
        eyu2.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.c.toString();
    }
}

