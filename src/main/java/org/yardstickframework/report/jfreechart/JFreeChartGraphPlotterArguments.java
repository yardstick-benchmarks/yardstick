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

import com.beust.jcommander.*;

import java.util.*;

/**
 * Graph plotter arguments.
 */
@SuppressWarnings({"UnusedDeclaration", "FieldCanBeLocal"})
public class JFreeChartGraphPlotterArguments {
    /** */
    @Parameter(names = {"-h", "--help"}, description = "Print help message", help = true, hidden = true)
    private boolean help;

    /** */
    @Parameter(names = {"-i", "--inputFolders"}, variableArity = true,
        description = "Space-separated list of input folders which contains folders with probe results files (required)")
    private List<String> inputFolders = new ArrayList<>();

    /** */
    @Parameter(names = {"-cc", "--chartColumns"},
        description = "Number of columns that the charts are displayed in on the resulted page")
    private int chartCols = 3;

    /** */
    @Parameter(names = {"-gm", "--generationMode"},
        description = "Graph generation mode for comparing benchmark results:\n\n" +
            "       STANDARD: all benchmark results are displayed on separate graphs.\n\n" +
            "       COMPARISON: benchmarks from multiple folders (space-separated) are paired together.\n\n" +
            "       COMPOUND: benchmarks from multiple folders (space-separated) are shown together.\n")
    private JFreeChartGenerationMode genMode = JFreeChartGenerationMode.COMPOUND;

    /** */
    @Parameter(names = {"-sm", "--summaryMode"},
        description = "Mode that defines whether a summary plot is added to a graph or not:\n\n" +
            "       SUM_ONLY: summary plot is added to a graph (default).\n\n" +
            "       INDIVIDUAL_ONLY: individual plots are displayed.\n\n" +
            "       INDIVIDUAL_AND_SUM: individual and summary plots are displayed.\n")
    private JFreeChartSummaryMode sumMode = JFreeChartSummaryMode.SUM_ONLY;

    /**
     * @return List of input folders.
     */
    public List<String> inputFolders() {
        return inputFolders;
    }

    /**
     * @return Chart columns number.
     */
    public int chartColumns() {
        return chartCols;
    }

    /**
     * @return Help.
     */
    public boolean help() {
        return help;
    }

    /**
     * @return Generation mode.
     */
    public JFreeChartGenerationMode generationMode() {
        return genMode;
    }

    /**
     * @return Summary mode.
     */
    public JFreeChartSummaryMode summaryMode() {
        return sumMode;
    }
}
