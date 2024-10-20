/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class aym {
    public final Map a = new HashMap();
    public View b;
    final ArrayList c = new ArrayList();

    @Deprecated
    public aym() {
    }

    public aym(View view) {
        this.b = view;
    }

    public final boolean equals(Object object) {
        if (object instanceof aym) {
            View view = this.b;
            object = (aym)object;
            if (view == ((aym)object).b && this.a.equals(((aym)object).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("TransitionValues@");
        charSequence.append(Integer.toHexString(this.hashCode()));
        charSequence.append(":\n");
        charSequence = charSequence.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append("    view = ");
        stringBuilder.append(this.b);
        stringBuilder.append("\n");
        charSequence = stringBuilder.toString().concat("    values:");
        for (String string : this.a.keySet()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append((String)charSequence);
            stringBuilder2.append("    ");
            stringBuilder2.append(string);
            stringBuilder2.append(": ");
            stringBuilder2.append(this.a.get(string));
            stringBuilder2.append("\n");
            charSequence = stringBuilder2.toString();
        }
        return charSequence;
    }
}

