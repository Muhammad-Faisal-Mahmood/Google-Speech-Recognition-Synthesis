/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Printer
 */
import J.N;
import android.util.Printer;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

class kng
implements Printer {
    private String a;

    public void a(String string) {
        EarlyTraceEvent.a();
        if (!TraceEvent.a) {
            return;
        }
        if (TraceEvent.c) {
            string = "Looper.dispatch: EVENT_NAME_FILTERED";
        } else {
            int n2 = string.indexOf(40, 18);
            int n3 = n2 == -1 ? -1 : string.indexOf(41, n2);
            String string2 = "";
            String string3 = n3 != -1 ? string.substring(n2 + 1, n3) : "";
            int n4 = string.indexOf(125, 18);
            n3 = n4 == -1 ? -1 : string.indexOf(58, n4);
            n2 = n3;
            if (n3 == -1) {
                n2 = string.length();
            }
            if (n4 != -1) {
                string2 = string.substring(n4 + 2, n2);
            }
            string = a.aq(string2, string3, "Looper.dispatch: ", "(", ")");
        }
        this.a = string;
        if (TraceEvent.a) {
            N.M_y76mct(this.a);
            return;
        }
        EarlyTraceEvent.a();
    }

    public void b(String string) {
        EarlyTraceEvent.a();
        if (TraceEvent.a && this.a != null) {
            if (TraceEvent.a) {
                N.MLJecZJ9();
            } else {
                EarlyTraceEvent.a();
            }
        }
        this.a = null;
    }

    public final void println(String string) {
        if (string.startsWith(">")) {
            this.a(string);
            return;
        }
        this.b(string);
    }
}

