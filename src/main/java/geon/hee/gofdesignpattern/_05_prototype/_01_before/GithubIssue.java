package geon.hee.gofdesignpattern._05_prototype._01_before;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GithubIssue {

    private int id;

    private String title;

    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issue/%d",
                repository.getUser(), repository.getName(), id);
    }
}
