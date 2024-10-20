/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class ksl {
    public static final String a = "ksl";
    public static final Set b;
    public JSONObject c = new JSONObject();

    static {
        HashSet<String> hashSet = new HashSet<String>(228);
        for (int i2 = 0; i2 < 228; ++i2) {
            String string = (new String[]{"CHLO", "SHLO", "SCFG", "REJ", "CETV", "PRST", "SCUP", "ALPN", "P256", "C255", "AESG", "CC20", "QBIC", "AFCW", "IFW5", "IFW6", "IFW7", "IFW8", "IFW9", "IFWA", "TBBR", "1RTT", "2RTT", "LRTT", "BBS1", "BBS2", "BBS3", "BBS4", "BBS5", "BBRR", "BBR1", "BBR2", "BBR3", "BBR4", "BBR5", "BBR9", "BBRA", "BBRB", "BBRS", "BBQ1", "BBQ2", "BBQ3", "BBQ5", "BBQ6", "BBQ7", "BBQ8", "BBQ9", "BBQ0", "RENO", "TPCC", "BYTE", "IW03", "IW10", "IW20", "IW50", "B2ON", "B2NA", "B2NE", "B2RP", "B2LO", "B2HR", "B2SL", "B2H2", "B2RC", "BSAO", "B2DL", "B201", "B202", "B203", "B204", "B205", "B206", "B207", "NTLP", "1TLP", "1RTO", "NRTO", "TIME", "ATIM", "MIN1", "MIN4", "MAD0", "MAD2", "MAD3", "1ACK", "AKD3", "AKDU", "AFFE", "AFF1", "AFF2", "SSLR", "NPRR", "2RTO", "3RTO", "4RTO", "5RTO", "6RTO", "CBHD", "NBHD", "CONH", "LFAK", "STMP", "EACK", "ILD0", "ILD1", "ILD2", "ILD3", "ILD4", "RUNT", "NSTP", "NRTT", "1PTO", "2PTO", "6PTO", "7PTO", "8PTO", "PTOS", "PTOA", "PEB1", "PEB2", "PVS1", "PAG1", "PAG2", "PSDA", "PLE1", "PLE2", "APTO", "ELDT", "RVCM", "TCID", "MPTH", "NCMR", "DFER", "NPCO", "BWRE", "BWMX", "BWID", "BWI1", "BWRS", "BWS2", "BWS3", "BWS4", "BWS5", "BWS6", "BWP0", "BWP1", "BWP2", "BWP3", "BWP4", "BWG4", "BWG7", "BWG8", "BWS7", "BWM3", "BWM4", "ICW1", "DTOS", "FIDT", "3AFF", "10AF", "MTUH", "MTUL", "NSLC", "NCHP", "NBPE", "X509", "X59R", "CHID", "VER ", "NONC", "NONP", "KEXS", "AEAD", "COPT", "CLOP", "ICSL", "MIBS", "MIUS", "ADE ", "IRTT", "TRTT", "SNI ", "PUBS", "SCID", "ORBT", "PDMD", "PROF", "CCRT", "EXPY", "STTL", "SFCW", "CFCW", "UAID", "XLCT", "QLVE", "PDP1", "PDP2", "PDP3", "PDP5", "QNZ2", "MAD", "IGNP", "SRWP", "ROWF", "ROWR", "GSR0", "GSR1", "GSR2", "GSR3", "NRES", "INVC", "GWCH", "YTCH", "ACH0", "RREJ", "CADR", "ASAD", "SRST", "CIDK", "CIDS", "RNON", "RSEQ", "PAD ", "EPID", "SNO0", "STK0", "CRT255", "CSCT"})[i2];
            if (hashSet.add(j$.util.Objects.requireNonNull(string))) {
                continue;
            }
            Objects.toString(string);
            throw new IllegalArgumentException("duplicate element: ".concat(String.valueOf(string)));
        }
        b = DesugarCollections.unmodifiableSet(hashSet);
    }

    /*
     * WARNING - void declaration
     */
    public ksl(String string) {
        if (!ksl.b(string)) {
            try {
                JSONTokener jSONTokener = new JSONTokener(string);
                this.c = (JSONObject)jSONTokener.nextValue();
                return;
            }
            catch (ClassCastException classCastException) {
            }
            catch (JSONException jSONException) {
                // empty catch block
            }
            if (Log.isLoggable((String)a, (int)2)) {
                void var1_4;
                String.format("Experimental options could not be parsed, using default values. Error: %s", var1_4.getMessage());
            }
        }
    }

    public static final boolean b(String string) {
        return string == null || string.isEmpty();
        {
        }
    }

    /*
     * WARNING - void declaration
     */
    public final Object a(String object, String string, Object object2, Class clazz) {
        Object object3;
        block11: {
            object3 = object2;
            if (this.c.length() != 0) {
                try {
                    object = object3 = this.c.getJSONObject((String)object);
                }
                catch (JSONException jSONException) {
                    if (Log.isLoggable((String)a, (int)2)) {
                        String.format("Failed to get %s options: %s", object, jSONException.getMessage());
                    }
                    object = null;
                }
                object3 = object2;
                if (object != null) {
                    if (object.length() == 0) {
                        object3 = object2;
                    } else {
                        try {
                            object3 = clazz.cast(object.get(string));
                            break block11;
                        }
                        catch (ClassCastException classCastException) {
                        }
                        catch (JSONException jSONException) {
                            // empty catch block
                        }
                        object3 = object2;
                        if (Log.isLoggable((String)a, (int)2)) {
                            void var1_4;
                            String.format("Failed to get %s options: %s", string, var1_4.getMessage());
                            object3 = object2;
                        }
                    }
                }
            }
        }
        return object3;
    }
}

