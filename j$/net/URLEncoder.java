/*
 * Decompiled with CFR 0.152.
 */
package j$.net;

import j$.sun.security.action.a;
import j$.util.Objects;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.BitSet;

public class URLEncoder {
    static BitSet a;

    static {
        int n2;
        a = new BitSet(256);
        for (n2 = 97; n2 <= 122; ++n2) {
            a.set(n2);
        }
        for (n2 = 65; n2 <= 90; ++n2) {
            a.set(n2);
        }
        for (n2 = 48; n2 <= 57; ++n2) {
            a.set(n2);
        }
        Object object = a;
        ((BitSet)object).set(32);
        ((BitSet)object).set(45);
        ((BitSet)object).set(95);
        ((BitSet)object).set(46);
        ((BitSet)object).set(42);
        if (System.getSecurityManager() == null) {
            System.getProperty("file.encoding");
        } else {
            object = (String)AccessController.doPrivileged(new a(0));
        }
    }

    public static String a(String string, Charset charset) {
        Objects.requireNonNull(charset, "charset");
        StringBuilder stringBuilder = new StringBuilder(string.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n2 = 0;
        int n3 = 0;
        while (n2 < string.length()) {
            int n4 = string.charAt(n2);
            Object object = a;
            int n5 = n2;
            int n6 = n4;
            if (((BitSet)object).get(n4)) {
                n5 = n4;
                if (n4 == 32) {
                    n5 = 43;
                    n3 = 1;
                }
                stringBuilder.append((char)n5);
                ++n2;
                continue;
            }
            do {
                charArrayWriter.write(n6);
                n2 = n5;
                if (n6 >= 55296) {
                    n2 = n5;
                    if (n6 <= 56319) {
                        n3 = n5 + 1;
                        n2 = n5;
                        if (n3 < string.length()) {
                            n6 = string.charAt(n3);
                            n2 = n5;
                            if (n6 >= 56320) {
                                n2 = n5;
                                if (n6 <= 57343) {
                                    charArrayWriter.write(n6);
                                    n2 = n3;
                                }
                            }
                        }
                    }
                }
                if (++n2 >= string.length()) break;
                n3 = string.charAt(n2);
                n5 = n2;
                n6 = n3;
            } while (!((BitSet)object).get(n3));
            charArrayWriter.flush();
            object = new String(charArrayWriter.toCharArray()).getBytes(charset);
            for (n5 = 0; n5 < ((Object)object).length; ++n5) {
                char c2;
                stringBuilder.append('%');
                char c3 = c2 = Character.forDigit(object[n5] >> 4 & 0xF, 16);
                if (Character.isLetter(c2)) {
                    c3 = (char)(c2 - 32);
                }
                stringBuilder.append(c3);
                c3 = c2 = Character.forDigit(object[n5] & 0xF, 16);
                if (Character.isLetter(c2)) {
                    c3 = (char)(c2 - 32);
                }
                stringBuilder.append(c3);
            }
            charArrayWriter.reset();
            n3 = 1;
        }
        if (n3 != 0) {
            string = stringBuilder.toString();
        }
        return string;
    }

    public static String encode(String string, String string2) {
        if (string2 != null) {
            try {
                string = URLEncoder.a(string, Charset.forName(string2));
                return string;
            }
            catch (IllegalCharsetNameException | UnsupportedCharsetException illegalArgumentException) {
                throw new UnsupportedEncodingException(string2);
            }
        }
        throw new NullPointerException("charsetName");
    }
}

