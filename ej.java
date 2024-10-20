/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ej
implements View.OnClickListener {
    private final View a;
    private final String b;
    private Method c;
    private Context d;

    public ej(View view, String string) {
        this.a = view;
        this.b = string;
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(View var1_1) {
        block13: {
            if (this.c == null) {
                var3_4 = this.a.getContext();
                block6: while (var3_4 != null) {
                    block12: {
                        if (var3_4.isRestricted() || (var4_5 = var3_4.getClass().getMethod(this.b, new Class[]{View.class})) == null) break block12;
                        this.c = var4_5;
                        this.d = var3_4;
                        break block13;
                    }
lbl11:
                    // 2 sources

                    while (true) {
                        if (var3_4 instanceof ContextWrapper) {
                            var3_4 = ((ContextWrapper)var3_4).getBaseContext();
                            continue block6;
                        }
                        var3_4 = null;
                        continue block6;
                        break;
                    }
                }
                var2_7 = this.a.getId();
                if (var2_7 == -1) {
                    var1_1 = "";
                } else {
                    var1_1 = new StringBuilder(" with id '");
                    var1_1.append(this.a.getContext().getResources().getResourceEntryName(var2_7));
                    var1_1.append("'");
                    var1_1 = var1_1.toString();
                }
                var3_4 = new StringBuilder("Could not find method ");
                var3_4.append(this.b);
                var3_4.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                var3_4.append(this.a.getClass());
                var3_4.append((String)var1_1);
                throw new IllegalStateException(var3_4.toString());
            }
        }
        try {
            this.c.invoke((Object)this.d, new Object[]{var1_1});
            return;
        }
        catch (InvocationTargetException var1_2) {
            throw new IllegalStateException("Could not execute method for android:onClick", var1_2);
        }
        catch (IllegalAccessException var1_3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", var1_3);
        }
        catch (NoSuchMethodException var4_6) {
            ** continue;
        }
    }
}

