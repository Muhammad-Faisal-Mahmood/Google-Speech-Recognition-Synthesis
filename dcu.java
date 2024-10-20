/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class dcu
extends Exception {
    private dcu(String string, Throwable throwable) {
        super(string, throwable);
    }

    public static void a(Collection object, String object2, Object ... object3) {
        Object object4;
        block38: {
            int n2;
            Object object5;
            object4 = object.iterator();
            Object var9_6 = null;
            object = null;
            while (object4.hasNext()) {
                object5 = (hpn)object4.next();
                try {
                    hhk.S((Future)object5);
                }
                catch (ExecutionException executionException) {
                    object5 = object;
                    if (object == null) {
                        object5 = new gzs();
                    }
                    ((gzs)object5).h(crh.r(executionException));
                    object = object5;
                }
            }
            if (object == null) {
                return;
            }
            object4 = ((gzs)object).g();
            object2 = String.format(Locale.US, (String)object2, (Object[])object3);
            int n3 = ((hct)object4).c;
            object = object2;
            if (n3 <= 1) break block38;
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("\n");
            ((StringBuilder)object).append(n3 - 1);
            ((StringBuilder)object).append(" additional failure(s) besides cause:\n");
            object3 = ((StringBuilder)object).toString();
            object2 = new StringWriter();
            object = ((StringWriter)object2).getBuffer();
            PrintWriter printWriter = new PrintWriter((Writer)object2);
            printWriter.println((String)object3);
            n3 = 0;
            int n4 = 1;
            while (true) {
                int n5;
                block36: {
                    if (n4 >= ((hct)object4).c) break;
                    object3 = (Throwable)object4.get(n4);
                    n5 = n4 + 1;
                    printWriter.printf("--- Failure %d ----------------------------\n", n5);
                    if (n3 <= 32) break block36;
                    printWriter.println(crh.q((Throwable)object3, 1));
                    n4 = n5;
                    continue;
                }
                n4 = ((StringBuffer)object).length() - 1;
                ((Throwable)object3).printStackTrace(printWriter);
                n2 = 1;
                while (true) {
                    if (n4 >= ((StringBuffer)object).length()) break;
                    int n6 = n2;
                    if (((StringBuffer)object).charAt(n4) == '\n') {
                        n6 = n2 + 1;
                    }
                    ++n4;
                    n2 = n6;
                    continue;
                    break;
                }
                n3 += n2;
                n4 = n5;
            }
            printWriter.println("-------------------------------------------");
            object5 = ((StringWriter)object2).toString();
            object = crh.p((String)object5, 0);
            object2 = var9_6;
            while (object != null) {
                object3 = object2;
                if (object2 == null) {
                    object3 = new ArrayList();
                }
                n4 = 0;
                n3 = 0;
                while (true) {
                    block37: {
                        if (n4 >= object3.size()) break;
                        object2 = (dcz)object3.get(n4);
                        n2 = n3;
                        if (((dcz)object2).e < 0) break block37;
                        n2 = n3 + 1;
                    }
                    if (((dcz)object2).hashCode() == ((dcz)object).hashCode()) {
                        ((dcz)object).e = n2;
                        break;
                    }
                    ++n4;
                    n3 = n2;
                    continue;
                    break;
                }
                object3.add(object);
                object = crh.p((String)object5, ((dcz)object).b + 1);
                object2 = object3;
            }
            object = object5;
            if (object2 == null) break block38;
            object3 = new StringBuilder();
            n4 = 0;
            n3 = 0;
            while (true) {
                if (n4 >= object2.size()) break;
                object = (dcz)object2.get(n4);
                ((StringBuilder)object3).append((CharSequence)object5, n3, ((dcz)object).a);
                if (((dcz)object).e >= 0) {
                    ((StringBuilder)object3).append("\tSame as stack trace [");
                    ((StringBuilder)object3).append(((dcz)object).e + 1);
                    ((StringBuilder)object3).append("]\n");
                } else {
                    ((StringBuilder)object3).append(object);
                }
                n3 = ((dcz)object).b + 1;
                ++n4;
                continue;
                break;
            }
            try {
                if (n3 < ((String)object5).length()) {
                    ((StringBuilder)object3).append((CharSequence)object5, n3, ((String)object5).length());
                }
                object = ((StringBuilder)object3).toString();
            }
            catch (Throwable throwable) {
                try {
                    object2 = ((Object)throwable).toString();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Failed to build string from throwables: ");
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                }
                finally {
                    printWriter.close();
                }
            }
        }
        throw new dcu((String)object, (Throwable)object4.get(0));
    }
}

