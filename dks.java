/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;

final class dks {
    private final Level a;
    private final String b;
    private final String c;

    public dks() {
        throw null;
    }

    public dks(Level level, String string, String string2) {
        this.a = level;
        if (string != null) {
            this.b = string;
            this.c = string2;
            return;
        }
        throw new NullPointerException("Null logFormat");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dks) {
            object = (dks)object;
            if (this.a.equals(((dks)object).a) && this.b.equals(((dks)object).b) && this.c.equals(((dks)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("AbseilLogData{logLevel=");
        stringBuilder.append(string);
        stringBuilder.append(", logFormat=");
        stringBuilder.append(this.b);
        stringBuilder.append(", fileName=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

