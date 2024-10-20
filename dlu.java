/*
 * Decompiled with CFR 0.152.
 */
public final class dlu {
    public final boolean a;
    private final gzx b;

    public dlu() {
        throw null;
    }

    public dlu(boolean bl2, gzx gzx2) {
        this.a = bl2;
        if (gzx2 != null) {
            this.b = gzx2;
            return;
        }
        throw new NullPointerException("Null runningAppProcessInfosInternal");
    }

    public final gzx a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dlu) {
            object = (dlu)object;
            if (this.a == ((dlu)object).a && fvd.z(this.b, ((dlu)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = true != this.a ? 1237 : 1231;
        return (n2 ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = ((Object)this.b).toString();
        StringBuilder stringBuilder = new StringBuilder("RunningAppProcessInfoResponse{getStatus=");
        stringBuilder.append(this.a);
        stringBuilder.append(", runningAppProcessInfosInternal=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

