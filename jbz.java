/*
 * Decompiled with CFR 0.152.
 */
import java.text.MessageFormat;
import java.util.logging.Level;

final class jbz
extends ity {
    private final jca a;

    public jbz(jca jca2, jjt jjt2) {
        a.s(jca2, "tracer");
        this.a = jca2;
        a.s(jjt2, "time");
    }

    public static Level c(int n2) {
        if (--n2 != 1) {
            if (n2 != 2 && n2 != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final void d(int n2) {
        if (n2 == 1) return;
        Object object = this.a.b;
        // MONITORENTER : object
        // MONITOREXIT : object
    }

    @Override
    public final void a(int n2, String string) {
        Level level = jbz.c(n2);
        if (jca.a.isLoggable(level)) {
            jca.a(this.a.c, level, string);
        }
        this.d(n2);
    }

    @Override
    public final void b(int n2, String string, Object ... objectArray) {
        Level level = jbz.c(n2);
        this.d(n2);
        string = jca.a.isLoggable(level) ? MessageFormat.format(string, objectArray) : null;
        this.a(n2, string);
    }
}

