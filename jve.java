/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLong;

public final class jve {
    public static final boolean a;
    public static final boolean b;
    public static final AtomicLong c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        boolean bl2;
        boolean bl3;
        block4: {
            block0: {
                block3: {
                    String string;
                    block1: {
                        block2: {
                            string = kbu.a("kotlinx.coroutines.debug");
                            bl3 = true;
                            if (string == null) break block0;
                            int n2 = string.hashCode();
                            if (n2 == 0) break block1;
                            if (n2 == 3551) break block2;
                            if (!(n2 != 109935 ? n2 == 3005871 && string.equals("auto") : string.equals("off"))) throw new IllegalStateException(a.aj(string, "System property 'kotlinx.coroutines.debug' has unrecognized value '", "'"));
                            break block0;
                        }
                        if (!string.equals("on")) throw new IllegalStateException(a.aj(string, "System property 'kotlinx.coroutines.debug' has unrecognized value '", "'"));
                        break block3;
                    }
                    if (!string.equals("")) throw new IllegalStateException(a.aj(string, "System property 'kotlinx.coroutines.debug' has unrecognized value '", "'"));
                }
                bl2 = true;
                break block4;
            }
            bl2 = false;
        }
        a = bl2;
        bl2 = bl2 && jse.ao("kotlinx.coroutines.stacktrace.recovery", true) ? bl3 : false;
        b = bl2;
        c = new AtomicLong(0L);
    }
}

