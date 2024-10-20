/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Objects;

public abstract class jzt
implements kad {
    public final jqf a;
    public final int b;
    public final int c;

    public jzt(jqf jqf2, int n2, int n3) {
        this.a = jqf2;
        this.b = n2;
        this.c = n3;
        boolean bl2 = jve.a;
    }

    static /* synthetic */ Object e(jzt object, jyy jyy2, jqb jqb2) {
        if ((object = jvf.f(new jzs(jyy2, (jzt)object, null), jqb2)) == jqh.a) {
            return object;
        }
        return jon.a;
    }

    @Override
    public Object a(jyy jyy2, jqb jqb2) {
        return jzt.e(this, jyy2, jqb2);
    }

    protected abstract Object b(jyh var1, jqb var2);

    @Override
    public final jyx bI(jqf jqf2, int n2, int n3) {
        int n4;
        boolean bl2 = jve.a;
        jqf jqf3 = this.a;
        jqf2.plus(jqf3);
        if (n3 != 1) {
            n4 = n2;
            n2 = n3;
        } else {
            n4 = this.b;
            if (n4 == -3) {
                n3 = n2;
            } else {
                n3 = n2;
                if (n4 != -2) {
                    n2 = n3 = n4 + n2;
                    if (n3 < 0) {
                        n2 = Integer.MAX_VALUE;
                    }
                    n3 = n2;
                }
            }
            n2 = this.c;
            n4 = n3;
        }
        if (jse.i(jqf3, this.a) && n4 == this.b && n2 == this.c) {
            return this;
        }
        return this.c(jqf3, n4, n2);
    }

    protected abstract jzt c(jqf var1, int var2, int var3);

    public String toString() {
        int n2;
        Object object = new ArrayList<String>(4);
        Object object2 = this.a;
        if (object2 != jqg.a) {
            Objects.toString(object2);
            ((ArrayList)object).add("context=".concat("EmptyCoroutineContext"));
        }
        if ((n2 = this.b) != -3) {
            ((ArrayList)object).add(a.af(n2, "capacity="));
        }
        if (this.c != 1) {
            Objects.toString(jns.ap(2));
            ((ArrayList)object).add("onBufferOverflow=".concat(jns.ap(2)));
        }
        object2 = jvf.a(this);
        object = jns.D(object, ", ", null, null, null, 62);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object2);
        stringBuilder.append("[");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

