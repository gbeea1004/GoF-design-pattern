package geon.hee.gofdesignpattern._05_prototype._03_java;

import geon.hee.gofdesignpattern._05_prototype._02_after.GithubIssue;
import geon.hee.gofdesignpattern._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("성건희");
        repository.setName("디자인-패턴-공부");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : 프로토타입 패턴은 무엇인가?");

        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println("githubIssueData = " + githubIssueData);
    }
}
