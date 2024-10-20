/*
 * Decompiled with CFR 0.152.
 */
public final class gsx
extends gst {
    static final int a = Integer.numberOfLeadingZeros(31);
    public static final gsy c = new gsx();

    public gsx() {
        super("CharMatcher.whitespace()");
    }

    @Override
    public final boolean b(char c2) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001\u202f\u00a0\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt(1682554634 * c2 >>> a) == c2;
    }
}

