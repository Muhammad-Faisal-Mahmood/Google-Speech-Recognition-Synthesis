/*
 * Decompiled with CFR 0.152.
 */
public final class bpp
extends Exception {
    public bpp(int n2, int n3, String string, Throwable throwable) {
        String string2;
        String string3 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? "CONNECTION_ERROR" : "PREPARATION_ERROR") : "INFERENCE_ERROR") : "DOWNLOAD_ERROR";
        if (n3 != 15) {
            if (n3 != 16) {
                if (n3 != 501) {
                    block0 : switch (n3) {
                        default: {
                            switch (n3) {
                                default: {
                                    string2 = "UNKNOWN";
                                    break block0;
                                }
                                case 606: {
                                    string2 = "FEATURE_NOT_FOUND";
                                    break block0;
                                }
                                case 605: {
                                    string2 = "NULL_BINDING";
                                    break block0;
                                }
                                case 604: {
                                    string2 = "NEEDS_SYSTEM_UPDATE";
                                    break block0;
                                }
                                case 603: {
                                    string2 = "BINDING_DIED";
                                    break block0;
                                }
                                case 602: {
                                    string2 = "SERVICE_DISCONNECTED";
                                    break block0;
                                }
                                case 601: 
                            }
                            string2 = "BINDING_FAILURE";
                            break;
                        }
                        case 12: {
                            string2 = "REQUEST_TOO_LARGE";
                            break;
                        }
                        case 11: {
                            string2 = "RESPONSE_PROCESSING_ERROR";
                            break;
                        }
                        case 10: {
                            string2 = "SERVICE_PROCESSING_ERROR";
                            break;
                        }
                        case 9: {
                            string2 = "BUSY";
                            break;
                        }
                        case 8: {
                            string2 = "NOT_AVAILABLE";
                            break;
                        }
                        case 7: {
                            string2 = "CANCELLED";
                            break;
                        }
                        case 6: {
                            string2 = "IPC_ERROR";
                            break;
                        }
                        case 5: {
                            string2 = "COMPUTE_ERROR";
                            break;
                        }
                        case 4: {
                            string2 = "REQUEST_PROCESSING_ERROR";
                            break;
                        }
                        case 3: {
                            string2 = "BAD_REQUEST";
                            break;
                        }
                        case 2: {
                            string2 = "BAD_DATA";
                            break;
                        }
                    }
                } else {
                    string2 = "NOT_ENOUGH_DISK_SPACE";
                }
            } else {
                string2 = "NOT_SUPPORTED";
            }
        } else {
            string2 = "RESPONSE_GENERATION_ERROR";
        }
        super(String.format("AICore failed with error type %s-%s and error code %s-%s: %s", n2, string3, n3, string2, string), throwable);
    }
}

