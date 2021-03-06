/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model;

/**
 * Statistic
 */
public enum Statistic {
    
    SampleCount("SampleCount"),
    Average("Average"),
    Sum("Sum"),
    Minimum("Minimum"),
    Maximum("Maximum");

    private String value;

    private Statistic(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return Statistic corresponding to the value
     */
    public static Statistic fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("SampleCount".equals(value)) {
            return Statistic.SampleCount;
        } else if ("Average".equals(value)) {
            return Statistic.Average;
        } else if ("Sum".equals(value)) {
            return Statistic.Sum;
        } else if ("Minimum".equals(value)) {
            return Statistic.Minimum;
        } else if ("Maximum".equals(value)) {
            return Statistic.Maximum;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    