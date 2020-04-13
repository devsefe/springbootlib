package com.devsefe.lib.springbootlib.extension;

import com.sun.istack.Nullable;
import lombok.experimental.ExtensionMethod;

import java.time.LocalDate;

public final class Converting {

    /**
    * Converts any string to nullable byte. It provides try-catch, doesn't throw exception
     * @param value value to convert
     * @param defaultValue if value could not change, this value will be return
    **/
    public static final Byte toByte(String value, Byte defaultValue) {
        try {
            return Byte.parseByte(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * Converts any string to nullable int. It provides try-catch, doesn't throw exception
     * @param value value to convert
     * @param defaultValue if value could not change, this value will be return
     **/
    public static final Integer toInt(String value, Integer defaultValue) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * Converts any string to nullable float. It provides try-catch, doesn't throw exception
     * @param value value to convert
     * @param defaultValue if value could not change, this value will be return
     **/
    public static final Float toFloat(String value, Float defaultValue) {
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * Converts any string to nullable double. It provides try-catch, doesn't throw exception
     * @param value value to convert
     * @param defaultValue if value could not change, this value will be return
     **/
    public static final Double toDouble(String value, Double defaultValue) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * Converts any string to nullable localDate. It provides try-catch, doesn't throw exception
     * @param value value to convert
     * @param defaultValue if value could not change, this value will be return
     **/
    public static final LocalDate toLocalDate(String value, LocalDate defaultValue) {
        try {
            return LocalDate.parse(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
