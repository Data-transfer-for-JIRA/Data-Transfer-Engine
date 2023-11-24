package com.transfer.issuetype.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueTypeSchemeDTO {
    String issueTypeSchemeId;
    Integer projectId;
}