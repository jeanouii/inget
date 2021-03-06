/*
 *
 *   Tomitribe Confidential
 *
 *  Copyright Tomitribe Corporation. 2018
 *
 *  The source code for this program is not published or otherwise divested
 *  of its trade secrets, irrespective of what has been deposited with the
 *  U.S. Copyright Office.
 *
 */

package org.tomitribe.inget.common;

import java.io.File;

public class Configuration {

    public static String TEMP_SOURCE;
    public static String MODEL_SUFFIX;
    public static String RESOURCE_SOURCES;
    public static String MODEL_SOURCES;
    public static String GENERATED_SOURCES;
    public static String MAIN_CLASS = "org.tomitribe.model.ModelGenerator";
    public static String MODEL_PACKAGE;
    public static String RESOURCE_PACKAGE;
    public static String RESOURCE_SUFFIX;
    public static String CLIENT_NAME;
    public static String CLIENT_SOURCES;
    public static String CMD_PACKAGE;
    public static String CMD_LINE_NAME;
    public static Authentication AUTHENTICATION;

    public static String getModelPath() {
        return MODEL_SOURCES + File.separator + Utils.transformPackageToPath(MODEL_PACKAGE);
    }

    public static String getResourcePath() {
        return RESOURCE_SOURCES + File.separator + Utils.transformPackageToPath(RESOURCE_PACKAGE);
    }

    public static String getClientPath() {
        return CLIENT_SOURCES + File.separator + Utils.transformPackageToPath(RESOURCE_PACKAGE) + File.separator + "client";
    }

    public static String getClientPackage() {
        return Configuration.RESOURCE_PACKAGE + ".client";
    }

    public static void clean() {
        TEMP_SOURCE = null;
        MODEL_SUFFIX = null;
        RESOURCE_SOURCES = null;
        MODEL_SOURCES = null;
        GENERATED_SOURCES = null;
        MODEL_PACKAGE = null;
        RESOURCE_PACKAGE = null;
        RESOURCE_SUFFIX = null;
        CLIENT_NAME = null;
        CLIENT_SOURCES = null;
        CMD_PACKAGE = null;
        AUTHENTICATION = null;
    }
}
