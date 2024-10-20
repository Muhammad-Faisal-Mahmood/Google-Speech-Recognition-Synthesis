/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.SQLException
 *  android.view.View
 *  android.widget.EdgeEffect
 */
import android.content.Context;
import android.database.SQLException;
import android.view.View;
import android.widget.EdgeEffect;
import java.lang.reflect.Method;

public final class yi {
    public static void a(EdgeEffect edgeEffect, float f2, float f3) {
        edgeEffect.onPull(f2, f3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(View view, float f2) {
        try {
            ki$$ExternalSyntheticApiModelOutline0.m(view, f2);
            return;
        }
        catch (LinkageError linkageError) {
            return;
        }
    }

    public static final void c() {
        abr.d(true);
        int n2 = ado.a;
    }

    public static /* synthetic */ void d() {
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
        agf.z(7);
    }

    public static /* synthetic */ void e() {
        agf.z(0);
        agf.z(1);
        agf.z(2);
        agf.z(3);
        agf.z(4);
        agf.z(5);
        agf.z(6);
    }

    public static final Method f() {
        return (Method)awu.c.a();
    }

    public static final Method g() {
        return (Method)awu.b.a();
    }

    public static final awn h(Context context) {
        jse.e(context, "context");
        return new awn(context);
    }

    public static final void i(awq object, Object[] objectArray) {
        if (objectArray != null) {
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                Object object2 = objectArray[i2];
                if (object2 == null) {
                    object.f(i2);
                    continue;
                }
                if (object2 instanceof byte[]) {
                    object.c(i2, (byte[])object2);
                    continue;
                }
                if (object2 instanceof Float) {
                    object.d(i2, ((Number)object2).floatValue());
                    continue;
                }
                if (object2 instanceof Double) {
                    object.d(i2, ((Number)object2).doubleValue());
                    continue;
                }
                if (object2 instanceof Long) {
                    object.e(i2, ((Number)object2).longValue());
                    continue;
                }
                if (object2 instanceof Integer) {
                    object.e(i2, ((Number)object2).intValue());
                    continue;
                }
                if (object2 instanceof Short) {
                    object.e(i2, ((Number)object2).shortValue());
                    continue;
                }
                if (object2 instanceof Byte) {
                    object.e(i2, ((Number)object2).byteValue());
                    continue;
                }
                if (object2 instanceof String) {
                    object.g(i2, (String)object2);
                    continue;
                }
                if (object2 instanceof Boolean) {
                    long l2 = true != (Boolean)object2 ? 0L : 1L;
                    object.e(i2, l2);
                    continue;
                }
                object = new StringBuilder("Cannot bind ");
                ((StringBuilder)object).append(object2);
                ((StringBuilder)object).append(" at index ");
                ((StringBuilder)object).append(i2);
                ((StringBuilder)object).append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        }
    }

    public static final void j(int n2, String string) {
        throw new SQLException(a.af(n2, "Error code: ").concat(", message: ".concat(string)));
    }

    public static final void k(bzb object, String string) {
        object = ((bzb)object).L(string);
        try {
            object.h();
            return;
        }
        finally {
            object.e();
        }
    }
}

