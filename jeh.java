/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class jeh {
    private final ArrayList a = new ArrayList();

    public final void a(Object object) {
        this.a.add(object.toString());
    }

    public final void b(String string, Object object) {
        String string2 = String.valueOf(object);
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("=");
        ((StringBuilder)object).append(string2);
        string = ((StringBuilder)object).toString();
        this.a.add(string);
    }

    public final String toString() {
        return this.a.toString();
    }
}

