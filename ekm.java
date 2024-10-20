/*
 * Decompiled with CFR 0.152.
 */
public final class ekm {
    public final ecu a;
    public final int b;
    private final int c;

    public ekm() {
        throw null;
    }

    public ekm(ecu ecu2, int n2) {
        if (ecu2 != null) {
            this.a = ecu2;
            this.b = n2;
            this.c = 1;
            return;
        }
        throw new NullPointerException("Null hotwordListeningSession");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ekm) {
            object = (ekm)object;
            if (this.a.equals(((ekm)object).a) && this.b == ((ekm)object).b) {
                int n2 = ((ekm)object).c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        a.L(1);
        return ((n2 ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ 1;
    }

    public final String toString() {
        int n2 = a.x(1);
        String string = this.a.toString();
        String string2 = Integer.toString(n2);
        StringBuilder stringBuilder = new StringBuilder("HotwordListeningSessionData{hotwordListeningSession=");
        stringBuilder.append(string);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hotwordCaptureMode=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

