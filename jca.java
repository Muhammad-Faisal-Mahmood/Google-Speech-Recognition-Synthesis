/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

final class jca {
    static final Logger a = Logger.getLogger(ity.class.getName());
    public final Object b = new Object();
    public final ivn c;

    public jca(ivn object, long l2, String string) {
        a.s(object, "logId");
        this.c = object;
        object = new ivg();
        ((ivg)object).a = string.concat(" created");
        ((ivg)object).b = ivh.b;
        ((ivg)object).b(l2);
        this.b(((ivg)object).a());
    }

    static void a(ivn object, Level level, String string) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            object = object.toString();
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append((String)object);
            stringBuilder.append("] ");
            stringBuilder.append(string);
            object = new LogRecord(level, stringBuilder.toString());
            ((LogRecord)object).setLoggerName(logger.getName());
            ((LogRecord)object).setSourceClassName(logger.getName());
            ((LogRecord)object).setSourceMethodName("log");
            logger.log((LogRecord)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void b(ivi ivi2) {
        int n2 = ivi2.b.ordinal();
        Level level = n2 != 2 ? (n2 != 3 ? Level.FINEST : Level.FINE) : Level.FINER;
        Object object = this.b;
        // MONITORENTER : object
        // MONITOREXIT : object
        jca.a(this.c, level, ivi2.a);
    }
}

