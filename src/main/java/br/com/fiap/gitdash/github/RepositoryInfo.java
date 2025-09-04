package br.com.fiap.gitdash.github;

public class RepositoryInfo {
    private String name;
    private String description;
    private String lastCommitMessage;
    private int commitCount;
    private String htmlUrl;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLastCommitMessage() { return lastCommitMessage; }
    public void setLastCommitMessage(String lastCommitMessage) { this.lastCommitMessage = lastCommitMessage; }

    public int getCommitCount() { return commitCount; }
    public void setCommitCount(int commitCount) { this.commitCount = commitCount; }

    public String getHtmlUrl() { return htmlUrl; }
    public void setHtmlUrl(String htmlUrl) { this.htmlUrl = htmlUrl; }
}