/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public final class jlk
implements HostnameVerifier {
    public static final jlk a = new jlk();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private jlk() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static List a(X509Certificate iterator, int n2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        try {
            iterator = ((X509Certificate)((Object)iterator)).getSubjectAlternativeNames();
            if (iterator == null) {
                return Collections.emptyList();
            }
            iterator = iterator.iterator();
            while (true) {
                Object object;
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                List list = (List)iterator.next();
                if (list == null || list.size() < 2 || (object = (Integer)list.get(0)) == null || (Integer)object != n2 || (object = (String)list.get(1)) == null) continue;
                arrayList.add(object);
            }
        }
        catch (CertificateParsingException certificateParsingException) {
            return Collections.emptyList();
        }
    }

    private static final boolean b(String string, String string2) {
        if (!(string == null || string.length() == 0 || string.startsWith(".") || string.endsWith("..") || string2 == null || string2.length() == 0 || string2.startsWith(".") || string2.endsWith(".."))) {
            String string3 = string;
            if (!string.endsWith(".")) {
                string3 = string.concat(".");
            }
            string = string2;
            if (!string2.endsWith(".")) {
                string = string2.concat(".");
            }
            if (!(string = string.toLowerCase(Locale.US)).contains("*")) {
                return string3.equals(string);
            }
            if (string.startsWith("*.") && string.indexOf(42, 1) == -1) {
                if (string3.length() < string.length()) {
                    return false;
                }
                if ("*.".equals(string)) {
                    return false;
                }
                if (!string3.endsWith(string = string.substring(1))) {
                    return false;
                }
                int n2 = string3.length() - string.length();
                return n2 <= 0 || string3.lastIndexOf(46, n2 - 1) == -1;
            }
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final boolean verify(String var1_1, SSLSession var2_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 25[TRYBLOCK] [41 : 1232->1242)] javax.net.ssl.SSLException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

