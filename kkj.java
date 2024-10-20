/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.Serializable;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class kkj
extends Handler {
    public static final kkj a = new kkj();

    private kkj() {
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void publish(LogRecord object) {
        jse.e(object, "record");
        Object object2 = kki.a;
        String string = ((LogRecord)object).getLoggerName();
        jse.d(string, "getLoggerName(...)");
        int n2 = ((LogRecord)object).getLevel().intValue() > Level.INFO.intValue() ? 5 : (((LogRecord)object).getLevel().intValue() == Level.INFO.intValue() ? 4 : 3);
        String string2 = ((LogRecord)object).getMessage();
        jse.d(string2, "getMessage(...)");
        Serializable serializable = ((LogRecord)object).getThrown();
        jse.e(string, "loggerName");
        jse.e(string2, "message");
        object = object2 = (String)kki.b.get(string);
        if (object2 == null) {
            object = jse.D(string, 23);
        }
        if (Log.isLoggable((String)object, (int)n2)) {
            object2 = string2;
            if (serializable != null) {
                object2 = Log.getStackTraceString((Throwable)serializable);
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append(string2);
                ((StringBuilder)serializable).append("\n");
                ((StringBuilder)serializable).append((String)object2);
                object2 = ((StringBuilder)serializable).toString();
            }
            int n3 = ((String)object2).length();
            block0: for (int i2 = 0; i2 < n3; ++i2) {
                int n4 = jse.L((CharSequence)object2, '\n', i2, 4);
                int n5 = i2;
                int n6 = n4;
                if (n4 == -1) {
                    n6 = n3;
                    n5 = i2;
                }
                while (true) {
                    i2 = Math.min(n6, n5 + 4000);
                    string2 = ((String)object2).substring(n5, i2);
                    jse.d(string2, "substring(...)");
                    Log.println((int)n2, (String)object, (String)string2);
                    if (i2 >= n6) {
                        continue block0;
                    }
                    n5 = i2;
                }
            }
        }
    }
}

