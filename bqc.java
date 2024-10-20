/*
 * Decompiled with CFR 0.152.
 */
public final class bqc {
    public final String a;

    public bqc() {
        throw null;
    }

    public bqc(String string) {
        if (string != null) {
            this.a = string;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bqc) {
            object = (bqc)object;
            return this.a.equals(((bqc)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RosieRobotMessage{text=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

