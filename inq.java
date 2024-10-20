/*
 * Decompiled with CFR 0.152.
 */
public final class inq
implements inp {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;

    static {
        hdc hdc2 = hdc.a;
        a = dwg.c("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", hdc2, true, false);
        b = dwg.c("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", hdc2, true, false);
        c = dwg.c("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", hdc2, true, false);
    }

    @Override
    public final boolean a() {
        return (Boolean)a.a();
    }

    @Override
    public final boolean b() {
        return (Boolean)b.a();
    }

    @Override
    public final void c() {
        ((Boolean)c.a()).booleanValue();
    }
}

