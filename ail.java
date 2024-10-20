/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
import android.os.SystemClock;
import android.text.TextUtils;

public final class ail
extends aen {
    public final int c;
    public final String d;
    public final int e;
    public final adu f;
    public final int g;
    public final anc h;
    final boolean i;

    static {
        agf.z(1001);
        agf.z(1002);
        agf.z(1003);
        agf.z(1004);
        agf.z(1005);
        agf.z(1006);
    }

    public ail(int n2, Throwable throwable, int n3) {
        this(n2, throwable, n3, null, -1, null, 4, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ail(int n2, Throwable throwable, int n3, String string, int n4, adu adu2, int n5, boolean bl2) {
        String string2;
        String string3;
        if (n2 != 0) {
            if (n2 != 1) {
                string3 = "Unexpected runtime error";
            } else {
                string2 = String.valueOf(adu2);
                int n6 = agf.a;
                if (n5 != 0) {
                    if (n5 != 1) {
                        if (n5 != 2) {
                            if (n5 != 3) {
                                if (n5 != 4) throw new IllegalStateException();
                                string3 = "YES";
                            } else {
                                string3 = "NO_EXCEEDS_CAPABILITIES";
                            }
                        } else {
                            string3 = "NO_UNSUPPORTED_DRM";
                        }
                    } else {
                        string3 = "NO_UNSUPPORTED_TYPE";
                    }
                } else {
                    string3 = "NO";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(" error, index=");
                stringBuilder.append(n4);
                stringBuilder.append(", format=");
                stringBuilder.append(string2);
                stringBuilder.append(", format_supported=");
                stringBuilder.append(string3);
                string3 = stringBuilder.toString();
            }
        } else {
            string3 = "Source error";
        }
        string2 = string3;
        if (!TextUtils.isEmpty(null)) {
            string2 = string3.concat(": null");
        }
        this(string2, throwable, n3, n2, string, n4, adu2, n5, null, SystemClock.elapsedRealtime(), bl2);
    }

    private ail(String string, Throwable throwable, int n2, int n3, String string2, int n4, adu adu2, int n5, anc anc2, long l2, boolean bl2) {
        super(string, throwable, n2, l2);
        boolean bl3;
        boolean bl4 = false;
        if (bl2) {
            n2 = n3;
            if (n2 == 1) {
                n2 = 1;
                bl3 = true;
            } else {
                bl3 = false;
            }
        } else {
            n2 = n3;
            bl3 = true;
        }
        abr.d(bl3);
        bl3 = throwable == null ? bl4 : true;
        abr.d(bl3);
        this.c = n2;
        this.d = string2;
        this.e = n4;
        this.f = adu2;
        this.g = n5;
        this.h = anc2;
        this.i = bl2;
    }

    final ail a(anc anc2) {
        String string = this.getMessage();
        int n2 = agf.a;
        long l2 = this.b;
        boolean bl2 = this.i;
        return new ail(string, this.getCause(), this.a, this.c, this.d, this.e, this.f, this.g, anc2, l2, bl2);
    }
}

