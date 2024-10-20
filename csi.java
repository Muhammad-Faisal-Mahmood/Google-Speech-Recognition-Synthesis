/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class csi
extends Exception {
    public final gzx a;

    private csi(String string, Throwable throwable, gzx gzx2) {
        super(string, throwable);
        this.a = gzx2;
    }

    static Throwable a(Throwable throwable) {
        Throwable throwable2;
        Throwable throwable3 = throwable.getCause();
        if (throwable3 == null) {
            throwable2 = throwable;
        } else {
            throwable2 = throwable;
            if (throwable.getClass().equals(ExecutionException.class)) {
                throwable2 = csi.a(throwable3);
            }
        }
        return throwable2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Collection object, Object ... object2) {
        Object object3;
        Object object4;
        Iterator iterator = object.iterator();
        object = null;
        while (iterator.hasNext()) {
            object4 = (hpn)iterator.next();
            try {
                hhk.S((Future)object4);
                continue;
            }
            catch (ExecutionException executionException) {
            }
            catch (CancellationException cancellationException) {
                // empty catch block
            }
            object3 = object;
            if (object == null) {
                object3 = new gzs();
            }
            ((gzs)object3).h(csi.a((Throwable)object4));
            object = object3;
        }
        if (object == null) {
            return;
        }
        object4 = ((gzs)object).g();
        object2 = String.format(Locale.US, "Failed to download file group %s", (Object[])object2);
        int n2 = ((hct)object4).c;
        object = object2;
        if (n2 <= 1) throw new csi((String)object, (Throwable)object4.get(0), (gzx)object4);
        object = new StringBuilder();
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("\n");
        ((StringBuilder)object).append(n2);
        ((StringBuilder)object).append(" failure(s) in total:\n");
        object = ((StringBuilder)object).toString();
        object2 = new StringWriter();
        object3 = new PrintWriter((Writer)object2);
        ((PrintWriter)object3).println((String)object);
        n2 = 0;
        while (n2 < ((hct)object4).c) {
            object = (Throwable)object4.get(n2);
            ((PrintWriter)object3).printf("--- Failure %d ----------------------------\n", ++n2);
            ((PrintWriter)object3).println(csi.c((Throwable)object, 1));
        }
        ((PrintWriter)object3).println("-------------------------------------------");
        object = ((StringWriter)object2).toString();
        ((PrintWriter)object3).close();
        ((StringWriter)object2).close();
        throw new csi((String)object, (Throwable)object4.get(0), (gzx)object4);
        catch (Throwable throwable) {
            try {
                ((PrintWriter)object3).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    try {
                        ((StringWriter)object2).close();
                        throw throwable3;
                    }
                    catch (Throwable throwable4) {
                        try {
                            throwable3.addSuppressed(throwable4);
                            throw throwable3;
                        }
                        catch (Throwable throwable5) {
                            object = "Failed to build string from throwables: ".concat(((Object)throwable5).toString());
                        }
                    }
                }
            }
        }
        throw new csi((String)object, (Throwable)object4.get(0), (gzx)object4);
    }

    private static String c(Throwable object, int n2) {
        String string = object.getClass().getName();
        CharSequence charSequence = ((Throwable)object).getMessage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append((String)charSequence);
        string = stringBuilder.toString();
        object = ((Throwable)object).getCause();
        if (object != null) {
            if (n2 >= 5) {
                return string.concat("\n(...)");
            }
            object = csi.c((Throwable)object, n2 + 1);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("\nCaused by: ");
            ((StringBuilder)charSequence).append((String)object);
            return ((StringBuilder)charSequence).toString();
        }
        return string;
    }
}

