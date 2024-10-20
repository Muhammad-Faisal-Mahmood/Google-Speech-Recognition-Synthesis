/*
 * Decompiled with CFR 0.152.
 */
public final class hdq
extends hav {
    final transient Object a;

    public hdq(Object object) {
        fxf.K(object);
        this.a = object;
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        objectArray[n2] = this.a;
        return n2 + 1;
    }

    @Override
    public final boolean contains(Object object) {
        return this.a.equals(object);
    }

    @Override
    public final gzx f() {
        return gzx.q(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final hdx k() {
        return new hbm(this.a);
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

