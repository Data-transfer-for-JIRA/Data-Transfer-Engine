package com.platform.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDTO {

    // 필수
    private String projectFlag; // 프로젝트 여부 [프로젝트: P, 유지보수: M]

    private String projectName; // 프로젝트명

    private String projectCode; // 프로젝트 코드

    // 선택 (공통)
    private String assignee; // 담당자(select box)

    private String subAssignee; // 부 담당자(select box)

    private String salesManager; // 영업 대표(select box)

    private String contractor; // 계약사

    private String client; // 고객사

    private String productType; // 제품 유형(select box)

    private String productTypeEtc; // 제품 유형 기타

    private String productInfo; // 제품 정보(select box)

    private String productInfoEtc; // 제품 정보 기타

    private String linkInfo; // 연동 정보(select box)

    private String linkInfoEtc; // 연동 정보 기타

    private String barcodeType; // 바코드 타입(select box) [3단: 1, 기본: 0]

    private String multiOsSupport; // 멀티 OS 지원 여부(check box) [지원: Multi OS]

    private String printerSupportRange; // 프린터 지원 범위(select box)

    private String etc; // 기타 정보

    private String description; // 기본 이력 내용

    // 선택 (프로젝트)
    private String projectAssignmentDate; // 프로젝트 배정일(calendar)

    private String projectProgressStep; // 프로젝트 진행 단계(select box)

    // 선택 (유지보수)
    private String contractStatus; // 계약 여부(check box) [계약: 1, 계약 x: 0]

    private String maintenanceStartDate; // 유지보수 시작일(calendar)

    private String maintenanceEndDate; // 유지보수 종료일(calendar)

    private String inspectionMethod; // 점검 방법(select box)

    private String inspectionMethodEtc; // 점검 방법 기타

    private String inspectionCycle; // 점검 주기(select box)

}