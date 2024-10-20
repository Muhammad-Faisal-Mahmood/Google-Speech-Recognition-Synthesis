/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Objects;

public final class acw
extends abo {
    public final int j;
    public final adc k;
    public acx l;
    private abe m;

    public acw(adc adc2) {
        this.j = 54321;
        this.k = adc2;
        if (adc2.j == null) {
            adc2.j = this;
            adc2.d = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    protected final void d() {
        if (acv.b(2)) {
            ((Object)this).toString();
        }
        adc adc2 = this.k;
        adc2.f = true;
        adc2.h = false;
        adc2.g = false;
        adb adb2 = (adb)adc2;
        List list = adb2.c;
        if (list != null) {
            adb2.b(list);
            return;
        }
        adc2.d();
        adb2.a = new ada(adb2);
        adb2.a();
    }

    @Override
    protected final void e() {
        if (acv.b(2)) {
            ((Object)this).toString();
        }
        adc adc2 = this.k;
        adc2.f = false;
        adc2.d();
    }

    @Override
    public final void f(abp abp2) {
        super.f(abp2);
        this.m = null;
        this.l = null;
    }

    public final void i() {
        abe abe2 = this.m;
        acx acx2 = this.l;
        if (abe2 != null && acx2 != null) {
            super.f(acx2);
            this.c(abe2, acx2);
        }
    }

    public final void j() {
        if (acv.b(3)) {
            ((Object)this).toString();
        }
        this.k.d();
        this.k.g = true;
        Object object = this.l;
        if (object != null) {
            ((abn)this).f((abp)object);
            if (((acx)object).b) {
                if (acv.b(2)) {
                    Objects.toString(((acx)object).a);
                }
                object = ((acx)object).c;
                ((eyu)object).a.clear();
                ((eyu)object).a.notifyDataSetChanged();
            }
        }
        object = this.k;
        acw acw2 = ((adc)object).j;
        if (acw2 != null) {
            if (acw2 == this) {
                ((adc)object).j = null;
                ((adc)object).h = true;
                ((adc)object).f = false;
                ((adc)object).g = false;
                ((adc)object).i = false;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public final void k(abe abe2, eyu object) {
        acx acx2 = new acx(this.k, (eyu)object);
        this.c(abe2, acx2);
        object = this.l;
        if (object != null) {
            ((abn)this).f((abp)object);
        }
        this.m = abe2;
        this.l = acx2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.j);
        stringBuilder.append(" : ");
        stringBuilder.append(this.k.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this.k)));
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}

