package org.openfact.admin;

public class Config {

    private String serverUrl;
    private String organization;

    public Config(String serverUrl, String organization) {
        this.serverUrl = serverUrl;
        this.organization = organization;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
