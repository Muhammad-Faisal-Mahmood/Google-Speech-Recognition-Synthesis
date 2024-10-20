/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

public final class kbs {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object object = new Exception();
        Object object2 = a.class.getSimpleName();
        jse.d(object2, "getSimpleName(...)");
        object = ((Throwable)object).getStackTrace()[0];
        String string = String.valueOf(object2);
        object2 = ((StackTraceElement)object).getFileName();
        int n2 = ((StackTraceElement)object).getLineNumber();
        a = new StackTraceElement("_COROUTINE.".concat(string), "_", (String)object2, n2);
        try {
            object = Class.forName("jqm").getCanonicalName();
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (joe.a(object) != null) {
            object2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String)object2;
        try {
            object = Class.forName("kbs").getCanonicalName();
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        object2 = object;
        if (joe.a(object) != null) {
            object2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String)object2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Throwable a(Throwable object, jqp object2) {
        int n2;
        int n3;
        Object object3;
        int n4;
        Object object4;
        block15: {
            block18: {
                block17: {
                    object4 = ((Throwable)object).getCause();
                    n4 = 0;
                    if (object4 == null) break block17;
                    object3 = object.getClass();
                    if (!jse.i(object4.getClass(), object3)) break block17;
                    object3 = ((Throwable)object).getStackTrace();
                    n3 = ((StackTraceElement[])object3).length;
                    break block18;
                }
                object4 = new joc(object, new StackTraceElement[0]);
                break block15;
            }
            for (n2 = 0; n2 < n3; ++n2) {
                if (!kbs.d(object3[n2])) continue;
                object4 = new joc(object4, object3);
                break block15;
            }
            object4 = new joc(object, new StackTraceElement[0]);
        }
        object3 = ((joc)object4).b;
        Throwable throwable = (Throwable)((joc)object4).a;
        StackTraceElement[] stackTraceElementArray = object3;
        object3 = kbd.a(throwable);
        if (object3 == null) {
            return object;
        }
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<StackTraceElement>();
        object2.by();
        do {
            object4 = object2;
            if (!(object2 instanceof jqp)) {
                object4 = null;
            }
            if (object4 == null) break;
            object2 = object4 = object4.bx();
        } while (object4 != null);
        if (arrayDeque.isEmpty()) {
            return object;
        }
        if (throwable != object) {
            block16: {
                n3 = stackTraceElementArray.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    if (!kbs.d(stackTraceElementArray[n2])) {
                        continue;
                    }
                    break block16;
                }
                n2 = -1;
            }
            n3 = n2 + 1;
            n2 = stackTraceElementArray.length - 1;
            if (n3 <= n2) {
                while (true) {
                    object = stackTraceElementArray[n2];
                    object2 = (StackTraceElement)arrayDeque.getLast();
                    if (((StackTraceElement)object).getLineNumber() == ((StackTraceElement)object2).getLineNumber() && jse.i(((StackTraceElement)object).getMethodName(), ((StackTraceElement)object2).getMethodName()) && jse.i(((StackTraceElement)object).getFileName(), ((StackTraceElement)object2).getFileName()) && jse.i(((StackTraceElement)object).getClassName(), ((StackTraceElement)object2).getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArray[n2]);
                    if (n2 == n3) break;
                    --n2;
                }
            }
        }
        arrayDeque.addFirst(a);
        object2 = throwable.getStackTrace();
        n3 = kbs.e((StackTraceElement[])object2, b);
        if (n3 == -1) {
            ((Throwable)object3).setStackTrace(arrayDeque.toArray(new StackTraceElement[0]));
            return object3;
        }
        object = new StackTraceElement[arrayDeque.size() + n3];
        for (n2 = 0; n2 < n3; ++n2) {
            object[n2] = object2[n2];
        }
        object2 = arrayDeque.iterator();
        n2 = n4;
        while (true) {
            if (!object2.hasNext()) {
                ((Throwable)object3).setStackTrace((StackTraceElement[])object);
                return object3;
            }
            object[n2 + n3] = (StackTraceElement)object2.next();
            ++n2;
        }
    }

    public static final Throwable b(Throwable serializable) {
        Throwable throwable;
        if (jve.b && (throwable = kbd.a((Throwable)serializable)) != null) {
            int n2;
            StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
            int n3 = stackTraceElementArray.length;
            int n4 = n3 - 1;
            if (n4 >= 0) {
                while (true) {
                    n2 = n4 - 1;
                    serializable = stackTraceElementArray[n4];
                    if (!jse.i(c, ((StackTraceElement)serializable).getClassName())) {
                        if (n2 < 0) break;
                        n4 = n2;
                        continue;
                    }
                    break;
                }
            } else {
                n4 = -1;
            }
            n2 = kbs.e(stackTraceElementArray, b);
            int n5 = 0;
            n2 = n2 == -1 ? 0 : n3 - n2;
            n3 = n3 - n4 - n2;
            StackTraceElement[] stackTraceElementArray2 = new StackTraceElement[n3];
            for (n2 = n5; n2 < n3; ++n2) {
                serializable = n2 == 0 ? a : stackTraceElementArray[n4 + 1 + n2 - 1];
                stackTraceElementArray2[n2] = serializable;
            }
            throwable.setStackTrace(stackTraceElementArray2);
            return throwable;
        }
        return serializable;
    }

    public static final Throwable c(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        if (throwable2 != null) {
            StackTraceElement[] stackTraceElementArray = throwable.getClass();
            if (jse.i(throwable2.getClass(), stackTraceElementArray)) {
                stackTraceElementArray = throwable.getStackTrace();
                int n2 = stackTraceElementArray.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (!kbs.d(stackTraceElementArray[i2])) continue;
                    return throwable2;
                }
            }
        }
        return throwable;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return jse.X(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArray, String string) {
        int n2;
        block2: {
            int n3 = stackTraceElementArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                if (!jse.i(string, stackTraceElementArray[n2].getClassName())) {
                    continue;
                }
                break block2;
            }
            n2 = -1;
        }
        return n2;
    }
}

