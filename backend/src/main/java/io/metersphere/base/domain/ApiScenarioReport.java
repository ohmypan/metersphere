package io.metersphere.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiScenarioReport implements Serializable {
    private String id;

    private String apiScenarioId;

    private String name;

    private String description;

    private Long createTime;

    private Long updateTime;

    private String status;

    private String userId;

    private String triggerMode;

    private static final long serialVersionUID = 1L;
}