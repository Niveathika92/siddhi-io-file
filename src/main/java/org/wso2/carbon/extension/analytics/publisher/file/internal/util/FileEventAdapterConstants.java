/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.extension.analytics.publisher.file.internal.util;

public class FileEventAdapterConstants {

    private FileEventAdapterConstants() {
    }

    public static final String ADAPTER_TYPE = "file";

    public static final String ADAPTER_FILE_NAME = "filename";
    public static final String ADAPTER_FILE_NAME_HINT = "filename.hint";

    public static final String ADAPTER_BUFFER_SIZE = "buffersize";
    public static final String ADAPTER_BUFFER_HINT = "buffersize.hint";

    public static final String ADAPTER_FILE_BUFFER_SIZE_DEFAULT = "1024";
}