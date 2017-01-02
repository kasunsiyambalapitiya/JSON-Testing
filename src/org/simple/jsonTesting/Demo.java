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



package org.simple.jsonTesting;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;
public class Demo {


    public static void main(String[] args) {


        JSONParser parser = new JSONParser();
        JSONObject jsonObject;
        try {

            jsonObject = (JSONObject) parser.parse(new FileReader("/home/kasun/Documents/json.txt"));

            System.out.println("The json object"+jsonObject);

           

            JSONArray from_excel = (JSONArray)jsonObject.get("from_excel");
            // for row output 1
            for(Object o: from_excel){
                System.out.println(o);
            }
            // for row output 2
            Iterator iterator = from_excel.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            // for item output 3
            for (int i = 0; i < from_excel.size(); i++) {

                JSONObject jsonObjectRow = (JSONObject) from_excel.get(i);
                String num = (String) jsonObjectRow.get("num");
                String solution = (String) jsonObjectRow.get("solution");
                System.out.println("num="+num+"; solution="+solution);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }

}
