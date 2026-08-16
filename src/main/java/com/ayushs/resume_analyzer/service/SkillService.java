package com.ayushs.resume_analyzer.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.ayushs.resume_analyzer.dto.MatchResult;

@Service
public class SkillService {

    public List<String> findSkills(String resumeText) {

        List<String> skills = new ArrayList<>();

        String text = resumeText.toLowerCase();

        String[] skillList = {
                "java",
                "spring boot",
                "sql",
                "mysql",
                "postgresql",
                "python",
                "c++",
                "javascript",
                "html",
                "css",
                "git",
                "github",
                "docker",
                "aws",
                "react",
                "mongodb"
        };

        for (String skill : skillList) {

            if (text.contains(skill.toLowerCase())) {
                skills.add(skill);
            }
        }

        return skills;
    }
    public MatchResult compareSkills(String resumeText, String jobDescription) {

        List<String> resumeSkills = findSkills(resumeText);

        List<String> jobSkills = findSkills(jobDescription);

        List<String> matchedSkills = new ArrayList<>();
        List<String> missingSkills = new ArrayList<>();

        for (String skill : jobSkills) {

            if (resumeSkills.contains(skill)) {
                matchedSkills.add(skill);
            } else {
                missingSkills.add(skill);
            }
        }

        int score = 0;

        if (!jobSkills.isEmpty()) {
            score = (matchedSkills.size() * 100) / jobSkills.size();
        }

        return new MatchResult(
                score,
                jobSkills.size(),
                matchedSkills,
                missingSkills
        );
    }
}
