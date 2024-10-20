/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.WearableControllerProvider;

public final class fdr {
    public final int a;
    public final int b;

    public fdr() {
        throw null;
    }

    public fdr(int n2, int n3) {
        this.b = n2;
        this.a = n3;
    }

    static fdq a() {
        fdq fdq2 = new fdq();
        fdq2.b(-1);
        return fdq2;
    }

    public final String b() {
        int n2 = this.b;
        if (n2 != 0) {
            return "agsa_transcription_".concat(WearableControllerProvider.c(n2));
        }
        throw null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof fdr) {
            object = (fdr)object;
            int n2 = this.b;
            int n3 = ((fdr)object).b;
            if (n2 != 0) {
                return n2 == n3 && this.a == ((fdr)object).a;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b;
        a.L(n2);
        return (n2 ^ 0xF4243) * 1000003 ^ this.a;
    }

    public final String toString() {
        int n2 = this.b;
        String string = n2 != 0 ? Integer.toString(a.x(n2)) : "null";
        StringBuilder stringBuilder = new StringBuilder("AppflowStatus{errorType=");
        stringBuilder.append(string);
        stringBuilder.append(", errorCode=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

