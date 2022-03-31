package geon.hee.gofdesignpattern._05_prototype._03_java;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class GithubIssueData {

    private int id;

    private String title;

    private String repositoryUser;

    private String repositoryName;
}
