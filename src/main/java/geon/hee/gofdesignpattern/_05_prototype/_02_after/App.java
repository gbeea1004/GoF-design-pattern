package geon.hee.gofdesignpattern._05_prototype._02_after;

/**
 * 프로토타입 장점
 * - 복잡한 객체를 만드는 과정을 숨길 수 있다.
 * - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리)적인 면에서 효율적일 수도 있다.
 * - 추상적인 타입을 리턴할 수 있다.
 *
 * 프로토타입 단점
 * - 복제한 객체를 만드는 과정 자체가 복잡할 수 있다. (특히, 순환 참조가 있는 경우)
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("성건희");
        repository.setName("디자인-패턴-공부");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : 프로토타입 패턴은 무엇인가?");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        repository.setUser("Keesun");

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        // Deep Copy (Shallow Copy 일 경우, repository 는 기존것을 그대로 사용함)
        System.out.println(clone.getRepository() != githubIssue.getRepository());

        System.out.println(clone.getUrl());
    }
}
