/*
 * Decompiled with CFR 0.152.
 */
public abstract class ddu {
    public static ddt c() {
        ddt ddt2 = new ddt();
        ddt2.b(false);
        return ddt2;
    }

    public abstract dds a();

    public abstract boolean b();

    public String toString() {
        String string = ((Object)this.a()).toString();
        String string2 = true != this.b() ? "bg" : "fg";
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

