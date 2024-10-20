/*
 * Decompiled with CFR 0.152.
 */
public final class ekj {
    public final eaj a;
    public final int b;

    public ekj() {
        throw null;
    }

    public ekj(eaj eaj2, int n2) {
        if (eaj2 != null) {
            this.a = eaj2;
            this.b = n2;
            return;
        }
        throw new NullPointerException("Null audioRequestListeningSession");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ekj) {
            object = (ekj)object;
            if (this.a.equals(((ekj)object).a) && this.b == ((ekj)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("AudioRequestListeningSessionData{audioRequestListeningSession=");
        stringBuilder.append(string);
        stringBuilder.append(", sessionToken=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

