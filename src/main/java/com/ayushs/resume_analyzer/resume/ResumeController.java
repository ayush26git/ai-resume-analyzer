package com.ayushs.resume_analyzer.resume;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.ayushs.resume_analyzer.service.ResumeService;
import com.ayushs.resume_analyzer.service.SkillService;
import java.util.List;
import com.ayushs.resume_analyzer.dto.MatchResult;
@RestController
@RequestMapping("/api/resume")
public class ResumeController {
    private final ResumeService resumeService;
    private final SkillService skillService;


    public ResumeController(ResumeService resumeService,SkillService skillService) {
        this.resumeService = resumeService;
        this.skillService = skillService;
    }

    @PostMapping("/upload")
    public String uploadResume(@RequestParam("file") MultipartFile file) throws Exception {
        String text = resumeService.extractText(file);
        List<String> skills = skillService.findSkills(text);

        return "Detected Skills: " + skills;

    }
    @PostMapping("/analyze")
    public MatchResult analyzeResume(
            @RequestParam("file") MultipartFile file,
            @RequestParam("jobDescription") String jobDescription
    ) throws Exception {

        String resumeText = resumeService.extractText(file);

        return skillService.compareSkills(
                resumeText,
                jobDescription
        );
    }
}