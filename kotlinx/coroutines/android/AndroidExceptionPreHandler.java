/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class AndroidExceptionPreHandler
extends jpw
implements CoroutineExceptionHandler {
    private volatile Object _preHandler = this;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Method preHandler() {
        Object object = this._preHandler;
        if (object != this) {
            return (Method)object;
        }
        Object var3_3 = null;
        try {
            Method method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            object = var3_3;
            if (Modifier.isPublic(method.getModifiers())) {
                boolean bl2 = Modifier.isStatic(method.getModifiers());
                object = !bl2 ? var3_3 : method;
            }
        }
        catch (Throwable throwable) {
            object = var3_3;
        }
        this._preHandler = object;
        return object;
    }

    @Override
    public void handleException(jqf object, Throwable throwable) {
        if (Build.VERSION.SDK_INT < 28) {
            object = this.preHandler();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if ((object = object != null ? ((Method)object).invoke(null, null) : null) instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler)object;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), throwable);
            }
        }
    }
}

