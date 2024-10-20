/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

public final class x {
    public static final Object a = new Object();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(Context var0) {
        var7_3 = x.a;
        synchronized (var7_3) {
            block16: {
                block17: {
                    block18: {
                        block15: {
                            var5_4 = "";
                            var8_6 = var0.openFileInput("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                            ** try [egrp 1[TRYBLOCK] [4, 2, 3 : 20->122)] { 
lbl7:
                            // 1 sources

                            break block18;
lbl-1000:
                            // 1 sources

                            {
                                catch (Throwable var0_1) {
                                    break block15;
                                }
lbl10:
                                // 2 sources

                                catch (IOException | XmlPullParserException var4_12) {}
                                {
                                    Log.w((String)"AppLocalesStorageHelper", (String)"Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                                    var6_7 = var5_4;
                                    if (var8_6 == null) break block16;
                                    var4_11 = var5_4;
                                }
                            }
lbl16:
                            // 2 sources

                            while (true) {
                                var8_6.close();
                                var6_7 = var4_11;
                                break;
                            }
                        }
                        if (var8_6 == null) throw var0_1;
                        var8_6.close();
                        throw var0_1;
                        catch (FileNotFoundException var0_2) {
                            return "";
                        }
                    }
                    var6_7 = Xml.newPullParser();
                    var6_7.setInput((InputStream)var8_6, "UTF-8");
                    var3_8 = var6_7.getDepth();
                    do {
                        var2_10 = var6_7.next();
                        var4_11 = var5_4;
                        if (var2_10 == 1) break block17;
                        var1_9 = var2_10;
                        if (var2_10 != 3) continue;
                        var4_11 = var5_4;
                        if (var6_7.getDepth() <= var3_8) break block17;
                        var1_9 = 3;
                    } while (var1_9 == 3 || var1_9 == 4 || !var6_7.getName().equals("locales"));
                    var4_11 = var6_7.getAttributeValue(null, "application_locales");
                }
                var6_7 = var4_11;
                if (var8_6 != null) {
                    ** continue;
                }
                break block16;
                catch (IOException var5_5) {
                    var6_7 = var4_11;
                }
                break block16;
                catch (IOException var4_13) {
                    throw var0_1;
                }
            }
            if (var6_7.isEmpty() == false) return var6_7;
            var0.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
            return var6_7;
        }
    }

    static /* synthetic */ void b(cy cy2, an an2) {
        jse.e(cy2, "$operation");
        if (by.S(2)) {
            Objects.toString(cy2);
        }
        cy2.f(an2);
    }
}

