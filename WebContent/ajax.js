/**
 * 
 */

var httpRequest = null;

function sendRequest(method,url,param,callback){
   httpRequest = new XMLHttpRequest();
   
   var httpMethod = method ? method : "GET";
   if(httpMethod != "GET" && httpMethod != "POST"){
      httpMethod = "GET";
   }
   
   var httpUrl = url;
   
   var httpParam = (param == null || param == "")? null : param;
   
   if(httpMethod == "GET" && httpParam != null){
      httpUrl = httpUrl + "?" + httpParam;
   }
   
   httpRequest.open(httpMethod,httpUrl,true);
   httpRequest.onreadystatechange =callback;
   httpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");//POST방식일 경우 필요한 명령
   httpRequest.send(httpMethod=="POST"?httpParam : null);
}