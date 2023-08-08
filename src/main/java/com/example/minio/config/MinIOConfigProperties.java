package com.example.minio.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@Data
@ConfigurationProperties(prefix = "minio")  // 文件上传 配置前缀file.oss
public class MinIOConfigProperties implements Serializable {

    private String accessKey;
    private String secretKey;
    private String bucket;
    private String endpoint;
    private String readPath;

    /*
  accessKey: minio
  secretKey: minio123
  bucket: leadnews
  endpoint: http://192.168.5.130:9000
  readPath: http://192.168.5.130:9000
   */


}
