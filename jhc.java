/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

final class jhc
extends iwh {
    public final ivz e;
    public iui f = iui.d;
    private iwe g;

    public jhc(ivz ivz2) {
        this.e = ivz2;
    }

    @Override
    public final iyh a(iwd object) {
        Object object2 = ((iwd)object).a;
        if (!object2.isEmpty()) {
            Object object3 = ((iwd)object).c;
            object = object2;
            if (object3 instanceof jgz) {
                object3 = (jgz)object3;
                Boolean bl2 = ((jgz)object3).a;
                object = object2;
                if (bl2 != null) {
                    object = object2;
                    if (bl2.booleanValue()) {
                        object = new ArrayList(object2);
                        object2 = ((jgz)object3).b;
                        Collections.shuffle(object, new Random());
                    }
                }
            }
            if ((object2 = this.g) == null) {
                object3 = this.e;
                object2 = new ivu();
                ((ivu)object2).b((List)object);
                object = ((ivz)object3).b(((ivu)object2).a());
                ((iwe)object).c(new jgy(this, (iwe)object, 0));
                this.g = object;
                this.f(iui.a, new jha(iwb.b((iwe)object)));
                ((iwe)object).a();
            } else {
                ((iwe)object2).d((List)object);
            }
            return iyh.b;
        }
        Object object4 = ((iwd)object).a;
        object2 = iyh.k;
        object4 = String.valueOf(object4);
        object = ((Object)((iwd)object).b).toString();
        StringBuilder stringBuilder = new StringBuilder("NameResolver returned no usable address. addrs=");
        stringBuilder.append((String)object4);
        stringBuilder.append(", attrs=");
        stringBuilder.append((String)object);
        object = ((iyh)object2).e(stringBuilder.toString());
        this.b((iyh)object);
        return object;
    }

    @Override
    public final void b(iyh iyh2) {
        iwe iwe2 = this.g;
        if (iwe2 != null) {
            iwe2.b();
            this.g = null;
        }
        this.f(iui.c, new jha(iwb.a(iyh2)));
    }

    @Override
    public final void d() {
        iwe iwe2 = this.g;
        if (iwe2 != null) {
            iwe2.a();
        }
    }

    @Override
    public final void e() {
        iwe iwe2 = this.g;
        if (iwe2 != null) {
            iwe2.b();
        }
    }

    public final void f(iui iui2, iwf iwf2) {
        this.f = iui2;
        this.e.f(iui2, iwf2);
    }
}

