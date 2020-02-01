package org.benchmarks.data;

import org.benchmarks.definitions.DailyBenchmarkConfig;
import org.benchmarks.definitions.SourceFileColumns;
import org.benchmarks.definitions.StaticVersion;
import org.benchmarks.util.ReportProperties;
import org.json.simple.JSONObject;

public class DailyBenchmarkData extends ReportData {

    private String benchmark;
    private String benchmarkPath;

    public DailyBenchmarkData(DailyBenchmarkConfig config) {
        super();

        this.benchmark = config.getBenchmark();
        this.benchmarkPath = config.getLastSuccessfulBuildCsvPath();
    }

    @Override
    public String getDataSourcePath(StaticVersion staticVersion, ReportProperties reportProperties) {
        return this.benchmarkPath;
    }

    @Override
    protected ReportRow parseJenkinsReportRow(JSONObject testJenkinsReportRow) {
        DailyBenchmarkRow  dailyBenchmarkRow = new DailyBenchmarkRow();

        dailyBenchmarkRow.setBenchmark(this.benchmark);

        if (testJenkinsReportRow.get(SourceFileColumns.BENCHMARK.getColumn()) != null) {
            dailyBenchmarkRow.setName((String) testJenkinsReportRow.get(SourceFileColumns.BENCHMARK.getColumn()));
        }
        if (testJenkinsReportRow.get(SourceFileColumns.SCORE.getColumn()) != null) {
            dailyBenchmarkRow.setScore(testJenkinsReportRow.get(SourceFileColumns.SCORE.getColumn()).toString());
        }

        return dailyBenchmarkRow;
    }
}
