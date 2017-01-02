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



package gettingDataFromPullRequestAPI;
import java.io.FileReader;

import javax.swing.text.html.parser.Parser;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class Demo {

    public static void main(String[] args) {
        JSONParser parser= new JSONParser();
        String location=System.getProperty("user.dir");
        System.out.println(location); 
        try{
            JSONArray jsonArray= (JSONArray) parser.parse(new FileReader("/home/kasun/Documents/jsondata.json"));


            // needs to run for all the objects in the JSONArray
            for(int i=0; i< jsonArray.size();i++){

                JSONObject jsonObject= (JSONObject)jsonArray.get(i);

                long prNo=(Long)jsonObject.get("number");
                System.out.println("The pr no is "+ prNo);

            }





        }

        catch(Exception e){
            System.out.println("Error"+e);

        }


    }

}
