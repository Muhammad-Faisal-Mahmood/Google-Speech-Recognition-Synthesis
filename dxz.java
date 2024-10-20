/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutorService;

public final class dxz {
    public final int a;
    public final ExecutorService b;
    public final gto c;

    public dxz() {
        throw null;
    }

    public dxz(int n2, ExecutorService executorService, gto gto2) {
        this.a = n2;
        this.b = executorService;
        this.c = gto2;
    }

    public static dxy a() {
        dxy dxy2 = new dxy(null);
        dxy2.b = new hon();
        dxy2.c = gsl.a;
        dxy2.a = 300;
        dxy2.d = 1;
        return dxy2;
    }

    public static dxz b() {
        return dxz.a().a();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dxz) {
            object = (dxz)object;
            if (this.a == ((dxz)object).a && this.b.equals(((dxz)object).b) && this.c.equals(((dxz)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        Object object = this.c;
        String string = String.valueOf(this.b);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("AppFlowLoggerConfiguration{maxEventsInMemory=");
        stringBuilder.append(this.a);
        stringBuilder.append(", loggingExecutorService=");
        stringBuilder.append(string);
        stringBuilder.append(", backgroundExecutorService=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

