/*
 * Decompiled with CFR 0.152.
 */
public final class fyt {
    public final int a;
    public final int b;

    public fyt(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fyt)) {
            return false;
        }
        object = (fyt)object;
        if (this.a != ((fyt)object).a) {
            return false;
        }
        return this.b == ((fyt)object).b;
    }

    public final int hashCode() {
        return this.a * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActiveCallbacks(callbacksId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", callbacksState=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

