/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

final class hhi
extends hgw {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final hgg d;
    private final int e;

    public hhi(String string, int n2, Level level, boolean bl2, Set set, hgg hgg2) {
        super(string);
        this.e = 2;
        this.a = level;
        this.b = bl2;
        this.c = set;
        this.d = hgg2;
    }

    @Override
    public final void b(hfu hfu2) {
        int n2;
        Object object = (String)hfu2.l().d(hfo.a);
        String string = object;
        if (object == null) {
            string = this.d();
        }
        object = string;
        if (string == null) {
            string = hfu2.f().b();
            n2 = string.indexOf(36, string.lastIndexOf(46));
            object = string;
            if (n2 >= 0) {
                object = string.substring(0, n2);
            }
        }
        string = hhk.e((String)object);
        object = hfu2.o();
        if (!(this.b || Log.isLoggable((String)string, (int)(n2 = hhk.d((Level)object))) || Log.isLoggable((String)"all", (int)n2))) {
            return;
        }
        hhj.e(hfu2, string, 2, this.a, this.c, this.d);
    }

    @Override
    public final boolean c(Level level) {
        return true;
    }
}

