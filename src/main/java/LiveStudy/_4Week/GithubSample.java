package LiveStudy._4Week;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

import static org.kohsuke.github.GHIssueState.ALL;

public class GithubSample {

    public static void main(String[] args) throws IOException {
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
}
