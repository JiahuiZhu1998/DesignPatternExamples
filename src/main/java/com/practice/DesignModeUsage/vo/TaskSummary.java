package com.practice.DesignModeUsage.vo;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TaskSummary {
    private Long taskId;

    private String tenantName;

    private Integer caseCount = 0;

    private Integer finishCount = 0;

    private Integer connectCount = 0;

    private LocalDateTime createTime;

    private Integer status;

    private String taskName;

    private String productName;

    private Long productConfigId;

    private BigDecimal completeDegree = BigDecimal.ZERO;

    private Long bizTypeId;

}

