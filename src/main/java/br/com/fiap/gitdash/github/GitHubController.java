package br.com.fiap.gitdash.github;

import br.com.fiap.gitdash.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;

import java.util.List;

@Controller
public class GitHubController {

    private final GitHubService gitHubService;

    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/")
    public String getUserInfo(Model model, @RegisteredOAuth2AuthorizedClient("github") OAuth2AuthorizedClient authorizedClient) {

        String tokenValue = authorizedClient.getAccessToken().getTokenValue();
        User user = gitHubService.getUserInfo(tokenValue);
        List<RepositoryInfo> repos = gitHubService.getUserRepositories(tokenValue);

        model.addAttribute("name", user.getName() != null ? user.getName() : user.getLogin());
        model.addAttribute("avatar_url", user.getAvatarUrl());
        model.addAttribute("html_url", user.getHtmlUrl());
        model.addAttribute("repos", repos);

        return "user";
    }
}