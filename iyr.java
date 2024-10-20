/*
 * Decompiled with CFR 0.152.
 */
public final class iyr {
    public static final iyr a = new iyr();

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (iyr)object;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        String string = Integer.toHexString(1);
        StringBuilder stringBuilder = new StringBuilder("BindServiceFlags{");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

