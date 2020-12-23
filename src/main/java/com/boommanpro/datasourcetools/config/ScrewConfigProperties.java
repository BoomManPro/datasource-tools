package com.boommanpro.datasourcetools.config;

import cn.smallbun.screw.core.engine.EngineFileType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wangqimeng
 * @date 2020/12/23 10:51
 */
@Data
@ConfigurationProperties(prefix = "screw.config")
public class ScrewConfigProperties {

    private EngineFileType generatorType = EngineFileType.HTML;

    private String outputPath = "./";

    private String version = "1.0.0";

    private String description = "生成文档信息描述";
}
