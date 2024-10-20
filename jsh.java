/*
 * Decompiled with CFR 0.152.
 */
public class jsh
extends jrx
implements jqz,
jsz {
    public jsh() {
        super(jrx.b, null, null, null, false);
    }

    public jsh(Object object, Class clazz) {
        super(object, clazz, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }

    @Override
    public final Object a() {
        return this.g();
    }

    public final jtd b() {
        jsz jsz2 = this.c();
        if (jsz2 != this) {
            return ((jsh)jsz2).b();
        }
        throw new jqy();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof jsh) {
            object = (jsh)object;
            if (this.d().equals(((jrx)object).d()) && this.d.equals(((jrx)object).d) && this.e.equals(((jrx)object).e) && jse.i(this.c, ((jrx)object).c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected final void f() {
        int n2 = jsk.a;
    }

    public Object g() {
        return this.b().e();
    }

    public final int hashCode() {
        return (this.d().hashCode() * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }

    public final String toString() {
        Object object = this.c();
        if (object != this) {
            return object.toString();
        }
        object = this.d;
        StringBuilder stringBuilder = new StringBuilder("property ");
        stringBuilder.append((String)object);
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

