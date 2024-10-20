/*
 * Decompiled with CFR 0.152.
 */
public final class bgm {
    public final String a;
    public final int b;
    public final int c;

    public bgm(String string, int n2, int n3) {
        jse.e(string, "workSpecId");
        this.a = string;
        this.b = n2;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bgm)) {
            return false;
        }
        object = (bgm)object;
        if (!jse.i(this.a, ((bgm)object).a)) {
            return false;
        }
        if (this.b != ((bgm)object).b) {
            return false;
        }
        return this.c == ((bgm)object).c;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.b) * 31 + this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SystemIdInfo(workSpecId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", generation=");
        stringBuilder.append(this.b);
        stringBuilder.append(", systemId=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

