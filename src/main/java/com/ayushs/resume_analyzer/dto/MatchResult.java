package com.ayushs.resume_analyzer.dto;
import java.util.List;

public class MatchResult {

    private int score;
    private int totalRequiredSkills;
    private List<String> matchedSkills;
    private List<String> missingSkills;

    public MatchResult(int score,
                       int totalRequiredSkills,
                       List<String> matchedSkills,
                       List<String> missingSkills) {

        this.score = score;
        this.totalRequiredSkills = totalRequiredSkills;
        this.matchedSkills = matchedSkills;
        this.missingSkills = missingSkills;
    }

    public int getScore() {
        return score;
    }

    public int getTotalRequiredSkills() {
        return totalRequiredSkills;
    }

    public List<String> getMatchedSkills() {
        return matchedSkills;
    }

    public List<String> getMissingSkills() {
        return missingSkills;
    }
}
