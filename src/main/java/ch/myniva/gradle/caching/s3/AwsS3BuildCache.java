/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.myniva.gradle.caching.s3;

import org.gradle.caching.configuration.AbstractBuildCache;

public class AwsS3BuildCache extends AbstractBuildCache {
  private String region;
  private String bucket;
  private String path;
  private boolean reducedRedundancy = true;
  private String endpoint;
  private String awsAccessKeyId;
  private String awsSecretKey;

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public boolean isReducedRedundancy() {
    return reducedRedundancy;
  }

  public void setReducedRedundancy(boolean reducedRedundancy) {
    this.reducedRedundancy = reducedRedundancy;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getAwsAccessKeyId() {
    return awsAccessKeyId;
  }

  public void setAwsAccessKeyId(String awsAccessKeyId) {
    this.awsAccessKeyId = awsAccessKeyId;
  }

  public String getAwsSecretKey() {
    return awsSecretKey;
  }

  public void setAwsSecretKey(String awsSecretKey) {
    this.awsSecretKey = awsSecretKey;
  }
}
