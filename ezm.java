/*
 * Decompiled with CFR 0.152.
 */
public final class ezm {
    public final ezj a;
    public final gto b;
    public final gto c;

    public ezm() {
        throw null;
    }

    public ezm(ezj ezj2, gto gto2, gto gto3) {
        if (ezj2 != null) {
            this.a = ezj2;
            this.b = gto2;
            this.c = gto3;
            return;
        }
        throw new NullPointerException("Null descriptor");
    }

    public static ezm a(ezj ezj2, String string) {
        return new ezm(ezj2, gto.i(string), gsl.a);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ezm) {
            object = (ezm)object;
            if (((Object)this.a).equals(((ezm)object).a) && this.b.equals(((ezm)object).b) && this.c.equals(((ezm)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Object)this.a).hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        Object object = this.c;
        Object object2 = this.b;
        String string = ((Object)this.a).toString();
        object2 = object2.toString();
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("LanguagePackPackage{descriptor=");
        stringBuilder.append(string);
        stringBuilder.append(", filesystemPath=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", trainingPlanZipfile=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

