/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.concurrent.Executor;

public final class dxs {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final gto d;
    public final gto e;
    public final hav f;
    public final gto g;
    private final Executor h;

    static {
        dxs.a().a();
    }

    public dxs() {
        throw null;
    }

    public dxs(boolean bl2, String string, boolean bl3, gto gto2, gto gto3, hav hav2, Executor executor, gto gto4) {
        this.a = bl2;
        this.b = string;
        this.c = bl3;
        this.d = gto2;
        this.e = gto3;
        this.f = hav2;
        this.h = executor;
        this.g = gto4;
    }

    public static dxr a() {
        dxr dxr2 = new dxr(null);
        dxr2.d(false);
        dxr2.c();
        hom hom2 = hom.a;
        if (hom2 != null) {
            dxr2.b = hom2;
            dxr2.a = "Unknown";
            return dxr2;
        }
        throw new NullPointerException("Null listenerExecutor");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dxs) {
            object = (dxs)object;
            if (this.a == ((dxs)object).a && this.b.equals(((dxs)object).b) && this.c == ((dxs)object).c && this.d.equals(((dxs)object).d) && this.e.equals(((dxs)object).e) && this.f.equals(((dxs)object).f) && this.h.equals(((dxs)object).h) && this.g.equals(((dxs)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean bl2 = this.a;
        int n2 = 1237;
        int n3 = true != bl2 ? 1237 : 1231;
        int n4 = this.b.hashCode();
        if (this.c) {
            n2 = 1231;
        }
        return (((((((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n2) * 1000003 ^ this.d.hashCode()) * 1000003 ^ 0x79A31AAC) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.g.hashCode();
    }

    public final String toString() {
        Object object = this.g;
        Object object2 = this.h;
        Object object3 = this.f;
        Object object4 = this.e;
        String string = String.valueOf(this.d);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("LoggerOptions{dumpable=");
        stringBuilder.append(this.a);
        stringBuilder.append(", loggerName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", enableTikTokIntegration=");
        stringBuilder.append(this.c);
        stringBuilder.append(", appIdOverrideForProducts=");
        stringBuilder.append(string);
        stringBuilder.append(", maxEventsInMemory=");
        stringBuilder.append((String)object4);
        stringBuilder.append(", appFlowListeners=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", listenerExecutor=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", loggerId=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

