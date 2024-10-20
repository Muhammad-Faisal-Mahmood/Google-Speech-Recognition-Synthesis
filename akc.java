/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class akc {
    public final long a;
    public final aew b;
    public final int c;
    public final anc d;
    public final long e;
    public final aew f;
    public final int g;
    public final anc h;
    public final long i;
    public final long j;

    public akc(long l2, aew aew2, int n2, anc anc2, long l3, aew aew3, int n3, anc anc3, long l4, long l5) {
        this.a = l2;
        this.b = aew2;
        this.c = n2;
        this.d = anc2;
        this.e = l3;
        this.f = aew3;
        this.g = n3;
        this.h = anc3;
        this.i = l4;
        this.j = l5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (akc)object;
            if (this.a == ((akc)object).a && this.c == ((akc)object).c && this.e == ((akc)object).e && this.g == ((akc)object).g && this.i == ((akc)object).i && this.j == ((akc)object).j && a.k(this.b, ((akc)object).b) && a.k(this.d, ((akc)object).d) && a.k(this.f, ((akc)object).f) && a.k(this.h, ((akc)object).h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }
}

