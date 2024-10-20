/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.InflateException
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 */
import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

final class fa
implements MenuItem.OnMenuItemClickListener {
    private static final Class[] a = new Class[]{MenuItem.class};
    private final Object b;
    private Method c;

    public fa(Object object, String object2) {
        this.b = object;
        Class<?> clazz = object.getClass();
        try {
            this.c = clazz.getMethod((String)object2, a);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Couldn't resolve menu item onClick handler ");
            stringBuilder.append((String)object2);
            stringBuilder.append(" in class ");
            stringBuilder.append(clazz.getName());
            object2 = new InflateException(stringBuilder.toString());
            object2.initCause((Throwable)exception);
            throw object2;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.c.getReturnType() == Boolean.TYPE) {
                return (Boolean)this.c.invoke(this.b, menuItem);
            }
            this.c.invoke(this.b, menuItem);
            return true;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

