/*
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.yardstickframework.report.jfreechart;

import java.util.*;

/**
 * Additional info for plot.
 */
public class JFreeChartPlotInfo {
    /** */
    private final String name;

    /** */
    private final Collection<String> cfg;

    /** */
    private final double avg;

    /** */
    private final double min;

    /** */
    private final double max;

    /** */
    private final double stdDiv;

    /** */
    private String color;

    /** */
    private JFreeChartGenerationMode mode;

    /**
     * @param name Plot name.
     * @param cfg Configuration string.
     * @param avg Average.
     * @param min Minimum.
     * @param max Maximum.
     * @param stdDiv Standard deviation.
     * @param mode Mode.
     */
    public JFreeChartPlotInfo(String name, Collection<String> cfg, double avg, double min, double max, double stdDiv,
        JFreeChartGenerationMode mode) {
        this.name = name;
        this.cfg = cfg;
        this.avg = avg;
        this.min = min;
        this.max = max;
        this.stdDiv = stdDiv;
        this.mode = mode;
    }

    /**
     * @return Plot name.
     */
    public String name() {
        return name;
    }

    /**
     * @return Configuration.
     */
    public Collection<String> configuration() {
        return cfg;
    }

    /**
     * @return Average.
     */
    public double average() {
        return avg;
    }

    /**
     * @return Minimum.
     */
    public double minimum() {
        return min;
    }

    /**
     * @return Maximum.
     */
    public double maximum() {
        return max;
    }

    /**
     * @return Standard deviation.
     */
    public double standardDeviation() {
        return stdDiv;
    }

    /**
     * @return Plot color.
     */
    public String color() {
        return color;
    }

    /**
     * @param color Color.
     */
    public void color(String color) {
        this.color = color;
    }

    /**
     * @return Generation mode.
     */
    public JFreeChartGenerationMode mode() {
        return mode;
    }

    /**
     * @param mode Generation mode.
     */
    public void mode(JFreeChartGenerationMode mode) {
        this.mode = mode;
    }
}
