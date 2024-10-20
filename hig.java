/*
 * Decompiled with CFR 0.152.
 */
final class hig
implements hif {
    private static final int c(StackTraceElement[] stackTraceElementArray, Class object) {
        object = ((Class)object).getName();
        boolean bl2 = false;
        for (int i2 = 3; i2 < stackTraceElementArray.length; ++i2) {
            boolean bl3;
            if (stackTraceElementArray[i2].getClassName().equals(object)) {
                bl3 = true;
            } else {
                bl3 = bl2;
                if (bl2) {
                    return i2;
                }
            }
            bl2 = bl3;
        }
        return -1;
    }

    @Override
    public final StackTraceElement a(Class clazz) {
        hhk.f(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTraceElementArray = new Throwable().getStackTrace();
        int n2 = hig.c(stackTraceElementArray, clazz);
        if (n2 != -1) {
            return stackTraceElementArray[n2];
        }
        return null;
    }

    @Override
    public final StackTraceElement[] b(Class stackTraceElementArray, int n2) {
        int n3;
        int n4;
        StackTraceElement[] stackTraceElementArray2;
        block5: {
            int n5;
            block4: {
                boolean bl2 = n2 == -1 || n2 > 0;
                hhk.f(bl2, "maxDepth must be > 0 or -1");
                hhk.f(true, "skipFrames must be >= 0");
                stackTraceElementArray2 = new Throwable().getStackTrace();
                n4 = hig.c(stackTraceElementArray2, (Class)stackTraceElementArray);
                if (n4 == -1) {
                    return new StackTraceElement[0];
                }
                n5 = stackTraceElementArray2.length - n4;
                if (n2 <= 0) break block4;
                n3 = n2;
                if (n2 < n5) break block5;
            }
            n3 = n5;
        }
        stackTraceElementArray = new StackTraceElement[n3];
        System.arraycopy(stackTraceElementArray2, n4, stackTraceElementArray, 0, n3);
        return stackTraceElementArray;
    }
}

