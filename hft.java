/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class hft
implements hey {
    private static final Set d = new HashSet<Class>(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final String a;
    public final StringBuilder b;
    public boolean c = false;
    private final String e;

    public hft(StringBuilder stringBuilder) {
        this.e = "[CONTEXT ";
        this.a = " ]";
        this.b = stringBuilder;
    }

    private static int b(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (c2 >= ' ' && c2 != '\"' && c2 != '\\') {
                ++n2;
                continue;
            }
            return n2;
        }
        return -1;
    }

    @Override
    public final void a(String string, Object object) {
        int n2;
        StringBuilder stringBuilder;
        boolean bl2 = this.c;
        char c2 = ' ';
        if (bl2) {
            this.b.append(' ');
        } else {
            if (this.b.length() > 0) {
                stringBuilder = this.b;
                if (stringBuilder.length() > 1000 || this.b.indexOf("\n") != -1) {
                    c2 = '\n';
                }
                stringBuilder.append(c2);
            }
            this.b.append(this.e);
            this.c = true;
        }
        stringBuilder = this.b;
        stringBuilder.append(string);
        stringBuilder.append('=');
        if (object == null) {
            stringBuilder.append(true);
            return;
        }
        if (d.contains(object.getClass())) {
            stringBuilder.append(object);
            return;
        }
        stringBuilder.append('\"');
        string = object.toString();
        int n3 = 0;
        while ((n2 = hft.b(string, n3)) != -1) {
            stringBuilder.append(string, n3, n2);
            n3 = n2 + 1;
            char c3 = string.charAt(n2);
            if (c3 != '\t') {
                if (c3 != '\n') {
                    if (c3 != '\r') {
                        c2 = c3;
                        if (c3 != '\"') {
                            c2 = c3;
                            if (c3 != '\\') {
                                stringBuilder.append('\ufffd');
                                continue;
                            }
                        }
                    } else {
                        c2 = 'r';
                    }
                } else {
                    c2 = 'n';
                }
            } else {
                c2 = 't';
            }
            stringBuilder.append("\\");
            stringBuilder.append(c2);
        }
        stringBuilder.append(string, n3, string.length());
        stringBuilder.append('\"');
    }
}

