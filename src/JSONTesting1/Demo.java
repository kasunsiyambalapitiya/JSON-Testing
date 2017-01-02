/*
*  Copyright (c) Dec 20, 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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



package JSONTesting1;

import org.json.simple.*;
public class Demo {
    
    public static void main(String[] args) {
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("name","Kasun");
        jsonObject.put("age",new Integer(25));
        jsonObject.put("salary", new Double(80000));
        
        System.out.println(jsonObject);
    }

}
