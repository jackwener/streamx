/*
 * Copyright 2019 The StreamX Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.streamxhub.streamx.flink.packer.pipeline

/**
 * Trait for watching the change events of the Docker resolved progress
 * for a BuildPipeline instance.
 *
 * @author Al-assad
 */
trait DockerProgressWatcher {

  /**
   * async call when pulling docker image progress is changed.
   */
  def onDockerPullProgressChange(snapshot: DockerPullSnapshot): Unit

  /**
   * async call when building docker image progress is changed.
   */
  def onDockerBuildProgressChange(snapshot: DockerBuildSnapshot): Unit

  /**
   * async call when pushing docker image progress is changed.
   */
  def onDockerPushProgressChange(snapshot: DockerPushSnapshot): Unit

}

/**
 * silent watcher
 */
class SilentDockerProgressWatcher extends DockerProgressWatcher {

  override def onDockerPullProgressChange(snapshot: DockerPullSnapshot): Unit = {}

  override def onDockerBuildProgressChange(snapshot: DockerBuildSnapshot): Unit = {}

  override def onDockerPushProgressChange(snapshot: DockerPushSnapshot): Unit = {}

}
