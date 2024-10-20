/*
 * Decompiled with CFR 0.152.
 */
public final class kpl
extends hwv
implements hyg {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    public static final kpl DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile hym PARSER;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean brotliEnabled_;
    public boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    public boolean disableCache_;
    public boolean enableNetworkQualityEstimator_;
    public String experimentalOptions_ = "";
    public boolean http2Enabled_;
    public long httpCacheMaxSize_;
    public int httpCacheMode_;
    public long mockCertVerifier_;
    public int networkThreadPriority_;
    public String quicDefaultUserAgentId_ = "";
    public boolean quicEnabled_;
    public String storagePath_ = "";
    public String userAgent_ = "";

    static {
        kpl kpl2;
        DEFAULT_INSTANCE = kpl2 = new kpl();
        hwv.z(kpl.class, kpl2);
    }

    private kpl() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object a(int n2, Object object) {
        if (--n2 == 0) {
            return (byte)1;
        }
        if (n2 == 2) {
            return new hyq(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006\b\u1004\u0007\t\u1002\b\n\u1008\t\u000b\u1002\n\f\u1007\u000b\r\u1007\f\u000e\u1004\r", new Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_"});
        }
        if (n2 == 3) {
            return new kpl();
        }
        if (n2 == 4) {
            return new hwp(DEFAULT_INSTANCE);
        }
        if (n2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (n2 != 6) {
            return null;
        }
        hym hym2 = PARSER;
        object = hym2;
        if (hym2 == null) {
            synchronized (kpl.class) {
                hym2 = PARSER;
                object = hym2;
                if (hym2 == null) {
                    PARSER = object = new hwq(DEFAULT_INSTANCE);
                }
            }
        }
        return object;
    }
}

