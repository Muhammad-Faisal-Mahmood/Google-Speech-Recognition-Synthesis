/*
 * Decompiled with CFR 0.152.
 */
public final class dut
extends RuntimeException {
    public final int a;

    public dut(int n2, String string, Throwable throwable) {
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n2);
            stringBuilder.append(": ");
            stringBuilder.append(string);
            string = stringBuilder.toString();
        } else {
            string = String.valueOf(n2);
        }
        super(string, throwable);
        this.a = n2;
    }
}

