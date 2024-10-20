/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kke
extends kkf {
    public static final boolean a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2;
        block13: {
            block12: {
                block11: {
                    Object object;
                    block10: {
                        block5: {
                            int n2;
                            int n3;
                            int n4;
                            int n5;
                            block9: {
                                block8: {
                                    block6: {
                                        block7: {
                                            object = System.getProperty("java.specification.version");
                                            bl2 = true;
                                            if (object == null) break block5;
                                            jse.ab(10);
                                            n5 = ((String)object).length();
                                            if (n5 == 0) break block5;
                                            n4 = ((String)object).charAt(0);
                                            n3 = jse.a(n4, 48);
                                            n2 = -2147483647;
                                            if (n3 >= 0) break block6;
                                            if (n5 == 1) break block5;
                                            if (n4 != 45) break block7;
                                            n2 = Integer.MIN_VALUE;
                                            n4 = 1;
                                            break block8;
                                        }
                                        if (n4 != 43) break block5;
                                        n4 = 1;
                                        n3 = 0;
                                        break block9;
                                    }
                                    n4 = 0;
                                }
                                n3 = n4;
                            }
                            int n6 = 0;
                            int n7 = -59652323;
                            while (n4 < n5) {
                                int n8 = jse.ac(((String)object).charAt(n4));
                                if (n8 < 0) break block5;
                                int n9 = n7;
                                if (n6 < n7) {
                                    if (n7 != -59652323) break block5;
                                    n9 = -214748364;
                                    if (n6 < -214748364) break block5;
                                }
                                if ((n6 *= 10) >= n2 + n8) {
                                    n6 -= n8;
                                    ++n4;
                                    n7 = n9;
                                    continue;
                                }
                                break block5;
                            }
                            object = n3 != 0 ? Integer.valueOf(n6) : Integer.valueOf(-n6);
                            break block10;
                        }
                        object = null;
                    }
                    if (object == null) break block11;
                    if ((Integer)object < 9) break block12;
                    break block13;
                }
                try {
                    SSLSocket.class.getMethod("getApplicationProtocol", null);
                }
                catch (NoSuchMethodException noSuchMethodException) {}
            }
            bl2 = false;
        }
        a = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a(SSLSocket object) {
        block4: {
            jse.e(object, "sslSocket");
            try {
                object = dp$$ExternalSyntheticApiModelOutline0.m((SSLSocket)object);
                if (object == null) break block4;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                return null;
            }
            boolean bl2 = jse.i(object, "");
            if (bl2) break block4;
            return object;
        }
        return null;
    }

    @Override
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override
    public final void d(SSLSocket sSLSocket, String object, List list) {
        jse.e(sSLSocket, "sslSocket");
        jse.e(list, "protocols");
        object = sSLSocket.getSSLParameters();
        dp$$ExternalSyntheticApiModelOutline0.m((SSLParameters)object, kmp.C(list).toArray(new String[0]));
        sSLSocket.setSSLParameters((SSLParameters)object);
    }
}

