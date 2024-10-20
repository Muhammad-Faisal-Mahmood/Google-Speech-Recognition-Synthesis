/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class pb
implements Cloneable {
    public boolean a;
    public int[] b;
    public Object[] c;
    public int d;

    public pb() {
        int n2 = pd.d(10);
        this.b = new int[n2];
        this.c = new Object[n2];
    }

    public final int a(int n2) {
        if (this.a) {
            pc.b(this);
        }
        return this.b[n2];
    }

    public final int b() {
        if (this.a) {
            pc.b(this);
        }
        return this.d;
    }

    public final Object c(int n2) {
        if (this.a) {
            pc.b(this);
        }
        return this.c[n2];
    }

    public final void d(int n2, Object object) {
        Object[] objectArray;
        int n3 = pd.a(this.b, this.d, n2);
        if (n3 >= 0) {
            this.c[n3] = object;
            return;
        }
        int n4 = ~n3;
        int n5 = this.d;
        if (n4 < n5 && (objectArray = this.c)[n4] == pc.a) {
            this.b[n4] = n2;
            objectArray[n4] = object;
            return;
        }
        n3 = n4;
        if (this.a) {
            n3 = n4;
            if (n5 >= this.b.length) {
                pc.b(this);
                n3 = ~pd.a(this.b, this.d, n2);
            }
        }
        if ((n4 = this.d) >= (objectArray = (Object[])this.b).length) {
            n4 = pd.d(n4 + 1);
            objectArray = Arrays.copyOf((int[])objectArray, n4);
            jse.d(objectArray, "copyOf(...)");
            this.b = (int[])objectArray;
            objectArray = Arrays.copyOf(this.c, n4);
            jse.d(objectArray, "copyOf(...)");
            this.c = objectArray;
        }
        if ((n4 = this.d) - n3 != 0) {
            objectArray = this.b;
            n5 = n3 + 1;
            jns.W((int[])objectArray, (int[])objectArray, n5, n3, n4);
            objectArray = this.c;
            jns.X(objectArray, objectArray, n5, n3, this.d);
        }
        this.b[n3] = n2;
        this.c[n3] = object;
        ++this.d;
    }

    public final String toString() {
        Object object;
        if (this.b() <= 0) {
            object = "{}";
        } else {
            StringBuilder stringBuilder = new StringBuilder(this.d * 28);
            stringBuilder.append('{');
            int n2 = this.d;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(this.a(i2));
                stringBuilder.append('=');
                object = this.c(i2);
                if (object != this) {
                    stringBuilder.append(object);
                    continue;
                }
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('}');
            object = stringBuilder.toString();
        }
        return object;
    }
}

