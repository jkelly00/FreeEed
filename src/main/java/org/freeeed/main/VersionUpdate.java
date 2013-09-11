/*    
    *
    * Licensed under the Apache License, Version 2.0 (the "License");
    * you may not use this file except in compliance with the License.
    * You may obtain a copy of the License at
    *
    * http://www.apache.org/licenses/LICENSE-2.0
    *
    * Unless required by applicable law or agreed to in writing, software
    * distributed under the License is distributed on an "AS IS" BASIS,
    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    * See the License for the specific language governing permissions and
    * limitations under the License.
*/
package org.freeeed.main;

import org.freeeed.ec2.S3Agent;
import org.freeeed.services.History;


/**
 *
 * @author mark
 */
public class VersionUpdate {

    private String updateInfo;
    String bucket = "shmsoft";
    String updateKey = "SHMcloud.update";
    String updateJar = "target/SHMcloud-1.0-SNAPSHOT-jar-with-dependencies.jar";

    public String queryUpdateInfo() {
        S3Agent s3agent = new S3Agent();
        return s3agent.getTextFromS3(bucket, updateKey);
    }

    public boolean isNewVersionAvailable() {
        updateInfo = queryUpdateInfo();
        if (updateInfo == null) {
            return false;
        }
        String[] lines = updateInfo.split("\n");
        String newVersion = lines.length > 0 ? lines[0] : "";
        String currentVersion = Version.version;
        return currentVersion.compareTo(newVersion) < 0;
    }

    /**
     * @return the updateInfo
     */
    public String getUpdateInfo() {
        return updateInfo;
    }

    /**
     * @param updateInfo the updateInfo to set
     */
    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public void downloadUpdateJar() {
        S3Agent s3agent = new S3Agent();
        s3agent.downloadFileFromS3(bucket, updateJar, updateJar + ".new");
        History.appendToHistory("New version download completed. Will update on next restart");
    }
}
