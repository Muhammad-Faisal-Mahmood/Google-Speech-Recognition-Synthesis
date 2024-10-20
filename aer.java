/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class aer {
    public final Object a;
    public final int b;
    public final aef c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        yi.e();
    }

    public aer(Object object, int n2, aef aef2, Object object2, int n3, long l2, long l3, int n4, int n5) {
        this.a = object;
        this.b = n2;
        this.c = aef2;
        this.d = object2;
        this.e = n3;
        this.f = l2;
        this.g = l3;
        this.h = n4;
        this.i = n5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aer)object;
            if (this.b == ((aer)object).b && this.e == ((aer)object).e && this.f == ((aer)object).f && this.g == ((aer)object).g && this.h == ((aer)object).h && this.i == ((aer)object).i && a.k(this.c, ((aer)object).c) && a.k(this.a, ((aer)object).a) && a.k(this.d, ((aer)object).d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }
}

