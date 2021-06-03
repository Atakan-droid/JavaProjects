package atakandroid.hrms.entities.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeAddDto {

	private int candidateId;
    private String imageUrl;
    private String github;
    private String linkedin;
    private String description;
    private List<Integer> schoolIds;
    private List<Integer> jobExperienceIds;
    private List<Integer> foreignLanguageIds;
    private List<Integer> technologyIds;
}
