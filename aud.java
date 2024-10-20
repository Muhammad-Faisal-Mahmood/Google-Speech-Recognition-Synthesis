/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteTransactionListener
 *  android.os.CancellationSignal
 */
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

public final class aud
extends jsf
implements jqz {
    public static final aud a;
    public static final aud b;
    public static final aud c;
    public static final aud d;
    public static final aud e;
    public static final aud f;
    public static final aud g;
    private final int h;

    static {
        g = new aud(9);
        f = new aud(8);
        e = new aud(7);
        d = new aud(5);
        c = new aud(4);
        b = new aud(3);
        a = new aud(1);
    }

    public aud(int n2) {
        this.h = n2;
        super(0);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object a() {
        void var2_12;
        void var2_6;
        int n2 = this.h;
        Method method = null;
        Object var2_4 = null;
        switch (n2) {
            default: {
                return "";
            }
            case 7: {
                return jon.a;
            }
            case 6: {
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            }
            case 5: {
                method = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                method.setAccessible(true);
                Method method2 = method;
                return var2_6;
            }
            case 4: {
                String[] stringArray = awu.a;
                GenericDeclaration genericDeclaration = yi.g();
                Method method3 = method;
                if (genericDeclaration == null) return var2_12;
                genericDeclaration = ((Method)genericDeclaration).getReturnType();
                Method method4 = method;
                if (genericDeclaration == null) return var2_12;
                Class<Integer> clazz = Integer.TYPE;
                Method method5 = ((Class)genericDeclaration).getDeclaredMethod("beginTransaction", clazz, SQLiteTransactionListener.class, clazz, CancellationSignal.class);
                return var2_12;
            }
            case 3: {
                return true;
            }
            case 2: {
                return jon.a;
            }
            case 1: {
                jss jss2 = jst.a;
                return jst.b.b() + 65536;
            }
            case 0: 
        }
        return jon.a;
        catch (Throwable throwable) {
            return var2_6;
        }
        catch (Throwable throwable) {
            Method method6 = method;
            return var2_12;
        }
    }
}

