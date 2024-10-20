/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

public class gtk {
    public final String c;

    public gtk(gtk gtk2) {
        this.c = gtk2.c;
    }

    public gtk(String string) {
        fxf.K(string);
        this.c = string;
    }

    public static gtk c(char c2) {
        return new gtk(String.valueOf(c2));
    }

    public CharSequence a(Object object) {
        Objects.requireNonNull(object);
        object = object instanceof CharSequence ? (CharSequence)object : object.toString();
        return object;
    }

    public void b(Appendable appendable, Iterator iterator) {
        if (iterator.hasNext()) {
            appendable.append(this.a(iterator.next()));
            while (iterator.hasNext()) {
                appendable.append(this.c);
                appendable.append(this.a(iterator.next()));
            }
        }
    }

    public final String d(Iterable object) {
        Iterator iterator = object.iterator();
        object = new StringBuilder();
        this.f((StringBuilder)object, iterator);
        return ((StringBuilder)object).toString();
    }

    public final String e(Object object, Object object2, Object ... objectArray) {
        return this.d(new gtj(objectArray, object, object2));
    }

    public final void f(StringBuilder stringBuilder, Iterator iterator) {
        try {
            this.b(stringBuilder, iterator);
            return;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }

    public final void g(StringBuilder stringBuilder, Iterable iterable) {
        this.f(stringBuilder, iterable.iterator());
    }
}

