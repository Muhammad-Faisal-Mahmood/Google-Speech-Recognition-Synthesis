/*
 * Decompiled with CFR 0.152.
 */
public abstract class jwt
extends juy {
    protected final String e() {
        juy juy2 = jvo.a;
        juy2 = kbn.a;
        if (this == juy2) {
            return "Dispatchers.Main";
        }
        try {
            juy2 = ((jwt)juy2).h();
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            juy2 = null;
        }
        if (this == juy2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract jwt h();

    @Override
    public String toString() {
        String string;
        String string2 = string = this.e();
        if (string == null) {
            string2 = jvf.a(this);
            string = jvf.b(this);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("@");
            stringBuilder.append(string);
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

