/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  dalvik.system.VMStack
 */
import android.os.Build;
import dalvik.system.VMStack;

public final class hhc
extends hgt {
    private static final boolean a;
    private static final boolean b;
    private static final hgs c;

    static {
        boolean bl2;
        a = hhb.a();
        String string = Build.FINGERPRINT;
        boolean bl3 = bl2 = true;
        if (string != null) {
            bl3 = "robolectric".equals(Build.FINGERPRINT) ? bl2 : false;
        }
        b = bl3;
        c = new hha();
    }

    static Class p() {
        return VMStack.getStackClass2();
    }

    static String q() {
        try {
            String string = VMStack.getStackClass2().getName();
            return string;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ boolean r() {
        return b;
    }

    static /* bridge */ /* synthetic */ boolean s() {
        return a;
    }

    static boolean t() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            String string = hhc.q();
            boolean bl2 = hhb.class.getName().equals(string);
            return bl2;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    @Override
    protected hfv e(String object) {
        block7: {
            block6: {
                Object object2;
                char c2;
                block5: {
                    if (hhf.d.get() == null) break block5;
                    object = ((hgy)hhf.d.get()).a((String)object);
                    break block6;
                }
                int n2 = ((String)object).length();
                do {
                    object2 = object;
                    if (--n2 < 0) break;
                    c2 = ((String)object).charAt(n2);
                    if (c2 == '$') {
                        object2 = ((String)object).replace('$', '.');
                        break;
                    }
                    object2 = object;
                } while (c2 != '.');
                object = new hhf((String)object2);
                hhe.a.offer(object);
                if (hhf.d.get() != null) break block7;
            }
            return object;
        }
        hhf.e();
        return object;
    }

    @Override
    protected hgs h() {
        return c;
    }

    @Override
    protected hhk j() {
        return hhg.a;
    }

    @Override
    protected String m() {
        return "platform: Android";
    }
}

