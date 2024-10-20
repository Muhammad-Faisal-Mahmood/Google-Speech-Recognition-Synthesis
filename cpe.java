/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

public final class cpe
extends Exception {
    public cpe(Thread thread) {
        this(thread, null);
    }

    public cpe(Thread object, Throwable throwable) {
        Object object2 = LockSupport.getBlocker((Thread)object);
        Object object3 = ((Thread)object).getState();
        String string = String.valueOf(object);
        Object object4 = "";
        object3 = object3 == null ? "" : " in state ".concat(object3.toString());
        Object object5 = object2 == null ? "" : " blocked on ".concat(object2.toString());
        Thread thread = cpe.a(object2);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append((String)object5);
        object3 = thread == null ? object4 : " (see cause for owner state)";
        ((StringBuilder)object2).append((String)object3);
        object3 = ((StringBuilder)object2).toString();
        object5 = ((Thread)object).getStackTrace();
        object4 = cpe.a(LockSupport.getBlocker((Thread)object));
        object = throwable;
        if (object4 != null) {
            object = new cpe((Thread)object4, throwable);
        }
        super((String)object3);
        if (object != null) {
            this.initCause((Throwable)object);
        }
        this.setStackTrace((StackTraceElement[])object5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static Thread a(Object object) {
        boolean bl2 = object instanceof AbstractOwnableSynchronizer;
        Method method = null;
        Object object2 = method;
        if (!bl2) return object2;
        try {
            object2 = AbstractOwnableSynchronizer.class.getDeclaredMethod("getExclusiveOwnerThread", null);
            ((Method)object2).setAccessible(true);
            return (Thread)((Method)object2).invoke(object, null);
        }
        catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException exception) {
            return method;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Throwable fillInStackTrace() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return this;
    }
}

