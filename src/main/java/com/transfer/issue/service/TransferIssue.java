package com.transfer.issue.service;

import com.transfer.issue.model.dto.TransferIssueDTO;
import com.transfer.issue.model.dto.WebLinkDTO;
import com.transfer.project.model.entity.TB_JML_Entity;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Map;

public interface TransferIssue {

    Map<String ,String> transferIssueData(TransferIssueDTO transferIssueDTO) throws Exception;

    /*
     *  생성한 이슈의 상태를 변환하는 메서드
     * */
    void changeIssueStatus(String issueKey) throws Exception;
    /**/
    public String getOneAssigneeId(String userName) throws Exception;

    Map<String, String> updateIssueData(TransferIssueDTO transferIssueDTO) throws Exception;

    String getBaseIssueKey(String jiraProjectCode, String issueType);

    Specification<TB_JML_Entity> hasDateTimeBeforeIsNull(String field);

    /*
    *  프로젝트에 걸린 웹링크 조회
    */
    List<WebLinkDTO> getWebLinkByJiraKey(String jiraKey) throws Exception;
}
