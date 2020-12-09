import LiveStudy._4Week.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.kohsuke.github.*;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;


import static org.kohsuke.github.GHIssueState.ALL;
import static org.junit.jupiter.api.Assertions.*;


public class TestController {

    @Test
    @DisplayName("반복문 테스트")
    void conditionalTest() {
        int score = 90;

        switch (score) {
            case 95:
                System.out.println("A+");
                break;
            case 90:
                System.out.println("A");
                break;
            case 85:
                System.out.println("B+");
                break;
        }
    }

    @Test
    @DisplayName("깃 허브 이슈 테스트")
    void githubTest() throws IOException {
        String token = "";













        GitHub gitHub = new GitHubBuilder().withOAuthToken(token).build();


        GHRepository repo = gitHub.getRepository("whiteship/live-study");


        // 전체 이슈 18개
        List<GHIssue> issues = repo.getIssues(ALL);

        // 전체 참가자
        Map<String, Integer> participantI = new HashMap<>();


        for (GHIssue issue : issues) {
            List<GHIssueComment> comments = issue.getComments();
            Set<String> names = new HashSet<>();
            for (GHIssueComment comment : comments) {
                String name = comment.getUser().getLogin();
                names.add(name);
            }

            for (String user : names) {
                if (participantI.containsKey(user)) {
                    Integer cnt = participantI.get(user)+1;
                    participantI.put(user,cnt);
                } else {
                    participantI.put(user, 1);
                }
            }
        }
        participantI.forEach(
                (s, integer) -> {
                    System.out.println(s+" = "+String.format("%.2f", (float) integer / 18)+"%");
                }
        );

    }

    @Test
    @DisplayName("LinkedListTest")
    void LinkedListTest() {
        ListNode head = new ListNode();

        head.add(head , new ListNode(5), 1);
        head.add(head , new ListNode(6), 2);
        head.add(head , new ListNode(7), 3);
        head.remove(head, 3);
        head.remove(head, 5);
        System.out.println(head.contains(head, new ListNode(5)));
        System.out.println(head.contains(head, new ListNode(3)));
        System.out.println(head.contains(head, new ListNode(7)));
        System.out.println(head.getSize());
        System.out.println(head.toString());

    }

    @Test
    @DisplayName("add Test")
    void LinkedListAddTest() {
        ListNode head = new ListNode();
        ListNode data = new ListNode(5);
        ListNode newData = new ListNode(7);


//        head.add(head , new ListNode(5), 1);
//        head.add(head , new ListNode(6), 2);
//        head.add(head , new ListNode(7), 3);
        head.add(head, new ListNode(5), 1);
    }
}
