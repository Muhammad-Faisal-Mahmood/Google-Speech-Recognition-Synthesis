/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class bmo
implements bmk {
    public final Method a;
    public final Activity b;

    public /* synthetic */ bmo(Method method, Activity activity) {
        this.a = method;
        this.b = activity;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void a(bml bml2) {
        void var1_4;
        Method method = this.a;
        Activity activity = this.b;
        try {
            method.invoke((Object)activity, bml2);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
        throw new RuntimeException("Couldn't call the MenuItem's listener", (Throwable)var1_4);
    }
}

