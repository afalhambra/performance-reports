package org.benchmarks.definitions;

public class DailyBenchmarkConfig {

    private String job;
    private String product;
    private String path;
    private String apiPath;
    private String lastBuildApiPath;
    private String lastSuccessfulBuildCsvPath;

    public DailyBenchmarkConfig(String job, String path, String subfolder, String product) {
        this.job = job;
        this.path = path;
        this.product = product;
        this.apiPath = path + "/api/json";
        this.lastBuildApiPath = path + "/lastCompletedBuild/api/json";
        this.lastSuccessfulBuildCsvPath = path + "/lastSuccessfulBuild/artifact/"+subfolder+"/results.csv";
    }

    public String getBenchmark() {
        return job;
    }

    public void setBenchmark(String benchmark) {
        this.job = benchmark;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLastBuildApiPath() {
        return lastBuildApiPath;
    }

    public void setLastBuildApiPath(String lastBuildApiPath) {
        this.lastBuildApiPath = lastBuildApiPath;
    }

    public String getLastSuccessfulBuildCsvPath() {
        return lastSuccessfulBuildCsvPath;
    }

    public void setLastSuccessfulBuildCsvPath(String lastSuccessfulBuildCsvPath) {
        this.lastSuccessfulBuildCsvPath = lastSuccessfulBuildCsvPath;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}